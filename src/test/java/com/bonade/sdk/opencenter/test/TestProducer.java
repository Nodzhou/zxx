package com.bonade.sdk.opencenter.test;

import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.config.KafkaConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lyh
 * Description:
 * ProjectName: open-center-sdk
 * Date: 2020/8/29 9:36
 */
public class TestProducer {
    private static String host = "http://localhost:4190";
    private static String clientId = "ac18b84ea65e437f9f860581ed89ba50";
    private static String secret = "6069351a14064504960bba3fc47a2107";
    private static SdkClient client = SdkClient.getSdkClient(); // 获取sdk实例

    static {
        client.init(host, clientId, secret);
    }

    public static void main(String[] args) {
        String clientId="00ptbnd1746501515159591886894915";

        String demoData="{\"type\":\"update_staff\",\"before\":null,\"after\":{\"certificateCard\":\"120101199003075631\",\"certificateType\":1,\"clientId\":null,\"companyName\":\"杨豌豆瑜伽馆\",\"companyOpenId\":\"00ptbnd5732893571602471754273160\",\"departmentId\":null,\"email\":\"\",\"employmentDate\":null,\"gender\":1,\"isCertificated\":0,\"isMainCompany\":0,\"jobId\":null,\"openId\":\"00ptbnd1050833451160264824206216\",\"phoneNumber\":\"15829360174\",\"staffFrom\":\"XHRM\",\"staffOpenId\":\"00ptbnd7442909316026482421871602\",\"status\":1,\"thirdCompanyId\":null,\"thirdStaffId\":null,\"thirdUserId\":null,\"userFrom\":\"XHRM\",\"username\":\"测试的员工\"}}";
        List<String> list=new ArrayList<String>();
        for (int i=0;i<5;i++){
            list.add(demoData);
        }
//        KafkaConfig.sendMsgBatch("plateformdataqueuereceivedead",clientId,list);
        KafkaConfig.sendMsgBatch("plateformdataqueue00ptbnd1746501515159591886894915",clientId,list);


//        KafkaConfig.sendMsgBatch(QueueConstant.PREFIX_NAME+clientId,clientId,list);
//        AsyncProducerPool.execute(QueueConstant.PREFIX_NAME+clientId,list);
//        AsyncProducerPool.execute("plateformdataqueuereceivedead",list);
    }

}
