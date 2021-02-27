package com.sjy.OA_Sys.bean;

import java.io.Serializable;

public class PublicAssetsType implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String typeName;

    private Integer state;

    public PublicAssetsType(Integer id, String typeName, Integer state) {
        this.id = id;
        this.typeName = typeName;
        this.state = state;
    }

    public PublicAssetsType() {
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}