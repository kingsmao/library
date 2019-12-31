package com.kingmao.library.dao;

import com.kingmao.library.entity.ConfigSymbolLimitToken;

public interface ConfigSymbolLimitTokenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConfigSymbolLimitToken record);

    int insertSelective(ConfigSymbolLimitToken record);

    ConfigSymbolLimitToken selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConfigSymbolLimitToken record);

    int updateByPrimaryKey(ConfigSymbolLimitToken record);
}