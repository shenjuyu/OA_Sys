package com.sjy.OA_Sys.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.sjy.OA_Sys.bean.AttSheet;
import com.sjy.OA_Sys.bean.Mail;
import com.sjy.OA_Sys.bean.Notice;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.bean.Task;
import com.sjy.OA_Sys.bean.TaskWithBLOBs;
import com.sjy.OA_Sys.biz.impl.AttSheetBizImpl;
import com.sjy.OA_Sys.biz.impl.MailBizImpl;
import com.sjy.OA_Sys.biz.impl.NoticeBizImpl;
import com.sjy.OA_Sys.biz.impl.TaskBizImpl;

@Controller
public class IndexAction {

	@Resource
	private MailBizImpl mbi;
	@Resource
	private NoticeBizImpl nbi;
	@Resource
	private TaskBizImpl tbi;
	@Resource
	private AttSheetBizImpl asbi;
	
	
	@GetMapping({"/","/index","/index.*"})
	public String toIndex(@SessionAttribute(value="loginStaff") Staff loginStaff,Model m) {
		m.addAttribute("loginStaff", loginStaff);
		
		// 未读邮件
		@SuppressWarnings("unchecked")
		ArrayList<Mail> mailList = (ArrayList<Mail>)mbi.findUnreadMail(loginStaff.getStaffId(), false);
		
		// 未读通知
		Notice notice = new Notice();
		// 被通知人是所有公司员工
		notice.setNoticeStaffAddressee(2);
		List<Notice> noReadNoticeList =  nbi.findNotice(notice,false,loginStaff.getStaffId(), null, null);
		
		// 登录员工与通知人属于同一部门
		notice.setNoticeStaffAddressee(1);
		noReadNoticeList.addAll(nbi.findNotice(notice,false,loginStaff.getStaffId(), null, null));
		
		// 未完成任务
		List<TaskWithBLOBs> noFinishedTask = tbi.findNoFinishedTask(loginStaff.getStaffId(), false, null, null);
		
		// 本月出勤情况
		AttSheet attSheet = new AttSheet(null, loginStaff.getStaffId(), null, null, 1);
		List<AttSheet> attSheets = asbi.findAttSheetForMonth(attSheet);
		int workDays = attSheets.size();
		attSheet.setAttSheetSituation(0);
		int leaveDays = asbi.findAttSheetForMonth(attSheet).size();
		
		
		m.addAttribute("mailList", mailList);
		m.addAttribute("noReadNoticeList", noReadNoticeList);
		m.addAttribute("noFinishedTask", noFinishedTask);
		m.addAttribute("workDays", workDays);
		m.addAttribute("leaveDays", leaveDays);
		return "index";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
