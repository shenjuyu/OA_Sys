package com.sjy.OA_Sys.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Mail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String mailId;

	private String mailStaffSend;

	private String mailStaffAddressee;

	private String mailTitle;

	private Timestamp mailTimeSend;

	private Integer mailSituation;

	private Staff staffSend;

	private Staff staffAddressee;

	public Mail(Integer id, String mailId, String mailStaffSend, String mailStaffAddressee, String mailTitle,
			Timestamp mailTimeSend, Integer mailSituation) {
		this.id = id;
		this.mailId = mailId;
		this.mailStaffSend = mailStaffSend;
		this.mailStaffAddressee = mailStaffAddressee;
		this.mailTitle = mailTitle;
		this.mailTimeSend = mailTimeSend;
		this.mailSituation = mailSituation;
	}

	public Mail() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId == null ? null : mailId.trim();
	}

	public String getMailStaffSend() {
		return mailStaffSend;
	}

	public void setMailStaffSend(String mailStaffSend) {
		this.mailStaffSend = mailStaffSend == null ? null : mailStaffSend.trim();
	}

	public String getMailStaffAddressee() {
		return mailStaffAddressee;
	}

	public void setMailStaffAddressee(String mailStaffAddressee) {
		this.mailStaffAddressee = mailStaffAddressee == null ? null : mailStaffAddressee.trim();
	}

	public String getMailTitle() {
		return mailTitle;
	}

	public void setMailTitle(String mailTitle) {
		this.mailTitle = mailTitle == null ? null : mailTitle.trim();
	}

	public Timestamp getMailTimeSend() {
		return mailTimeSend;
	}

	public void setMailTimeSend(Timestamp mailTimeSend) {
		this.mailTimeSend = mailTimeSend;
	}

	public Integer getMailSituation() {
		return mailSituation;
	}

	public void setMailSituation(Integer mailSituation) {
		this.mailSituation = mailSituation;
	}

	public Staff getStaffSend() {
		return staffSend;
	}

	public void setStaffSend(Staff staffSend) {
		this.staffSend = staffSend;
	}

	public Staff getStaffAddressee() {
		return staffAddressee;
	}

	public void setStaffAddressee(Staff staffAddressee) {
		this.staffAddressee = staffAddressee;
	}

}