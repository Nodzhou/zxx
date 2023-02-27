package com.bonade.sdk.opencenter.dto.jobposition;

import com.bonade.sdk.opencenter.vo.PageInfo;

/**
 * author: chd
 * date: 2020/6/29 18:25
 */
public class PlatformJobPositionPageDto extends PageInfo {

    /**
     * 岗位id
     */
    private String id;

    /**
     * 岗位状态
     */
    private Integer status;

    /**
     * 部门名称
     */
    private String positionName;
    /**
     * 企业id
     */
    private String companyId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
