package com.sjy.OA_Sys.web;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sjy.OA_Sys.bean.Project;
import com.sjy.OA_Sys.bean.ProjectWithBLOBs;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.bean.TaskWithBLOBs;
import com.sjy.OA_Sys.biz.impl.ProjectBizImpl;
import com.sjy.OA_Sys.biz.impl.TaskBizImpl;
import com.sjy.OA_Sys.util.TimeUtil;

@Controller
@SessionAttributes({ "loginStaff", "departCache" })
public class TaskCreatAction {

	@Resource
	private TaskBizImpl tbi;
	@Resource
	private ProjectBizImpl pbi;
	
	@Resource
	private ObjectMapper objectMapper;
	
	@GetMapping("toTaskCreat.do")
	public String toTaskCreat(@SessionAttribute(value="loginStaff") Staff loginStaff,Model m) {
		Project project = new Project();
		project.setStaffId(loginStaff.getStaffId());
		List<ProjectWithBLOBs> projects = (List<ProjectWithBLOBs>) pbi.findProject(project, false, null, null);
		m.addAttribute("projectList", projects);
		m.addAttribute("taskNum", 1);
		return "task-creat::taskCreat";
	}
	
	@PostMapping("createTaskform.do")
	@ResponseBody
	private Result toCreateTaskform(String proId,@RequestParam String taskTimeStartBefore,@RequestParam String taskTimeEndBefore,
			@RequestParam String taskDes,@RequestParam String taskGroupId,
			@RequestParam String taskName,@SessionAttribute(value = "loginStaff") Staff loginStaff) {
		
		Result result = null;
		try {
			List<String> taskTimeStartBeforeList = objectMapper.readValue(taskTimeStartBefore, new TypeReference<List<String>>() {});
			List<String> taskTimeEndBeforeList = objectMapper.readValue(taskTimeEndBefore, new TypeReference<List<String>>() {});
			List<String> taskDesList = objectMapper.readValue(taskDes, new TypeReference<List<String>>() {});
			List<String> taskGroupIdList = objectMapper.readValue(taskGroupId, new TypeReference<List<String>>() {});
			List<String> taskNameList = objectMapper.readValue(taskName, new TypeReference<List<String>>() {});

			List<TaskWithBLOBs> taskWithBLOBs = new ArrayList<TaskWithBLOBs>();
			if(taskNameList!=null && taskNameList.size()>0) {
				for(int i=0;i<taskNameList.size();i++) {
					TaskWithBLOBs bloBs = new TaskWithBLOBs();
					bloBs.setTaskName(taskNameList.get(i));
					bloBs.setTaskGroupId(taskGroupIdList.get(i));
					bloBs.setTaskDes(taskDesList.get(i));
					bloBs.setTaskTimeStart(TimeUtil.formatDateTime(taskTimeStartBeforeList.get(i)));
					bloBs.setTaskTimeEnd(TimeUtil.formatDateTime(taskTimeEndBeforeList.get(i)));
					bloBs.setTaskState(1);
					bloBs.setTaskRateProgress("0%");
					taskWithBLOBs.add(bloBs);
				}
			}
			result=tbi.addTaskForList(taskWithBLOBs, proId);
			return result;
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return result;
	}
}
