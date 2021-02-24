package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.Mail;
import com.sjy.OA_Sys.bean.Project;
import com.sjy.OA_Sys.bean.ProjectWithBLOBs;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.TaskWithBLOBs;

public interface ProjectBiz {

	/**
	 * 添加项目
	 * @param project
	 * @param taskWithBLOBs
	 * @return
	 */
	Result addProject(ProjectWithBLOBs project,List<TaskWithBLOBs> taskWithBLOBs);
	
	/**
	 * 查找项目
	 * @param project
	 * @param withBLOB
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	List<?> findProject(Project project,Boolean withBLOB,Integer pageNum,Integer pageSize);
	
	/**
	 * 修改项目
	 * @param project
	 * @return
	 */
	Result updateProject(ProjectWithBLOBs project);

	/**
	 * 查找最后一个
	 * @return
	 */
	Project findLastPro();
	
}
