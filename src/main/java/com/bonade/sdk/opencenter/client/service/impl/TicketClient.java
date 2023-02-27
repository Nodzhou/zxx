/**
　 * @author ShawnTang
  *
*/
package com.bonade.sdk.opencenter.client.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.ITicketService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.dto.ticket.TicketDto;
import com.bonade.sdk.opencenter.exception.ClientException;
import com.bonade.sdk.opencenter.utils.HttpClientUtils;
import com.bonade.sdk.opencenter.vo.TicketVo;

/**
 * <b>Description:</b><br>
 * 
 * @author ShawnTang
 * @version 1.0 <b>ProjectName:</b> open-center-sdk <br>
 *          <b>PackageName:</b> com.bonade.sdk.opencenter.client <br>
 *          <b>ClassName:</b> TicketClient <br>
 *          <b>Date:</b> 2020年9月22日
 */
public class TicketClient implements ITicketService { 

	/**
	 * 
	 * <b>Description:</b> 通过openId生成跳转的ticket<br>
	 * 
	 * @param ticketDto ticketDto
	 * @return ticket <b>Author:</b> ShawnTang <br>
	 *         <b>Date:</b> 2020年9月22日 <br>
	 *         <b>Version:</b> 1.0
	 */
	@Override
	public String createTicket(TicketDto ticketDto) {
		if (ticketDto == null) {
			throw new ClientException("ticketDto为空，请检查参数是否正确");
		}
		JSONObject jsonObject = new JSONObject();
		String jsonStr = JSONObject.toJSONString(ticketDto);
		jsonObject = JSONObject.parseObject(jsonStr);
		JSONObject ticketJson = getClient().executePost(ApiPathConstant.TicketUrl.CREATE_TICKET,
				HttpClientUtils.CONTENT_TYPE_JSON, jsonObject);
		if (ticketJson == null) {
			throw new ClientException("生成ticket失败，请检查参数是否正确");
		}
		String ticket = ticketJson.getString("ticket");
		if (StringUtils.isBlank(ticket)) {
			throw new ClientException("生成ticket失败，请检查参数是否正确");
		}
		return ticket;
	}

	/**
	 * 
	 * <b>Description:</b> 通过ticket解析出B端的用户信息<br>
	 * 
	 * @param ticket A端生成的ticket
	 * @return TicketVo ticket跳转的B端用户信息 <b>Author:</b> ShawnTang <br>
	 *         <b>Date:</b> 2020年9月22日 <br>
	 *         <b>Version:</b> 1.0
	 */
	@Override
	public TicketVo getUserIdByTicket(String ticket) {
		if (StringUtils.isBlank(ticket)) {
			throw new ClientException("解析的ticket为空，请检查参数是否正确");
		}
		Map<String, Object> paramsMap = new HashMap<>();
		paramsMap.put("ticket", ticket);
		JSONObject jsonObject = getClient().executePost(ApiPathConstant.TicketUrl.GET_USERID_BY_TICKET,
				HttpClientUtils.CONTENT_TYPE_JSON, paramsMap);
		if (jsonObject == null) {
			throw new ClientException("查询失败，请检查参数是否正确");
		}
		TicketVo ticketVo = new TicketVo();
		ticketVo = jsonObject.toJavaObject(TicketVo.class);
		return ticketVo;
	}

}
