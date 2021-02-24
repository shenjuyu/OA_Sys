package com.sjy.OA_Sys.web;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

import com.sjy.OA_Sys.bean.Mail;
import com.sjy.OA_Sys.bean.MailWithBLOBs;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.biz.impl.MailBizImpl;
import com.sjy.OA_Sys.biz.impl.StaffBizImpl;
import com.sjy.OA_Sys.util.CreateSequenceCodeUtil;
import com.sjy.OA_Sys.util.FileOperationUtil;

@Controller
@SessionAttributes("loginStaff")
public class EmailAtion {

	@Resource
	private MailBizImpl mbi;
	@Resource
	private StaffBizImpl sbi;
	@Resource
	private FileOperationUtil fileUtil;
	@Resource
	private CreateSequenceCodeUtil mailCodeUtil;

	@GetMapping("toEmail.do")
	public String toEmail(@SessionAttribute(value = "loginStaff") Staff loginStaff, Model m) {
		Mail mail = new Mail();
		mail.setMailStaffAddressee(loginStaff.getStaffId());
		mail.setMailSituation(1);
		List<Integer> mailSituation = new ArrayList<>();
		mailSituation.add(2);
		List<MailWithBLOBs> mailWithBLOBs = (List<MailWithBLOBs>) mbi.findMail(mail, mailSituation, 1, 8, true);

		m.addAttribute("isInbox", 1);// 是否是收件箱
		m.addAttribute("emailStyle", 1);
		m.addAttribute("getMailList", mailWithBLOBs);
		m.addAttribute("unReadMailSize", mbi.findUnreadMail(loginStaff.getStaffId(), false).size());
		m.addAttribute("addressBook", sbi.findStaffForComm(loginStaff));
		return "email::emailList";
	}

	@PostMapping("toWriteEmail.do")
	public String toWriteEmail(Mail mail,Model m) {
		MailWithBLOBs mailWithBLOBs = null;
		List<String> mailAttaList = null;
		
		if(mail!=null && mail.getId()!=null) {
			mailWithBLOBs = (MailWithBLOBs) mbi.findMail(mail, null, null, null, true).get(0);
			
			String mailAtta = mailWithBLOBs.getMailAttachment();
			
			if(mailAtta!=null && mailAtta != "") {
				mailAttaList = FileOperationUtil.fileNameDismantling(mailAtta);
			}
		}
		m.addAttribute("mailAttaList", mailAttaList);
		m.addAttribute("mailEdit", mailWithBLOBs);
		return "inbox::writeEmail";
	}

	@PostMapping("toInboxEmail.do")
	public String toInboxEmail(String staffId, @SessionAttribute(value = "loginStaff") Staff loginStaff, Model m) {
		Mail mail = new Mail();

		if (staffId != null && staffId != "") {
			mail.setMailStaffSend(staffId); // 设置发件人信息
		}

		mail.setMailStaffAddressee(loginStaff.getStaffId());
		mail.setMailSituation(1);

		m.addAttribute("isInbox", 1);// 是否是收件箱
		m.addAttribute("emailStyle", 1);
		List<Integer> mailSituation = new ArrayList<>();
		mailSituation.add(2);
		m.addAttribute("getMailList", mbi.findMail(mail, mailSituation, 1, 8, true));
		return "email::anyEmailList";
	}

	@PostMapping("toOutboxEmail.do")
	public String toOutboxEmail(String staffId, @SessionAttribute(value = "loginStaff") Staff loginStaff, Model m) {
		Mail mail = new Mail();

		if (staffId != null && staffId != "") {
			mail.setMailStaffAddressee(staffId); // 设置收件人信息
		}

		List<Integer> mailSituation = new ArrayList<>();
		mailSituation.add(1);
		mailSituation.add(2);
		mailSituation.add(3);
		mail.setMailSituation(4);
		mail.setMailStaffSend(loginStaff.getStaffId());
		List<MailWithBLOBs> mailWithBLOBs =  (List<MailWithBLOBs>) mbi.findMail(mail, mailSituation, 1, 8, true);
		System.out.println(mailWithBLOBs.size()+"==========");
		m.addAttribute("isInbox", 0);// 是否是收件箱
		m.addAttribute("emailStyle", 2);
		m.addAttribute("getMailList", mailWithBLOBs);
		return "email::anyEmailList";
	}

	@PostMapping("toDraftEmail.do")
	public String toDraftEmail(String staffId, @SessionAttribute(value = "loginStaff") Staff loginStaff, Model m) {
		Mail mail = new Mail();

		if (staffId != null && staffId != "") {
			mail.setMailStaffAddressee(staffId); // 设置收件人信息
		}

		mail.setMailStaffSend(loginStaff.getStaffId());
		mail.setMailSituation(0);
		m.addAttribute("isInbox", 0);// 是否是收件箱
		m.addAttribute("emailStyle", 3);
		m.addAttribute("getMailList", mbi.findMail(mail, null, 1, 8, true));
		return "email::anyEmailList";
	}

	@PostMapping("toTrashEmail.do")
	public String toTrashEmail(String staffId, @SessionAttribute(value = "loginStaff") Staff loginStaff, Model m) {
		Mail mail = new Mail();

		if (staffId != null && staffId != "") {
			mail.setMailStaffSend(staffId); // 设置发件人信息
		}

		mail.setMailStaffAddressee(loginStaff.getStaffId());
		mail.setMailSituation(3);
		m.addAttribute("isInbox", 1);// 是否是收件箱
		m.addAttribute("emailStyle", 4);
		m.addAttribute("getMailList", mbi.findMail(mail, null, 1, 8, true));
		return "email::anyEmailList";
	}

