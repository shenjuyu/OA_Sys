package com.sjy.OA_Sys.util;

import javax.annotation.Resource;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.sjy.OA_Sys.bean.Result;


/**
 * 发送邮件工具类
 * @author 沈俊羽
 *
 * 2021年1月28日
 */
@Component
public class SendEmail {

	@Resource
	private JavaMailSender mailSender;
	
	/**
	 * 发送邮件工具
	 * @param subject 邮件名称/邮件主题
	 * @param from 发送人
	 * @param email 接收人
	 * @param content 内容
	 * @param other content后拼接内容
	 * @return Result
	 */
	public Result sendEmail(String subject,String from,String email,String content,String ... others) {
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(from);
			message.setTo(email);
			message.setSubject(subject);
			if(others.length!=0) {
				String preContent=content;
				for(String other : others) {
					preContent += other;
				}
				message.setText(preContent);
			}else {
				message.setText(content);
			}
			mailSender.send(message);
		} catch (MailException e) {
			System.out.println(e.getMessage());
			return new Result(0,"发送邮件失败",e);
		}
		return new Result(1,"发送邮件成功");
	}
}
