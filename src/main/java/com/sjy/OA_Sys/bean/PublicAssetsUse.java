package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;
import java.util.Date;

public class PublicAssetsUse {
    private Integer id;

    private String pubassId;

    private String staffId;

    private Integer useCount;

    private Timestamp useTime;

    private Date useTerm;

    public PublicAssetsUse(Integer id, String pubassId, String staffId, Integer useCount, Timestamp useTime, Date useTerm) {
        this.id = id;
        this.pubassId = pubassId;
        this.staffId = staffId;
        this.useCount = useCount;
        this.useTime = useTime;
        this.useTerm = useTerm;
    }

    public PublicAssetsUse() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPubassId() {
        return pubassId;
    }

    public void setPubassId(String pubassId) {
        this.pubassId = pubassId == null ? null : pubassId.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public Timestamp getUseTime() {
        return useTime;
    }

    public void setUseTime(Timestamp useTime) {
        this.useTime = useTime;
    }

    public Date getUseTerm() {
        return useTerm;
    }

    public void setUseTerm(Date useTerm) {
        this.useTerm = useTerm;
    }
}