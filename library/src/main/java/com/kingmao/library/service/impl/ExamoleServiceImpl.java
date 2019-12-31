package com.kingmao.library.service.impl;

import com.kingmao.library.dao.ConfigCoinSymbolMapper;
import com.kingmao.library.entity.ConfigCoinSymbol;
import com.kingmao.library.entity.ConfigCoinSymbolExample;
import com.kingmao.library.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qinxuan
 * @date 2019/12/12
 */
@Service
public class ExamoleServiceImpl implements ExampleService {

    @Autowired
    private ConfigCoinSymbolMapper configCoinSymbolMapper;
    @Override
    public List<ConfigCoinSymbol> findAll(ConfigCoinSymbolExample example) {
        return configCoinSymbolMapper.selectByExample(example);
    }

    @Override
    public int countByExample(ConfigCoinSymbolExample example) {
        return configCoinSymbolMapper.countByExample(example);
    }
}
