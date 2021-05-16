package com.sjy.OA_Sys.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sjy.OA_Sys.bean.ProcessType;
import com.sjy.OA_Sys.bean.ProcessTypeExample;
import com.sjy.OA_Sys.bean.ProcessTypeExample.Criteria;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.ProcessTypeBiz;
import com.sjy.OA_Sys.dao.ProcessTypeMapper;

@Service
public class ProcessTypeBizImpl implements ProcessTypeBiz {

	@Resource
	private ProcessTypeMapper ptm;
	private ProcessTypeExample pte = new ProcessTypeExample();

	@Override
	public List<ProcessType> findProcessType(ProcessType processType, Integer pageNum, Integer pageSize) {
		try {
			Criteria ce = pte.createCriteria();
			if (processType != null) {
				if (processType.getId() != null) {
					ce.andIdEqualTo(processType.getId());
				}
				if (processType.getTypeName() != null) {
					ce.andTypeNameEqualTo(processType.getTypeName());
				}
				if (processType.getTypeState() != null) {
					ce.andTypeStateEqualTo(processType.getTypeState());
				}
			}

			if (pageNum != null && pageSize != null) {
				PageHelper.startPage(pageNum, pageSize);
				return ptm.selectByExample(pte);
			}
			return ptm.selectByExample(pte);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pte.clear();
		}
		return null;
	}

	@Override
	public Result updateOrAddProcessType(List<ProcessType> processTypeList) {
		int flag = 0;
		for (ProcessType processType : processTypeList) {
			if (processType.getId() == null) {
				flag += ptm.insertSelective(processType);
			} else {
				flag += ptm.updateByPrimaryKeySelective(processType);
			}
		}
		if (flag >= processTypeList.size()) {
			return new Result(1, "成功");
		} else {
			return new Result(1, "失败");
		}
	}

	@Override
	public Result delProcessType(Integer[] ids) {
		int flag = 0;
		for (Integer integer : ids) {
			flag += ptm.deleteByPrimaryKey(integer);
		}
		if (flag >= ids.length) {
			return new Result(1, "成功");
		} else {
			return new Result(1, "失败");
		}
	}

}
