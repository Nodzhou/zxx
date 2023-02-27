package com.bonade.sdk.opencenter.vo.license;


import java.io.Serializable;

public class LicenseDetailsVo implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 系统名称
     */
	private String systemName;

    /**
     * 业务线名称
     */
	private String applicationName;

    /**
     * 应用地址
     */
	private String sysDomain;

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
     * 状态
     */
	private Integer status;

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getSysDomain() {
        return sysDomain;
    }

    public void setSysDomain(String sysDomain) {
        this.sysDomain = sysDomain;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
