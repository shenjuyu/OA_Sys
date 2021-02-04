package com.sjy.OA_Sys.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.TaskGroup;
import com.sjy.OA_Sys.bean.TaskGroupExample;
import com.sjy.OA_Sys.bean.TaskGroupExample.Criteria;
import com.sjy.OA_Sys.biz.TaskGroupBiz;
import com.sjy.OA_Sys.dao.TaskGroupMapper;

@Service
public class TaskGroupBizImpl implements TaskGroupBiz {

	@Resource
	private TaskGroupMapper tgm;

	private TaskGroupExample tge = new TaskGroupExample();

	@Override
	public List<TaskGroup> findTaskGroup(TaskGroup taskGroup) {
		try {
			Criteria criteria = tge.createCriteria();
			if (taskGroup != null) {
				if (taskGroup.getId() != null) {
					criteria.andIdEqualTo(taskGroup.getId());
				}
				if (taskGroup.getStaffId() != null) {
					criteria.andStaffIdEqualTo(taskGroup.getStaffId());
				}
				if (taskGroup.getTaskGroupId() != null) {
					criteria.andTaskGroupIdEqualTo(taskGroup.getTaskGroupId());
				}
				if (taskGroup.getTaskGroupName() != null) {
					criteria.andTaskGroupNameLike(taskGroup.getTaskGroupName());
				}
				if (taskGroup.getTaskGroupPower() != null) {
					criteria.andTaskGroupPowerEqualTo(taskGroup.getTaskGroupPower());
				}
			}

			return tgm.selectByExample(tge);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			tge.clear();
		}

		return null;
	}

	@Override
	public Result addTaskGroup(TaskGroup taskGroup) {
		int code = tgm.insertSelective(taskGroup);
		if (code > 0) {
			return new Result(1, "添加成功");
		} else {
			return new Result(0, "添加失败");
		}
	}

	@Override
	public Result updateTaskGroup(TaskGroup taskGroup) {
		int code = tgm.updateByPrimaryKeySelective(taskGroup);
		if (code > 0) {
			return new Result(1, "修改成功");
		} else {
			return new Result(0, "修改失败");
		}
	}

}
