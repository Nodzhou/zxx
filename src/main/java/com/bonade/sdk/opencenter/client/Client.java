package com.bonade.sdk.opencenter.client;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;
/**
 * 客户端接口
 * @author jimmy
 *
 */
public interface Client {
	
	/**
	 * 刷新客户端
	 */
//	void refresh();
	


	/** 
	 * 执行post 请求
	 * @param path 请求路径参考 ApiPathConstant 
	 * @param contentType 参考HttpClientUtils
	 * @param params 请求参数
	 * @return JSONObject 结果集
	 */
	JSONObject executePost(String path,String contentType, Map<String, Object> params);
	 

	/**
	 * 执行post 请求
	 * @param path 请求路径参考 ApiPathConstant
	 * @param jsonObject 请求参数
	 * @return JSONObject 结果集
	 */
	JSONObject postByJson(String path, Object jsonObject);
	
	
	/**
	 * 执行get 请求
	 * @param path 路径
	 * @param params 参数
	 * @return JSONObject 结果集
	 */
	JSONObject executeGet(String path,Map<String, Object> params);

	/** 
	 * 执行put 请求 
	 * @param path 路径
	 * @param params 参数信息
	 * @param contentType contentType
	 * @return JSONObject 结果集
	 */
	JSONObject executePut(String path,String contentType,Map<String, Object> params);
	 

	/**
	 * 执行delete 请求
	 * @param path 路径
	 * @param params 参数信息
	 * @return JSONObject 结果集
	 */
	JSONObject executeDelete(String path, Map<String, Object> params);
	
	/**
	 * <b>Description:这个方法用于业务线自定义处理请求接口</b>  <br>
	 * @author: chenjinghe
	 * <br><b>Date:</b> 2021/10/25 14:25
	 * <br><b>Version:</b> 1.0
	 * @param path 路径
	 * @param method 请求方式
	 * @param params 请求参数
	 * @param headers 请求头
	 * @param handler 结果处理器
	 * @return : T 泛型
	 */
	<T> T execute(String path,String method,Object params,Map<String,String>headers,ResultHandler<T> handler);
	
 
	
	

}
