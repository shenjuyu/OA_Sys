package com.sjy.OA_Sys.web;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sjy.OA_Sys.bean.ChatRecord;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.biz.impl.ChatRecordBizImpl;
import com.sjy.OA_Sys.biz.impl.StaffBizImpl;

@Controller
@SessionAttributes("loginStaff")
public class ChatServiceAction {

	@Resource
	private StaffBizImpl sbi;
	@Resource
	private ChatRecordBizImpl crb;
	
	@GetMapping("toChatService.do")
	public String toChatService(@SessionAttribute(value = "loginStaff") Staff loginStaff, Model m) {
		List<Staff> staffs = sbi.findStaffForComm(loginStaff);
		Staff addresseeStaff = staffs.get(0);
		
		
		ChatRecord chatRecord = new ChatRecord();
		chatRecord.setChatReceive(addresseeStaff.getStaffId());
		chatRecord.setChatSender(loginStaff.getStaffId());
		
		List<ChatRecord> chatRecordList = crb.findChatRecord(chatRecord, 1, 10);
		
		m.addAttribute("chatRecordList", chatRecordList);
		m.addAttribute("addresseeStaff", addresseeStaff);
		m.addAttribute("isGroup", 0);// 0 不是小组  1 是小组
		
		m.addAttribute("addressBook", staffs);
		return "chat-service::chatService";
	}
	
	@PostMapping("showChatShadow.do")
	public String toShowChatShadow(Staff addresseeStaff,@SessionAttribute(value = "loginStaff") Staff loginStaff, Model m) {
		addresseeStaff = sbi.findStaff(addresseeStaff, null, null).get(0);
		
		ChatRecord chatRecord = new ChatRecord();
		chatRecord.setChatReceive(addresseeStaff.getStaffId());
		chatRecord.setChatSender(loginStaff.getStaffId());
		
		List<ChatRecord> chatRecordList = crb.findChatRecord(chatRecord, 1, 10);
		m.addAttribute("chatRecordList", chatRecordList);
		m.addAttribute("addresseeStaff", addresseeStaff);
		m.addAttribute("isGroup", 0);// 0 不是小组  1 是小组
		return "chat-service::staffChatShadow";
	}
	
	@PostMapping("loadMessage.do")
	@ResponseBody
	public Result toLoadMessage(String staffId,Integer pageNum,@SessionAttribute(value="loginStaff") Staff loginStaff) {
		ChatRecord chatRecord = new ChatRecord();
		chatRecord.setChatReceive(staffId);
		chatRecord.setChatSender(loginStaff.getStaffId());
		List<ChatRecord> chatRecordList = crb.findChatRecord(chatRecord, pageNum, 10);
		System.out.println(chatRecordList.toString());
		
		Result result = null;
		if(chatRecordList.size()>0) {
			result=new Result(1, chatRecordList);
		}else {
			result=new Result(0, "前方无记录");
		}
		return result;
	}
}
