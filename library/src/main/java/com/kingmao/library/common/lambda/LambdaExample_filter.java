package com.kingmao.library.common.lambda;

import com.google.gson.Gson;
import com.kingmao.library.entity.ConfigCoinSymbol;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author qinxuan
 * @date 2019/12/12
 */
public class LambdaExample_filter {
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
        t2(list);
    }

    public static void t2(List<ConfigCoinSymbol> openCoinList){
        List<ConfigCoinSymbol> coinTempList = new ArrayList<>();

        /**
         * 条件过滤器
         */
        Predicate<ConfigCoinSymbol> otcFilterOpen = (p -> p.getId() != 1);
        Predicate<ConfigCoinSymbol> otcFilterClose = (p -> p.getId() != 2);
        Predicate<ConfigCoinSymbol> withdrewFilterOpen = (p -> p.getCoinSymbol().equals("aaa"));
        Predicate<ConfigCoinSymbol> withdrewFilterClose = (p -> !p.getCoinSymbol().equals("bbb"));

        /**
         * 排序器
         */
        Comparator<ConfigCoinSymbol> sortById = ((v1, v2) -> (v1.getId() - v2.getId()));

        coinTempList = openCoinList.stream().filter(otcFilterOpen).filter(withdrewFilterClose).sorted(sortById).collect(Collectors.toList());
        System.out.println(new Gson().toJson(openCoinList));
        System.out.println(new Gson().toJson(coinTempList));
    }

    public static void t3(){
        Integer defalut = 10;
        //获取所有开放的币种
        List<ConfigCoinSymbol> allOpenCoinList = null;
        //筛选ETH代币
        Predicate<ConfigCoinSymbol> ethFilter = (p -> p.getTokenBase().equalsIgnoreCase("ETH"));
        //id（时间）倒序
        Comparator<ConfigCoinSymbol> idFilter = ((v1, v2) -> (v2.getId() - v1.getId()));
        List<ConfigCoinSymbol> retList = allOpenCoinList.stream().filter(ethFilter).sorted(idFilter).limit(defalut).collect(Collectors.toList());
    }
}
