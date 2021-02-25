package com.sjy.OA_Sys.biz.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sjy.OA_Sys.bean.Project;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Task;
import com.sjy.OA_Sys.bean.TaskExample;
import com.sjy.OA_Sys.bean.TaskExample.Criteria;
import com.sjy.OA_Sys.bean.TaskGroup;
import com.sjy.OA_Sys.bean.TaskWithBLOBs;
import com.sjy.OA_Sys.biz.TaskBiz;
import com.sjy.OA_Sys.dao.TaskMapper;
import com.sjy.OA_Sys.util.CreateSequenceCodeUtil;

@Service
public class TaskBizImpl implements TaskBiz {

	@Resource
	private TaskMapper tm;
	@Resource
	private TaskGroupBizImpl tgbi;

	@Resource
	private CreateSequenceCodeUtil codeUtil;
	
	private TaskExample te = new TaskExample();

	@Override
	public Result addTask(TaskWithBLOBs task) {
		int code = tm.insertSelective(task);
		if (code > 0) {
			return new Result(1, "添加成功");
		} else {
			return new Result(0, "添加失败");
		}
	}

	@Override
	public Result addTaskForList(List<TaskWithBLOBs> tasks,String projectId) {
		int code = 0;
		for (TaskWithBLOBs taskWithBLOBs : tasks) {
			taskWithBLOBs.setProId(projectId);
			taskWithBLOBs.setTaskId(codeUtil.createCode("task"));
			code += tm.insertSelective(taskWithBLOBs);
		}

		if (code >= tasks.size()) {
			return new Result(1, "添加成功");
		} else {
			return new Result(0, "添加失败");
		}
	}

	@Override
	public Result updateTask(TaskWithBLOBs task) {
		te.createCriteria().andTaskIdEqualTo(task.getTaskId());
		int code = tm.updateByExampleSelective(task, te);
		if (code==1) {
			return new Result(1, "添加成功");
		} else {
			return new Result(0, "添加失败");
		}
	}

	@Override
	public List<?> findTask(Task task, Boolean withBLOB, Integer pageNum, Integer pageSize) {
		try {
			Criteria criteria = te.createCriteria();
			if (task != null) {
				if (task.getProId() != null) {
					criteria.andProIdEqualTo(task.getProId());
				}
				if (task.getTaskGroupId() != null) {
					criteria.andTaskGroupIdEqualTo(task.getTaskGroupId());
				}
				if (task.getTaskId() != null) {
					criteria.andTaskIdEqualTo(task.getTaskId());
				}
				if (task.getTaskName() != null) {
					criteria.andTaskNameEqualTo(task.getTaskName());
				}
				if (task.getTaskRateProgress() != null) {
					criteria.andTaskRateProgressEqualTo(task.getTaskRateProgress());
				}
				if (task.getTaskState() != null) {
					criteria.andTaskStateEqualTo(task.getTaskState());
				}
				if (task.getTaskTimeEnd() != null) {
					criteria.andTaskTimeEndEqualTo(task.getTaskTimeEnd());
				}
				if (task.getTaskTimeStart() != null) {
					criteria.andTaskTimeStartEqualTo(task.getTaskTimeStart());
				}
			}

			// 分页
			if (pageNum != null && pageSize != null) {
				if (withBLOB) {
					PageHelper.startPage(pageNum, pageSize);
					return tm.selectByExampleWithBLOBs(te);
				} else {
					PageHelper.startPage(pageNum, pageSize);
					return tm.selectByExample(te);
				}
			}

			if (withBLOB) {
				return tm.selectByExampleWithBLOBs(te);
			} else {
				return tm.selectByExample(te);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			te.clear();
		}
		return null;
	}
	

	@Override
	public List<TaskWithBLOBs> findTaskByStaffId(String staffId, Integer pageNum, Integer pageSize) {
		if(pageNum!=null && pageSize!=null) {
			PageHelper.startPage(pageNum, pageSize);
			return tm.selectByStaffId(staffId);
		}
		return tm.selectByStaffId(staffId);
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<TaskWithBLOBs> findNoFinishedTask(String staffId, Boolean withBLOB, Integer pageNum, Integer pageSize) {
		// 先查出该员工位于哪几个小组 在查出这几个小组未完成的任务
		List<TaskWithBLOBs> noFinishedTaskList = new ArrayList<TaskWithBLOBs>();
		TaskGroup taskGroup = new TaskGroup();
		taskGroup.setStaffId(staffId);
		List<TaskGroup> taskGroups = tgbi.findTaskGroup(taskGroup);
		if (taskGroups.size() > 0) {
			Task task = new Task();
			task.setTaskState(3);
			for (TaskGroup taskGroupFind : taskGroups) {
				task.setTaskGroupId(taskGroupFind.getTaskGroupId());
				List<TaskWithBLOBs> taskWithBLOBs = (List<TaskWithBLOBs>) findTask(task, withBLOB, pageNum, pageSize);
				if(taskWithBLOBs==null || taskWithBLOBs.size()==0) {
					break;
				}
				noFinishedTaskList.addAll(taskWithBLOBs);
			}

		}

		return noFinishedTaskList;
	}

	@Override
	public Task findLastTask() {
		te.setOrderByClause("id desc");
		List<Task> tasks = tm.selectByExample(te);
		if(tasks.size()<1) {
			return null;
		}
		return tasks.get(0);
	}

}
