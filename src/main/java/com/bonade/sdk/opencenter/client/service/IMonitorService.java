package com.bonade.sdk.opencenter.client.service;

import com.bonade.sdk.opencenter.business.IReceive;
import com.bonade.sdk.opencenter.pojo.PlatformSynLogInfo;

import java.util.Properties;

/**
 * @author: lyh
 * Description:
 * ProjectName: open-center-sdk
 * Date: 2020/9/3 14:18
 */
public interface IMonitorService extends SdkService {

    /**
     * @param ic 接口
     */
    void executeMonitor(IReceive ic);

    /**
     * 通过传入配置消费
     *
     * @param ic         接口
     * @param properties 配置
     */
    void executeMonitor(IReceive ic, Properties properties);

    /**
     * @param platformSynLogInfo 实体类
     */
    void insertLog(PlatformSynLogInfo platformSynLogInfo);

}
