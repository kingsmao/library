package com.kingmao.library.service.impl;

import com.kingmao.library.dao.MatchOrderMapper;
import com.kingmao.library.entity.MatchOrder;
import com.kingmao.library.service.MatchOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qinxuan
 * @date 2019/12/20
 */
@Service
public class MatchOrderServiceImpl implements MatchOrderService {
    @Autowired
    private MatchOrderMapper matchOrderMapper;

    public int insert(MatchOrder matchOrder) {
        return matchOrderMapper.insertSelective(matchOrder);
    }
}
