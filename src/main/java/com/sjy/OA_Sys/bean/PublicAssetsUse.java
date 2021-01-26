package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;
import java.util.Date;

public class PublicAssetsUse {
    private Integer id;

    private Integer pubassId;

    private Integer staffId;

    private Integer useCount;

    private Timestamp useTime;

    private Date useTerm;

    public PublicAssetsUse(Integer id, Integer pubassId, Integer staffId, Integer useCount, Timestamp useTime, Date useTerm) {
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

    public Integer getPubassId() {
        return pubassId;
    }

    public void setPubassId(Integer pubassId) {
        this.pubassId = pubassId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
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