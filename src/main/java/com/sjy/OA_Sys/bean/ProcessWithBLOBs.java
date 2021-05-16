package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;

public class ProcessWithBLOBs extends Process {
    private String processTask;

    private String processReason;

    private String processEnclosure;

    public ProcessWithBLOBs(Integer id, Integer processType, String processApplicant, Timestamp processApplicantTime, Timestamp processStartTime, Timestamp processEndTime, String processTaskToStaff, String processTaskSupervise, Integer processFinish, String processTask, String processReason, String processEnclosure) {
        super(id, processType, processApplicant, processApplicantTime, processStartTime, processEndTime, processTaskToStaff, processTaskSupervise, processFinish);
        this.processTask = processTask;
        this.processReason = processReason;
        this.processEnclosure = processEnclosure;
    }

    public ProcessWithBLOBs() {
        super();
    }

    public String getProcessTask() {
        return processTask;
    }

    public void setProcessTask(String processTask) {
        this.processTask = processTask == null ? null : processTask.trim();
    }

    public String getProcessReason() {
        return processReason;
    }

    public void setProcessReason(String processReason) {
        this.processReason = processReason == null ? null : processReason.trim();
    }

    public String getProcessEnclosure() {
        return processEnclosure;
    }

    public void setProcessEnclosure(String processEnclosure) {
        this.processEnclosure = processEnclosure == null ? null : processEnclosure.trim();
    }
}