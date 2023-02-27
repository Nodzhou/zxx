package com.bonade.sdk.opencenter.pojo;

import com.bonade.sdk.opencenter.enums.PlatformStatusEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author chd
 */
public class PlatformDepartmentInfo implements Serializable {

	/**
	 * 部门id
	 */
    private String id;

    /**
     * 企业ID
     */
    private String companyId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 上级部门Id
     */
    private String parentId;

    /**
     * 联系电话
     */
    private String telephone;

    /**
     * 描述
     */
    private String departmentDesc;

    /**
     * 创建人Id
     */
    private String createId;

    /**
     * 创建人
     */
    private String createUser;

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
     * 部门状态
     */
    private PlatformStatusEnum status;

	/**
	 * 部门编码
	 */
    private String departmentCode;

	/**
	 * 部门类型(0内部部门 1外部部门)
	 */
	private Integer departmentType;

	/**
	 * 部门人数
	 */
    private Integer departmentNumber;

	/**
	 * 部门排序
	 */
	private Integer departmentSort;

	/**
	 * 部门负责人
	 */
    private List<String> leaders;

	/**
	 * 上级部门名称
	 */
    private String parentName;

	/**
	 * 上级部门类型
	 */
    private Integer parentDeptType;

	/**
	 * 部门人数
	 */
    private int total;

    public PlatformDepartmentInfo() {}

    private PlatformDepartmentInfo(Builder builder) {
    	this.id = builder.id;
    	this.companyId = builder.companyId;
    	this.createId = builder.createId;
    	this.createTime = builder.createTime;
    	this.createUser = builder.createUser;
    	this.departmentCode = builder.departmentCode;
    	this.departmentDesc = builder.departmentDesc;
    	this.departmentName = builder.departmentName;
    	this.departmentNumber = builder.departmentNumber;
    	this.departmentSort = builder.departmentSort;
    	this.departmentType = builder.departmentType;
    	this.leaders = builder.leaders;
    	this.parentDeptType = builder.parentDeptType;
    	this.parentId = builder.parentId;
    	this.parentName = builder.parentName;
    	this.status = builder.status;
    	this.telephone = builder.telephone;
    	this.total = builder.total;
    	this.updateId = builder.updateId;
    	this.updateTime = builder.updateTime;
    	this.updateUser = builder.updateUser;
	}

    public static class Builder{

		private String id;

		private String companyId;

		private String departmentName;

		private String parentId;

		private String telephone;

		private String departmentDesc;

		private String createId;

		private String createUser;

		private Date createTime;

		private String updateId;

		private String updateUser;

		private Date updateTime;

		private PlatformStatusEnum status;

		private String departmentCode;

		private Integer departmentType;

		private Integer departmentNumber;

		private Integer departmentSort;

		private List<String> leaders;

		private String parentName;

		private Integer parentDeptType;

		private int total;

		public Builder setId(String id) {
			this.id = id;
			return this;
		}

		public Builder setCompanyId(String companyId) {
			this.companyId = companyId;
			return this;
		}

		public Builder setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
			return this;
		}

		public Builder setParentId(String parentId) {
			this.parentId = parentId;
			return this;
		}

		public Builder setTelephone(String telephone) {
			this.telephone = telephone;
			return this;
		}

		public Builder setDepartmentDesc(String departmentDesc) {
			this.departmentDesc = departmentDesc;
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

		public Builder setStatus(PlatformStatusEnum status) {
			this.status = status;
			return this;
		}

		public Builder setDepartmentCode(String departmentCode) {
			this.departmentCode = departmentCode;
			return this;
		}

		public Builder setDepartmentType(Integer departmentType) {
			this.departmentType = departmentType;
			return this;
		}

		public Builder setDepartmentNumber(Integer departmentNumber) {
			this.departmentNumber = departmentNumber;
			return this;
		}

		public Builder setDepartmentSort(Integer departmentSort) {
			this.departmentSort = departmentSort;
			return this;
		}

		public Builder setLeaders(List<String> leaders) {
			this.leaders = leaders;
			return this;
		}

		public Builder setParentName(String parentName) {
			this.parentName = parentName;
			return this;
		}

		public Builder setParentDeptType(Integer parentDeptType) {
			this.parentDeptType = parentDeptType;
			return this;
		}

		public Builder setTotal(int total) {
			this.total = total;
			return this;
		}

		public PlatformDepartmentInfo builder() {
			return new PlatformDepartmentInfo(this);
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


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getParentId() {
		return parentId;
	}


	public void setParentId(String parentId) {
		this.parentId = parentId;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getDepartmentDesc() {
		return departmentDesc;
	}


	public void setDepartmentDesc(String departmentDesc) {
		this.departmentDesc = departmentDesc;
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


	public PlatformStatusEnum getStatus() {
		return status;
	}


	public void setStatus(PlatformStatusEnum status) {
		this.status = status;
	}


	public String getDepartmentCode() {
		return departmentCode;
	}


	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}


	public Integer getDepartmentType() {
		return departmentType;
	}


	public void setDepartmentType(Integer departmentType) {
		this.departmentType = departmentType;
	}


	public Integer getDepartmentNumber() {
		return departmentNumber;
	}


	public void setDepartmentNumber(Integer departmentNumber) {
		this.departmentNumber = departmentNumber;
	}


	public Integer getDepartmentSort() {
		return departmentSort;
	}


	public void setDepartmentSort(Integer departmentSort) {
		this.departmentSort = departmentSort;
	}


	public List<String> getLeaders() {
		return leaders;
	}


	public void setLeaders(List<String> leaders) {
		this.leaders = leaders;
	}


	public String getParentName() {
		return parentName;
	}


	public void setParentName(String parentName) {
		this.parentName = parentName;
	}


	public Integer getParentDeptType() {
		return parentDeptType;
	}


	public void setParentDeptType(Integer parentDeptType) {
		this.parentDeptType = parentDeptType;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}

}