	@PostMapping("delEmail.do")
	@ResponseBody
	public Result toDelEmail(String emailId) {
		MailWithBLOBs mail = new MailWithBLOBs();
		mail.setMailId(emailId);
		mail.setMailSituation(3);
		return mbi.updateMailSituation(mail);
	}

	@Value("${spring.resources.staticLocations}")
	private String[] filePath;

	@GetMapping("downloadAtta.do")
	public String downloadFile(String fileName, HttpServletRequest request, HttpServletResponse response) {

		String trueName = FileOperationUtil.fileNameDecryption(fileName);

		if (fileName != null) {
			String path = filePath[0].substring("file:/".length());
			// 设置文件路径
			File file = new File(path + "mailFile/" + fileName);
			// 如果文件存在，则进行下载
			if (file.exists()) {
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				OutputStream os = null;
				try {
					// 配置文件下载
					response.setHeader("content-type", "application/octet-stream");
					response.setContentType("application/octet-stream");
					// 下载文件能正常显示中文
					response.setHeader("Content-Disposition",
							"attachment;filename=" + URLEncoder.encode(trueName, "UTF-8"));
					// 实现文件下载
					byte[] buffer = new byte[1024];

					fis = new FileInputStream(file);
					bis = new BufferedInputStream(fis);
					os = response.getOutputStream();
					int i = bis.read(buffer);
					while (i != -1) {
						os.write(buffer, 0, i);
						os.flush();
						i = bis.read(buffer);
					}
					return null;

				} catch (Exception e) {
					return null;

				} finally {
					if (bis != null) {
						try {
							bis.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					if (fis != null) {
						try {
							fis.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					if (os != null) {
						try {
							os.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}

		return null;
	}

	@PostMapping("toReplyEmail.do")
	public Result toReplyEmail(MailWithBLOBs mail, Model m) {
		Mail oldMail = (Mail) mbi.findMail(mail, null, null, null, false).get(0);
		String mailId = mailCodeUtil.createCode("email");
		mail.setMailId(mailId);
		mail.setMailSituation(1);
		mail.setMailStaffAddressee(oldMail.getMailStaffSend());
		mail.setMailStaffSend(oldMail.getMailStaffAddressee());
		mail.setMailTimeSend(new Timestamp(new Date().getTime()));
		mail.setMailTitle(oldMail.getMailTitle());
		Result result = mbi.addMail(mail);
		return result;
	}

	@PostMapping("readNow.do")
	@ResponseBody
	public Result toReadNow(MailWithBLOBs mail) {
		mail.setMailSituation(2);
		return mbi.updateMailSituation(mail);
	}

	@PostMapping("uploadEmailAtta.do")
	@ResponseBody
	public Result toUploadEmailAtta(@RequestParam("file") MultipartFile file,
			@SessionAttribute(value = "loginStaff") Staff loginStaff) {
		Result result = fileUtil.fileUpload(file, "mailFile/");
		if (result.getSucess() == 0) {
			return result;
		}
		return result;
	}

	@PostMapping("sendEmail.do")
	@ResponseBody
	public Result toSendEmail(@RequestParam ArrayList<String> fileNames, String addresses, MailWithBLOBs mail,
			@SessionAttribute(value = "loginStaff") Staff loginStaff) {
		if (fileNames.size() > 0) {// 处理附件
			String fileName = FileOperationUtil.fileNameArrange(fileNames);
			mail.setMailAttachment(fileName);
		}
		mail.setMailStaffSend(loginStaff.getStaffId());

		Result result = null;
		// 处理收件者
		String[] addressArr = addresses.split(";");
		List<String> addressList = new ArrayList<String>();
		for (int i = 0; i < addressArr.length; i++) {
			String address = addressArr[i];
			addressList.add(address.substring(address.indexOf("<") + 1, address.indexOf(">")));
		}

		// 发送邮件
		for (String trueAddress : addressList) {
			mail.setMailId(mailCodeUtil.createCode("email"));
			mail.setMailStaffAddressee(trueAddress);
			mail.setMailSituation(1);
			result = mbi.addMail(mail);
			if (result.getSucess() == 1) {
				continue;
			} else if (result.getSucess() == 0) {
				return result;
			}
		}
		return result;
	}

	@PostMapping("saveMail.do")
	@ResponseBody
	public Result toSaveMail(@RequestParam(required = false) ArrayList<String> fileNames,
			@RequestParam(required = false) String addresses, MailWithBLOBs mail,
			@SessionAttribute(value = "loginStaff") Staff loginStaff) {
		if (fileNames != null && fileNames.size() > 0) {// 处理附件
			String fileName = FileOperationUtil.fileNameArrange(fileNames);
			mail.setMailAttachment(fileName);
		}
		mail.setMailStaffSend(loginStaff.getStaffId());

		Result result = null;
		// 处理收件者
		// 保存邮件为草稿
		if (addresses != null && addresses != "") {
			String[] addressArr = addresses.split(";");
			List<String> addressList = new ArrayList<String>();
			for (int i = 0; i < addressArr.length; i++) {
				String address = addressArr[i];
				addressList.add(address.substring(address.indexOf("<") + 1, address.indexOf(">")));
			}
			
			for (String trueAddress : addressList) {
				mail.setMailStaffAddressee(trueAddress);
				result = mbi.addMail(mail);
				if (result.getSucess() == 1) {
					continue;
				} else if (result.getSucess() == 0) {
					return result;
				}
			}
		}else {
			mail.setMailId(mailCodeUtil.createCode("email"));
			mail.setMailSituation(0);
			result = mbi.addMail(mail);
			return result;
		}
		
		return result;
	}
}
