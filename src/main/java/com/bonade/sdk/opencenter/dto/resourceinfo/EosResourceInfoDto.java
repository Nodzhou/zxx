package com.bonade.sdk.opencenter.dto.resourceinfo;

import com.bonade.sdk.opencenter.pojo.EosResourceInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <b>Description:</b><br>
 *
 * @author jdocer
 * @version 1.0
 * <b>ProjectName:</b>
 * <br><b>PackageName:</b>
 * <br><b>ClassName:</b>
 * <br><b>Date:</b>
 */

public class EosResourceInfoDto<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 资源id
     */
    private String resourceOpenId;

    /**
     * 系统id
     */
    private String systemId;

    /**
     * 本系统资源id
     */
    private String thirdResourceId;

    /**
     * 父级资源id
     */
    private String parentResourceOpenId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 资源图标
     */

    private String resourceIcon;

    /**
     * 资源连接地址
     */
    private String resourceUrl;

    /**
     * 资源描述
     */
    private String resourceDesc;

    /**
     * 创建类型 1:中控  2:企业中心  3:业务线
     */
    private Integer createType;

    /**
     * 修改类型 1:中控  2:企业中心  3:业务线
     */

    private Integer updateType;

    /**
     * 状态
     */

    private Integer status;

    /**
     * 是否启用，1-启用，2-不启用
     */
    private Integer isShow;

    /**
     * 业务线clientId
     */

    private String clientId;

    /**
     * 资源编码
     */

    private String resourceCode;
    /**
     * 资源层级
     */

    private Integer resourceLayer;
    /**
     * 资源排序
     */

    private Integer resourceSort;

    /**
     * 资源类型
     */

    private Integer resourceType;

    /**
     * 子级
     */
    private List<EosResourceInfo> children = new ArrayList<>();

    /**
     * 是否已选
     */
    private Boolean checked = false;

    /**
     * 父级资源名称
     */
    private String parentResourceName;

    /**
     * 是否有子级资源
     */
    private Boolean haveChildren;

    /**
     * 系统名称
     */

    private String sysName;

    /**
     * 业务线名称
     */

    private String applicationName;

    /**
     * 授权标识
     */
    private String authMark;

    /**
     * 系统权重，值越大，权重越大
     */
    private Integer weight;

    /**
     * 是否系统必选 1-是 0-否
     */
    private Integer systemRequire;

    /**
     * 备注
     */
    private String remark;

    /**
     * 资源部分的扩展字段
     */
    private T resourceInfoExtend;

    /**
     * 获取资源id
     *
     * @return String 资源id
     */
    public String getResourceOpenId() {
        return resourceOpenId;
    }

    /**
     * 设置资源id
     *
     * @param resourceOpenId 资源id
     */
    public void setResourceOpenId(String resourceOpenId) {
        this.resourceOpenId = resourceOpenId;
    }

    /**
     * 获取系统systemId
     *
     * @return String 系统systemId
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * 设置系统systemId
     *
     * @param systemId 系统ID
     */
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    /**
     * 获取本系统资源id
     *
     * @return String 本系统资源id
     */
    public String getThirdResourceId() {
        return thirdResourceId;
    }

    /**
     * 设置本系统资源id
     *
     * @param thirdResourceId 资源ID
     */
    public void setThirdResourceId(String thirdResourceId) {
        this.thirdResourceId = thirdResourceId;
    }

    /**
     * 获取父资源id
     *
     * @return String 父资源id
     */
    public String getParentResourceOpenId() {
        return parentResourceOpenId;
    }

    /**
     * 设置父资源id
     *
     * @param parentResourceOpenId 父资源id
     */
    public void setParentResourceOpenId(String parentResourceOpenId) {
        this.parentResourceOpenId = parentResourceOpenId;
    }

    /**
     * 获取资源名称
     *
     * @return String 资源名称
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 设置资源名称
     *
     * @param resourceName 资源名称
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * 获取资源图标
     *
     * @return String 资源图标
     */
    public String getResourceIcon() {
        return resourceIcon;
    }

    /**
     * 设置资源图标
     *
     * @param resourceIcon 资源图标
     */
    public void setResourceIcon(String resourceIcon) {
        this.resourceIcon = resourceIcon;
    }

    /**
     * 获取资源路径
     *
     * @return String 资源路径
     */
    public String getResourceUrl() {
        return resourceUrl;
    }


    /**
     * 设置资源路径
     *
     * @param resourceUrl 资源路径
     */
    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    /**
     * 获取资源描述
     *
     * @return String 资源描述
     */
    public String getResourceDesc() {
        return resourceDesc;
    }

    /**
     * 设置资源描述
     *
     * @param resourceDesc 资源描述
     */
    public void setResourceDesc(String resourceDesc) {
        this.resourceDesc = resourceDesc;
    }

    public Integer getCreateType() {
        return createType;
    }

    public void setCreateType(Integer createType) {
        this.createType = createType;
    }


    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public Integer getResourceLayer() {
        return resourceLayer;
    }

    public void setResourceLayer(Integer resourceLayer) {
        this.resourceLayer = resourceLayer;
    }

    public Integer getResourceSort() {
        return resourceSort;
    }

    public void setResourceSort(Integer resourceSort) {
        this.resourceSort = resourceSort;
    }

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public List<EosResourceInfo> getChildren() {
        return children;
    }

    public void setChildren(List<EosResourceInfo> children) {
        this.children = children;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getParentResourceName() {
        return parentResourceName;
    }

    public void setParentResourceName(String parentResourceName) {
        this.parentResourceName = parentResourceName;
    }

    public Boolean getHaveChildren() {
        return haveChildren;
    }

    public void setHaveChildren(Boolean haveChildren) {
        this.haveChildren = haveChildren;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getAuthMark() {
        return authMark;
    }

    public void setAuthMark(String authMark) {
        this.authMark = authMark;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getSystemRequire() {
        return systemRequire;
    }

    public void setSystemRequire(Integer systemRequire) {
        this.systemRequire = systemRequire;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public T getResourceInfoExtend() {
        return resourceInfoExtend;
    }

    public void setResourceInfoExtend(T resourceInfoExtend) {
        this.resourceInfoExtend = resourceInfoExtend;
    }

    @Override
    public String toString() {
        return "EosResourceInfoDto{" +
                "resourceOpenId='" + resourceOpenId + '\'' +
                ", systemId='" + systemId + '\'' +
                ", thirdResourceId='" + thirdResourceId + '\'' +
                ", parentResourceOpenId='" + parentResourceOpenId + '\'' +
                ", resourceName='" + resourceName + '\'' +
                ", resourceIcon='" + resourceIcon + '\'' +
                ", resourceUrl='" + resourceUrl + '\'' +
                ", resourceDesc='" + resourceDesc + '\'' +
                ", createType=" + createType +
                ", updateType=" + updateType +
                ", status=" + status +
                ", isShow=" + isShow +
                ", clientId='" + clientId + '\'' +
                ", resourceCode='" + resourceCode + '\'' +
                ", resourceLayer=" + resourceLayer +
                ", resourceSort=" + resourceSort +
                ", resourceType=" + resourceType +
                ", children=" + children +
                ", checked=" + checked +
                ", parentResourceName='" + parentResourceName + '\'' +
                ", haveChildren=" + haveChildren +
                ", sysName='" + sysName + '\'' +
                ", applicationName='" + applicationName + '\'' +
                ", authMark='" + authMark + '\'' +
                ", weight=" + weight +
                ", systemRequire=" + systemRequire +
                ", remark='" + remark + '\'' +
                ", resourceInfoExtend=" + resourceInfoExtend +
                '}';
    }
}
