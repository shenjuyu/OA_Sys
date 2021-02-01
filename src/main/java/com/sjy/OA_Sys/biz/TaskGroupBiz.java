package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.TaskGroup;

public interface TaskGroupBiz {

	/**
	 * 查找小组
	 * @param taskGroup
	 * @return
	 */
	List<TaskGroup> findTaskGroup(TaskGroup taskGroup);
	
	/**
	 * 添加小组
	 * @param taskGroup
	 * @return
	 */
	Result addTaskGroup(TaskGroup taskGroup);
	
	/**
	 * 修改小组
	 * @param taskGroup
	 * @return
	 */
	Result updateTaskGroup(TaskGroup taskGroup);
}
