package com.sjy.OA_Sys.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Project implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String proId;

    private String staffId;

    private String proName;

    private Timestamp proTimeCre;

    private Timestamp proTimeStart;

    private Timestamp proTimeEnd;

    private String proRateProgress;

    private Integer proState;
    
    private Staff staff;

    public Project(Integer id, String proId, String staffId, String proName, Timestamp proTimeCre, Timestamp proTimeStart, Timestamp proTimeEnd, String proRateProgress, Integer proState) {
        this.id = id;
        this.proId = proId;
        this.staffId = staffId;
        this.proName = proName;
        this.proTimeCre = proTimeCre;
        this.proTimeStart = proTimeStart;
        this.proTimeEnd = proTimeEnd;
        this.proRateProgress = proRateProgress;
        this.proState = proState;
    }

    public Project() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId == null ? null : proId.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
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
    
	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", proId=" + proId + ", staffId=" + staffId + ", proName=" + proName
				+ ", proTimeCre=" + proTimeCre + ", proTimeStart=" + proTimeStart + ", proTimeEnd=" + proTimeEnd
				+ ", proRateProgress=" + proRateProgress + ", proState=" + proState + "]";
	}
    
}