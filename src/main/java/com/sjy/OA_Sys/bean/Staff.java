package com.sjy.OA_Sys.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Staff implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String staffId;

    private String staffPwd;

    private String staffName;
    
    private Integer staffSex;

    private Timestamp staffBirth;

    private String staffIdCard;

    private String staffTel;

    private String staffEmail;

    private String staffAddr;

    private String staffImg;

    private BigDecimal staffWages;

    private Integer staffState;

    private String staffPower;

    private String departId;
    
    private Depart depart;

    public Staff(Integer id, String staffId, String staffPwd, String staffName, Integer staffSex, Timestamp staffBirth, String staffIdCard, String staffTel, String staffEmail, String staffAddr, String staffImg, BigDecimal staffWages, Integer staffState, String staffPower, String departId) {
        this.id = id;
        this.staffId = staffId;
        this.staffPwd = staffPwd;
        this.staffName = staffName;
        this.staffSex = staffSex;
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

    public Staff(String staffId, String staffName, Integer staffSex, String staffImg, Integer staffState,
			String staffPower) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffSex = staffSex;
		this.staffImg = staffImg;
		this.staffState = staffState;
		this.staffPower = staffPower;
	}


	public Staff() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
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

    public Integer getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(Integer staffSex) {
        this.staffSex = staffSex;
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

    public String getStaffPower() {
        return staffPower;
    }

    public void setStaffPower(String staffPower) {
        this.staffPower = staffPower == null ? null : staffPower.trim();
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }

	public Depart getDepart() {
		return depart;
	}

	public void setDepartName(Depart depart) {
		this.depart = depart;
	}

}