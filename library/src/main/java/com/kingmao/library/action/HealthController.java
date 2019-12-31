package com.kingmao.library.action;

import com.kingmao.library.entity.MatchOrder;
import com.kingmao.library.service.MatchOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author qinxuan
 * @date 2019/12/31
 */
@RestController
public class HealthController {
    @Autowired
    private MatchOrderService matchOrderService;

    @RequestMapping(value = "/createOrder")
    public void createOrder(){
        MatchOrder matchOrder = new MatchOrder();
        matchOrder.setOrderType((byte)1);
        matchOrder.setPrice(generateRandomBigDecimalNum());
        matchOrder.setVolume(generateRandomBigDecimalNum());
        matchOrderService.insert(matchOrder);
    }

    public static BigDecimal generateRandomBigDecimalNum(){
        float minF = new BigDecimal(1).floatValue();
        float maxF = new BigDecimal(100).floatValue();
        //生成随机数
        BigDecimal db = new BigDecimal(Math.random() * (maxF - minF) + minF);
        //返回保留两位小数的随机数。不进行四舍五入
        return db.setScale(2,BigDecimal.ROUND_DOWN);
    }
}
