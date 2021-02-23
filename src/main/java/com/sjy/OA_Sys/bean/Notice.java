package com.sjy.OA_Sys.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Notice implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String noticeStaffSend;

    private String noticeStaffAddressee;

    private String noticeTitle;

    private Timestamp noticeTime;

    private String noticeDes;
    
    private Staff staffSend;
    
//    private List<NoticeNum> noticeNumList;
    
    private Integer isRead;// 是否已读 1 是  0 否

    private Long readCount;
    
    public Notice(Integer id, String noticeStaffSend, String noticeStaffAddressee, String noticeTitle, Timestamp noticeTime) {
        this.id = id;
        this.noticeStaffSend = noticeStaffSend;
        this.noticeStaffAddressee = noticeStaffAddressee;
        this.noticeTitle = noticeTitle;
        this.noticeTime = noticeTime;
    }

    public Notice(Integer id, String noticeStaffSend, String noticeStaffAddressee, String noticeTitle, Timestamp noticeTime, String noticeDes) {
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

    public String getNoticeStaffAddressee() {
        return noticeStaffAddressee;
    }

    public void setNoticeStaffAddressee(String noticeStaffAddressee) {
        this.noticeStaffAddressee = noticeStaffAddressee == null ? null : noticeStaffAddressee.trim();
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
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

//	public List<NoticeNum> getNoticeNumList() {
//		return noticeNumList;
//	}
//
//	public void setNoticeNumList(List<NoticeNum> noticeNumList) {
//		this.noticeNumList = noticeNumList;
//	}

	public Integer getIsRead() {
		return isRead;
	}

	public void setIsRead(Integer isRead) {
		this.isRead = isRead;
	}

	public Staff getStaffSend() {
		return staffSend;
	}

	public void setStaffSend(Staff staffSend) {
		this.staffSend = staffSend;
	}

	public Long getReadCount() {
		return readCount;
	}

	public void setReadCount(Long readCount) {
		this.readCount = readCount;
	}
    
}