package com.sjy.OA_Sys.scheduleTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduleTask {

	@Scheduled(cron="0 59 23 * * ?")
	public void attSheetArrangTask() {
		// 考勤表的整理 的定时任务
		
	}
	
	@Scheduled(cron="0/2 * * * * ?")
	public void task() {
		System.out.println("执行定时任务时间:"+System.currentTimeMillis());
		
	}
}
