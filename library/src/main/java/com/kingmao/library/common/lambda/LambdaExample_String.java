package com.kingmao.library.common.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author qinxuan
 * @date 2019/12/12
 */
public class LambdaExample_String {
    public static void main(String[] args) {
       t1();
    }

    /**
     * 字典值排序，包含了数字，字母
     * v1,v2  v2 -> v1 倒叙
     * v1,v2  v1 -> v2 正序
     */
    public static void t1(){
        List<String> list1 =
                Arrays.asList("sdf","f3w23","f23tr","f34")
                        .stream()
                        .sorted((v1, v2) -> v1.compareTo(v2))
                        .collect(Collectors.toList());
        System.out.println(list1);
    }
}
