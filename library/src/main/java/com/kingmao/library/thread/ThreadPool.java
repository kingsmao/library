package com.kingmao.library.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author qinxuan
 * @date 2020/1/2
 */
public class ThreadPool {
    public static void main(String[] args) {
        //ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue(10);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 10, 5, TimeUnit.SECONDS, blockingQueue);

        Runnable race2 = () -> System.out.println("Hello world !");
        poolExecutor.execute(race2);


    }
}
