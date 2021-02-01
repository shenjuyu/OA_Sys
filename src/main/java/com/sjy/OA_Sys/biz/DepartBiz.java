package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.Depart;
import com.sjy.OA_Sys.bean.Result;

public interface DepartBiz {

	/**
	 * 查找部门
	 * @param de
	 * @return
	 */
	List<Depart> findDepart(Depart de);
	
	/**
	 * 更新部门
	 * @param de
	 * @return
	 */
	Result upDateDepart(Depart de);
	
	/**
	 * 新增部门
	 * @param de
	 * @return
	 */
	Result addDepart(Depart de);
}
