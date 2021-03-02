package com.sjy.OA_Sys.scheduleTask;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sjy.OA_Sys.bean.AttSheet;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.biz.impl.AttSheetBizImpl;
import com.sjy.OA_Sys.biz.impl.StaffBizImpl;
import com.sjy.OA_Sys.util.TimeUtil;

@Component
public class MyScheduleTask {

	@Resource
	private StaffBizImpl sbi;
	@Resource
	private AttSheetBizImpl asbi;

	@Value("${contentTips.openingTimeHour}")
	private String openingTimeHour; // 下班的时间 时
	@Value("${contentTips.openingTimeMin}")
	private String openingTimeMin; // 下班的时间 分
	@Value("${contentTips.closingTimeHour}")
	private String closingTimeHour; // 下班的时间 时
	@Value("${contentTips.closingTimeMin}")
	private String closingTimeMin; // 下班的时间 分

	@Scheduled(cron = "0 1 23 * * ?")
	public void attSheetArrangTask() {
		// 考勤表的整理 的定时任务
		List<Staff> staffList = sbi.findStaff(null, null, null);
		long openingTime = TimeUtil.getDayTime(Integer.valueOf(openingTimeHour), Integer.valueOf(openingTimeMin))
				.getTime();
		long closingTime = TimeUtil.getDayTime(Integer.valueOf(closingTimeHour), Integer.valueOf(closingTimeMin))
				.getTime();
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
				asbi.addAttSheetForAdmin(attSheet);
			} else if (attSheet.getAttSheetTimeStart().getTime() > openingTime) {
				// 该员工迟到了
				attSheet.setAttSheetSituation(2);
				attSheet.setStaffId(staff.getStaffId());
				asbi.updateAttSheetForAdmin(attSheet);
			} else if (attSheet.getAttSheetTimeEnd() == null || attSheet.getAttSheetTimeEnd().getTime() < closingTime
					|| attSheet.getAttSheetSituation() == 5) {
				// 未签退或签退时间早于下班时间则 该员工早退了
				attSheet.setAttSheetSituation(3);
				attSheet.setStaffId(staff.getStaffId());
				asbi.updateAttSheetForAdmin(attSheet);
			}
		}

	}

	@Scheduled(cron = "0/2 * * * * ?")
	public void task() {
		System.out.println("执行定时任务时间:" + System.currentTimeMillis());

	}
}
