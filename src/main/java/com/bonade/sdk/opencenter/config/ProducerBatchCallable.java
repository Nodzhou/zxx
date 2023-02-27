package com.bonade.sdk.opencenter.config;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * @author: lyh
 * Description:
 * ProjectName: open-center-sdk
 * Date: 2020/9/3 10:26
 */
class ProducerBatchCallable implements Callable<List<String>> {
    String clientId;
    String topicName;
    List<String> list;

    public ProducerBatchCallable(String topicName, String clientId, List<String> list) {
        this.topicName = topicName;
        this.list = list;
        this.clientId = clientId;
    }

    @Override
    public List<String> call() throws Exception {
        List<String> result = KafkaConfig.sendMsgBatchAndReturn(topicName, clientId, list);
        return result;
    }

}
