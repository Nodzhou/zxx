package com.bonade.sdk.opencenter.vo;


import com.bonade.sdk.opencenter.dto.BaseExtendDto;

import java.io.Serializable;
import java.util.Date;


/**
 */
public class StaffInfoPageByDepartVo<T extends BaseExtendDto> implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
     * 员工ID
     */
	private String staffId;
	/**
     * 员工姓名
     */
	private String staffName;
	/**
     * 岗位ID
     */
	private String positionId;
	/**
     * 岗位名称
     */
	private String positionName;
	/**
     * 部门ID
     */
	private String departmentId;
	/**
	 * 用户id
	 */
	private String userId;
	/**
     * 部门名称
     */
	private String departmentName;
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getPositionId() {
		return positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
