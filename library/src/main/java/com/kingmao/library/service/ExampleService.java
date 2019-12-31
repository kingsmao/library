package com.kingmao.library.service;

import com.kingmao.library.entity.ConfigCoinSymbol;
import com.kingmao.library.entity.ConfigCoinSymbolExample;

import java.util.List;

/**
 * @author qinxuan
 * @date 2019/12/12
 */
public interface ExampleService {
    List<ConfigCoinSymbol> findAll(ConfigCoinSymbolExample example);

    int countByExample(ConfigCoinSymbolExample example);


}
