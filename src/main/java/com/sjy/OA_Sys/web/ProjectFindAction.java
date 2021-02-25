package com.sjy.OA_Sys.web;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sjy.OA_Sys.bean.AttFileName;
import com.sjy.OA_Sys.bean.Project;
import com.sjy.OA_Sys.bean.ProjectWithBLOBs;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.bean.Task;
import com.sjy.OA_Sys.bean.TaskWithBLOBs;
import com.sjy.OA_Sys.biz.impl.ProjectBizImpl;
import com.sjy.OA_Sys.biz.impl.TaskBizImpl;
import com.sjy.OA_Sys.util.FileOperationUtil;

@Controller
@SessionAttributes("loginStaff")
public class ProjectFindAction {

	@Resource
	private ProjectBizImpl pbi;
	@Resource
	private TaskBizImpl tbi;

	@GetMapping("toProjectFind.do")
	public String toProjectFind(@SessionAttribute(value = "loginStaff") Staff staff, Model m) {
		List<ProjectWithBLOBs> projects = (List<ProjectWithBLOBs>) pbi.findProject(null, true, 1, 10);

		m.addAttribute("projectList", projects);
		return "project-find::projectFind";
	}

	@PostMapping("showProjectDetils.do")
	public String toShowProjectDetils(Project project,Model m) {
		List<ProjectWithBLOBs> projectWithBLOBs = (List<ProjectWithBLOBs>) pbi.findProject(project, true, null, null);
		List<TaskWithBLOBs> taskWithBLOBs=null;
		
		if(projectWithBLOBs==null || projectWithBLOBs.size()!=1) {
			return "plugin::proDes";
		}
		ProjectWithBLOBs projectGot = projectWithBLOBs.get(0);
		
		// 对附件的处理
		String fileNames = projectGot.getProAttachment();
		if(fileNames!=null || !fileNames.equals("")) {
			List<String> fileNameListBefore = FileOperationUtil.fileNameDismantling(fileNames);// 解密前的
			List<AttFileName> fileNameList = new ArrayList<AttFileName>();
			for (int i = 0; i < fileNameListBefore.size(); i++) {
				AttFileName attFileName = new AttFileName(fileNameListBefore.get(i), FileOperationUtil.fileNameDecryption(fileNameListBefore.get(i)));
				fileNameList.add(attFileName);
			}
			m.addAttribute("fileNameList", fileNameList);
		}
		
		m.addAttribute("project", projectGot);
		
		Task task = new Task();
		task.setProId(project.getProId());
		taskWithBLOBs= (List<TaskWithBLOBs>) tbi.findTask(task, true, null, null);
		if(taskWithBLOBs==null && taskWithBLOBs.size()==0) {
			return "plugin::proDes";
		}
		System.out.println(taskWithBLOBs.size());
		m.addAttribute("taskList", taskWithBLOBs);
		
		return "plugin::proDes";
	}

	@PostMapping("projectShowToPage.do")
	public String toprojectShowToPage(Integer page, Model m) {
		List<ProjectWithBLOBs> projects = (List<ProjectWithBLOBs>) pbi.findProject(null, true, page, 10);
		m.addAttribute("projectList", projects);
		return "project-find::projectFind";
	}
	
	@Value("${spring.resources.staticLocations}")
	private String[] filePath;
	
	@GetMapping("downloadProjectAtta.do")
	public String downloadProjectFile(String fileName, HttpServletRequest request, HttpServletResponse response) {

		String trueName = FileOperationUtil.fileNameDecryption(fileName);

		if (fileName != null) {
			String path = filePath[0].substring("file:/".length());
			// 设置文件路径
			File file = new File(path + "projectFile/" + fileName);
			// 如果文件存在，则进行下载
			if (file.exists()) {
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				OutputStream os = null;
				try {
					// 配置文件下载
					response.setHeader("content-type", "application/octet-stream");
					response.setContentType("application/octet-stream");
					// 下载文件能正常显示中文
					response.setHeader("Content-Disposition",
							"attachment;filename=" + URLEncoder.encode(trueName, "UTF-8"));
					// 实现文件下载
					byte[] buffer = new byte[1024];

					fis = new FileInputStream(file);
					bis = new BufferedInputStream(fis);
					os = response.getOutputStream();
					int i = bis.read(buffer);
					while (i != -1) {
						os.write(buffer, 0, i);
						os.flush();
						i = bis.read(buffer);
					}
					return null;

				} catch (Exception e) {
					return null;

				} finally {
					if (bis != null) {
						try {
							bis.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					if (fis != null) {
						try {
							fis.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					if (os != null) {
						try {
							os.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}

		return null;
	}
}
