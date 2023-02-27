/**
 *
 * @author ShawnTang
 *
 */
package com.bonade.sdk.opencenter.vo;

import java.io.Serializable;
import java.util.List;

public class AppServiceManageVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String typeName;

	/**
	 * 版本编号
	 */
	private String versionCode;

	/**
	 * 版本名称
	 */
	private String versionName;

	/**
	 * 版本类型
	 */
	private Integer versionType;

	private List<AppServiceManageFunctionItemVo> functionItems;

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
	 * @return the versionCode
	 */
	public String getVersionCode() {
		return versionCode;
	}

	/**
	 * @param versionCode the versionCode to set
	 */
	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	/**
	 * @return the versionName
	 */
	public String getVersionName() {
		return versionName;
	}

	/**
	 * @param versionName the versionName to set
	 */
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	/**
	 * @return the versionType
	 */
	public Integer getVersionType() {
		return versionType;
	}

	/**
	 * @param versionType the versionType to set
	 */
	public void setVersionType(Integer versionType) {
		this.versionType = versionType;
	}

	/**
	 * @return the functionItems
	 */
	public List<AppServiceManageFunctionItemVo> getFunctionItems() {
		return functionItems;
	}

	/**
	 * @param functionItems the functionItems to set
	 */
	public void setFunctionItems(List<AppServiceManageFunctionItemVo> functionItems) {
		this.functionItems = functionItems;
	}

	/**
	 * <b>Description:</b><br>
	 * 
	 * @return <b>Author:</b> ShawnTang <br>
	 *         <b>Date:</b> 2020年10月4日 上午10:09:12 <br>
	 *         <b>Version:</b> 1.0
	 */
	@Override
	public String toString() {
		return "AppServiceManageVo [typeName=" + typeName + ", versionCode=" + versionCode + ", versionName="
				+ versionName + ", versionType=" + versionType + ", functionItems=" + functionItems + "]";
	}

}
