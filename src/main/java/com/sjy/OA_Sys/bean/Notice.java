package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;
import java.util.List;

public class Notice {
    private Integer id;

    private String noticeStaffSend;

    private Integer noticeStaffAddressee;

    private String noticeTitle;

    private Timestamp noticeTime;

    private String noticeDes;
    
    private List<NoticeNum> noticeNumList;

    public Notice(Integer id, String noticeStaffSend, Integer noticeStaffAddressee, String noticeTitle, Timestamp noticeTime) {
        this.id = id;
        this.noticeStaffSend = noticeStaffSend;
        this.noticeStaffAddressee = noticeStaffAddressee;
        this.noticeTitle = noticeTitle;
        this.noticeTime = noticeTime;
    }

    public Notice(Integer id, String noticeStaffSend, Integer noticeStaffAddressee, String noticeTitle, Timestamp noticeTime, String noticeDes) {
        this.id = id;
        this.noticeStaffSend = noticeStaffSend;
        this.noticeStaffAddressee = noticeStaffAddressee;
        this.noticeTitle = noticeTitle;
        this.noticeTime = noticeTime;
        this.noticeDes = noticeDes;
    }

    public Notice() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoticeStaffSend() {
        return noticeStaffSend;
    }

    public void setNoticeStaffSend(String noticeStaffSend) {
        this.noticeStaffSend = noticeStaffSend == null ? null : noticeStaffSend.trim();
    }

    public Integer getNoticeStaffAddressee() {
        return noticeStaffAddressee;
    }

    public void setNoticeStaffAddressee(Integer noticeStaffAddressee) {
        this.noticeStaffAddressee = noticeStaffAddressee;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public Timestamp getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Timestamp noticeTime) {
        this.noticeTime = noticeTime;
    }

    public String getNoticeDes() {
        return noticeDes;
    }

    public void setNoticeDes(String noticeDes) {
        this.noticeDes = noticeDes == null ? null : noticeDes.trim();
    }

	public List<NoticeNum> getNoticeNumList() {
		return noticeNumList;
	}

	public void setNoticeNumList(List<NoticeNum> noticeNumList) {
		this.noticeNumList = noticeNumList;
	}
    
}