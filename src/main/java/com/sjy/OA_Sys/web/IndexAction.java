package com.sjy.OA_Sys.web;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.sjy.OA_Sys.bean.Mail;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.biz.impl.MailBizImpl;

@Controller
public class IndexAction {

	@Resource
	private MailBizImpl mbi;
	
	
	@GetMapping({"/","/index","/index.*"})
	public String toIndex(@SessionAttribute(value="loginStaff") Staff loginStaff,Model m) {
		m.addAttribute("loginStaff", loginStaff);
		
		@SuppressWarnings("unchecked")
		ArrayList<Mail> mailList = (ArrayList<Mail>)mbi.findUnreadMail(loginStaff.getStaffId(), false);
		
		
		m.addAttribute("mailList", mailList);
		return "index";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
