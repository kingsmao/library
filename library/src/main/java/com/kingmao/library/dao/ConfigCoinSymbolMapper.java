package com.kingmao.library.dao;


import com.kingmao.library.entity.ConfigCoinSymbol;
import com.kingmao.library.entity.ConfigCoinSymbolExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author qinxuan
*/
public interface ConfigCoinSymbolMapper extends SqlMapper {
    int countByExample(ConfigCoinSymbolExample example);

    int deleteByExample(ConfigCoinSymbolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigCoinSymbol record);

    int insertSelective(ConfigCoinSymbol record);

    ConfigCoinSymbol selectOnlyOneByExample(ConfigCoinSymbolExample example);

    List<ConfigCoinSymbol> selectByExample(ConfigCoinSymbolExample example);

    ConfigCoinSymbol selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigCoinSymbol record, @Param("example") ConfigCoinSymbolExample example);

    int updateByExample(@Param("record") ConfigCoinSymbol record, @Param("example") ConfigCoinSymbolExample example);

    int updateByPrimaryKeySelective(ConfigCoinSymbol record);

    int updateByPrimaryKey(ConfigCoinSymbol record);
}