package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.Calendar;
import com.sjy.OA_Sys.bean.Result;

public interface CalendarBiz {

	/**
	 * 添加/修改日程
	 * @param calendar
	 * @return
	 */
	Result addCalendar(Calendar calendar);
	
	/**
	 * 根据id查找日程
	 * @param id
	 * @return
	 */
	Calendar findCalendarById(Integer id);
	
	/**
	 * 查找日程
	 * @param calendar
	 * @return
	 */
	List<Calendar> findCalendar(Calendar calendar);
}
