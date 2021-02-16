package com.sjy.OA_Sys.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class CreateSequenceCodeUtil {

	@Resource
	private RedisUtil redisUtil;
	
	public String createEmailCode() {
		String emailCode = "";
		Integer emailCodeNumTody = null;
		try {
			emailCodeNumTody = (Integer)redisUtil.get("emailCodeNumTody");
			if(emailCodeNumTody==null) {
				emailCodeNumTody = 1;
			}else {
				emailCodeNumTody++;
			}
			SimpleDateFormat formatter= new SimpleDateFormat("yyyyMMdd");
			Date date = new Date(System.currentTimeMillis());
			emailCode=formatter.format(date);
			
			if(emailCodeNumTody/10<1) {
				emailCode+="0000"+emailCodeNumTody;
			}else if(emailCodeNumTody/100<1) {
				emailCode+="000"+emailCodeNumTody;
			}else if(emailCodeNumTody/1000<1) {
				emailCode+="00"+emailCodeNumTody;
			}else if(emailCodeNumTody/10000<1) {
				emailCode+="0"+emailCodeNumTody;
			}else {
				emailCode+=emailCodeNumTody;
			}
			return emailCode;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			redisUtil.set("emailCodeNumTody", emailCodeNumTody);
		}
		return null;
	}
}
