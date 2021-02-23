package com.sjy.OA_Sys.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class AttSheet implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String staffId;

    private Timestamp attSheetTimeStart;

    private Timestamp attSheetTimeEnd;

    private Integer attSheetSituation;

    public AttSheet(Integer id, String staffId, Timestamp attSheetTimeStart, Timestamp attSheetTimeEnd, Integer attSheetSituation) {
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

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public Date getAttSheetTimeStart() {
        return attSheetTimeStart;
    }

    public void setAttSheetTimeStart(Timestamp attSheetTimeStart) {
        this.attSheetTimeStart = attSheetTimeStart;
    }

    public Date getAttSheetTimeEnd() {
        return attSheetTimeEnd;
    }

    public void setAttSheetTimeEnd(Timestamp attSheetTimeEnd) {
        this.attSheetTimeEnd = attSheetTimeEnd;
    }

    public Integer getAttSheetSituation() {
        return attSheetSituation;
    }

    public void setAttSheetSituation(Integer attSheetSituation) {
        this.attSheetSituation = attSheetSituation;
    }
}