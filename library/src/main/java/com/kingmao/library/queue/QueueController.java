package com.kingmao.library.queue;

import com.kingmao.library.entity.MatchOrder;
import com.kingmao.library.service.MatchOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author qinxuan
 * @date 2020/1/2
 * 开启四个线程向队列中插订单
 * 开启一个线程消费订单并插入数据库
 * 相当于一个本地MQ
 */
@RestController
public class QueueController {
    @Autowired
    private  MatchOrderService matchOrderService;

    @RequestMapping(value = "/insert")
    public String t1(){
        LinkedBlockingQueue<MatchOrder> linkedBlockingQueue = new LinkedBlockingQueue<>();
        for (int x = 0; x < 4; x++) {
            new Thread(new PutOrder(linkedBlockingQueue)).start();
        }

        new Thread(new ConsumerOrder(linkedBlockingQueue,matchOrderService)).start();

        return "ok";
    }

}
