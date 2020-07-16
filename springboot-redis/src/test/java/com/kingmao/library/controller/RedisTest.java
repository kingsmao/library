package com.kingmao.library.controller;

import com.kingmao.library.common.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author qinxuan
 * @date 2020/4/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void t1(){
        redisUtil.set("士大夫立刻就","五分13二");
        redisUtil.set("个人465 二","3个人");
        redisUtil.set("二个人豆腐干地方","dfgdfg");
        redisUtil.set("风格和法闰土","儿童424多少");
        redisUtil.set("35 人","er3二");
    }
}
