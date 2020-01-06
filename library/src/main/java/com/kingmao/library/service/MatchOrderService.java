package com.kingmao.library.service;

import com.kingmao.library.entity.MatchOrder;
import com.kingmao.library.entity.MatchOrderExample;

import java.util.List;

/**
 * @author qinxuan
 * @date 2019/12/20
 */
public interface MatchOrderService {
    int insert(MatchOrder matchOrder);

    int insertSelective(MatchOrder matchOrder);

    List<MatchOrder> selectByExample(MatchOrderExample example);

    int updateByPrimaryKey(MatchOrder matchOrder);
}
