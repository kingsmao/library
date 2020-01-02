package com.kingmao.library.config;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author qinxuan
 * @date 2020/1/1
 */
@Component
public class SystemConfig {

  //@PostConstruct
    public void test() throws InterruptedException {

      new Thread(() ->{
          while (true) {
                    System.out.println("系统线程的名字为：" + Thread.currentThread().getName());
              try {
                  Thread.sleep(2000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }

          }

      }).start();
    }
}
