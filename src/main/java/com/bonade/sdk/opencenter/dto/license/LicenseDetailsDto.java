package com.bonade.sdk.opencenter.dto.license;

import java.io.Serializable;
import java.util.Date;

public class LicenseDetailsDto implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 授权详情id
	 */
	private Integer id;
	/**
	 * 系统code
	 */
	private String systemCode;



    /**
     * clientId
     */
    private String clientId;


    /**
     * 所属业务线code
     */
    private String applicationCode;


    /**
     * 所属业务线名称
     */
    private String applicationName;

    /**
     * 系统名称
     */
    private String systemName;
	/**
	 * 有效期起
	 */
	private Date validityStart;

	/**
	 * 有效期止
	 */
	private Date validityPeriod;

	/**
	 * 是否永久(1永久，0非永久)
	 */
	private Integer isPermanent;

	/**
	 * 可授权数
	 */
	private Integer mayAuthorize;

	public Integer getMayAuthorize() {
		return mayAuthorize;
	}

	public void setMayAuthorize(Integer mayAuthorize) {
		this.mayAuthorize = mayAuthorize;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public Date getValidityStart() {
		return validityStart;
	}

	public void setValidityStart(Date validityStart) {
		this.validityStart = validityStart;
	}

	public Date getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(Date validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public Integer getIsPermanent() {
		return isPermanent;
	}

	public void setIsPermanent(Integer isPermanent) {
		this.isPermanent = isPermanent;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }
}
