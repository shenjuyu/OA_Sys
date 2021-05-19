package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.Process;
import com.sjy.OA_Sys.bean.ProcessDetails;
import com.sjy.OA_Sys.bean.Result;

public interface ProcessDetailsBiz {

	List<ProcessDetails> findProcessDetails(ProcessDetails processDetails, Integer pageNum, Integer pageSize);
	
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
	List<ProcessDetails> findProcessDetailsForApproved(ProcessDetails processDetails,Process process, Integer pageNum, Integer pageSize);
	
	Result updateOrAddProcessDetails(List<ProcessDetails> processDetailsList);
	
	Result delProcessDetails(Integer[] ids);
}
