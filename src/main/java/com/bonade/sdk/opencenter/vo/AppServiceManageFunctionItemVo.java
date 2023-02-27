/**
 *
 * @author ShawnTang
 *
 */
package com.bonade.sdk.opencenter.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AppServiceManageFunctionItemVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	/**
	 * 类别id
	 */
	private String typeId;

	/**
	 * 服务名称
	 */
	private String name;
	/**
	 * 排序
	 */
	private Integer sort;

	/**
	 * 快捷排序
	 */
	private Integer quickSort;
	/**
	 * 应用H5包资源
	 */
	private String h5Uri;
	/**
	 * 服务图标
	 */
	private String icon;
	/**
	 * 应用url
	 */
	private String serviceUrl;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 创建人id
	 */
	private String createId;
	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	/**
	 * 修改人Id
	 */
	private String updateId;
	/**
	 * 修改时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;
	/**
	 * 状态 {1：已上架；2：未上架；3：已下架；4：已停用}
	 */
	private Integer status;

	/**
	 * 客户端系统编号
	 */
	private String clientId;

	/**
	 * 新增字段 判断是否原生 0:不是 1:是 add by 刘子煜
	 */
	private String isOst;

	/**
	 * 新增字段 应用服务版本号 add by 刘子煜
	 */
	private String code;

	/**
	 * 新增字段是否使用原生导航 0:不是 1：是 add by 刘子煜
	 */
	private Integer isOstNavigation;

	/**
	 * 原生导航兰颜色
	 */
	private String ostNavigationColor;

	/**
	 * 新增字段是否使用蓝牙 0:不是 1：是 add by 刘子煜
	 */
	private Integer isBluetooth;

	/**
	 * 非必填系统标志 add by 刘子煜
	 */
	private String channel;

	/**
	 * 非必填跳转时是否需要参数 0:不是 1：是 add by 刘子煜
	 */
	private Integer isNeedParam;

	/**
	 * 类别名称
	 */
	private String typeName;

	/**
	 * 是否快捷 true 是；false 否
	 */
	private boolean isSelect;

	/**
	 * 应用H5包资源
	 */
	private String h5Name;

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
	 * @return the typeId
	 */
	public String getTypeId() {
		return typeId;
	}

	/**
	 * @param typeId the typeId to set
	 */
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

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
	 * @return the sort
	 */
	public Integer getSort() {
		return sort;
	}

	/**
	 * @param sort the sort to set
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}

	/**
	 * @return the quickSort
	 */
	public Integer getQuickSort() {
		return quickSort;
	}

	/**
	 * @param quickSort the quickSort to set
	 */
	public void setQuickSort(Integer quickSort) {
		this.quickSort = quickSort;
	}

	/**
	 * @return the h5Uri
	 */
	public String getH5Uri() {
		return h5Uri;
	}

	/**
	 * @param h5Uri the h5Uri to set
	 */
	public void setH5Uri(String h5Uri) {
		this.h5Uri = h5Uri;
	}

	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * @return the serviceUrl
	 */
	public String getServiceUrl() {
		return serviceUrl;
	}

	/**
	 * @param serviceUrl the serviceUrl to set
	 */
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the createId
	 */
	public String getCreateId() {
		return createId;
	}

	/**
	 * @param createId the createId to set
	 */
	public void setCreateId(String createId) {
		this.createId = createId;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the updateId
	 */
	public String getUpdateId() {
		return updateId;
	}

	/**
	 * @param updateId the updateId to set
	 */
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

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
	 * @return the isOst
	 */
	public String getIsOst() {
		return isOst;
	}

	/**
	 * @param isOst the isOst to set
	 */
	public void setIsOst(String isOst) {
		this.isOst = isOst;
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
	 * @return the isOstNavigation
	 */
	public Integer getIsOstNavigation() {
		return isOstNavigation;
	}

	/**
	 * @param isOstNavigation the isOstNavigation to set
	 */
	public void setIsOstNavigation(Integer isOstNavigation) {
		this.isOstNavigation = isOstNavigation;
	}

	/**
	 * @return the ostNavigationColor
	 */
	public String getOstNavigationColor() {
		return ostNavigationColor;
	}

	/**
	 * @param ostNavigationColor the ostNavigationColor to set
	 */
	public void setOstNavigationColor(String ostNavigationColor) {
		this.ostNavigationColor = ostNavigationColor;
	}

	/**
	 * @return the isBluetooth
	 */
	public Integer getIsBluetooth() {
		return isBluetooth;
	}

	/**
	 * @param isBluetooth the isBluetooth to set
	 */
	public void setIsBluetooth(Integer isBluetooth) {
		this.isBluetooth = isBluetooth;
	}

	/**
	 * @return the channel
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * @param channel the channel to set
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * @return the isNeedParam
	 */
	public Integer getIsNeedParam() {
		return isNeedParam;
	}

	/**
	 * @param isNeedParam the isNeedParam to set
	 */
	public void setIsNeedParam(Integer isNeedParam) {
		this.isNeedParam = isNeedParam;
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
	 * @return the isSelect
	 */
	public boolean isSelect() {
		return isSelect;
	}

	/**
	 * @param isSelect the isSelect to set
	 */
	public void setSelect(boolean isSelect) {
		this.isSelect = isSelect;
	}

	/**
	 * @return the h5Name
	 */
	public String getH5Name() {
		return h5Name;
	}

	/**
	 * @param h5Name the h5Name to set
	 */
	public void setH5Name(String h5Name) {
		this.h5Name = h5Name;
	}

	/**
	 * <b>Description:</b><br>
	 * 
	 * @return <b>Author:</b> ShawnTang <br>
	 *         <b>Date:</b> 2020年10月7日 上午11:12:41 <br>
	 *         <b>Version:</b> 1.0
	 */
	@Override
	public String toString() {
		return "AppServiceManageFunctionItemVo [id=" + id + ", typeId=" + typeId + ", name=" + name + ", sort=" + sort
				+ ", quickSort=" + quickSort + ", h5Uri=" + h5Uri + ", icon=" + icon + ", serviceUrl=" + serviceUrl
				+ ", description=" + description + ", createId=" + createId + ", createTime=" + createTime
				+ ", updateId=" + updateId + ", updateTime=" + updateTime + ", status=" + status + ", clientId="
				+ clientId + ", isOst=" + isOst + ", code=" + code + ", isOstNavigation=" + isOstNavigation
				+ ", ostNavigationColor=" + ostNavigationColor + ", isBluetooth=" + isBluetooth + ", channel=" + channel
				+ ", isNeedParam=" + isNeedParam + ", typeName=" + typeName + ", isSelect=" + isSelect + ", h5Name="
				+ h5Name + "]";
	}

}
