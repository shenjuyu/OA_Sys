package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.ProcessType;
import com.sjy.OA_Sys.bean.Result;

public interface ProcessTypeBiz {

	/**
	 * 查找流程类型
	 * @param processType
	 * @return
	 */
	 List<ProcessType> findProcessType(ProcessType processType, Integer pageNum, Integer pageSize);
	
	/**
	 * 修改或新增流程类型
	 * @param processTypeList
	 * @return
	 */
	Result updateOrAddProcessType(List<ProcessType> processTypeList);

	/**
	 * 删除流程类型
	 * @param ids
	 * @return
	 */
	Result delProcessType(Integer[] ids);
}
