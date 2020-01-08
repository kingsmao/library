package com.kingmao.library.dao;

import com.kingmao.library.entity.MatchOrder;

public interface MatchOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MatchOrder record);

    int insertSelective(MatchOrder record);

    MatchOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MatchOrder record);

    int updateByPrimaryKey(MatchOrder record);
}