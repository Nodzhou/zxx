package com.bonade.sdk.opencenter.business;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.client.service.impl.MonitorClient;
import com.bonade.sdk.opencenter.common.QueueConstant;
import com.bonade.sdk.opencenter.config.AsyncProducerPool;
import com.bonade.sdk.opencenter.config.KafkaConfig;
import com.bonade.sdk.opencenter.pojo.PlatformSynLogInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;

import java.time.Duration;
import java.util.*;

/**
 * @author: lyh Description: ProjectName: open-center-sdk Date: 2020/8/29 16:31
 */
public class InitNotify {

    private static Log log = LogFactory.getLog(InitNotify.class);

    public static SubjectList getList() {
        return list;
    }

    static SubjectList list = new SubjectList();
    static MonitorClient monitorClient = new MonitorClient();

    public static String getKafkaHostByServiceHost() {
        String hostValue = SdkClient.getHost();
        if (QueueConstant.SERVICE_HOST_DEV.contains(hostValue)) {
            return QueueConstant.KAFKA_HOST_DEV;
        } else if (QueueConstant.SERVICE_HOST_DEV_UNION.contains(hostValue)) {
            return QueueConstant.KAFKA_HOST_DEV_UNION;
        } else if (QueueConstant.SERVICE_HOST_TEST.contains(hostValue)) {
            return QueueConstant.KAFKA_HOST_TEST;
        } else if (QueueConstant.SERVICE_HOST_PRO.contains(hostValue)) {
            return QueueConstant.KAFKA_HOST_PRO;
        } else if (QueueConstant.SERVICE_HOST_TY.contains(hostValue)) {
            return QueueConstant.KAFKA_HOST_TY;
        }else if (QueueConstant.SERVICE_HOST_DEMO.contains(hostValue)) {
            return QueueConstant.KAFKA_HOST_DEMO;
        }
        return null;
    }

    /**
     * ????????????????????????
     *
     * @param clientId   ?????????
     * @param topicName  ????????????
     * @param properties ??????
     */
    public static void cusMsg(String clientId, String topicName, Properties properties) {
        Consumer<Long, String> consumer = null;
        if (properties == null) {
            consumer = KafkaConfig.createCustomer();
        } else {
            consumer = KafkaConfig.createCustomerByProperties(properties);
        }
        continueLast(clientId, topicName, consumer);
    }

    /**
     * ??????????????????????????????
     *
     * @param clientId  ?????????
     * @param topicName ????????????
     * @param consumer  ?????????
     */
    public static void continueLast(String clientId, String topicName, Consumer<Long, String> consumer) {
        long lastConsumerOffset = 0;

        consumer.subscribe(Collections.singletonList(topicName));
        try {
            while (true) {
                JSONArray receiveList = new JSONArray();
                final ConsumerRecords<Long, String> consumerRecords = consumer.poll(Duration.ofMillis(500));
                if (consumerRecords != null) {
                    for (ConsumerRecord<Long, String> record : consumerRecords) {
                        try {
                            // ????????????????????????
                            if (SdkClient.getSdkClient().getIReceive() != null) {
                                list.notifyReceiver(record.value());
                                // ????????????
                                receiveList.add(transLog(clientId, topicName, record.value()));
                            } else {
                                handleUnReceive(clientId, record.value());
                            }
                        } catch (Exception e) {
                            handleUnReceive(clientId, record.value());
                        }
                        lastConsumerOffset = record.offset();
                    }
                }
                try {
                    // ???????????? ????????????
                    consumer.commitAsync();
                } catch (Exception e) {
                    e.printStackTrace();
                    List<String> deadCommitList = new ArrayList<>();
                    if (consumerRecords != null) {
                        consumerRecords.forEach(record -> {
                            deadCommitList.add(String.valueOf(record));
                        });
                    }
                    // ?????????????????????????????????????????????
                    AsyncProducerPool.execute(QueueConstant.PREFIX_NAME + QueueConstant.QUEUE_COMMIT_DEAD_DATA,
                            clientId, deadCommitList);
                }
                try {
                    if (consumerRecords.count() > 0) {
                        sendConsumerOffset(clientId, topicName, lastConsumerOffset + 1);
                        KafkaConfig.sendMsgNoClose(QueueConstant.PREFIX_NAME + QueueConstant.QUEUE_LOG, clientId,
                                receiveList.toString());
                    }
                } catch (Exception e) {
                }
            }
        } finally {
            try {
                // ????????????
                consumer.commitSync();
            } finally {
                consumer.close();
                log.info("kafka???????????????????????????");
            }
        }
    }

    /**
     * ????????????offset
     *
     * @param clientId
     * @param topic
     * @param offset
     */
    private static void sendConsumerOffset(String clientId, String topic, long offset) {
        JSONObject json = new JSONObject();
        json.put("topic", topic);
        json.put("offset", offset);
        json.put("lastTime", System.currentTimeMillis());
        KafkaConfig.sendMsgNoClose(QueueConstant.PREFIX_NAME + QueueConstant.QUEUE_OFFSET, clientId,
                json.toJSONString());
    }

    /**
     * ??????openCenter??????????????????
     *
     * @param clientId  ?????????ID
     * @param topicName ????????????
     * @param msg       ?????????
     */
    private static JSONObject transLog(String clientId, String topicName, String msg) {
        PlatformSynLogInfo logInfo = new PlatformSynLogInfo();
        logInfo.setLogType(1);
        logInfo.setYwx(clientId);
        logInfo.setQueueName(topicName);
        logInfo.setMsg(msg);
        logInfo.setLogStatus(1);
        logInfo.setCreateTime(new Date());
        String result = JSON.toJSONString(logInfo);
        JSONObject json = JSON.parseObject(result);
        return json;
    }

    /**
     * @param clientId ?????????ID
     * @param msg      ?????????
     */
    public static void handleUnReceive(String clientId, String msg) {
        List<String> deadReceiveList = new ArrayList<>();
        deadReceiveList.add(msg);
        AsyncProducerPool.execute(QueueConstant.PREFIX_NAME + QueueConstant.QUEUE_RECEIVE_DEAD_DATA, clientId,
                deadReceiveList);
    }

}
