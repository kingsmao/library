package com.kingmao.library.queue;

import com.kingmao.library.entity.MatchOrder;
import com.kingmao.library.service.MatchOrderService;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author qinxuan
 * @date 2020/1/2
 */
public class ConsumerOrder implements Runnable {
    private  LinkedBlockingQueue<MatchOrder> linkedBlockingQueue;
    private  MatchOrderService matchOrderService;

    public ConsumerOrder(LinkedBlockingQueue<MatchOrder> linkedBlockingQueue, MatchOrderService matchOrderService) {
        this.linkedBlockingQueue = linkedBlockingQueue;
        this.matchOrderService = matchOrderService;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                MatchOrder matchOrder = linkedBlockingQueue.take();
                if (matchOrderService.insertSelective(matchOrder) > 0) {
                    System.out.println("队列消费了一个，剩余大小：" + linkedBlockingQueue.size());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
