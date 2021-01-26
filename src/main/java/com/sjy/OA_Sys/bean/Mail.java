package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;

public class Mail {
    private Integer mailId;

    private Integer mailStaffSend;

    private Integer mailStaffAddressee;

    private String mailTitle;

    private Timestamp mailTimeSend;

    private Integer mailSituation;

    public Mail(Integer mailId, Integer mailStaffSend, Integer mailStaffAddressee, String mailTitle, Timestamp mailTimeSend, Integer mailSituation) {
        this.mailId = mailId;
        this.mailStaffSend = mailStaffSend;
        this.mailStaffAddressee = mailStaffAddressee;
        this.mailTitle = mailTitle;
        this.mailTimeSend = mailTimeSend;
        this.mailSituation = mailSituation;
    }

    public Mail() {
        super();
    }

    public Integer getMailId() {
        return mailId;
    }

    public void setMailId(Integer mailId) {
        this.mailId = mailId;
    }

    public Integer getMailStaffSend() {
        return mailStaffSend;
    }

    public void setMailStaffSend(Integer mailStaffSend) {
        this.mailStaffSend = mailStaffSend;
    }

    public Integer getMailStaffAddressee() {
        return mailStaffAddressee;
    }

    public void setMailStaffAddressee(Integer mailStaffAddressee) {
        this.mailStaffAddressee = mailStaffAddressee;
    }

    public String getMailTitle() {
        return mailTitle;
    }

    public void setMailTitle(String mailTitle) {
        this.mailTitle = mailTitle == null ? null : mailTitle.trim();
    }

    public Timestamp getMailTimeSend() {
        return mailTimeSend;
    }

    public void setMailTimeSend(Timestamp mailTimeSend) {
        this.mailTimeSend = mailTimeSend;
    }

    public Integer getMailSituation() {
        return mailSituation;
    }

    public void setMailSituation(Integer mailSituation) {
        this.mailSituation = mailSituation;
    }
}