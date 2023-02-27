package com.bonade.sdk.opencenter.business;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Vector;

/**
 * @author: lyh
 * Description:
 * ProjectName: open-center-sdk
 * Date: 2020/8/29 16:26
 */
public class SubjectList {

    private static Log log = LogFactory.getLog(SubjectList.class);

    /**
     * 接收者数组
     */
    private Vector<IReceive> oVector = new Vector<>();

    /**
     * 增加一个接收者
     *
     * @param receiver 接收者
     */
    public void addObserver(IReceive receiver) {
        oVector.add(receiver);
    }

    /**
     * 移除一个接收者
     *
     * @param receiver 接收者
     */
    public void deleteObserver(IReceive receiver) {
        oVector.remove(receiver);
    }

    /**
     * 通知订阅的接收者
     *
     * @param msg 消息
     */
    public void notifyReceiver(String msg) {
        for (IReceive observer : oVector) {
            observer.receive(msg);
        }
    }

}
