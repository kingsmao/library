package com.kingmao.library.common.lambda;

import com.google.gson.Gson;
import com.kingmao.library.entity.ConfigCoinSymbol;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author qinxuan
 * @date 2019/12/12
 */
public class LambdaExample_List {
    public static void main(String[] args) {
        ConfigCoinSymbol c1 = new ConfigCoinSymbol();
        ConfigCoinSymbol c2 = new ConfigCoinSymbol();
        ConfigCoinSymbol c3 = new ConfigCoinSymbol();
        ConfigCoinSymbol c4 = new ConfigCoinSymbol();
        c1.setId(1);
        c2.setId(2);
        c3.setId(3);
        c4.setId(4);

        c1.setCoinSymbol("aaa");
        c2.setCoinSymbol("bbb");
        c3.setCoinSymbol("ccc");
        c4.setCoinSymbol("ddd");

        c1.setAddressLen(4);
        c1.setAddressLen(5);
        c1.setAddressLen(6);
        c1.setAddressLen(7);

        List<ConfigCoinSymbol> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        //System.out.println(new Gson().toJson(list));
        t3(list);
    }

    /**
     * 将List<T> 中的字符串 拼接到list2中  List<String>
     *
     * List<T>  --->  List<String>
     *
     * [aaa, bbb, ccc, ddd]
     *
     * @param list
     */
    public static void t1(List<ConfigCoinSymbol> list){
        List<String> strings = list.stream().map(e -> e.getCoinSymbol()).collect(Collectors.toList());
        System.out.println(strings);
    }

    /**
     * 将List<T> 中的字符串 拼接成一个字符串
     *
     * List<T>  --->  String
     *
     * "aaa,bbb,ccc,ddd"
     * @param list
     */
    public static void t2(List<ConfigCoinSymbol> list){
        String str = list.stream().map(e -> e.getCoinSymbol()).collect(Collectors.joining(","));
        System.out.println(str);
    }

    /**
     * 操作List<T>中的一个字段，循环取出这个字段进行操作
     * @param list
     */
    public static void t3(List<ConfigCoinSymbol> list){
        Integer s = 3; //有时s无法直接传入lambda中，需要在lambda写入一个变量接收s
        list.forEach(e ->{
            e.setId(e.getId() + s);
        });

        System.out.println(new Gson().toJson(list));
    }

    /**
     * 如果List<T>中的一个字段符合条件，则把这个对象剔除
     * @param list
     */
    public static void t4(List<ConfigCoinSymbol> list){
        list.removeIf(e -> e.getId() == 2);
        System.out.println(new Gson().toJson(list));
    }

    /**
     * List<T> 比较对象中多个属性，先比较a，再比较c
     * 可以继续追加 thenComparing
     * @param list
     */
    public static void t5(List<ConfigCoinSymbol> list){
        Comparator<ConfigCoinSymbol> a = (o1,o2) -> o1.getId().compareTo(o2.getId());
        Comparator<ConfigCoinSymbol> b = (o1,o2) -> o1.getCoinSymbol().compareTo(o2.getCoinSymbol());
        list.sort(a.thenComparing(b));
    }

}
