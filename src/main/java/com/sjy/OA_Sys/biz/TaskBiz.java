package com.sjy.OA_Sys.biz;

import java.util.List;

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
	Result addTaskForList(List<TaskWithBLOBs> tasks);
	
	/**
	 * 查找任务
	 * @param task
	 * @return
	 */
	List<?> findTask(Task task,Boolean withBLOB, Integer pageNum, Integer pageSize);
	
	/**
	 * 根据员工ID查找未完成任务
	 * @param task
	 * @param withBLOB
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	List<?> findNoFinishedTask(String staffID,Boolean withBLOB, Integer pageNum, Integer pageSize);
}
