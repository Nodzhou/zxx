/**
　 * @author ShawnTang
  *
*/
package com.bonade.sdk.opencenter.client.service;

import com.bonade.sdk.opencenter.dto.ticket.TicketDto;
import com.bonade.sdk.opencenter.vo.TicketVo;

/**
 * <b>Description:</b><br>
 * 
 * @author ShawnTang
 * @version 1.0 <b>ProjectName:</b> open-center-sdk <br>
 *          <b>PackageName:</b> com.bonade.sdk.opencenter.client.service <br>
 *          <b>ClassName:</b> ITicketService <br>
 *          <b>Date:</b> 2020年9月22日
 */
public interface ITicketService extends SdkService {

	/**
	 * 
	 * <b>Description:</b> 通过openId生成跳转的ticket<br>
	 * 
	 * @param ticketDto ticketDto
	 * @return ticket <b>Author:</b> ShawnTang <br>
	 *         <b>Date:</b> 2020年9月22日 <br>
	 *         <b>Version:</b> 1.0
	 */
	String createTicket(TicketDto ticketDto);

	/**
	 * 
	 * <b>Description:</b> 通过ticket解析出B端的用户信息<br>
	 * 
	 * @param ticket A端生成的ticket
	 * @return TicketVo ticket跳转的B端用户信息 <b>Author:</b> ShawnTang <br>
	 *         <b>Date:</b> 2020年9月22日 <br>
	 *         <b>Version:</b> 1.0
	 */
	TicketVo getUserIdByTicket(String ticket);
}
