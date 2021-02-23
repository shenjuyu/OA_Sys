package com.sjy.OA_Sys.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class NoticeNum implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer noticeId;

    private String staffId;

    private Timestamp readTime;
    
    private Staff staff;

    public NoticeNum(Integer id, Integer noticeId, String staffId, Timestamp readTime) {
        this.id = id;
        this.noticeId = noticeId;
        this.staffId = staffId;
        this.readTime = readTime;
    }

    public NoticeNum() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}
    
	public Timestamp getReadTime() {
        return readTime;
    }

    public void setReadTime(Timestamp readTime) {
        this.readTime = readTime;
    }
}