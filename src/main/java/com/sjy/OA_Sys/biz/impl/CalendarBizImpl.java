package com.sjy.OA_Sys.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sjy.OA_Sys.bean.Calendar;
import com.sjy.OA_Sys.bean.CalendarExample;
import com.sjy.OA_Sys.bean.CalendarExample.Criteria;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.CalendarBiz;
import com.sjy.OA_Sys.dao.CalendarMapper;

@Service
public class CalendarBizImpl implements CalendarBiz {

	@Resource
	private CalendarMapper cm;
	
	private CalendarExample ce = new CalendarExample();

	@Override
	public Result addCalendar(Calendar calendar) {
		int code;
		if (calendar.getId() != null && findCalendarById(calendar.getId()) != null) {
			code = cm.updateByPrimaryKeySelective(calendar);
		} else {
			code = cm.insertSelective(calendar);
		}
		
		if(code==1) {
			return new Result(1, "成功");
		}
		return new Result(0, "失败");
	}

	@Override
	public Calendar findCalendarById(Integer id) {
		return cm.selectByPrimaryKey(id);
	}

	@Override
	public List<Calendar> findCalendar(Calendar calendar) {
		try {
			Criteria criteria = ce.createCriteria();
			if(calendar!=null) {
				if(calendar.getId()!=null) {
					criteria.andIdEqualTo(calendar.getId());
				}
				if(calendar.getCalendarTitle()!=null) {
					criteria.andCalendarTitleLike(calendar.getCalendarTitle());
				}
				if(calendar.getStaffId()!=null) {
					criteria.andStaffIdEqualTo(calendar.getStaffId());
				}
				if(calendar.getCalendarState()!=null) {
					criteria.andCalendarStateEqualTo(calendar.getCalendarState());
				}
			}
			return cm.selectByExample(ce);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ce.clear();
		}
		return null;
	}

}
