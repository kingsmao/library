package com.kingmao.library.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author qinxuan
 * @date 2020/1/1
 */
@Component
public class SystemConfig {
    private static final Logger logger = LoggerFactory.getLogger(SystemConfig.class);
  @PostConstruct
    public void test() throws InterruptedException {

      new Thread(() ->{
          while (true) {
              logger.info("系统线程的名字为：" + Thread.currentThread().getName() + "=======================================");
              logger.info("INFO系统当前时间：" + new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date()));
              logger.debug("DEBUG系统当前时间：" + new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date()));
              logger.warn("WARN系统当前时间：" + new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date()));
              logger.error("ERROR系统当前时间：" + new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date()));
              try {
                  Thread.sleep(1000 * 60);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }

          }

      }).start();
    }
}
