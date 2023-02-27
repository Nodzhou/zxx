package com.bonade.sdk.opencenter.test;

import com.bonade.sdk.opencenter.business.IReceive;

/**
 * @author: lyh
 * Description:
 * ProjectName: open-center-sdk
 * Date: 2020/8/29 15:31
 */
public class ReceiveServiceImpl implements IReceive {
    @Override
    public void receive(String msg) {
        System.out.println("业务线接口接收数据 "+msg);
    }
}
