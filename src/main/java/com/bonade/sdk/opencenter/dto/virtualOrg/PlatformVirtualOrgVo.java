package com.bonade.sdk.opencenter.dto.virtualOrg;

import java.util.List;

/**
 * @author zhangbeiping
 * <b>Description:中台—虚拟组织扩展虚拟类</b><br>
 * <b>ProjectName:bonade-platform-structure</b>
 * <br><b>PackageName:com.bonade.structure.pojo.vo</b>
 * <br><b>ClassName:PlatformVirtualOrgParam</b>
 * <br><b>Date:2020/9/5 11:41</b>
 */
public class PlatformVirtualOrgVo extends PlatformVirtualOrgInfo {

    /**
     * 上级虚拟组织名称
     */
    private String parentName;

    /**
     * 虚拟组织对于的成员数量
     */
    private int staffCount;

    /**
     * 是否展开：默认为false，展开是为true（前段使用）
     */
    private boolean expand;

    /**
     * 虚拟组织负责人扩展信息虚拟类
     */
    private List<PlatformVirtualLeaderVo> platformVirtualLeaderVoList;

    /**
     * 孩子树
     */
    private List<PlatformVirtualOrgVo> children;

    /**
     * 虚拟组织类型{1：行政虚拟组织，2：业务虚拟组织}
     */
    private Integer type;

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    public boolean isExpand() {
        return expand;
    }

    public void setExpand(boolean expand) {
        this.expand = expand;
    }

    public List<PlatformVirtualLeaderVo> getPlatformVirtualLeaderVoList() {
        return platformVirtualLeaderVoList;
    }

    public void setPlatformVirtualLeaderVoList(List<PlatformVirtualLeaderVo> platformVirtualLeaderVoList) {
        this.platformVirtualLeaderVoList = platformVirtualLeaderVoList;
    }

    public List<PlatformVirtualOrgVo> getChildren() {
        return children;
    }

    public void setChildren(List<PlatformVirtualOrgVo> children) {
        this.children = children;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
