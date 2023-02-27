package com.bonade.sdk.opencenter.client.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.business.IReceive;
import com.bonade.sdk.opencenter.business.InitNotify;
import com.bonade.sdk.opencenter.business.SubjectList;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.client.service.IMonitorService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.common.QueueConstant;
import com.bonade.sdk.opencenter.pojo.PlatformSynLogInfo;
import com.bonade.sdk.opencenter.utils.HttpClientUtils;

import java.util.Properties;

/**
 * @author: lyh
 * Description:
 * ProjectName: open-center-sdk
 * Date: 2020/9/3 14:20
 */
public class MonitorClient implements IMonitorService { 

    @Override
    public void executeMonitor(IReceive ic) {
        SubjectList list = InitNotify.getList();
        list.addObserver(ic);
        String clientId = SdkClient.getClientId();
        Properties properties = null;
        InitNotify.cusMsg(clientId, QueueConstant.PREFIX_NAME + clientId, properties);
    }

    @Override
    public void executeMonitor(IReceive ic, Properties properties) {
        SubjectList list = InitNotify.getList();
        list.addObserver(ic);
        String clientId = SdkClient.getClientId();
        InitNotify.cusMsg(clientId, QueueConstant.PREFIX_NAME + clientId, properties);
    }

    @Override
    public void insertLog(PlatformSynLogInfo platformSynLogInfo) {
        JSONObject resultObject = getClient().executePost(ApiPathConstant.SynQueueLog.INSERT_LOG, HttpClientUtils.CONTENT_TYPE_JSON, (JSONObject) JSONObject.toJSON(platformSynLogInfo));
    }
}
