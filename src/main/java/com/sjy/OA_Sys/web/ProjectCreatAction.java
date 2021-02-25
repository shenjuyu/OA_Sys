package com.sjy.OA_Sys.web;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sjy.OA_Sys.bean.Depart;
import com.sjy.OA_Sys.bean.ProjectWithBLOBs;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.bean.TaskGroup;
import com.sjy.OA_Sys.bean.TaskWithBLOBs;
import com.sjy.OA_Sys.biz.impl.ProjectBizImpl;
import com.sjy.OA_Sys.biz.impl.TaskGroupBizImpl;
import com.sjy.OA_Sys.util.CreateSequenceCodeUtil;
import com.sjy.OA_Sys.util.FileOperationUtil;
import com.sjy.OA_Sys.util.RedisUtil;
import com.sjy.OA_Sys.util.TimeUtil;

@Controller
@SessionAttributes({ "loginStaff", "departCache" })
public class ProjectCreatAction {

	@Resource
	private ProjectBizImpl pbi;
	@Resource
	private TaskGroupBizImpl tgbi;
	@Resource
	private ObjectMapper objectMapper;

	@Resource
	private FileOperationUtil fileUtil;
	@Resource
	private RedisUtil redisUtil;

	@GetMapping("toProjectCreat.do")
	public String toProjectCreat(Model m) {
		m.addAttribute("taskNum", 1);
		return "project-creat::projectCreat";
	}

	@PostMapping("uploadProjectAtta.do")
	@ResponseBody
	public Result toUploadProjectAtta(@RequestParam("file") MultipartFile file,
			@SessionAttribute(value = "loginStaff") Staff loginStaff) {
		Result result = fileUtil.fileUpload(file, "projectFile/");
		if (result.getSucess() == 0) {
			return result;
		}
		return result;
	}

	@PostMapping("toAddTaskDiv.do")
	public String toAddTaskDiv(Integer taskNum, Model m) {
		m.addAttribute("taskNum", taskNum);
		return "plugin::addTask";
	}

	@PostMapping("getDepartGroup.do")
	@ResponseBody
	public Result toGetDepartGroup(String departId) {
		// 根据组长所在的部门查找小组
		TaskGroup taskGroup = new TaskGroup();
		taskGroup.setTaskGroupPower(0);
		List<TaskGroup> groups = tgbi.findTaskGroup(taskGroup);// 获取到所有的组长

		if (groups != null && groups.size() > 0) {
			Iterator<TaskGroup> iterator = groups.iterator();
			while (iterator.hasNext()) {
				TaskGroup groupTemp = iterator.next();
				if (!groupTemp.getGroupStaff().getDepartId().equals(departId)) {// 组长所属部门与选中部门相同
					iterator.remove();
				}
			}
			return new Result(1, groups);
		}
		return new Result(1, groups);
	}

	@PostMapping("createProform.do")
	@ResponseBody
	public Result toCreateProform(ProjectWithBLOBs projectWithBLOBs, @RequestParam(required=false) String fileNames,
			@RequestParam String proTimeStartBefore,@RequestParam String proTimeEndBefore,
			@RequestParam String taskTimeStartBefore,@RequestParam String taskTimeEndBefore,
			@RequestParam String taskDes,@RequestParam String taskGroupId,
			@RequestParam String taskName,@SessionAttribute(value = "loginStaff") Staff loginStaff) {
		Result result = null;
		try {
			List<String> fileNameList = objectMapper.readValue(fileNames, new TypeReference<List<String>>() {});
			if (fileNameList!=null && fileNameList.size() > 0) {// 处理附件
				String fileName = FileOperationUtil.fileNameArrange(fileNameList);
				projectWithBLOBs.setProAttachment(fileName);
			}
			projectWithBLOBs.setProTimeCre(new Timestamp(System.currentTimeMillis()));
			projectWithBLOBs.setProTimeStart(TimeUtil.formatDateTime(proTimeStartBefore));
			projectWithBLOBs.setProTimeEnd(TimeUtil.formatDateTime(proTimeEndBefore));
			projectWithBLOBs.setStaffId(loginStaff.getStaffId());
			projectWithBLOBs.setProState(1);
			projectWithBLOBs.setProRateProgress("0%");
			
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
	
			result = pbi.addProject(projectWithBLOBs, taskWithBLOBs);
			return result;
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return result;
	}
}
