/**
　 * @author ShawnTang
  *
*/
package com.bonade.sdk.opencenter.dto.ticket;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * <b>Description:</b><br>
 * 
 * @author ShawnTang
 * @version 1.0 <b>ProjectName:</b> bonade-platform-opencenter <br>
 *          <b>PackageName:</b> com.bonade.opencenter.pojo.dto <br>
 *          <b>ClassName:</b> TicketDto <br>
 *          <b>Date:</b> 2020年9月21日
 */
public class TicketDto implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 请求的客户端用户id
	 */
	private String openId;
	/**
	 * 被请求的客户端(业务线)
	 */
	private String requestedClientId;
	/**
	 * 透传的数据
	 */
	private JSONObject data;

	/**
	 * ticket
	 */
	private String ticket;

	/**
	 * @return the requestedClientId
	 */
	public String getRequestedClientId() {
		return requestedClientId;
	}

	/**
	 * @param requestedClientId the requestedClientId to set
	 */
	public void setRequestedClientId(String requestedClientId) {
		this.requestedClientId = requestedClientId;
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
	 * @return the ticket
	 */
	public String getTicket() {
		return ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	/**
	 * <b>Description:</b><br>
	 * 
	 * @return <b>Author:</b> ShawnTang <br>
	 *         <b>Date:</b> 2020年9月22日 下午4:37:28 <br>
	 *         <b>Version:</b> 1.0
	 */
	@Override
	public String toString() {
		return "TicketDto [openId=" + openId + ", requestedClientId=" + requestedClientId + ", data=" + data
				+ ", ticket=" + ticket + "]";
	}

}
