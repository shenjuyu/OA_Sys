package com.sjy.OA_Sys.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sjy.OA_Sys.bean.Calendar;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.biz.impl.CalendarBizImpl;
import com.sjy.OA_Sys.util.TimeUtil;

@Controller
@SessionAttributes("loginStaff")
public class CalendarAction {

	@Resource
	private CalendarBizImpl cbi;

	@GetMapping("toCalendar.do")
	public String toCalendarAction() {
		return "full_calendar::calendarShow";
	}

	@GetMapping("getCalendar.do")
	@ResponseBody
	public Result toGetCalendar(@SessionAttribute(value = "loginStaff") Staff loginStaff) {
		Calendar calendar = new Calendar();
		calendar.setStaffId(loginStaff.getStaffId());
		calendar.setCalendarState(1);
		List<Calendar> calendarList = cbi.findCalendar(calendar);
		return new Result(1, calendarList);
	}

	@PostMapping("toAddCalendar.do")
	@ResponseBody
	public Result toAddCalendar(Integer calendarId, String calendarTitle, String calendarTimeStart,
			String calendarTimeEnd, String calendarDes, @SessionAttribute(value = "loginStaff") Staff loginStaff) {
		
		Calendar calendar = new Calendar();
		if(calendarId!=null && calendarId != 0) {
			calendar.setId(calendarId);
		}
		calendar.setCalendarTitle(calendarTitle);
		calendar.setCalendarTimeStart(TimeUtil.formatDateTime(calendarTimeStart));
		calendar.setCalendarTimeEnd(TimeUtil.formatDateTime(calendarTimeEnd));
		calendar.setCalendarDes(calendarDes);
		calendar.setCalendarState(1); // 1 正常 0 已删除 2 已过期
		calendar.setStaffId(loginStaff.getStaffId());
		return cbi.addCalendar(calendar);
	}
	
	@PostMapping("toDelCalendar.do")
	@ResponseBody
	public Result toDelCalendar(Integer calendarId, @SessionAttribute(value = "loginStaff") Staff loginStaff) {
		System.out.println(calendarId+"++++++++++++");
		Calendar calendar = new Calendar();
		calendar.setId(calendarId);
		calendar.setCalendarState(0);
		return cbi.addCalendar(calendar);
		
	}
	
}
