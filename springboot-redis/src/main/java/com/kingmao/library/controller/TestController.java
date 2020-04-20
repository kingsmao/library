package com.kingmao.library.controller;

import com.kingmao.library.common.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qinxuan
 * @date 2020/4/20
 */
@RestController
public class TestController {
    @Autowired
    private RedisUtil redisUtil;
    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/key")
    public String getKey(String key){
        logger.info("接收到参数key={}",key);
        if(!redisUtil.hasKey(key)){
            redisUtil.set(key, "kingmao");
        }
        return redisUtil.get(key);
    }
}
