package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.Project;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Task;
import com.sjy.OA_Sys.bean.TaskWithBLOBs;

public interface TaskBiz {

	/**
	 * 添加任务
	 * @param task
	 * @return
	 */
	Result addTask(TaskWithBLOBs task);
	
	/**
	 * 批量添加任务
	 * @param tasks
	 * @return
	 */
	Result addTaskForList(List<TaskWithBLOBs> tasks,String projectId);
	
	/**
	 * 修改
	 * @param task
	 * @return
	 */
	Result updateTask(TaskWithBLOBs task);
	
	/**
	 * 查找任务
	 * @param task
	 * @return
	 */
	List<?> findTask(Task task,Boolean withBLOB, Integer pageNum, Integer pageSize);
	
	/**
	 * 查找该员工参与的任务
	 * @param staffId
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	List<TaskWithBLOBs> findTaskByStaffId(String staffId, Integer pageNum, Integer pageSize);
	
	/**
	 * 根据员工ID查找未完成任务
	 * @param task
	 * @param withBLOB
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	List<?> findNoFinishedTask(String staffID,Boolean withBLOB, Integer pageNum, Integer pageSize);
	
	/**
	 * 查找最后一个
	 * @return
	 */
	Task findLastTask();
}
