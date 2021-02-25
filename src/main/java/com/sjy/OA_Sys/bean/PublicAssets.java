package com.sjy.OA_Sys.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class PublicAssets implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String pubassId;

	private String pubassName;

	private Integer pubassType;

	private BigDecimal pubassPrice;

	private String departId;

	private Timestamp pubassTime;

	private Integer pubassCount;

	private String pubassDes;

	public PublicAssets(Integer id, String pubassId, String pubassName, Integer pubassType, BigDecimal pubassPrice,
			String departId, Timestamp pubassTime, Integer pubassCount) {
		this.id = id;
		this.pubassId = pubassId;
		this.pubassName = pubassName;
		this.pubassType = pubassType;
		this.pubassPrice = pubassPrice;
		this.departId = departId;
		this.pubassTime = pubassTime;
		this.pubassCount = pubassCount;
	}

	public PublicAssets(Integer id, String pubassId, String pubassName, Integer pubassType, BigDecimal pubassPrice,
			String departId, Timestamp pubassTime, Integer pubassCount, String pubassDes) {
		this.id = id;
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

	public String getPubassName() {
		return pubassName;
	}

	public void setPubassName(String pubassName) {
		this.pubassName = pubassName == null ? null : pubassName.trim();
	}

	public Integer getPubassType() {
		return pubassType;
	}

	public void setPubassType(Integer pubassType) {
		this.pubassType = pubassType;
	}

	public BigDecimal getPubassPrice() {
		return pubassPrice;
	}

	public void setPubassPrice(BigDecimal pubassPrice) {
		this.pubassPrice = pubassPrice;
	}

	public String getDepartId() {
		return departId;
	}

	public void setDepartId(String departId) {
		this.departId = departId == null ? null : departId.trim();
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