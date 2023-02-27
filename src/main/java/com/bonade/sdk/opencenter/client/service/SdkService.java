package com.bonade.sdk.opencenter.client.service;

import com.bonade.sdk.opencenter.client.Client;
import com.bonade.sdk.opencenter.client.SdkClient;

public interface SdkService {

	default Client getClient() {
		return SdkClient.getClient();
	} 
}
