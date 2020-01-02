package com.kingmao.library.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author qinxuan
 * @date 2020/1/1
 */
public class DownLoadThread {

    public static void main(String[] args) {
        Thread thread = null;
        List<Integer> param = new ArrayList<>();
        test(param);
        Integer startIndex = 0;
        Integer endIndex = 0;
        Integer volume = 10;//每个线程处理的数量
        Double s = Math.ceil(param.size() / volume);
        Integer loop =s.intValue();
        for (int x = 0; x < loop; x++) {
            startIndex = endIndex;
            if (volume < (param.size() - x * volume)) {
                endIndex = param.size();
            }
            endIndex = volume * (1 + x);
            //thread = new Thread(new Down(startIndex, endIndex, param));
            thread.start();

        }

    }

    public static void test(List<Integer> param){
        for (int x = 0; x < 100; x++) {
            param.add(x + 1);
        }
        //System.out.println(param);

    }
}
