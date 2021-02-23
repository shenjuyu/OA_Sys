package com.sjy.OA_Sys.bean;

import java.io.Serializable;

public class Depart implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String departId;

	private String departName;

	private String departAddr;

	public Depart(Integer id, String departId, String departName, String departAddr) {
		this.id = id;
		this.departId = departId;
		this.departName = departName;
		this.departAddr = departAddr;
	}

	public Depart() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartId() {
		return departId;
	}

	public void setDepartId(String departId) {
		this.departId = departId == null ? null : departId.trim();
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName == null ? null : departName.trim();
	}

	public String getDepartAddr() {
		return departAddr;
	}

	public void setDepartAddr(String departAddr) {
		this.departAddr = departAddr == null ? null : departAddr.trim();
	}
}