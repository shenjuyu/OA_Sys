package com.sjy.OA_Sys.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.sjy.OA_Sys.bean.Notice;
import com.sjy.OA_Sys.bean.NoticeNum;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.biz.impl.NoticeBizImpl;
import com.sjy.OA_Sys.biz.impl.NoticeNumBizImpl;

@Controller
public class NoticeAction {

	@Resource
	private NoticeBizImpl nbi;
	@Resource
	private NoticeNumBizImpl nnbi;

	@GetMapping("toNotice.do")
	public String toNotice(@SessionAttribute(value="loginStaff") Staff loginStaff,Model m) {
		Notice notice = new Notice();
		List<String> addressee = new ArrayList<String>();
		addressee.add("2");
		addressee.add(loginStaff.getDepartId());
		List<Notice> noticeList = nbi.findNotice(notice, addressee, null, loginStaff.getStaffId(), 1, 2);
		
		m.addAttribute("noticeList", noticeList);
		return "notice::noticeList";
	}
	
	@PostMapping("noticeShowToPage.do")
	public String toNoticeShowToPage(Integer page, @SessionAttribute(value="loginStaff") Staff loginStaff, Model m) {
		Notice notice = new Notice();
		List<String> addressee = new ArrayList<String>();
		addressee.add("2");
		addressee.add(loginStaff.getDepartId());
		List<Notice> noticeList = nbi.findNotice(notice, addressee, null, loginStaff.getStaffId(), page, 2);
		
		m.addAttribute("noticeList", noticeList);
		return "notice::noticeList";
	}
	
	@PostMapping("showNoticeDetils.do")
	@ResponseBody
	public Result toShowNoticeDetils(Integer id, @SessionAttribute(value="loginStaff") Staff loginStaff) {
		Notice notice = new Notice();
		notice.setId(id);
		
		NoticeNum readStaff = new NoticeNum();
		readStaff.setNoticeId(id);
		readStaff.setStaffId(loginStaff.getStaffId());
		Result result = nnbi.addNoticeNum(readStaff);
		if(result.getSucess()==0) {
			result.setMessage("服务器数据库错误...");
			return result;
		}
		
		List<Notice> notices = nbi.findNotice(notice, null, null, null, null, null);
		if(notices!=null && notices.size()>0) {
			notice = notices.get(0);
			NoticeNum noticeNum = new NoticeNum();
			noticeNum.setNoticeId(id);
			long readCount = nnbi.countByExample(noticeNum);
			notice.setReadCount(readCount);
			return new Result(1, notice);
		}else{
			return new Result(0, "无此公告");
		}
	}
	
	@PostMapping("showReadStaff.do")
	@ResponseBody
	public Result toShowReadStaff(Integer id) {
		NoticeNum noticeNum = new NoticeNum();
		noticeNum.setNoticeId(id);
		List<NoticeNum> noticeNums = nnbi.findNoticeNum(noticeNum);
		if(noticeNums!=null && noticeNums.size()>0) {
			return new Result(1, noticeNums);
		}else{
			return new Result(0, "暂无人阅读");
		}
	}
	
	@PostMapping("noticeAdd.do")
	@ResponseBody
	public Result toNoticeAdd(Notice notice,@SessionAttribute(value="loginStaff") Staff staff) {
		if(notice.getNoticeStaffAddressee().equals("1")) {
			notice.setNoticeStaffAddressee(staff.getDepartId());
		}
		notice.setNoticeStaffSend(staff.getStaffId());
		Result result = nbi.addNotice(notice);
		return result;
	}
	
}
