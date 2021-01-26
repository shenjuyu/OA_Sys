package com.sjy.OA_Sys.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class PublicAssets {
    private Integer pubassId;

    private String pubassName;

    private String pubassType;

    private BigDecimal pubassPrice;

    private Integer departId;

    private Timestamp pubassTime;

    private Integer pubassCount;

    private String pubassDes;

    public PublicAssets(Integer pubassId, String pubassName, String pubassType, BigDecimal pubassPrice, Integer departId, Timestamp pubassTime, Integer pubassCount) {
        this.pubassId = pubassId;
        this.pubassName = pubassName;
        this.pubassType = pubassType;
        this.pubassPrice = pubassPrice;
        this.departId = departId;
        this.pubassTime = pubassTime;
        this.pubassCount = pubassCount;
    }

    public PublicAssets(Integer pubassId, String pubassName, String pubassType, BigDecimal pubassPrice, Integer departId, Timestamp pubassTime, Integer pubassCount, String pubassDes) {
        this.pubassId = pubassId;
        this.pubassName = pubassName;
        this.pubassType = pubassType;
        this.pubassPrice = pubassPrice;
        this.departId = departId;
        this.pubassTime = pubassTime;
        this.pubassCount = pubassCount;
        this.pubassDes = pubassDes;
    }

    public PublicAssets() {
        super();
    }

    public Integer getPubassId() {
        return pubassId;
    }

    public void setPubassId(Integer pubassId) {
        this.pubassId = pubassId;
    }

    public String getPubassName() {
        return pubassName;
    }

    public void setPubassName(String pubassName) {
        this.pubassName = pubassName == null ? null : pubassName.trim();
    }

    public String getPubassType() {
        return pubassType;
    }

    public void setPubassType(String pubassType) {
        this.pubassType = pubassType == null ? null : pubassType.trim();
    }

    public BigDecimal getPubassPrice() {
        return pubassPrice;
    }

    public void setPubassPrice(BigDecimal pubassPrice) {
        this.pubassPrice = pubassPrice;
    }

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public Timestamp getPubassTime() {
        return pubassTime;
    }

    public void setPubassTime(Timestamp pubassTime) {
        this.pubassTime = pubassTime;
    }

    public Integer getPubassCount() {
        return pubassCount;
    }

    public void setPubassCount(Integer pubassCount) {
        this.pubassCount = pubassCount;
    }

    public String getPubassDes() {
        return pubassDes;
    }

    public void setPubassDes(String pubassDes) {
        this.pubassDes = pubassDes == null ? null : pubassDes.trim();
    }
}