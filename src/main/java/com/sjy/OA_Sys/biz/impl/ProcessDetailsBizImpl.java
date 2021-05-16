package com.sjy.OA_Sys.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sjy.OA_Sys.bean.ProcessDetails;
import com.sjy.OA_Sys.bean.ProcessDetailsExample;
import com.sjy.OA_Sys.bean.ProcessDetailsExample.Criteria;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.ProcessDetailsBiz;
import com.sjy.OA_Sys.dao.ProcessDetailsMapper;

@Service
public class ProcessDetailsBizImpl implements ProcessDetailsBiz {

	@Resource
	private ProcessDetailsMapper pdm;
	private ProcessDetailsExample pde = new ProcessDetailsExample();

	@Override
	public List<ProcessDetails> findProcessDetails(ProcessDetails processDetails, Integer pageNum, Integer pageSize) {
		try {
			Criteria ce = pde.createCriteria();
			if (processDetails != null) {
				if (processDetails.getId() != null) {
					ce.andIdEqualTo(processDetails.getId());
				}
				if (processDetails.getProcessId() != null) {
					ce.andProcessIdEqualTo(processDetails.getProcessId());
				}
				if (processDetails.getProcessStage() != null) {
					ce.andProcessStageEqualTo(processDetails.getProcessStage());
				}
				if (processDetails.getApprovedResult() != null) {
					ce.andApprovedResultEqualTo(processDetails.getApprovedResult());
				}
				if (processDetails.getApprovedStaff() != null) {
					ce.andApprovedStaffEqualTo(processDetails.getApprovedStaff());
				}
			}
			if (pageNum != null && pageSize != null) {
				PageHelper.startPage(pageNum, pageSize);
				return pdm.selectByExample(pde);
			}
			return pdm.selectByExample(pde);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pde.clear();
		}
		return null;
	}

	@Override
	public Result updateOrAddProcessDetails(List<ProcessDetails> processDetailsList) {
		int flag=0;
		for (ProcessDetails processDetails : processDetailsList) {
			if(processDetails.getId()==null) {
				flag += pdm.insertSelective(processDetails);
			}else {
				flag += pdm.updateByPrimaryKeyWithBLOBs(processDetails);
			}
		}
		if (flag >= processDetailsList.size()) {
			return new Result(1, "成功");
		} else {
			return new Result(1, "失败");
		}
	}

	@Override
	public Result delProcessDetails(Integer[] ids) {
		int flag = 0;
		for (Integer integer : ids) {
			flag += pdm.deleteByPrimaryKey(integer);
		}
		if (flag >= ids.length) {
			return new Result(1, "成功");
		} else {
			return new Result(1, "失败");
		}
	}

}
