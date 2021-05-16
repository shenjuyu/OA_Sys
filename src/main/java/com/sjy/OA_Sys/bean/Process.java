package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;
import java.util.List;

public class Process {
    private Integer id;

    private Integer processType;

    private String processApplicant;

    private Timestamp processApplicantTime;

    private Timestamp processStartTime;

    private Timestamp processEndTime;

    private String processTaskToStaff;

    private String processTaskSupervise;

    private Integer processFinish;
    
    private ProcessType processTypePoJo;
    
    private List<ProcessDetails> processDetails;
    
    private Staff applicantStaff;

    private Staff taskStaff;
    
    private Staff superviceStaff;
    

    public Process(Integer id, Integer processType, String processApplicant, Timestamp processApplicantTime, Timestamp processStartTime, Timestamp processEndTime, String processTaskToStaff, String processTaskSupervise, Integer processFinish) {
        this.id = id;
        this.processType = processType;
        this.processApplicant = processApplicant;
        this.processApplicantTime = processApplicantTime;
        this.processStartTime = processStartTime;
        this.processEndTime = processEndTime;
        this.processTaskToStaff = processTaskToStaff;
        this.processTaskSupervise = processTaskSupervise;
        this.processFinish = processFinish;
    }

    public Process() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProcessType() {
        return processType;
    }

    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    public String getProcessApplicant() {
        return processApplicant;
    }

    public void setProcessApplicant(String processApplicant) {
        this.processApplicant = processApplicant == null ? null : processApplicant.trim();
    }

    public Timestamp getProcessApplicantTime() {
        return processApplicantTime;
    }

    public void setProcessApplicantTime(Timestamp processApplicantTime) {
        this.processApplicantTime = processApplicantTime;
    }

    public Timestamp getProcessStartTime() {
        return processStartTime;
    }

    public void setProcessStartTime(Timestamp processStartTime) {
        this.processStartTime = processStartTime;
    }

    public Timestamp getProcessEndTime() {
        return processEndTime;
    }

    public void setProcessEndTime(Timestamp processEndTime) {
        this.processEndTime = processEndTime;
    }

    public String getProcessTaskToStaff() {
        return processTaskToStaff;
    }

    public void setProcessTaskToStaff(String processTaskToStaff) {
        this.processTaskToStaff = processTaskToStaff == null ? null : processTaskToStaff.trim();
    }

    public String getProcessTaskSupervise() {
        return processTaskSupervise;
    }

    public void setProcessTaskSupervise(String processTaskSupervise) {
        this.processTaskSupervise = processTaskSupervise == null ? null : processTaskSupervise.trim();
    }

    public Integer getProcessFinish() {
        return processFinish;
    }

    public void setProcessFinish(Integer processFinish) {
        this.processFinish = processFinish;
    }

	public ProcessType getProcessTypePoJo() {
		return processTypePoJo;
	}

	public void setProcessTypePoJo(ProcessType processTypePoJo) {
		this.processTypePoJo = processTypePoJo;
	}

	public List<ProcessDetails> getProcessDetails() {
		return processDetails;
	}

	public void setProcessDetails(List<ProcessDetails> processDetails) {
		this.processDetails = processDetails;
	}

	public Staff getApplicantStaff() {
		return applicantStaff;
	}

	public void setApplicantStaff(Staff applicantStaff) {
		this.applicantStaff = applicantStaff;
	}

	public Staff getTaskStaff() {
		return taskStaff;
	}

	public void setTaskStaff(Staff taskStaff) {
		this.taskStaff = taskStaff;
	}

	public Staff getSuperviceStaff() {
		return superviceStaff;
	}

	public void setSuperviceStaff(Staff superviceStaff) {
		this.superviceStaff = superviceStaff;
	}
	
}