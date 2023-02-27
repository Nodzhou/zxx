package com.bonade.sdk.opencenter.vo;

public class PageData<T> {

	/** 总数 */
	private long total;
	/** 返回数据 */
	private T data;

	public PageData() {

	}

	public PageData(T data, long total) {
		this.total = total;
		this.data = data;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
