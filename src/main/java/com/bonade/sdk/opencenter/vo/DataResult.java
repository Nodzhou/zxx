package com.bonade.sdk.opencenter.vo;

import java.io.Serializable;


public class DataResult<T extends Object> implements Serializable {

	private static final long serialVersionUID = 5063776667672736098L;

	/** 状态，10200表示成功， 10500表示失败 */
	private Integer code = 10200;

	private String message = "成功";

	/** 数据体 */
	private T data;

	/**时间戳  */
	private long timestamp = System.currentTimeMillis();

	public DataResult() {

	}

	public DataResult(Integer code, String message, T data) {
		this.message = message;
		this.data = data;
		this.code = code;
	}

	public DataResult(String message, T data) {
		this.message = message;
		this.data = data;
	}

	public DataResult(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

}
