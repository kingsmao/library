package com.kingmao.library.action;


import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author qinxuan
 * @date 2020/1/3
 */
public class VoidController {
    public static void main(String[] args) {
        t11();
    }

    public static void t1(){
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

    public static void t2(){
        List<Integer> l1 = new ArrayList(20);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(10, 5);
        System.out.println(l1);
    }

    public static void t3(){
        BigDecimal s1 = new BigDecimal(1.10000007);
        BigDecimal threshold = new BigDecimal(0.5);
        BigDecimal ret = s1.multiply(threshold).setScale(8, BigDecimal.ROUND_UP);
        System.out.println(ret);
    }

    public static Integer t4(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        if (true) {
            for (Integer s: list) {
                if (s == 5) {
                    return 99;
                }
            }

            for (Integer s: list) {
                if (s == 2) {
                    return 88;
                }
            }

            for (Integer s: list) {
                if (s == 3) {
                    return 77;
                }
            }
        }

        return null;
    }

    public static boolean t5(){
        String s1 = "aaBB";
        String s2 = "AABB";
        return s1.equalsIgnoreCase(s2);
    }

    public static Set<String> t6(){
        Set<String> quoteList = new HashSet<>();
        Set<String> baseList = new HashSet<>();

        quoteList.add("aaa");
        quoteList.add("aaa");
        quoteList.add("bbb");
        quoteList.add("ccc");

        baseList.add("ccc");
        baseList.add("ddd");
        baseList.add("fff");

        baseList.addAll(quoteList);
       // System.out.println(quoteList);
        //System.out.println(baseList);
        return baseList;
    }


    public static void t7(){
        List<String> finalCoin = new LinkedList<>();
        finalCoin.add("USDT");
        finalCoin.add("BTC");
        finalCoin.add("ETH");
        System.out.println(finalCoin);
    }

    public static void t8(){
        Integer t1 = null;
        String s1 = t1.toString().substring(0, 3);
        System.out.println(s1);
    }

    public static void t9(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.forEach(e ->{
            if (e.equals(2)) {
                return;
            }
            System.out.println(e);
        });
    }

    public static void t10(){
        BigDecimal open = new BigDecimal(5);
        BigDecimal close = new BigDecimal(1);
        BigDecimal rate = close.subtract(open).divide(open);
        System.out.println(rate);
    }

    public static void t11(){
        UUID uuid = UUID.randomUUID();
        System.out.println(".{"+uuid.toString()+"}");
        String s1 = "db293adf-2076-4917-bdd6-e32271419591";
        String s2 = "ae807c84-daa4-4a6d-a441-5b1247d112fa";
    }
}
