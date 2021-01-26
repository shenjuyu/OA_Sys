package com.sjy.OA_Sys.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Staff {
    private Integer staffId;

    private String staffPwd;

    private String staffName;

    private Timestamp staffBirth;

    private String staffIdCard;

    private String staffTel;

    private String staffEmail;

    private String staffAddr;

    private String staffImg;

    private BigDecimal staffWages;

    private Integer staffState;

    private Integer staffPower;

    private Integer departId;

    public Staff(Integer staffId, String staffPwd, String staffName, Timestamp staffBirth, String staffIdCard, String staffTel, String staffEmail, String staffAddr, String staffImg, BigDecimal staffWages, Integer staffState, Integer staffPower, Integer departId) {
        this.staffId = staffId;
        this.staffPwd = staffPwd;
        this.staffName = staffName;
        this.staffBirth = staffBirth;
        this.staffIdCard = staffIdCard;
        this.staffTel = staffTel;
        this.staffEmail = staffEmail;
        this.staffAddr = staffAddr;
        this.staffImg = staffImg;
        this.staffWages = staffWages;
        this.staffState = staffState;
        this.staffPower = staffPower;
        this.departId = departId;
    }

    public Staff() {
        super();
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffPwd() {
        return staffPwd;
    }

    public void setStaffPwd(String staffPwd) {
        this.staffPwd = staffPwd == null ? null : staffPwd.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public Timestamp getStaffBirth() {
        return staffBirth;
    }

    public void setStaffBirth(Timestamp staffBirth) {
        this.staffBirth = staffBirth;
    }

    public String getStaffIdCard() {
        return staffIdCard;
    }

    public void setStaffIdCard(String staffIdCard) {
        this.staffIdCard = staffIdCard == null ? null : staffIdCard.trim();
    }

    public String getStaffTel() {
        return staffTel;
    }

    public void setStaffTel(String staffTel) {
        this.staffTel = staffTel == null ? null : staffTel.trim();
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail == null ? null : staffEmail.trim();
    }

    public String getStaffAddr() {
        return staffAddr;
    }

    public void setStaffAddr(String staffAddr) {
        this.staffAddr = staffAddr == null ? null : staffAddr.trim();
    }

    public String getStaffImg() {
        return staffImg;
    }

    public void setStaffImg(String staffImg) {
        this.staffImg = staffImg == null ? null : staffImg.trim();
    }

    public BigDecimal getStaffWages() {
        return staffWages;
    }

    public void setStaffWages(BigDecimal staffWages) {
        this.staffWages = staffWages;
    }

    public Integer getStaffState() {
        return staffState;
    }

    public void setStaffState(Integer staffState) {
        this.staffState = staffState;
    }

    public Integer getStaffPower() {
        return staffPower;
    }

    public void setStaffPower(Integer staffPower) {
        this.staffPower = staffPower;
    }

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }
}