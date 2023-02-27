package com.bonade.sdk.opencenter.param;

//import com.bonade.sdk.opencenter.enums.PlatformStatusEnum;

import com.bonade.sdk.opencenter.vo.PageInfo;

/**
 * @author: chd
 * date: 2020/6/29 18:25
 */
public class PlatformJobPositionParam {

    /**
     * 岗位id
     */
    private String id;

    /**
     * 岗位状态
     */
    private Integer status;

    /**
     * 企业id
     */
    private String companyId;

    /**
     * 分页参数
     */
    private PageInfo pageInfo = new PageInfo();

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

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
