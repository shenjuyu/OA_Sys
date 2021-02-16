package com.sjy.OA_Sys.web;

import java.io.IOException;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.bean.VerifyCode;
import com.sjy.OA_Sys.biz.impl.StaffBizImpl;
import com.sjy.OA_Sys.util.AddCookie;
import com.sjy.OA_Sys.util.RandomUtils;
import com.sjy.OA_Sys.util.SendEmail;
import com.sjy.OA_Sys.util.VerificationCodeGeneratorUtil;

@Controller
@SessionAttributes({"loginStaff","backResetPwdEmailCode"})
public class LoginAction { 

	@Resource
	private AddCookie addCookie;
	@Resource
	private SendEmail sendEmail;
	@Resource
	private StaffBizImpl sbi; 

	@GetMapping("toLogin.do")
	public String toLogin(HttpServletRequest request,HttpServletResponse response) {
		int landed = 0;
		Cookie[] cookies = request.getCookies();
		if(cookies!=null) {
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("backName")) {
					landed++;
					continue;
				}
				if(cookie.getName().equals("backPwd")) {
					landed++;
					continue;
				}
			}
		} 
		if(landed == 0 || landed % 2 != 0 ) {
			Cookie cname = new Cookie("backName","" );
		    Cookie cpwd = new Cookie("backPwd", "");
		    response.addCookie(cname);
		    response.addCookie(cpwd);
		}
		return "login";
	}
	
	/**
	 * 用户登录
	 * @param user 用户名/密码
	 * @param backUserVerifyCode 输入的验证码
	 * @param remPwd  是否记住密码
	 * @param backVerifyCode 后端生成的验证码
	 * @param m
	 * @return
	 */
	@ResponseBody
	@PostMapping("loginNow.do")
	public Result loginNow(Staff staff,String backUserVerifyCode,boolean remPwd,boolean isAdmin,
			@SessionAttribute(value="backVerifyCode",required=false) VerifyCode backVerifyCode,Model m,
			HttpServletRequest request,HttpServletResponse response) {
		if(backVerifyCode==null) {
			return new Result(0, "请输入正确的验证码");
		}
		if(RandomUtils.getMinute(backVerifyCode.getDate(), new Date())>5) {
			return new Result(0,"验证码失效");
		}
		if(!backVerifyCode.getCode().equals(backUserVerifyCode)) {
			return new Result(0, "请输入正确的验证码");
		}
		// 登录
		Result resultStaffLogin = sbi.userLogin(staff);
		if(resultStaffLogin.getSucess()==0) {
			return new Result(resultStaffLogin.getSucess(), resultStaffLogin.getMessage());
		}
		Staff loginStaff = (Staff) resultStaffLogin.getObj();
		// 添加Cookie
		addCookie.addCookie(true, remPwd, loginStaff.getStaffId().toString(), loginStaff.getStaffPwd(), request, response);
		m.addAttribute("loginStaff", loginStaff);
		return new Result(resultStaffLogin.getSucess(), resultStaffLogin.getMessage());
	}
	
	@GetMapping("logVerifyCode.do")
	public void toLogVerifyCode(HttpServletRequest request, HttpServletResponse response) {
		VerificationCodeGeneratorUtil iVerifyCodeGen = new VerificationCodeGeneratorUtil();
        try {
            //设置长宽
            VerifyCode verifyCode = iVerifyCodeGen.generate(80, 28);
            verifyCode.setDate(new Date());
            //将VerifyCode绑定session
            request.getSession().setAttribute("backVerifyCode", verifyCode);
            //设置响应头
            response.setHeader("Pragma", "no-cache");
            //设置响应头
            response.setHeader("Cache-Control", "no-cache");
            //在代理服务器端防止缓冲
            response.setDateHeader("Expires", 0);
            //设置响应内容类型
            response.setContentType("image/jpeg");
            response.getOutputStream().write(verifyCode.getImgBytes());
            response.getOutputStream().flush();
        } catch (IOException e) {
        	System.out.println(e.getMessage());
        }
	}
	
	@Value("${mail.formMail.addr}")
	private String from;
	@Value("${mail.formMail.resetPwdEmailContent}")
	private String resetPwdEmailContent;
	@Value("${mail.formMail.currency}")
	private String currency;
	@Value("${mail.formMail.subject}")
	private String subject;
	
	@ResponseBody
	@PostMapping("sendBackResetPwdEmail.do")
	public Result sendBackResetPwdEmail(String staffId,boolean resetIsAdmin,Model m) {
		String staffEmail = sbi.findUserEmail(staffId);
		// 生成验证码
		String resetPwdEmailCode = RandomUtils.randomString(4);
		//发送邮件
		Result resultSendEmail = sendEmail.sendEmail(subject, from, staffEmail, resetPwdEmailContent, resetPwdEmailCode,currency);
		VerifyCode verifyCode = new VerifyCode(resetPwdEmailCode, new Date());
		// 将验证码放到session中
		m.addAttribute("backResetPwdEmailCode", verifyCode);
		return resultSendEmail;
	}
	
	@ResponseBody
	@PostMapping("backResetPwd.do")
	public Result backResetPwd(String staffId,
			String backResetPwdEmail,String resetPwd,
			@SessionAttribute(value="backResetPwdEmailCode",required=false) VerifyCode backResetPwdEmailCode) {
		if(backResetPwdEmailCode==null) {
			return new Result(0,"请输入正确的验证码");
		}
		if(RandomUtils.getMinute(backResetPwdEmailCode.getDate(), new Date())>5) {
			return new Result(0,"验证码已失效,请重新发送");
		}
		if(!backResetPwdEmail.equals(backResetPwdEmailCode.getCode())) {
			return new Result(0,"请输入正确的验证码");
		}
		
		Staff staff = new Staff();
		staff.setStaffId(staffId);
		staff.setStaffPwd(resetPwd);
		Result result = sbi.updateUserPwd(staff);
		return result;
	}
}
