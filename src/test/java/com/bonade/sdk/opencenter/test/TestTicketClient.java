/**
　 * @author ShawnTang
  *
*/
package com.bonade.sdk.opencenter.test;

import com.alibaba.fastjson.JSON;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.dto.ticket.TicketDto;
import com.bonade.sdk.opencenter.vo.TicketVo;

/**
 * <b>Description:</b><br>
 * 
 * @author ShawnTang
 * @version 1.0 <b>ProjectName:</b> open-center-sdk <br>
 *          <b>PackageName:</b> com.bonade.sdk.opencenter.test <br>
 *          <b>ClassName:</b> TestTicketClient <br>
 *          <b>Date:</b> 2020年9月22日 下午8:27:57
 */
public class TestTicketClient {
	private static SdkClient client = SdkClient.getSdkClient();
	private static String host = "http://zttest.bndxqc.com";
	private static String clientId = "a686023f70a711e9b9fd7cd30a5a3208";
	private static String secret = "563a81b870b211e9b9fd7cd30a5a3208";

	public TestTicketClient() {
	}

	static {
		client.init(host, clientId, secret);
	}

	public static void main(String[] args) {
		createTicket();
//		getUserIdByTicket();
	}

	public static void createTicket() {
		TicketDto ticketDto = new TicketDto();
		ticketDto.setOpenId("d8fe0d6a0bfa43e6a8f96d50b7c09f3e");
		ticketDto.setRequestedClientId("a3e1d83103df4e218ef2337bd76543bd");
		String ticket = client.getTicketService().createTicket(ticketDto);
		System.out.println(ticket);
	}

	public static void getUserIdByTicket() {
		String ticket = "fd13ef3588cb4702a00950960820dd2a";
		TicketVo ticketVo = client.getTicketService().getUserIdByTicket(ticket);
		System.out.println(JSON.toJSON(ticketVo));
	}
}
