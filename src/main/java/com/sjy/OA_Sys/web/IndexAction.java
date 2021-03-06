package com.sjy.OA_Sys.web;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.sjy.OA_Sys.bean.AttSheet;
import com.sjy.OA_Sys.bean.Mail;
import com.sjy.OA_Sys.bean.Notice;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.bean.Task;
import com.sjy.OA_Sys.bean.TaskWithBLOBs;
import com.sjy.OA_Sys.biz.impl.AttSheetBizImpl;
import com.sjy.OA_Sys.biz.impl.MailBizImpl;
import com.sjy.OA_Sys.biz.impl.NoticeBizImpl;
import com.sjy.OA_Sys.biz.impl.TaskBizImpl;

@Controller
@SessionAttributes(value="loginStaff")
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
		// 未读邮件
		@SuppressWarnings("unchecked")
		ArrayList<Mail> mailList = (ArrayList<Mail>)mbi.findUnreadMail(loginStaff.getStaffId(), false);
		
		
		// 未读通知
		Notice notice = new Notice();
		// 被通知人是所有公司员工
		notice.setNoticeStaffAddressee("2");
		List<String> addressee = new ArrayList<>();
		addressee.add("2");
		addressee.add(loginStaff.getDepartId());
		List<Notice> noReadNoticeList =  nbi.findNotice(notice,addressee,false,loginStaff.getStaffId(), null, null);
		System.out.println(noReadNoticeList.size()+"--------------");
		
		// 未完成任务
		List<TaskWithBLOBs> noFinishedTask = tbi.findNoFinishedTask(loginStaff.getStaffId(), false, null, null);
		
		
		// 本月出勤情况
		AttSheet attSheet = new AttSheet(null, loginStaff.getStaffId(), null, null, 1);
		List<AttSheet> attSheets = asbi.findAttSheetForMonth(attSheet);
		int workDays = attSheets.size();
		attSheet.setAttSheetSituation(0);
		int leaveDays = asbi.findAttSheetForMonth(attSheet).size();
		
		
		// 今日是否签到
		AttSheet attSheetTemp = new AttSheet();
		attSheetTemp.setStaffId(loginStaff.getStaffId());
		attSheetTemp = asbi.findAttSheetForToDay(attSheetTemp);
		if(attSheetTemp==null) {// 未签到
			m.addAttribute("attSheetFlag", 0);
		}else if(attSheetTemp.getAttSheetSituation()==5){ // 已签到 未签退
			m.addAttribute("attSheetFlag", 1);
		}else { // 今日签到任务已完成
			m.addAttribute("attSheetFlag", 2);
		}
		
		m.addAttribute("mailList", mailList);
		m.addAttribute("noReadNoticeList", noReadNoticeList);
		m.addAttribute("noFinishedTask", noFinishedTask);
		m.addAttribute("workDays", workDays);
		m.addAttribute("leaveDays", leaveDays);
		return "index";
	}
	
	@Value("${spring.resources.staticLocations}")
	private String [] uploadDir;
	
	@PostMapping("uploadimg.do")
	@ResponseBody
	public String toUploadImg(String CKEditorFuncNum,@RequestParam("upload") MultipartFile file) throws IllegalStateException, IOException {
		String path= uploadDir[0].substring("file:/".length());
		String fileName = "otherImg/"+file.getOriginalFilename();
		String userFileName=file.getOriginalFilename();
		String suffix = userFileName.substring(userFileName.lastIndexOf('.'));
		String name=userFileName.substring(0, userFileName.lastIndexOf('.'));
		String addFileName=String.valueOf(System.currentTimeMillis()).substring(6);
		fileName = "otherImg/"+name+addFileName+suffix;
		
		String contentType = file.getContentType();
		String result="";
		if (contentType.equals("image/pjpeg")
				|| contentType.equals("image/jpeg")) {
			// IE6上传jpg图片的headimageContentType是image/pjpeg，而IE9以及火狐上传的jpg图片是image/jpeg
		} else if (contentType.equals("image/png")
				|| contentType.equals("image/x-png")) {
			// IE6上传的png图片的headimageContentType是"image/x-png"
		} else if (contentType.equals("image/gif")) {
		} else if (contentType.equals("image/bmp")) {
		} else {
			result="<script type=\"text/javascript\">"
					+"window.parent.CKEDITOR.tools.callFunction(" + CKEditorFuncNum
					+ ",''," + "'文件格式不正确（必须为.jpg/.gif/.bmp/.png文件）');"
					+"</script>";
			return result;
		}
		
		
		File diskFile=new File(path+fileName);
		if (!diskFile.exists()) { // 如果路径不存在，创建
			diskFile.mkdirs();
		}
		file.transferTo(diskFile);
		result="<script type=\"text/javascript\">"
				+ "window.parent.CKEDITOR.tools.callFunction("+CKEditorFuncNum+",'"+"/"+fileName+"')"
				+ "</script>";
		return result;
	}
	
	@PostMapping("toSignIn.do")
	@ResponseBody
	private Result toSignIn(@SessionAttribute(value="loginStaff") Staff loginStaff) {
		AttSheet attSheet = new AttSheet();
		attSheet.setAttSheetSituation(5);
		attSheet.setAttSheetTimeStart(new Timestamp(System.currentTimeMillis()));
		attSheet.setStaffId(loginStaff.getStaffId());
		return asbi.addAttSheet(attSheet);
	}
	
	@PostMapping("toSignOut.do")
	@ResponseBody
	private Result toSignOut(@SessionAttribute(value="loginStaff") Staff loginStaff) {
		AttSheet attSheet = new AttSheet();
		attSheet.setAttSheetSituation(1);
		attSheet.setAttSheetTimeStart(new Timestamp(System.currentTimeMillis()));
		attSheet.setStaffId(loginStaff.getStaffId());
		return asbi.updateAttSheet(attSheet);
	}
}
