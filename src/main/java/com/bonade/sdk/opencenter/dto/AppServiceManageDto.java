/**
 *
 * @author ShawnTang
 *
 */
package com.bonade.sdk.opencenter.dto;

import java.io.Serializable;

public class AppServiceManageDto implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 服务名称
	 */
	private String name;

	/**
	 * 版本id
	 */
	private String versionId;

	/**
	 * 服务类型名称
	 */
	private String typeName;

	/**
	 * 版本类型 1.IOS 2.Android
	 */
	private String versionType;

	/**
	 * APP版本code
	 */
	private String code;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the versionId
	 */
	public String getVersionId() {
		return versionId;
	}

	/**
	 * @param versionId the versionId to set
	 */
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * @param typeName the typeName to set
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	/**
	 * @return the versionType
	 */
	public String getVersionType() {
		return versionType;
	}

	/**
	 * @param versionType the versionType to set
	 */
	public void setVersionType(String versionType) {
		this.versionType = versionType;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <b>Description:</b><br>
	 * 
	 * @return <b>Author:</b> ShawnTang <br>
	 *         <b>Date:</b> 2020年10月4日 上午9:41:48 <br>
	 *         <b>Version:</b> 1.0
	 */
	@Override
	public String toString() {
		return "AppServiceManageVo [name=" + name + ", versionId=" + versionId + ", typeName=" + typeName
				+ ", versionType=" + versionType + ", code=" + code + "]";
	}

}
