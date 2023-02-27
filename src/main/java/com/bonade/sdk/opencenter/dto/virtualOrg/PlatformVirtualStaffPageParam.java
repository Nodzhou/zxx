package com.bonade.sdk.opencenter.dto.virtualOrg;

import com.bonade.sdk.opencenter.vo.PageInfo;

import java.util.List;

/**
 * @author zhangbeiping
 * <b>Description:中台—虚拟组织成员查询参数</b><br>
 * <b>ProjectName:bonade-platform-structure</b>
 * <br><b>PackageName:com.bonade.structure.pojo.vo</b>
 * <br><b>ClassName:PlatformVirtualStaffPageParam</b>
 * <br><b>Date:2020/9/4 11:23</b>
 */
public class PlatformVirtualStaffPageParam extends PageInfo {

    /**
     * 模糊查询支持（工号，姓名，手机号）
     */
    private String keyword;

    /**
     * 虚拟组织ID集合
     */
    private List<String> virtualOrgIds;

    /**
     * 虚拟组织成员ID集合
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

    public List<String> getVirtualOrgIds() {
        return virtualOrgIds;
    }

    public void setVirtualOrgIds(List<String> virtualOrgIds) {
        this.virtualOrgIds = virtualOrgIds;
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
