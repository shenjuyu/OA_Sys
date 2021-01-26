package com.sjy.OA_Sys.bean;

public class NoticeNum {
    private Integer id;

    private Integer noticeId;

    private Integer staffId;

    public NoticeNum(Integer id, Integer noticeId, Integer staffId) {
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

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }
}