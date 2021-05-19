package com.sjy.OA_Sys.biz.impl;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sjy.OA_Sys.bean.Process;
import com.sjy.OA_Sys.bean.ProcessDetails;
import com.sjy.OA_Sys.bean.ProcessDetailsExample;
import com.sjy.OA_Sys.bean.ProcessDetailsExample.Criteria;
import com.sjy.OA_Sys.bean.ProcessWithBLOBs;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.ProcessDetailsBiz;
import com.sjy.OA_Sys.dao.ProcessDetailsMapper;
import com.sjy.OA_Sys.dao.ProcessMapper;

@Service
public class ProcessDetailsBizImpl implements ProcessDetailsBiz {

	@Resource
	private ProcessMapper pm;
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
	
	/**
     * 两个参数需要的属性
     * processDetails：
     * @param approvedStaff 审核人
     * @param approvedResult 审核结果或审核状态
     * process：
     * @param processApplicant 申请人
     * @param processTaskToStaff 任务转交人
     * @param processType 流程类型
     * @param processTaskSupervise 任务监督人 
     * @param pageNum
     * @param pageSize
     * @return
     */
	@Override
	public List<ProcessDetails> findProcessDetailsForApproved(ProcessDetails processDetails,Process process, Integer pageNum, Integer pageSize) {
		if(pageNum!=null && pageSize !=null) {
			PageHelper.startPage(pageNum, pageSize);
		}
		return pdm.selectForApprovedStaff(processDetails,process);
	}

	@Override
	public Result updateOrAddProcessDetails(List<ProcessDetails> processDetailsList) {
		int flag=0;
		for (ProcessDetails processDetails : processDetailsList) {
			if(processDetails.getId()==null) {
				flag += pdm.insertSelective(processDetails);
			}else {
				flag += pdm.updateByPrimaryKeySelective(processDetails);
			}
		}
		if (flag >= processDetailsList.size()) {
			return new Result(1, "成功");
		} else {
			return new Result(1, "失败");
		}
	}
	
	public Result approvedProcess(ProcessDetails processDetails) {
		if(processDetails.getApprovedResult()==2) {// 如果有人不同意 则终止流程
			
			ProcessWithBLOBs processWithBLOBs = new ProcessWithBLOBs();
			processWithBLOBs.setId(processDetails.getProcessId());
			processWithBLOBs.setProcessFinish(2);
			pm.updateByPrimaryKeySelective(processWithBLOBs);
			
		}else if(processDetails.getApprovedResult()==1){
			ProcessDetails details = pdm.selectByPrimaryKey(processDetails.getId());
			// 若本阶段所有人全部完成则查找下阶段审核人并将其审核状态置为已到达3
			if(!checkFinishInThisStage(details.getProcessStage())) {
				ProcessDetails processDetailsTemp = new ProcessDetails();
				processDetailsTemp.setProcessStage(details.getProcessStage()+1);
				List<ProcessDetails> processDetailsList = findProcessDetails(processDetailsTemp, null, null);
				
				if(processDetailsList==null || processDetailsList.size()==0) { // 说明无下一阶段，流程执行完毕
					ProcessWithBLOBs processWithBLOBs = new ProcessWithBLOBs();
					processWithBLOBs.setId(processDetails.getProcessId());
					processWithBLOBs.setProcessFinish(1);
					pm.updateByPrimaryKeySelective(processWithBLOBs);
				}else {
					// 有下一阶段，将下阶段审核人并将其审核状态置为已到达3
					for (ProcessDetails processDetails2 : processDetailsList) {
						processDetails2.setApprovedResult(3);
					}
					updateOrAddProcessDetails(processDetailsList);
				}
			}
		}
		int flag = pdm.updateByPrimaryKeySelective(processDetails);
		
		if (flag >= 1) {
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

	/**
	 * 检查本阶段所有人全部完成
	 * @param id
	 * @return
	 */
	public boolean checkFinishInThisStage(Integer stage) {
		// 查找本阶段所有评审
		ProcessDetails detailsTemp = new ProcessDetails();
		detailsTemp.setProcessStage(stage);
		List<ProcessDetails> processDetailsList = findProcessDetails(detailsTemp, null, null);
		for (ProcessDetails processDetails : processDetailsList) {
			if(processDetails.getApprovedResult()!=1 || processDetails.getApprovedResult()!=2) {
				return false;
			}
		}
		return true;
	}
	
}
