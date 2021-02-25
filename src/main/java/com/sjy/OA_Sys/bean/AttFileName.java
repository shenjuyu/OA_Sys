package com.sjy.OA_Sys.bean;

import java.io.Serializable;

/**
 * 附件文件名类
 * @author 沈俊羽
 *
 * 2021年2月24日
 */
public class AttFileName implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fileNameBefore; // 解密前
	private String fileNameAfter; // 解密后

	public AttFileName(String fileNameBefore, String fileNameAfter) {
		this.fileNameBefore = fileNameBefore;
		this.fileNameAfter = fileNameAfter;
	}

	public AttFileName() {
	}

	public String getFileNameBefore() {
		return fileNameBefore;
	}

	public void setFileNameBefore(String fileNameBefore) {
		this.fileNameBefore = fileNameBefore;
	}

	public String getFileNameAfter() {
		return fileNameAfter;
	}

	public void setFileNameAfter(String fileNameAfter) {
		this.fileNameAfter = fileNameAfter;
	}

}
