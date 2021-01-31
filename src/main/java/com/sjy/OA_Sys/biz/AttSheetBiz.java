package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.AttSheet;
import com.sjy.OA_Sys.bean.Result;

public interface AttSheetBiz {

	/**
	 * 查找一个月的出勤记录
	 * @param attSheet
	 * @return
	 */
	List<AttSheet> findAttSheetForMonth(AttSheet attSheet);
	
	/**
	 * 添加出勤记录
	 * @param attSheet
	 * @return
	 */
	Result addAttSheet(AttSheet attSheet);
	
	/**
	 * 更新出勤记录
	 * @param attSheet
	 * @return
	 */
	Result updateAttSheet(AttSheet attSheet);
	
}
