/**
　 * @author ShawnTang
  *
*/
package com.bonade.sdk.opencenter.vo;

import java.io.Serializable;


/**
 * <b>Description: 业务线VO</b><br>
 * 
 * @author ShawnTang
 * @version 1.0 <b>ProjectName:</b> bonade-platform-opencenter <br>
 *          <b>PackageName:</b> com.bonade.opencenter.pojo.dto <br>
 *          <b>ClassName:</b> BusinessLineVo <br>
 *          <b>Date:</b> 2020年8月24日 下午2:25:09
 */
public class BusinessSystemVo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	/**
	 * 系统名称
	 */
	private String sysName;
	/**
	 * 系统域名
	 */
	private String sysDomain;

//	/**
//	 * 状态{1：已上架；2：未上架；3：已下架；4：已停用}
//	 */
//	@ApiModelProperty("状态{1：已上架；2：未上架；3：已下架；4：已停用}")
//	private Integer status;

	/**
	 * 资源ClientID
	 */
	private String clientId;

	/**
	 * 是否是内部(0内部系统，1是外部系统)
	 */
	private Integer isInterior;
	
	/**
	 * 系统编号
	 */
	private String sysCode;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the sysName
	 */
	public String getSysName() {
		return sysName;
	}

	/**
	 * @param sysName the sysName to set
	 */
	public void setSysName(String sysName) {
		this.sysName = sysName;
	}

	/**
	 * @return the sysDomain
	 */
	public String getSysDomain() {
		return sysDomain;
	}

	/**
	 * @param sysDomain the sysDomain to set
	 */
	public void setSysDomain(String sysDomain) {
		this.sysDomain = sysDomain;
	}

//	/**
//	 * @return the status
//	 */
//	public Integer getStatus() {
//		return status;
//	}

//	/**
//	 * @param status the status to set
//	 */
//	public void setStatus(Integer status) {
//		this.status = status;
//	}

	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the isInterior
	 */
	public Integer getIsInterior() {
		return isInterior;
	}

	/**
	 * @param isInterior the isInterior to set
	 */
	public void setIsInterior(Integer isInterior) {
		this.isInterior = isInterior;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	/**
	 * @return the sysCode
	 */
	public String getSysCode() {
		return sysCode;
	}

	/**
	 * @param sysCode the sysCode to set
	 */
	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}

	@Override
	public String toString() {
		return "BusinessSystemVo [id=" + id + ", sysName=" + sysName + ", sysDomain=" + sysDomain + ", clientId="
				+ clientId + ", isInterior=" + isInterior + ", sysCode=" + sysCode + "]";
	}


}
