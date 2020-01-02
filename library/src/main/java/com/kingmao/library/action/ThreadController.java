package com.kingmao.library.action;

import com.kingmao.library.service.MatchOrderService;
import com.kingmao.library.thread.Down;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qinxuan
 * @date 2020/1/2
 * 多线程导入数据库，例如插入大批量excel，可以开启多个线程同时插入
 * 注意service要通过传参的形式传给线程
 */
@RestController
public class ThreadController {
    @Autowired
    private MatchOrderService matchOrderService;

    @RequestMapping(value = "/thread")
    public String thread(){
        Thread thread = null;
        List<Integer> param = new ArrayList<>();
        test(param);
        Integer startIndex = 0;
        Integer endIndex = 0;
        Integer volume = 30;//每个线程处理的数量
        Double s = Math.ceil((double) param.size() / (double)volume);
        Integer loop =s.intValue();
        for (int x = 0; x < loop; x++) {
            startIndex = endIndex;
            if (volume > (param.size() - x * volume)) {
                endIndex = param.size();
            }else {
                endIndex = volume * (1 + x);
            }
            thread = new Thread(new Down(startIndex, endIndex, param,matchOrderService));
            thread.start();
        }
        return "ok";
    }

    public static void test(List<Integer> param){
        for (int x = 0; x < 100; x++) {
            param.add(x);
        }
        //System.out.println(param);

    }
}
