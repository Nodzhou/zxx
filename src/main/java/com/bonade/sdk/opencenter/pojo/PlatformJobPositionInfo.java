package com.bonade.sdk.opencenter.pojo;


import java.io.Serializable;
import java.util.Date;

/**
 *  岗位基础信息表
 * @author lyx
 */
public class PlatformJobPositionInfo implements Serializable {

    /**
     * 岗位id
     */
    private String id;
    /**
     * 企业ID
     */
    private String companyId;

    /**
     * 岗位名称
     */
    private String positionName;

    /**
     * 上级岗位id
     */
    private String parentId;

    /**
     * 职责范围
     */
    private String jobScope;

    /**
     * 创建人Id
     */
    private String createId;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 岗位级别
     */
    private Integer level;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人Id
     */
    private String updateId;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 岗位状态
      */
    private Integer status;

    /**
     * 岗位类别: 0:普通岗位, 1:管理岗位
     */
    private Integer positionType;

    /**
     * 岗位排序
     */
    private Integer positionSort;

    /**
     * 岗位人数
     */
    private Integer positionNumber;

    /**
     * 岗位编码
     */
    private String positionCode;

    /**
     * 岗位绑定的角色(多个id逗号隔开)
     */
    private String roleIds;

    public PlatformJobPositionInfo(){}

    private PlatformJobPositionInfo(Builder builder) {
        this.id = builder.id;
        this.companyId = builder.companyId;
        this.createId = builder.createId;
        this.createTime = builder.createTime;
        this.createUser = builder.createUser;
        this.jobScope = builder.jobScope;
        this.level = builder.level;
        this.parentId = builder.parentId;
        this.positionCode = builder.positionCode;
        this.positionName = builder.positionName;
        this.positionNumber = builder.positionNumber;
        this.positionSort = builder.positionSort;
        this.positionType = builder.positionType;
        this.roleIds = builder.roleIds;
        this.status = builder.status;
        this.updateId = builder.updateId;
        this.updateTime = builder.updateTime;
        this.updateUser = builder.updateUser;
    }

    public static class Builder {

        private String id;

        private String companyId;

        private String positionName;

        private String parentId;

        private String jobScope;

        private String createId;

        private String createUser;

        private Integer level;

        private Date createTime;

        private String updateId;

        private String updateUser;

        private Date updateTime;

        private Integer status;

        private Integer positionType;

        private Integer positionSort;

        private Integer positionNumber;

        private String positionCode;

        private String roleIds;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setCompanyId(String companyId) {
            this.companyId = companyId;
            return this;
        }

        public Builder setPositionName(String positionName) {
            this.positionName = positionName;
            return this;
        }

        public Builder setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder setJobScope(String jobScope) {
            this.jobScope = jobScope;
            return this;
        }

        public Builder setCreateId(String createId) {
            this.createId = createId;
            return this;
        }

        public Builder setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }

        public Builder setLevel(Integer level) {
            this.level = level;
            return this;
        }

        public Builder setCreateTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setUpdateId(String updateId) {
            this.updateId = updateId;
            return this;
        }

        public Builder setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }

        public Builder setUpdateTime(Date updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setStatus(Integer status) {
            this.status = status;
            return this;
        }

        public Builder setPositionType(Integer positionType) {
            this.positionType = positionType;
            return this;
        }

        public Builder setPositionSort(Integer positionSort) {
            this.positionSort = positionSort;
            return this;
        }

        public Builder setPositionNumber(Integer positionNumber) {
            this.positionNumber = positionNumber;
            return this;
        }

        public Builder setPositionCode(String positionCode) {
            this.positionCode = positionCode;
            return this;
        }

        public Builder setRoleIds(String roleIds) {
            this.roleIds = roleIds;
            return this;
        }
        public PlatformJobPositionInfo builder() {
            return new PlatformJobPositionInfo(this);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getJobScope() {
        return jobScope;
    }

    public void setJobScope(String jobScope) {
        this.jobScope = jobScope;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPositionType() {
        return positionType;
    }

    public void setPositionType(Integer positionType) {
        this.positionType = positionType;
    }

    public Integer getPositionSort() {
        return positionSort;
    }

    public void setPositionSort(Integer positionSort) {
        this.positionSort = positionSort;
    }

    public Integer getPositionNumber() {
        return positionNumber;
    }

    public void setPositionNumber(Integer positionNumber) {
        this.positionNumber = positionNumber;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }
}
