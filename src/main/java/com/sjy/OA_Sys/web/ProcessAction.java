package com.sjy.OA_Sys.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
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
import com.sjy.OA_Sys.bean.Process;
import com.sjy.OA_Sys.bean.ProcessWithBLOBs;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.biz.impl.ProcessBizImpl;
import com.sjy.OA_Sys.util.FileOperationUtil;

@Controller
@SessionAttributes("loginStaff")
public class ProcessAction {

	@Resource
	private ProcessBizImpl pbi;
	@Resource
	private ObjectMapper objectMapper;
	@Resource
	private FileOperationUtil fileUtil;

	public String toProcess() {
		return "process:processCreate";
	}

	@PostMapping("uploadProcessAtta.do")
	@ResponseBody
	public Result toUploadProcessAtta(@RequestParam("file") MultipartFile file,
			@SessionAttribute(value = "loginStaff") Staff loginStaff) {
		Result result = fileUtil.fileUpload(file, "projectFile/");
		if (result.getSucess() == 0) {
			return result;
		}
		return result;
	}

	@PostMapping("createProcess.do")
	@ResponseBody
	public Result toCreateProcess(ProcessWithBLOBs processWithBLOBs, @RequestParam(required = false) String fileNames,
			@SessionAttribute(value="loginStaff") Staff loginStaff) {
		try {
			List<String> fileNameList = objectMapper.readValue(fileNames, new TypeReference<List<String>>() {
			});
			if (fileNameList != null && fileNameList.size() > 0) {// 处理附件
				String fileName = FileOperationUtil.fileNameArrange(fileNameList);
				processWithBLOBs.setProcessEnclosure(fileName);
			}

			List<ProcessWithBLOBs> processWithBLOBsList = new ArrayList<ProcessWithBLOBs>();
			processWithBLOBsList.add(processWithBLOBs);

			// 创建流程
			pbi.updateOrAddProcess(processWithBLOBsList, loginStaff);

		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
