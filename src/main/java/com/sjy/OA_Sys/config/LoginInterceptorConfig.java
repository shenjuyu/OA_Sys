package com.sjy.OA_Sys.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sjy.OA_Sys.interceptor.StaffInterceptor;

/**
 * 拦截器配置
 * 
 * @author 沈俊羽
 *
 *         2021年1月31日
 */
@SpringBootConfiguration
public class LoginInterceptorConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 注册TestInterceptor拦截器
		InterceptorRegistration registration = registry.addInterceptor(new StaffInterceptor());
		// 添加拦截路径
		// 拦截所有
		registration.addPathPatterns("/**");
		// 添加不拦截路径
		registration.excludePathPatterns("/*/*.*","/toLogin.do", "/loginNow.do", "/logVerifyCode.do", "/sendBackResetPwdEmail.do",
				"/backResetPwd.do");

	}
}
