
package com.bonade.sdk.opencenter.vo;

import java.io.Serializable;

/**
 * 权限vo
 * 
 * @author linsj
 *
 */
public class RoleVo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2753007448698358316L;

	private String roleId;

	private String roleName;

	private String roleCode;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

}
