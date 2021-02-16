package com.sjy.OA_Sys.initData;

import javax.annotation.Resource;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import com.sjy.OA_Sys.bean.Mail;
import com.sjy.OA_Sys.biz.impl.MailBizImpl;
import com.sjy.OA_Sys.util.RedisUtil;

@Service
public class AfterServiceStarted implements ApplicationRunner {

	@Resource
	private MailBizImpl mbi;
	@Resource
	private RedisUtil redisUtil;;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// 初始化邮箱编码
		Mail mail = mbi.findLastMail();
		if (mail == null) {
			redisUtil.set("emailCodeNumTody", 0);
		} else {
			String emailCodeNumTody = mail.getMailId();
			emailCodeNumTody = emailCodeNumTody.substring(8);
			redisUtil.set("emailCodeNumTody", Integer.parseInt(emailCodeNumTody));
		}

	}

}
