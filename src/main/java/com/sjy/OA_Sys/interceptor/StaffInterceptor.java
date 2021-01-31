package com.sjy.OA_Sys.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.sjy.OA_Sys.bean.Staff;

/**
 * 拦截器
 * @author 沈俊羽
 *
 * 2021年1月31日
 */
public class StaffInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		try {
			Staff staff = (Staff) request.getSession().getAttribute("loginStaff");
			if(staff!=null){
			    return true;
			}
			response.sendRedirect(request.getContextPath()+"/toLogin.do");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;//如果设置为false时，被请求时，拦截器执行到此处将不会继续操作
        				//如果设置为true时，请求将会继续执行后面的操作
	}
}
