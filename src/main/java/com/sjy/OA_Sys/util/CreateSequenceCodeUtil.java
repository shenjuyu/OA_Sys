package com.sjy.OA_Sys.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

/**
 * 创建编号
 * @author 沈俊羽
 *
 * 2021年2月24日
 */
@Component
public class CreateSequenceCodeUtil {

	@Resource
	private RedisUtil redisUtil;
	
	/**
	 * 获取id
	 * @param codeType :email  project  task
	 * @return
	 */
	public String createCode(String codeType) {
		String code = "";
		Integer codeNumTody = null;
		try {
			String codeName="";
			switch (codeType) {
				case "email":
					codeName="emailCodeNumTody";
					break;
				case "project":
					codeName="projectCodeNumTody";
					break;
				case "task":
					codeName="taskCodeNumTody";
					break;
				default:
					break;
			}
			if(codeName=="") {
				return null;
			}
			codeNumTody = (Integer)redisUtil.get(codeName);
			if(codeNumTody==null) {
				codeNumTody = 1;
			}else {
				codeNumTody++;
			}
			SimpleDateFormat formatter= new SimpleDateFormat("yyyyMMdd");
			Date date = new Date(System.currentTimeMillis());
			code=formatter.format(date);
			
			if(codeNumTody/10<1) {
				code+="0000"+codeNumTody;
			}else if(codeNumTody/100<1) {
				code+="000"+codeNumTody;
			}else if(codeNumTody/1000<1) {
				code+="00"+codeNumTody;
			}else if(codeNumTody/10000<1) {
				code+="0"+codeNumTody;
			}else {
				code+=codeNumTody;
			}
			return code;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			redisUtil.set("codeNumTody", codeNumTody);
		}
		return null;
	}
}
