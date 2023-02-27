package com.bonade.sdk.opencenter.vo;

/**
 * 分页查询员工的字段Vo
 */
public class StaffQueryVo  {

	/**
	 * 企业Id
	 */
	private String companyId;

	/**
	 * 部门Id
	 */
	private String departmentId;

	/**
	 * 岗位Id
	 */
	private String positionId;

	/**
	 * 是否为主体企业, 0 否， 1 是
	 */
	private String isMainCompany;

	/**
	 * 是否在职， 0 否， 1 是
	 */
	private String isNotLeft;

	/**
	 * 入职时间下限
	 */
	private String dateJoinStart;

	/**
	 * 入职时间上限
	 */
	private String dateJoinEnd;

	/**
	 * 角色Id
	 */
	private String roleId;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 是否实名，0 否， 1 是
	 */
	private String isCertificated;

	/**
	 * 查询关键字
	 */
	private String keyword;

	/**
	 * 过滤字段
	 */
	private String sortField;


	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}


	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}


	public String getPositionId() {
		return positionId;
	}

	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}


	public String getIsNotLeft() {
		return isNotLeft;
	}

	public void setIsNotLeft(String isNotLeft) {
		this.isNotLeft = isNotLeft;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getIsMainCompany() {
		return isMainCompany;
	}

	public void setIsMainCompany(String isMainCompany) {
		this.isMainCompany = isMainCompany;
	}

	public String getDateJoinStart() {
		return dateJoinStart;
	}

	public void setDateJoinStart(String dateJoinStart) {
		this.dateJoinStart = dateJoinStart;
	}

	public String getDateJoinEnd() {
		return dateJoinEnd;
	}

	public void setDateJoinEnd(String dateJoinEnd) {
		this.dateJoinEnd = dateJoinEnd;
	}

	public String getIsCertificated() {
		return isCertificated;
	}

	public void setIsCertificated(String isCertificated) {
		this.isCertificated = isCertificated;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
}
