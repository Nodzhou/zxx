package com.bonade.sdk.opencenter.client;

public interface ResultHandler<T> {

	/**
	 * 
	 * <b>Description:</b><br> 
	 * @param orgin 原生字节数组
	 * @return 处理后防护结果
	 *
	 */
	T getResult(byte[] orgin);

}
