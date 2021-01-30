package com.sjy.OA_Sys.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

/**
 * 添加cookie的工具类
 * @author 沈俊羽
 *
 * 2021年1月28日
 */
@Component
public class AddCookie {

	/**
	 * 添加Cookie
	 * @param isBack 是否是后台
	 * @param remPwd 是否记住密码
	 * @param loginName 登录名称
	 * @param loginPwd 登录密码
	 * @param request 请求对象
	 * @param response 响应对象
	 */
	public void addCookie(boolean isBack,boolean remPwd, String loginName, String loginPwd, HttpServletRequest request,HttpServletResponse response) {
		if(remPwd) {
			// 选中了记住密码
			boolean landed = false;// 是否之前已经记住了密码
			Cookie[] cookies = request.getCookies();
			Cookie backNameCookie = null;
			Cookie backPwdCookie = null;
			for(Cookie cookie : cookies) {
				if(isBack && cookie.getName()=="backName" && cookie.getValue().equals(loginName)) {
					backNameCookie=cookie;
					landed = true;
					continue;
				}
				if(isBack && cookie.getName()=="backPwd" && cookie.getValue().equals(loginPwd)) {
					backPwdCookie=cookie;
					landed = true;
					continue;
				}
				
				if(isBack==false && cookie.getName()=="name" && cookie.getValue().equals(loginName)) {
					landed = true;
					continue;
				}
				if(isBack==false && cookie.getName()=="pwd" && cookie.getValue().equals(loginPwd)) {
					landed = true;
					continue;
				}
			}
			Cookie cname=null;
			Cookie cpwd=null;
			if(landed == false && isBack) {
				if(backNameCookie!=null && backPwdCookie != null) {
					backNameCookie.setValue(loginName);
					backPwdCookie.setValue(loginPwd);
				}else {
					cname = new Cookie("backName",loginName );
				    cpwd = new Cookie("backPwd", loginPwd);
				}
			}else if(landed == false && isBack==false) {
				cname = new Cookie("name",loginName );
			    cpwd = new Cookie("pwd", loginPwd);
			}
			cname.setMaxAge(60*60*24*7);
		    cpwd.setMaxAge(60*60*24*7);
		    response.addCookie(cname);
		    response.addCookie(cpwd);
		}else {
			// 未选中记住密码
			Cookie cname=null;
			Cookie cpwd=null;
			if(isBack==true) {
				cname = new Cookie("backName",loginName );
			    cpwd = new Cookie("backPwd", loginPwd);
			}else if(isBack==false) {
				cname = new Cookie("name",loginName );
			    cpwd = new Cookie("pwd", loginPwd);
			}
		    cname.setMaxAge(0);
		    cpwd.setMaxAge(0);
		    response.addCookie(cname);
		    response.addCookie(cpwd);
		}
	}
	
	
}
