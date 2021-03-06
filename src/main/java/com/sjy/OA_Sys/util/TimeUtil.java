package com.sjy.OA_Sys.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 获取时间工具类
 * @author 沈俊羽
 *
 * 2021年1月31日
 */
public class TimeUtil {
	
	/**
	 * 去T
	 * @param date
	 * @return
	 */
	public static Timestamp formatDateTime(String date) {
		date = date.replace("T", " ");
		Date dateTemp = null;
		try {
			dateTemp = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Timestamp timestamp = new Timestamp(dateTemp.getTime());
		return timestamp;
	}
	
	/**
	 * 格式化
	 * @param date 需要格式化的日期
	 * @param pattern 格式：例：yyyy-MM-dd HH:mm:SS
	 * @return
	 */
	public static String formatDateTime(Date date,String pattern) {
		SimpleDateFormat formatter= new SimpleDateFormat(pattern);
		return formatter.format(date);
	}
	
	/**
	 * 获取下个月的指定时间
	 * @param dayOfMonth
	 * @param hour
	 * @param minute
	 * @return
	 */
	public static Timestamp getNextMonthTime(Integer addMonth,Integer dayOfMonth,Integer hour,Integer minute) {
		Calendar toNextMonth = Calendar.getInstance();
		toNextMonth.add(Calendar.MONTH, addMonth);
		toNextMonth.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		toNextMonth.set(Calendar.HOUR, hour);
		toNextMonth.set(Calendar.MINUTE, minute);
		toNextMonth.set(Calendar.SECOND, 0);
		toNextMonth.set(Calendar.MILLISECOND, 0);
		return new Timestamp(toNextMonth.getTime().getTime());
	}
	
	/**
	 * 获取本月的指定时间
	 * @param dayOfMonth
	 * @param hour
	 * @param minute
	 * @return
	 */
	public static Timestamp getMonthTime(Integer dayOfMonth,Integer hour,Integer minute) {
		Calendar toMonth = Calendar.getInstance();
		toMonth.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		toMonth.set(Calendar.HOUR, hour);
		toMonth.set(Calendar.MINUTE, minute);
		toMonth.set(Calendar.SECOND, 0);
		toMonth.set(Calendar.MILLISECOND, 0);
		return new Timestamp(toMonth.getTime().getTime());
	}
	
	/**
	 * 获取本日指定时间
	 * @param hour
	 * @param minute
	 * @return
	 */
	public static Timestamp getDayTime(Integer hour,Integer minute) {
		Calendar today = Calendar.getInstance();
		today.set(Calendar.HOUR, hour);
		today.set(Calendar.MINUTE, minute);
		today.set(Calendar.SECOND, 0);
		today.set(Calendar.MILLISECOND, 0);
		return new Timestamp(today.getTime().getTime());
	}

	/**
	 * 获取今日开始时间
	 * @return
	 */
	public static Timestamp getStartTime() {
		Calendar todayStart = Calendar.getInstance();
		todayStart.set(Calendar.HOUR, 0);
		todayStart.set(Calendar.MINUTE, 0);
		todayStart.set(Calendar.SECOND, 0);
		todayStart.set(Calendar.MILLISECOND, 0);
		return new Timestamp(todayStart.getTime().getTime());
	}

	/**
	 * 获取今日结束时间
	 * @return
	 */
	public static Timestamp getEndTime() {
		Calendar todayEnd = Calendar.getInstance();
		todayEnd.set(Calendar.HOUR, 23);
		todayEnd.set(Calendar.MINUTE, 59);
		todayEnd.set(Calendar.SECOND, 59);
		todayEnd.set(Calendar.MILLISECOND, 999);
		return new Timestamp(todayEnd.getTime().getTime());
	}
}
