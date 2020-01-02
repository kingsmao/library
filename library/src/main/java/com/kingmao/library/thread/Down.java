package com.kingmao.library.thread;

import com.kingmao.library.entity.MatchOrder;
import com.kingmao.library.entity.MatchOrderExample;
import com.kingmao.library.service.MatchOrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author qinxuan
 * @date 2020/1/1
 */
public class Down implements Runnable {

    private static MatchOrderService matchOrderService;

    private  Integer start;
    private  Integer end;
    private static List<Integer> list;
    private  static volatile List<Integer> ret;

    public Down(Integer start,Integer end,List<Integer> list, MatchOrderService matchOrderService) {
        this.start = start;
        this.end = end;
        this.list = list;
        this.matchOrderService = matchOrderService;
    }

    @Override
    public void run() {
        List<Integer> param = list.subList(start,end);
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "线程开始和结束：" + start + "," + end +"," + param.toString());
        for (Integer s: param) {
            System.out.println(s);
            MatchOrder matchOrder = new MatchOrder();
            matchOrder.setPrice(new BigDecimal(s));
            matchOrder.setVolume(new BigDecimal(s));
            matchOrder.setCtime(new Date());
            matchOrderService.insertSelective(matchOrder);

        }

    }
}
