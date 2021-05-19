package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;

public class ProcessDetails {
    private Integer id;

    private Integer processId;

    private Integer processStage;

    private String approvedStaff;

    private Integer approvedResult;

    private Timestamp approvedTime;

    private String approvedOpinion;
    
    private Staff staff;
    
    private ProcessWithBLOBs process;

    public ProcessDetails(Integer id, Integer processId, Integer processStage, String approvedStaff, Integer approvedResult, Timestamp approvedTime) {
        this.id = id;
        this.processId = processId;
        this.processStage = processStage;
        this.approvedStaff = approvedStaff;
        this.approvedResult = approvedResult;
        this.approvedTime = approvedTime;
    }

    public ProcessDetails(Integer id, Integer processId, Integer processStage, String approvedStaff, Integer approvedResult, Timestamp approvedTime, String approvedOpinion) {
        this.id = id;
        this.processId = processId;
        this.processStage = processStage;
        this.approvedStaff = approvedStaff;
        this.approvedResult = approvedResult;
        this.approvedTime = approvedTime;
        this.approvedOpinion = approvedOpinion;
    }

    public ProcessDetails() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public Integer getProcessStage() {
        return processStage;
    }

    public void setProcessStage(Integer processStage) {
        this.processStage = processStage;
    }

    public String getApprovedStaff() {
        return approvedStaff;
    }

    public void setApprovedStaff(String approvedStaff) {
        this.approvedStaff = approvedStaff == null ? null : approvedStaff.trim();
    }

    public Integer getApprovedResult() {
        return approvedResult;
    }

    public void setApprovedResult(Integer approvedResult) {
        this.approvedResult = approvedResult;
    }

    public Timestamp getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(Timestamp approvedTime) {
        this.approvedTime = approvedTime;
    }

    public String getApprovedOpinion() {
        return approvedOpinion;
    }

    public void setApprovedOpinion(String approvedOpinion) {
        this.approvedOpinion = approvedOpinion == null ? null : approvedOpinion.trim();
    }

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public ProcessWithBLOBs getProcess() {
		return process;
	}

	public void setProcess(ProcessWithBLOBs process) {
		this.process = process;
	}
	
}