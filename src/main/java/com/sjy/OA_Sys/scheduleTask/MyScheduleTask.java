package com.sjy.OA_Sys.scheduleTask;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sjy.OA_Sys.bean.AttSheet;
import com.sjy.OA_Sys.bean.Project;
import com.sjy.OA_Sys.bean.ProjectWithBLOBs;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.bean.Task;
import com.sjy.OA_Sys.biz.impl.AttSheetBizImpl;
import com.sjy.OA_Sys.biz.impl.ProjectBizImpl;
import com.sjy.OA_Sys.biz.impl.StaffBizImpl;
import com.sjy.OA_Sys.biz.impl.TaskBizImpl;
import com.sjy.OA_Sys.util.SendEmail;
import com.sjy.OA_Sys.util.TimeUtil;

@Component
public class MyScheduleTask {

	@Resource
	private StaffBizImpl sbi;
	@Resource
	private AttSheetBizImpl asbi;
	@Resource
	private ProjectBizImpl pbi;
	@Resource
	private TaskBizImpl tbi;

	@Resource
	private SendEmail sendEmail;

	@Value("${contentTips.openingTimeHour}")
	private String openingTimeHour; // 下班的时间 时
	@Value("${contentTips.openingTimeMin}")
	private String openingTimeMin; // 下班的时间 分
	@Value("${contentTips.closingTimeHour}")
	private String closingTimeHour; // 下班的时间 时
	@Value("${contentTips.closingTimeMin}")
	private String closingTimeMin; // 下班的时间 分

	@Value("${mail.formMail.addr}")
	private String from;
	@Value("${mail.formMail.subject}")
	private String subject;
	@Value("${mail.formMail.adminEmail}")
	private String adminEmail;
	@Value("${mail.formMail.errorContent}")
	private String errorContent;

	@Scheduled(cron = "0 1 23 * * ?")
	public void attSheetArrangTask() {
		// 考勤表的整理 的定时任务
		List<Staff> staffList = sbi.findStaff(null, null, null);
		long openingTime = TimeUtil.getDayTime(Integer.valueOf(openingTimeHour), Integer.valueOf(openingTimeMin))
				.getTime();
		long closingTime = TimeUtil.getDayTime(Integer.valueOf(closingTimeHour), Integer.valueOf(closingTimeMin))
				.getTime();

		Result result = null;
		for (Staff staff : staffList) {
			AttSheet attSheet = new AttSheet();
			attSheet.setStaffId(staff.getStaffId());
			attSheet = asbi.findAttSheetForToDay(attSheet);

			// 0 请假 1 正常 2 迟到 3 早退 4 旷工 5 未签退
			if (attSheet == null) {
				// 该员工今日未签到 添加一条该员工旷工记录
				attSheet = new AttSheet();
				attSheet.setAttSheetSituation(4);
				attSheet.setStaffId(staff.getStaffId());
				result = asbi.addAttSheetForAdmin(attSheet);
			} else if (attSheet.getAttSheetTimeStart().getTime() > openingTime) {
				// 该员工迟到了
				attSheet.setAttSheetSituation(2);
				attSheet.setStaffId(staff.getStaffId());
				result = asbi.updateAttSheetForAdmin(attSheet);
			} else if (attSheet.getAttSheetTimeEnd() == null || attSheet.getAttSheetTimeEnd().getTime() < closingTime
					|| attSheet.getAttSheetSituation() == 5) {
				// 未签退或签退时间早于下班时间则 该员工早退了
				attSheet.setAttSheetSituation(3);
				attSheet.setStaffId(staff.getStaffId());
				result = asbi.updateAttSheetForAdmin(attSheet);
			}
			if (result.getSucess() == 0) {
				sendEmail.sendEmail(subject, from, adminEmail, errorContent, "考勤记录整理时出错...数据库错误...");
			}
		}

	}

	@Scheduled(cron = "0 30 23 * * ?")
	public void projectArrangTask() {
		// 项目进度统计
		List<ProjectWithBLOBs> projects = (List<ProjectWithBLOBs>) pbi.findProject(null, false, null, null);
		Iterator<ProjectWithBLOBs> projectsIt = projects.iterator();
		while (projectsIt.hasNext()) {
			ProjectWithBLOBs project = (ProjectWithBLOBs) projectsIt.next();

			Task task = new Task();
			task.setProId(project.getProId());
			List<Task> tasks = (List<Task>) tbi.findTask(task, false, null, null);

			Double proRateProgress = 0.00;
			double tempIntProgerss = 0;
			for (Task task2 : tasks) {
				String taskRateProgress = task2.getTaskRateProgress();

				taskRateProgress = taskRateProgress.replace("%", "");
				tempIntProgerss += Double.parseDouble(taskRateProgress);
			}
			proRateProgress = tempIntProgerss / (double) tasks.size();

			project.setProRateProgress(proRateProgress + "%");

			Result result = pbi.updateProject(project);
			if (result.getSucess() == 0) {
				sendEmail.sendEmail(subject, from, adminEmail, errorContent, "项目进度整理时出错...数据库错误...");
			}
		}

	}
}
