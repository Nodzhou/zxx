package com.bonade.sdk.opencenter.dto.license;

import com.bonade.sdk.opencenter.vo.PageInfo;


public class QueryLicenseDetailsDto  extends PageInfo {

    /**
     * 系统名称
     */
    private String systemName;

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }
}
