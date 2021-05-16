package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.ProcessDetails;
import com.sjy.OA_Sys.bean.Result;

public interface ProcessDetailsBiz {

	List<ProcessDetails> findProcessDetails(ProcessDetails processDetails, Integer pageNum, Integer pageSize);
	
	Result updateOrAddProcessDetails(List<ProcessDetails> processDetailsList);
	
	Result delProcessDetails(Integer[] ids);
}
