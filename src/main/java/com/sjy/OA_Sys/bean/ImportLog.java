package com.sjy.OA_Sys.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class ImportLog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String logId;

	private String staffId;

	private Timestamp logTime;

	private String logDes;

	public ImportLog(Integer id, String logId, String staffId, Timestamp logTime) {
		this.id = id;
		this.logId = logId;
		this.staffId = staffId;
		this.logTime = logTime;
	}

	public ImportLog(Integer id, String logId, String staffId, Timestamp logTime, String logDes) {
		this.id = id;
		this.logId = logId;
		this.staffId = staffId;
		this.logTime = logTime;
		this.logDes = logDes;
	}

	public ImportLog() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId == null ? null : logId.trim();
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId == null ? null : staffId.trim();
	}

	public Timestamp getLogTime() {
		return logTime;
	}

	public void setLogTime(Timestamp logTime) {
		this.logTime = logTime;
	}

	public String getLogDes() {
		return logDes;
	}

	public void setLogDes(String logDes) {
		this.logDes = logDes == null ? null : logDes.trim();
	}
}