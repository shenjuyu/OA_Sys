package com.sjy.OA_Sys.bean;

public class Depart {
    private Integer departId;

    private String departName;

    private String departAddr;

    public Depart(Integer departId, String departName, String departAddr) {
        this.departId = departId;
        this.departName = departName;
        this.departAddr = departAddr;
    }

    public Depart() {
        super();
    }

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public String getDepartAddr() {
        return departAddr;
    }

    public void setDepartAddr(String departAddr) {
        this.departAddr = departAddr == null ? null : departAddr.trim();
    }
}