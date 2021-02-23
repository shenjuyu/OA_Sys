package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;

public class ProjectWithBLOBs extends Project {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String proDes;

    private String proAttachment;

    private String proComments;

    public ProjectWithBLOBs(Integer id, String proId, String staffId, String proName, Timestamp proTimeCre, Timestamp proTimeStart, Timestamp proTimeEnd, String proRateProgress, Integer proState, String proDes, String proAttachment, String proComments) {
        super(id, proId, staffId, proName, proTimeCre, proTimeStart, proTimeEnd, proRateProgress, proState);
        this.proDes = proDes;
        this.proAttachment = proAttachment;
        this.proComments = proComments;
    }

    public ProjectWithBLOBs() {
        super();
    }

    public String getProDes() {
        return proDes;
    }

    public void setProDes(String proDes) {
        this.proDes = proDes == null ? null : proDes.trim();
    }

    public String getProAttachment() {
        return proAttachment;
    }

    public void setProAttachment(String proAttachment) {
        this.proAttachment = proAttachment == null ? null : proAttachment.trim();
    }

    public String getProComments() {
        return proComments;
    }

    public void setProComments(String proComments) {
        this.proComments = proComments == null ? null : proComments.trim();
    }
}