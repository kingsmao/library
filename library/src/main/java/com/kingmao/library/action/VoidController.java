package com.kingmao.library.action;

/**
 * @author qinxuan
 * @date 2020/1/3
 */
public class VoidController {
    public static void main(String[] args) {
        String s1 = new String ("dsf");
        String s2 = new String ("dsf");
        String s3 = new String ("dsf");
        if (true) {
            return;
        }
        /**
         * 后续代码不会执行
         */
        String s4 = new String ("dsf");
        String s5 = new String ("dsf");
    }
}
