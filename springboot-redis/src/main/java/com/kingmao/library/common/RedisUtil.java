package com.kingmao.library.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author qinxuan
 * @date 2020/4/20
 */
@Component
public class RedisUtil {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private Logger logger = LoggerFactory.getLogger(RedisUtil.class);
    /**
     * 是否存在key
     * @param key
     * @return
     */
    public Boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 设置指定 key 的值
     * @param key
     * @param value
     */
    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    /**
     * 获取指定 key 的值
     * @param key
     * @return
     */
    public String get(String key) {
        String result = null;
        try {
            result = redisTemplate.opsForValue().get(key);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return result;
    }
    // 其他方法省略
}
