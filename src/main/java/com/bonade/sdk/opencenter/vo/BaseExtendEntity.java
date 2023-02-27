package com.bonade.sdk.opencenter.vo;

import java.util.Date;

public class BaseExtendEntity {

	/** 扩展状态 */
	private Integer statusExtend;

	/** 创建时间 */
	private Date createTime;

	/** 更新时间 */
	private Date updateTime;


	public Integer getStatusExtend() {
		return statusExtend;
	}

	public void setStatusExtend(Integer statusExtend) {
		this.statusExtend = statusExtend;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
