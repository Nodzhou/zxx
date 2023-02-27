/**
　 * @author ShawnTang
  *
*/
package com.bonade.sdk.opencenter.vo;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * <b>Description:</b><br>
 * 
 * @author ShawnTang
 * @version 1.0 <b>ProjectName:</b> bonade-platform-opencenter <br>
 *          <b>PackageName:</b> com.bonade.opencenter.pojo.vo <br>
 *          <b>ClassName:</b> TicketVo <br>
 *          <b>Date:</b> 2020年9月22日
 */
public class TicketVo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求的客户端(业务线)
	 */
	private String aClientId;

	/**
	 * openId
	 */
	private String openId;
	/**
	 * 请求的客户端(业务线)
	 */
	private String bUserId;
	/**
	 * 透传的数据
	 */
	private JSONObject data;

	/**
	 * @return the aClientId
	 */
	public String getaClientId() {
		return aClientId;
	}

	/**
	 * @param aClientId the aClientId to set
	 */
	public void setaClientId(String aClientId) {
		this.aClientId = aClientId;
	}

	/**
	 * @return the openId
	 */
	public String getOpenId() {
		return openId;
	}

	/**
	 * @param openId the openId to set
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	/**
	 * @return the bUserId
	 */
	public String getbUserId() {
		return bUserId;
	}

	/**
	 * @param bUserId the bUserId to set
	 */
	public void setbUserId(String bUserId) {
		this.bUserId = bUserId;
	}

	/**
	 * @return the data
	 */
	public JSONObject getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(JSONObject data) {
		this.data = data;
	}

	/**
	 * <b>Description:</b><br>
	 * 
	 * @return <b>Author:</b> ShawnTang <br>
	 *         <b>Date:</b> 2020年9月22日 下午4:29:15 <br>
	 *         <b>Version:</b> 1.0
	 */
	@Override
	public String toString() {
		return "TicketVo [aClientId=" + aClientId + ", openId=" + openId + ", bUserId=" + bUserId + ", data=" + data
				+ "]";
	}

}
