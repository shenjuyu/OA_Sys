package com.sjy.OA_Sys.web;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sjy.OA_Sys.bean.Process;
import com.sjy.OA_Sys.bean.ProcessDetails;
import com.sjy.OA_Sys.bean.ProcessType;
import com.sjy.OA_Sys.bean.ProcessWithBLOBs;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.biz.impl.ProcessBizImpl;
import com.sjy.OA_Sys.biz.impl.ProcessDetailsBizImpl;
import com.sjy.OA_Sys.biz.impl.ProcessTypeBizImpl;
import com.sjy.OA_Sys.util.FileOperationUtil;
import com.sjy.OA_Sys.vo.FileName;

@Controller
@SessionAttributes(value="loginStaff")
public class ProcessApprovedAction {
	
	@Resource
	private ProcessDetailsBizImpl pdbi;
	@Resource
	private ProcessBizImpl pbi;
	@Resource
	private ProcessTypeBizImpl ptbi;

	@GetMapping("toProcessApproved.do")
	public String toProcessApproved(@SessionAttribute(value="loginStaff") Staff loginStaff, Model m) {
		// 查询登录人可以进行的所有流程
		ProcessDetails processDetails = new ProcessDetails();
		processDetails.setApprovedStaff(loginStaff.getStaffId());
		processDetails.setApprovedResult(3);
		List<ProcessDetails> processDetailsList = pdbi.findProcessDetailsForApproved(processDetails,null,1,3);
		m.addAttribute("processDetailsList", processDetailsList);
		
		List<ProcessType> processTypeList = ptbi.findProcessType(null, null, null);
		m.addAttribute("processTypeList", processTypeList);
		return "process-approved::processApproved";
	}
	
	/**
	 * 
	 * @param id 流程id
	 * @param m
	 * @param loginStaff
	 * @return
	 */
	@PostMapping("showProcessDetails.do")
	public String toShowProcessDetails(Integer id, Model m, @SessionAttribute(value="loginStaff") Staff loginStaff) {
		ProcessDetails details = new ProcessDetails();
		details.setId(id);
		List<ProcessDetails> processDetailsList = pdbi.findProcessDetails(details, null, null);
		
		Process process = new Process();
		process.setId(processDetailsList.get(0).getProcessId());
		List<ProcessWithBLOBs> processList = pbi.findProcess(process, null, null);
		
		List<FileName> fileNames = null;
		if(processList.get(0).getProcessEnclosure()!=null) {
			List<String> fileNamesTemp = FileOperationUtil.fileNameDismantling(processList.get(0).getProcessEnclosure());
			fileNames = new ArrayList<FileName>();
			FileName fileName = null;
			for (String string : fileNamesTemp) {
				fileName = new FileName(FileOperationUtil.fileNameDecryption(string),string);
				fileNames.add(fileName);
			}
		}
		
		m.addAttribute("processDetailSelf", processDetailsList.get(0));
		m.addAttribute("processForDetails", processList.get(0));
		m.addAttribute("fileNames", fileNames);
		return "plugin::processDetails";
	}
	
	@PostMapping("approvedProcess.do")
	@ResponseBody
	public Result toApprovedProcess(ProcessDetails processDetails, Model m) {
		processDetails.setApprovedTime(new Timestamp(System.currentTimeMillis()));
		return pdbi.approvedProcess(processDetails);
	}
	
	@PostMapping("selectProcessByCondition.do")
	public String selectProcessByCondition(Process process,@SessionAttribute(value="loginStaff") Staff loginStaff, Model m) {
		if(process.getProcessApplicant()==null || process.getProcessApplicant()=="") {
			process.setProcessApplicant(null);
		}
		if(process.getProcessType()==null || process.getProcessType()==0) {
			process.setProcessType(null);
		}
		if(process.getProcessTaskToStaff()==null || process.getProcessTaskToStaff()=="") {
			process.setProcessTaskToStaff(null);
		}
		if(process.getProcessTaskSupervise()==null || process.getProcessTaskSupervise()=="") {
			process.setProcessTaskSupervise(null);
		}
		
		ProcessDetails processDetails = new ProcessDetails();
		processDetails.setApprovedStaff(loginStaff.getStaffId());
		processDetails.setApprovedResult(3);
		m.addAttribute("processDetailsList", pdbi.findProcessDetailsForApproved(processDetails,process,1,3));
		return "process-approved::processDetailsShowList";
	}
	
	@PostMapping("toProcessDetailsPage.do")
	public String toProcessDetailsPage(Process process, Integer pageNum,@SessionAttribute(value="loginStaff") Staff loginStaff, Model m) {
		if(process.getProcessApplicant()==null || process.getProcessApplicant()=="") {
			process.setProcessApplicant(null);
		}
		if(process.getProcessType()==null || process.getProcessType()==0) {
			process.setProcessApplicant(null);
		}
		if(process.getProcessTaskToStaff()==null || process.getProcessTaskToStaff()=="") {
			process.setProcessTaskToStaff(null);
		}
		if(process.getProcessTaskSupervise()==null || process.getProcessTaskSupervise()=="") {
			process.setProcessTaskSupervise(null);
		}
		
		ProcessDetails processDetails = new ProcessDetails();
		processDetails.setApprovedStaff(loginStaff.getStaffId());
		processDetails.setApprovedResult(3);
		m.addAttribute("processDetailsList", pdbi.findProcessDetailsForApproved(processDetails,process,pageNum,3));
		return "process-approved::processDetailsShowList";
	}
	
}
