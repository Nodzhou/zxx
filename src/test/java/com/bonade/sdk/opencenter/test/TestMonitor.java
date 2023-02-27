package com.bonade.sdk.opencenter.test;

import com.bonade.sdk.opencenter.business.IReceive;
import com.bonade.sdk.opencenter.client.SdkClient;

import java.util.Properties;

/**
 * @author: lyh
 * Description:
 * ProjectName: open-center-sdk
 * Date: 2020/9/3 14:22
 */
public class TestMonitor {

    //    private static String host = "http://192.168.14.214/";
    private static String host = "http://localhost:4190";
    private static String clientId = "00ptbnd1746501515159591886894915";
    private static String secret = "00ptbnd2807065381595918868949159";
    private static SdkClient client = SdkClient.getSdkClient(); // 获取sdk实例

    static {
        client.init(host, clientId, secret);
    }

    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.put("group.id", "sd1");
        cusByProperties(properties);
    }


    public static void cus() {
        IReceive ic = new ReceiveServiceImpl();
        client.setIReceive(ic);
        client.getMonitorService().executeMonitor(ic);
    }

    public static void cusByProperties(Properties properties) {
        IReceive ic = new ReceiveServiceImpl();
        client.setIReceive(ic);
        client.getMonitorService().executeMonitor(ic,properties);
    }


}
