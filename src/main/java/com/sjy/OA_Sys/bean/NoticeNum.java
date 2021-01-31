package com.sjy.OA_Sys.bean;

public class NoticeNum {
    private Integer id;

    private Integer noticeId;

    private String staffId;
    
    private Staff staff;

    public NoticeNum(Integer id, Integer noticeId, String staffId) {
        this.id = id;
        this.noticeId = noticeId;
        this.staffId = staffId;
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
    
}