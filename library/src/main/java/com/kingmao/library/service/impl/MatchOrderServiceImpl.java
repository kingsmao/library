package com.kingmao.library.service.impl;

import com.kingmao.library.dao.MatchOrderMapper;
import com.kingmao.library.entity.MatchOrder;
import com.kingmao.library.entity.MatchOrderExample;
import com.kingmao.library.service.MatchOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public int insertSelective(MatchOrder matchOrder) {
        return matchOrderMapper.insertSelective(matchOrder);
    }

    @Override
    public List<MatchOrder> selectByExample(MatchOrderExample example) {
        return matchOrderMapper.selectByExample(example);
    }

    @Override
    public int updateByPrimaryKey(MatchOrder matchOrder) {
        return matchOrderMapper.updateByPrimaryKey(matchOrder);
    }
}
