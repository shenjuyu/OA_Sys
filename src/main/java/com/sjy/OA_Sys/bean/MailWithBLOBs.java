package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;

public class MailWithBLOBs extends Mail {
    private String mailDes;

    private String mailAttachment;

    public MailWithBLOBs(Integer mailId, Integer mailStaffSend, Integer mailStaffAddressee, String mailTitle, Timestamp mailTimeSend, Integer mailSituation, String mailDes, String mailAttachment) {
        super(mailId, mailStaffSend, mailStaffAddressee, mailTitle, mailTimeSend, mailSituation);
        this.mailDes = mailDes;
        this.mailAttachment = mailAttachment;
    }

    public MailWithBLOBs() {
        super();
    }

    public String getMailDes() {
        return mailDes;
    }

    public void setMailDes(String mailDes) {
        this.mailDes = mailDes == null ? null : mailDes.trim();
    }

    public String getMailAttachment() {
        return mailAttachment;
    }

    public void setMailAttachment(String mailAttachment) {
        this.mailAttachment = mailAttachment == null ? null : mailAttachment.trim();
    }
}