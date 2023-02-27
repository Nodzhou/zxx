package com.bonade.sdk.opencenter.config;

import com.bonade.sdk.opencenter.business.InitNotify;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.utils.PropertiesUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.PartitionInfo;
import org.apache.kafka.common.TopicPartition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Future;

/**
 * @author: lyh
 * Description:
 * ProjectName: open-center-sdk
 * Date: 2020/8/28 17:49
 */
public class KafkaConfig {

    private static Log log = LogFactory.getLog(KafkaConfig.class);
    private static final String DEFAULT_GROUP = "group";
    private static final String RESET_TYPE = "earliest";
    private static final String COMMIT_TYPE = "false";

    /**
     * 生产者属性配置
     */
    static Properties producerProperties;

    public static Properties getProducerProperties() {
        return producerProperties;
    }

    public static Properties getCustomerProperties() {
        return customerProperties;
    }

    /**
     * 消费者属性配置
     */
    static Properties customerProperties;

    /**
     * ip
     */
    static String host;

    /**
     * 消费者
     */
    static KafkaConsumer<String, String> consumer;

    private static void getProperties() {
        host = InitNotify.getKafkaHostByServiceHost();
        if (host == null) {
            log.info("读取kafka配置路径错误");
        }
    }

    /**
     * 创建一个生产者
     *
     * @return 消费者
     */
    public static KafkaProducer createProducer() {
        getProperties();
        if (producerProperties == null) {
            producerProperties = new Properties();
            String customerHost = customerProperties.getProperty("bootstrap.servers");
            if (StringUtils.isNotBlank(customerHost)) {
                producerProperties.put("bootstrap.servers", customerHost);
            } else {
                producerProperties.put("bootstrap.servers", host);
            }
            producerProperties.put("acks", "all");
            producerProperties.put("retries", 1);
            producerProperties.put("batch.size", 16384);
            producerProperties.put("linger.ms", 0);
            producerProperties.put("buffer.memory", 33554432);
            producerProperties.put("request.timeout.ms", 3000);
            producerProperties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
            producerProperties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        } else if (StringUtils.isNotBlank(producerProperties.getProperty("bootstrap.servers"))){
            producerProperties.put("acks", "all");
            producerProperties.put("retries", 1);
            producerProperties.put("batch.size", 16384);
            producerProperties.put("linger.ms", 0);
            producerProperties.put("buffer.memory", 33554432);
            producerProperties.put("request.timeout.ms", 3000);
            producerProperties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
            producerProperties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        }

        return new KafkaProducer<>(producerProperties);
    }


    /**
     * 通过配置创建消费者
     *
     * @param properties 配置
     * @return 消费者
     */
    public static KafkaConsumer createCustomerByProperties(Properties properties) {
        getProperties();
        if (customerProperties == null) {
            customerProperties = new Properties();
            customerProperties.put("bootstrap.servers", host);
            customerProperties.put("group.id", DEFAULT_GROUP);
            customerProperties.put("enable.auto.commit", COMMIT_TYPE);
            customerProperties.put("auto.commit.interval.ms", "1000");
            customerProperties.put("auto.offset.reset", RESET_TYPE);
            customerProperties.put("session.timeout.ms", "30000");
            customerProperties.put("max.poll.records", "50");
            customerProperties.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, 8000);
            customerProperties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
            customerProperties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
            customerProperties.putAll(properties);
        }
        if (producerProperties == null) {
            producerProperties = new Properties();
            producerProperties.put("bootstrap.servers", customerProperties.getProperty("bootstrap.servers"));
        }
        return new KafkaConsumer<>(customerProperties);
    }

    /**
     * 创建一个消费者
     *
     * @return 消费者
     */
    public static KafkaConsumer createCustomer() {
        getProperties();
        if (customerProperties == null) {
            customerProperties = new Properties();
            customerProperties.put("bootstrap.servers", host);
            customerProperties.put("group.id", DEFAULT_GROUP);
            customerProperties.put("enable.auto.commit", COMMIT_TYPE);
            customerProperties.put("auto.commit.interval.ms", "1000");
            customerProperties.put("auto.offset.reset", RESET_TYPE);
            customerProperties.put("session.timeout.ms", "30000");
            customerProperties.put("max.poll.records", "50");
            customerProperties.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, 8000);
            customerProperties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
            customerProperties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        }
        if (producerProperties == null) {
            producerProperties = new Properties();
            producerProperties.put("bootstrap.servers", customerProperties.getProperty("bootstrap.servers"));
        }
        return new KafkaConsumer<>(customerProperties);
    }


    /**
     * 发送消息
     *
     * @param topicName 主题名称
     * @param msg       消息体
     */
    public static void sendMsg(String topicName, String msg) {
        KafkaProducer producer = createProducer();
        producer = createProducer();
        Future<RecordMetadata> result = producer.send(new ProducerRecord<String, String>(topicName, msg));
        producer.close();
    }

    /**
     * @param topicName 主体名称
     * @param msg       消息体
     * @return string
     */
    public static String sendMsgAndReturn(String topicName, String msg) {
        KafkaProducer producer = createProducer();
        Future<RecordMetadata> result = producer.send(new ProducerRecord<String, String>(topicName, msg));
        String resultStr = "";
        try {
            resultStr = String.valueOf(result.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        producer.close();
        return resultStr;
    }

    /**
     * 批量发送消息
     *
     * @param topicName 主题名称
     * @param clientId  客户端ID
     * @param list      集合
     * @return string
     */
    public static List<String> sendMsgBatchAndReturn(String topicName, String clientId, List<String> list) {
        List<String> resultList = new ArrayList<>();
        KafkaProducer producer = createProducer();
        list.forEach(msg -> {
            Future<RecordMetadata> result = producer.send(new ProducerRecord<String, String>(topicName, clientId, msg));
            try {
                resultList.add(String.valueOf(result.get()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        producer.close();
        return resultList;
    }

    static KafkaProducer producerNoClose;

    /**
     * 发送消息
     *
     * @param topicName 主题名称
     * @param key       key
     * @param msg       集合
     *
     * @return 发送结果
     */
    public static Future<RecordMetadata> sendMsgNoClose(String topicName, String key, String msg) {
        if (producerNoClose == null) {
            producerNoClose = createProducer();
        }
        try {
            Future<RecordMetadata> result = producerNoClose.send(new ProducerRecord<String, String>(topicName, key, msg));
            return result;
        } catch (Exception e) {
            producerNoClose.close();
        }
        return null;
    }

    /**
     * 批量发送消息
     *
     * @param topicName 主题名称
     * @param key       key
     * @param list      集合
     */
    public static void sendMsgBatch(String topicName, String key, List<String> list) {
        KafkaProducer producer = createProducer();
        list.forEach(msg -> {
            Future<RecordMetadata> result = producer.send(new ProducerRecord<String, String>(topicName, key, msg));
        });
        producer.close();
    }

    /**
     * 获取某个Topic的所有分区以及分区最新的Offset
     *
     * @param topicName 主题名称
     */
    public static void getPartitionsForTopic(String topicName) {
        final Consumer<Long, String> consumer = createCustomer();
        Collection<PartitionInfo> partitionInfos = consumer.partitionsFor(topicName);
        List<TopicPartition> topicPartitions = new ArrayList<TopicPartition>();
        partitionInfos.forEach(str -> {
            topicPartitions.add(new TopicPartition(topicName, str.partition()));
            consumer.assign(topicPartitions);
            consumer.seekToEnd(topicPartitions);
            System.out.println("Partition " + str.partition() + " 's latest offset is '" + consumer.position(new TopicPartition(topicName, str.partition())));
        });
    }

}
