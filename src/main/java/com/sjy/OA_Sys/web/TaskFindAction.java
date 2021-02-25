package com.sjy.OA_Sys.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.bean.Task;
import com.sjy.OA_Sys.bean.TaskWithBLOBs;
import com.sjy.OA_Sys.biz.impl.TaskBizImpl;

@Controller
@SessionAttributes("loginStaff")
public class TaskFindAction {

	@Resource
	private TaskBizImpl tbi;
	
	@GetMapping("toTaskFind.do")
	public String toTaskFind(@SessionAttribute(value="loginStaff")Staff loginStaff,Model m) {
		// 查找任务——自己参与的
		List<TaskWithBLOBs> taskWithBLOBs = tbi.findTaskByStaffId(loginStaff.getStaffId(), 1, 2);
		
		m.addAttribute("taskList", taskWithBLOBs);
		return "task-find::taskFind";
	}
	
	@PostMapping("taskShowToPage.do")
	public String toTaskShowToPage(Integer page,@SessionAttribute(value="loginStaff")Staff loginStaff,Model m) {
		// 查找任务——自己参与的
		List<TaskWithBLOBs> taskWithBLOBs = tbi.findTaskByStaffId(loginStaff.getStaffId(), page, 2);
		
		m.addAttribute("taskList", taskWithBLOBs);
		return "task-find::taskFind";
	}
	
	@PostMapping("showTaskDetils.do")
	public String toShowTaskDetils(String taskId,Model m) {
		Task task = new Task();
		task.setTaskId(taskId);
		List<TaskWithBLOBs> taskWithBLOBs = (List<TaskWithBLOBs>) tbi.findTask(task, true, null, null);
		if(taskWithBLOBs==null || taskWithBLOBs.size()<0) {
			return "error";
		}
		m.addAttribute("taskDes", taskWithBLOBs.get(0));
		return "plugin::taskDes";
	}
	
	@PostMapping("taskReportSub.do")
	@ResponseBody
	public Result toTaskReportSub(String taskReport,String taskRateProgress,String taskId) {
		TaskWithBLOBs taskWithBLOBs = new TaskWithBLOBs();
		taskWithBLOBs.setTaskId(taskId);
		taskWithBLOBs.setTaskReport(taskReport);
		taskWithBLOBs.setTaskRateProgress(Math.round(Double.parseDouble(taskRateProgress)*100)+"%");
		Result result =tbi.updateTask(taskWithBLOBs);
		
		return result;
	}
}
