package com.kingmao.library.thread;

import com.kingmao.library.entity.ThreadEntity;

import java.util.Random;

/**
 * @author qinxuan
 * @date 2020/1/2
 */
public class CreateEntityThread {
    public static void main(String[] args) {
        for (int x = 0; x < 20; x++) {
            int finalX = x;
            int finalX1 = x;
            new Thread(() ->{
                t1(finalX, finalX1);
            }).start();
        }
    }

    public static void t1(int id, int ip){
        ThreadEntity entity = new ThreadEntity();
        try {
            Thread.sleep(new Random().nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        entity.setId(id);
        entity.setIp(ip);
        System.out.println(entity.toString());
    }
}
