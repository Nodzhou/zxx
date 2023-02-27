package com.bonade.sdk.opencenter.config;

import com.google.common.util.concurrent.*;
import org.omg.CORBA.Current;

import java.util.List;
import java.util.concurrent.Executors;

/**
 * @author: lyh
 * Description:
 * ProjectName: open-center-sdk
 * Date: 2020/8/31 17:14
 */
public class AsyncProducerPool {

    static ListeningExecutorService executorService = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());

    /**
     * 异步发送kafka数据
     *
     * @param topicName 主题名
     * @param clientId  客户端ID
     * @param list  数据集合
     */
    public static void execute(String topicName, String clientId, List<String> list) {
        ProducerBatchCallable callable = new ProducerBatchCallable(topicName, clientId, list);
        final ListenableFuture<List<String>> listenableFuture = executorService.submit(callable);
        Futures.addCallback(listenableFuture, new FutureCallback<List<String>>() {
            @Override
            public void onSuccess(List<String> result) {
                try {
                    listenableFuture.get();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Throwable t) {
                t.printStackTrace();
            }
        }, executorService);
    }
}


