package com.sjy.OA_Sys.bean;

public class ProcessType {
    private Integer id;

    private String typeName;

    private Integer typeState;

    public ProcessType(Integer id, String typeName, Integer typeState) {
        this.id = id;
        this.typeName = typeName;
        this.typeState = typeState;
    }

    public ProcessType() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getTypeState() {
        return typeState;
    }

    public void setTypeState(Integer typeState) {
        this.typeState = typeState;
    }
}