package com.kingmao.library.service;

import com.kingmao.library.entity.MatchOrder;

/**
 * @author qinxuan
 * @date 2019/12/20
 */
public interface MatchOrderService {
    int insert(MatchOrder matchOrder);

    int insertSelective(MatchOrder matchOrder);
}
