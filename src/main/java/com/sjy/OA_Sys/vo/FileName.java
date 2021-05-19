package com.sjy.OA_Sys.vo;

public class FileName {

	private String trueName;
	
	private String afterName;

	public FileName() {
		super();
	}

	public FileName(String trueName, String afterName) {
		super();
		this.trueName = trueName;
		this.afterName = afterName;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getAfterName() {
		return afterName;
	}

	public void setAfterName(String afterName) {
		this.afterName = afterName;
	}
	
}
