package com.bonade.sdk.opencenter.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lyh
 * Description:
 * ProjectName: open-center-sdk
 * Date: 2020/8/31 16:19
 */
public class QueueConstant {

    /**
     * 消息主题名
     */
    public static final String QUEUE_RECEIVE_DEAD_DATA = "receivedead";
    public static final String QUEUE_COMMIT_DEAD_DATA = "commitdead";
    public static final String PREFIX_NAME = "plateformdataqueue";
    public static final String QUEUE_OFFSET = "offset";
    public static final String QUEUE_LOG = "log";

    /**
     * 开发环境kafka server host
     */
    public static final String KAFKA_HOST_DEV = "INTERNAL://kafkadev.bndxqc.com:9092";

    /**
     * 联调开发环境kafka server host
     */
    public static final String KAFKA_HOST_DEV_UNION = "INTERNAL://ztkafkadev-v2.bndxqc.com:9092";

    /**
     * 测试环境kafka server host
     */
    public static final String KAFKA_HOST_TEST = "INTERNAL://ztkafkatest.bndxqc.com:9092";

    /**
     * 体验环境kafka server host
     */
    public static final String KAFKA_HOST_TY = "INTERNAL://ztkafkabeta.bndxqc.com:9092";

    /**
     * 演示环境kafka server host
     */
    public static final String KAFKA_HOST_DEMO = "INTERNAL://ztkafkademo.bndxqc.com:9092";

    /**
     * 生产环境kafka server host
     */
    public static final String KAFKA_HOST_PRO = "INTERNAL://ztkafka.bndxqc.com:9092,INTERNAL://ztkafka02.bndxqc.com:9092,INTERNAL://ztkafka03.bndxqc.com:9092";

    /**
     * 开发环境host对应kafka server host
     */
    public static List<String> SERVICE_HOST_DEV = new ArrayList() {
        {
            this.add("https://ztdev.bndxqc.com/");
            this.add("https://ztdev.bndxqc.com");
            this.add("http://ztdev.bndxqc.com/");
            this.add("http://ztdev.bndxqc.com");
            this.add("http://localhost:4190");
        }
    };

    /**
     * 联调开发环境host对应kafka server host
     */
    public static List<String> SERVICE_HOST_DEV_UNION = new ArrayList() {
        {
            this.add("https://ztdev-v2.bndxqc.com/");
            this.add("https://ztdev-v2.bndxqc.com");
            this.add("http://ztdev-v2.bndxqc.com/");
            this.add("http://ztdev-v2.bndxqc.com");
        }
    };

    /**
     * 测试环境host对应kafka server host
     */
    public static List<String> SERVICE_HOST_TEST = new ArrayList() {
        {
            this.add("https://zttest.bndxqc.com/");
            this.add("https://zttest.bndxqc.com");
            this.add("http://zttest.bndxqc.com/");
            this.add("http://zttest.bndxqc.com");
        }
    };

    /**
     * 体验环境host对应kafka server host
     */
    public static List<String> SERVICE_HOST_TY = new ArrayList() {
        {
            this.add("https://ztty.bndxqc.com/");
            this.add("https://ztty.bndxqc.com");
            this.add("http://ztty.bndxqc.com/");
            this.add("http://ztty.bndxqc.com");
        }
    };
    /**
     * 演示环境host对应kafka server host
     */
    public static List<String> SERVICE_HOST_DEMO = new ArrayList() {
        {
            this.add("https://ztdemo.bndxqc.com/");
            this.add("https://ztdemo.bndxqc.com");
        }
    };

    /**
     * 生产环境host对应kafka server host
     */
    public static List<String> SERVICE_HOST_PRO = new ArrayList() {
        {
            this.add("https://zt.bndxqc.com/");
            this.add("https://zt.bndxqc.com");
            this.add("http://zt.bndxqc.com/");
            this.add("http://zt.bndxqc.com");
        }
    };
}
