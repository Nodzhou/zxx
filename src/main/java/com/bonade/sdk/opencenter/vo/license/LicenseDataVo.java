package com.bonade.sdk.opencenter.vo.license;

import java.io.Serializable;

/**
 * @author: zzx
 * 
 */

public class LicenseDataVo implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 插入的时候返回的插入id
	 */
	Integer id;
	/**
	 * 修改和删除的数量
	 */
	int count;

	public LicenseDataVo() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LicenseDataVo(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
