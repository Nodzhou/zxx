package com.bonade.sdk.opencenter.dto.virtualOrg;

import java.util.List;

/**
 * @author zhangbeiping
 * <b>Description:中台—虚拟组织查询参数虚拟类</b><br>
 * <b>ProjectName:bonade-platform-structure</b>
 * <br><b>PackageName:com.bonade.structure.pojo.vo</b>
 * <br><b>ClassName:PlatformVirtualOrgParam</b>
 * <br><b>Date:2020/9/5 11:41</b>
 */
public class PlatformVirtualOrgParam {

    /**
     * 虚拟组织名称模糊查询
     */
    private String keyword;

    /**
     * 企业ID
     */
    private String companyId;

    /**
     * 父级ID
     */
    private String parentId;

    /**
     * ID集合查询
     */
    private List<String> ids;

    /**
     * 虚拟组织类型{1：行政虚拟组织，2：业务虚拟组织}
     */
    private Integer type;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
