package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;

public class ImportLog {
    private Integer logId;

    private Integer staffId;

    private Timestamp logTime;

    private String logDes;

    public ImportLog(Integer logId, Integer staffId, Timestamp logTime) {
        this.logId = logId;
        this.staffId = staffId;
        this.logTime = logTime;
    }

    public ImportLog(Integer logId, Integer staffId, Timestamp logTime, String logDes) {
        this.logId = logId;
        this.staffId = staffId;
        this.logTime = logTime;
        this.logDes = logDes;
    }

    public ImportLog() {
        super();
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Timestamp getLogTime() {
        return logTime;
    }

    public void setLogTime(Timestamp logTime) {
        this.logTime = logTime;
    }

    public String getLogDes() {
        return logDes;
    }

    public void setLogDes(String logDes) {
        this.logDes = logDes == null ? null : logDes.trim();
    }
}