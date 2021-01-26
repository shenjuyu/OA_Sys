package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;

public class Project {
    private Integer proId;

    private Integer staffId;

    private String proNaem;

    private Timestamp proTimeCre;

    private Timestamp proTimeStart;

    private Timestamp proTimeEnd;

    private String proRateProgress;

    private Integer proState;

    public Project(Integer proId, Integer staffId, String proNaem, Timestamp proTimeCre, Timestamp proTimeStart, Timestamp proTimeEnd, String proRateProgress, Integer proState) {
        this.proId = proId;
        this.staffId = staffId;
        this.proNaem = proNaem;
        this.proTimeCre = proTimeCre;
        this.proTimeStart = proTimeStart;
        this.proTimeEnd = proTimeEnd;
        this.proRateProgress = proRateProgress;
        this.proState = proState;
    }

    public Project() {
        super();
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getProNaem() {
        return proNaem;
    }

    public void setProNaem(String proNaem) {
        this.proNaem = proNaem == null ? null : proNaem.trim();
    }

    public Timestamp getProTimeCre() {
        return proTimeCre;
    }

    public void setProTimeCre(Timestamp proTimeCre) {
        this.proTimeCre = proTimeCre;
    }

    public Timestamp getProTimeStart() {
        return proTimeStart;
    }

    public void setProTimeStart(Timestamp proTimeStart) {
        this.proTimeStart = proTimeStart;
    }

    public Timestamp getProTimeEnd() {
        return proTimeEnd;
    }

    public void setProTimeEnd(Timestamp proTimeEnd) {
        this.proTimeEnd = proTimeEnd;
    }

    public String getProRateProgress() {
        return proRateProgress;
    }

    public void setProRateProgress(String proRateProgress) {
        this.proRateProgress = proRateProgress == null ? null : proRateProgress.trim();
    }

    public Integer getProState() {
        return proState;
    }

    public void setProState(Integer proState) {
        this.proState = proState;
    }
}