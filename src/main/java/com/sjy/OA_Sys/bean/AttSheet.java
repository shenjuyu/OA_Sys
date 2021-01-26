package com.sjy.OA_Sys.bean;

import java.util.Date;

public class AttSheet {
    private Integer id;

    private Integer staffId;

    private Date attSheetTimeStart;

    private Date attSheetTimeEnd;

    private Integer attSheetSituation;

    public AttSheet(Integer id, Integer staffId, Date attSheetTimeStart, Date attSheetTimeEnd, Integer attSheetSituation) {
        this.id = id;
        this.staffId = staffId;
        this.attSheetTimeStart = attSheetTimeStart;
        this.attSheetTimeEnd = attSheetTimeEnd;
        this.attSheetSituation = attSheetSituation;
    }

    public AttSheet() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Date getAttSheetTimeStart() {
        return attSheetTimeStart;
    }

    public void setAttSheetTimeStart(Date attSheetTimeStart) {
        this.attSheetTimeStart = attSheetTimeStart;
    }

    public Date getAttSheetTimeEnd() {
        return attSheetTimeEnd;
    }

    public void setAttSheetTimeEnd(Date attSheetTimeEnd) {
        this.attSheetTimeEnd = attSheetTimeEnd;
    }

    public Integer getAttSheetSituation() {
        return attSheetSituation;
    }

    public void setAttSheetSituation(Integer attSheetSituation) {
        this.attSheetSituation = attSheetSituation;
    }
}