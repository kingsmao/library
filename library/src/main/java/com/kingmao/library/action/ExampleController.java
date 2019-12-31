package com.kingmao.library.action;

import com.google.gson.Gson;
import com.kingmao.library.entity.ConfigCoinSymbol;
import com.kingmao.library.entity.ConfigCoinSymbolExample;
import com.kingmao.library.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author qinxuan
 * @date 2019/12/12
 */
@RestController
public class ExampleController {

    @Autowired
    private ExampleService exampleService;

    /**
     * 使用Criteria极大方便了增删改查
     * 例如：分页，排序，查询条件
     * id in List<Integer>，插入字段 id = 1 AND name in List<String>
     *
     * 如何使用？
     * 1.使用带有example的mybatis自动生成工具。
     * 2.添加依赖，注意版本。
     *    <dependency>
     *        <groupId>org.springframework.data</groupId>
     *        <artifactId>spring-data-commons</artifactId>
     *        <version>2.2.1.RELEASE</version>
     *    </dependency>
     * 3.mapper接口 extends SqlMapper，SqlMapper是一个空接口。
     * 4.Criteria与正常的增删改，联表查询等不冲突。
     */
    @RequestMapping(value = "/example")
    public String example(){
        Integer page = 0;
        Integer pageSize = 20;
        ConfigCoinSymbolExample example = new ConfigCoinSymbolExample();
        ConfigCoinSymbolExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(101);

        //查询条件在list中
        List<Integer> address = new ArrayList<>();
        criteria.andAddressLenIn(address);

        //分页
        example.setLimitStart((page - 1) * pageSize);
        example.setLimitEnd(pageSize);
        int count = exampleService.countByExample(example);

        //排序
        example.setOrderByClause("ctime desc,id desc");
        List<ConfigCoinSymbol> all = exampleService.findAll(example);

        Map<String, Object> data = new HashMap<>();
        data.put("feePoolingDetailList", null);
        data.put("count", count);
        data.put("pageSize", pageSize);
        data.put("page", page);
        Gson gson = new Gson();
        return gson.toJson(data);
    }
}
