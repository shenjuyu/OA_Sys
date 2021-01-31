package com.sjy.OA_Sys.biz.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;

import com.sjy.OA_Sys.bean.AttSheet;
import com.sjy.OA_Sys.bean.AttSheetExample;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.AttSheetBiz;
import com.sjy.OA_Sys.dao.AttSheetMapper;
import com.sjy.OA_Sys.util.TimeUtil;

public class AttSheetBizImpl implements AttSheetBiz {

	@Resource
	private AttSheetMapper am;

	private AttSheetExample ae = new AttSheetExample();
	
	@Value("${contentTips.closingTimeHour}")
	private String closingTimeHour; // 下班的时间 时
	@Value("${contentTips.closingTimeMin}")
	private String closingTimeMin;	// 下班的时间 分
	@Value("${contentTips.salaryDay}")
	private String salaryDay;	// 发放工资的时间 日
	
	@Override
	public List<AttSheet> findAttSheetForMonth(AttSheet attSheet) {
		//查找出勤记录
		// 获取本月开始时间与结束时间
		Timestamp toMonthStart = TimeUtil.getMonthTime(10, 0, 0);
		Timestamp toNextMonthEnd = TimeUtil.getNextMonthTime(1, 10, 0, 0);
		
		ae.createCriteria()
			.andStaffIdEqualTo(attSheet.getStaffId())
			.andAttSheetTimeEndBetween(toMonthStart, toNextMonthEnd)
			.andAttSheetSituationEqualTo(attSheet.getAttSheetSituation());
		List<AttSheet> attSheets = am.selectByExample(ae);
		ae.clear();
		return attSheets;
	}

	@Override
	public Result addAttSheet(AttSheet attSheet) {
		int code = am.insertSelective(attSheet);
		if (code > 0) {
			return new Result(1, "签到成功");
		} else {
			return new Result(0, "签到失败");
		}
	}

	@Override
	public Result updateAttSheet(AttSheet attSheet) {
		// 先确定两个时间 今天的开始时间 00:00 今天的结束时间 24:00
		Timestamp nowDayStart = TimeUtil.getStartTime();
		Timestamp nowDayEnd = TimeUtil.getEndTime();
		
		//获取下班时间 与 当前时间
		long closingTime = TimeUtil.getDayTime(Integer.valueOf(closingTimeHour), Integer.valueOf(closingTimeMin)).getTime();
		long nowTime = new Date().getTime();
		
		// 查出 签到时间 在这今天之内 且 签退时间 为空的 员工签到记录
		ae.createCriteria()
			.andStaffIdEqualTo(attSheet.getStaffId())
			.andAttSheetTimeStartBetween(nowDayStart, nowDayEnd)
			.andAttSheetTimeEndIsNull();
		List<AttSheet> attSheets = am.selectByExample(ae);
		
		if(attSheets.size()<=0) { // 如果查不到则说明该员工今天未签到 或 已签退  
			ae.clear();
			ae.createCriteria()
				.andStaffIdEqualTo(attSheet.getStaffId())
				.andAttSheetTimeStartBetween(nowDayStart, nowDayEnd)
				.andAttSheetTimeEndIsNotNull();
			List<AttSheet> attSheetList = am.selectByExample(ae);
			ae.clear();
			
			if(attSheetList.size()>0 && closingTime<nowTime) {	// 已签退
				return new Result(0, "您已签退，请勿重复签退");
			}
			
			//触发签到条件
			attSheet.setAttSheetTimeStart(new Timestamp(new Date().getTime()));
			attSheet.setAttSheetTimeEnd(null);
			return addAttSheet(attSheet);
		}
		
		// 触发签退条件
		if(nowTime<closingTime) {
			return new Result(0, "未到下班时间，请不要签退");
		}
		ae.createCriteria()
			.andStaffIdEqualTo(attSheet.getStaffId())
			.andAttSheetTimeStartBetween(nowDayStart, nowDayEnd);
		attSheet.setAttSheetTimeEnd(new Timestamp(nowTime));
		int code = am.updateByExampleSelective(attSheet, ae);
		ae.clear();
		if (code > 0) {
			return new Result(1, "签退成功");
		} else {
			return new Result(0, "签退失败");
		}
	}
}
