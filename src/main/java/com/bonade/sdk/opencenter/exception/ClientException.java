
package com.bonade.sdk.opencenter.exception;

import com.bonade.sdk.opencenter.common.ResultCodeConstant;

/**
 * 客户端异常
 *
 * @author jimmy
 */
public class ClientException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private int code;

	private String message;

	private Object data;

	public ClientException(int code, String message) {
		super(message);
		this.code = code;
		this.message = message;
	}

	public ClientException(int code, String message, Object data) {
		super(message);
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public ClientException() {
	}

	public ClientException(String message) {

		super(message);
		this.message = message;
		this.code = ResultCodeConstant.FAIL;
	}

	public ClientException(Throwable cause) {
		super(cause);
	}

	public ClientException(String message, Throwable cause) {
		super(message, cause);
		this.message = message;
		this.code = ResultCodeConstant.FAIL;
	}

	public ClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.message = message;
		this.code = ResultCodeConstant.FAIL;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public Object getData() {
		return data;
	}

}
