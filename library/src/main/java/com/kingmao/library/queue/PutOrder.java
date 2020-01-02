package com.kingmao.library.queue;

import com.kingmao.library.entity.MatchOrder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author qinxuan
 * @date 2020/1/2
 */
public class PutOrder implements Runnable {
    private  LinkedBlockingQueue<MatchOrder> linkedBlockingQueue;
    private static volatile AtomicLong orderId = new AtomicLong(0);

    public PutOrder(LinkedBlockingQueue<MatchOrder> linkedBlockingQueue) {
        this.linkedBlockingQueue = linkedBlockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (this){
                    MatchOrder matchOrder = new MatchOrder();
                    matchOrder.setVolume(new BigDecimal(t2(this.orderId)));
                    //matchOrder.setDesc(t2(this.orderId).toString() + " ddd");
                    matchOrder.setCtime(new Date());
                    linkedBlockingQueue.put(matchOrder);
                    System.out.println("队列中插入了订单，订单大小：" + linkedBlockingQueue.size());
                    Thread.sleep(1000*10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static Long t2(AtomicLong orderId){
        return orderId.addAndGet(1);
    }
}
