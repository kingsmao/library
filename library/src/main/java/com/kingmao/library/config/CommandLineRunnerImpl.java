package com.kingmao.library.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author qinxuan
 * @date 2020/1/1
 */
//@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        while (true) {
            System.out.printf("runner线程的名字为：%s=%n" , Thread.currentThread().getName());
            System.out.printf("runner线程的名字为：%s+%n" , Thread.currentThread().getName());
            Thread.sleep(2000);

        }
    }
}
