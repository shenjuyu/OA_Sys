package com.sjy.OA_Sys.biz;

import java.util.List;

import javax.annotation.Resource;

import com.sjy.OA_Sys.bean.Process;
import com.sjy.OA_Sys.bean.ProcessExample;
import com.sjy.OA_Sys.bean.ProcessWithBLOBs;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.dao.ProcessMapper;

public interface ProcessBiz {

	/**
	 * 查找流程
	 * @param process
	 * @return
	 */
	List<Process> findProcess(Process process, Integer pageNum, Integer pageSize);
	
	/**
	 * 查询或更新
	 * @param processWithBLOBsList
	 * @param LoginStaff
	 * @return
	 */
	Result updateOrAddProcess(List<ProcessWithBLOBs> processWithBLOBsList, Staff LoginStaff);
	
	Result delProcess(String[] id);
}
