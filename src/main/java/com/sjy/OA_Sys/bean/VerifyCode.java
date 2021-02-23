package com.sjy.OA_Sys.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 验证码类
 */
public class VerifyCode implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String code;

    private byte[] imgBytes;

    private Date date;
    
    public VerifyCode() {
	}
	public VerifyCode(String code) {
		this.code = code;
	}
	public VerifyCode(String code, Date date) {
		this.code = code;
		this.date = date;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public byte[] getImgBytes() {
		return imgBytes;
	}

	public void setImgBytes(byte[] imgBytes) {
		this.imgBytes = imgBytes;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
    

}