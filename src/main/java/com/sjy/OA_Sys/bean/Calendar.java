package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Calendar {
    private Integer id;

    private String calendarTitle;

    private Timestamp calendarTimeStart;

    private Timestamp calendarTimeEnd;

    private String staffId;

    private String calendarDes;

    private Integer calendarState;

    public Calendar(Integer id, String calendarTitle, Timestamp calendarTimeStart, Timestamp calendarTimeEnd, String staffId, String calendarDes, Integer calendarState) {
        this.id = id;
        this.calendarTitle = calendarTitle;
        this.calendarTimeStart = calendarTimeStart;
        this.calendarTimeEnd = calendarTimeEnd;
        this.staffId = staffId;
        this.calendarDes = calendarDes;
        this.calendarState = calendarState;
    }

    public Calendar() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalendarTitle() {
        return calendarTitle;
    }

    public void setCalendarTitle(String calendarTitle) {
        this.calendarTitle = calendarTitle == null ? null : calendarTitle.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Timestamp getCalendarTimeStart() {
        return calendarTimeStart;
    }

    public void setCalendarTimeStart(Timestamp calendarTimeStart) {
        this.calendarTimeStart = calendarTimeStart;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Timestamp getCalendarTimeEnd() {
        return calendarTimeEnd;
    }

    public void setCalendarTimeEnd(Timestamp calendarTimeEnd) {
        this.calendarTimeEnd = calendarTimeEnd;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getCalendarDes() {
        return calendarDes;
    }

    public void setCalendarDes(String calendarDes) {
        this.calendarDes = calendarDes == null ? null : calendarDes.trim();
    }

    public Integer getCalendarState() {
        return calendarState;
    }

    public void setCalendarState(Integer calendarState) {
        this.calendarState = calendarState;
    }
}