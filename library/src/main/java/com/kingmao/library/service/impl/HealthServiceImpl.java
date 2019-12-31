package com.kingmao.library.service.impl;

import com.kingmao.library.dao.FeePoolingMapper;
import com.kingmao.library.entity.FeePooling;
import com.kingmao.library.entity.FeePoolingExample;
import com.kingmao.library.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qinxuan
 * @date 2019/12/20
 */
@Service
public class HealthServiceImpl implements HealthService {
    @Autowired
    private FeePoolingMapper feePoolingMapperl;

    public List<FeePooling> findAll(FeePoolingExample example) {
        return feePoolingMapperl.selectByExample(example);
    }

    public int countByExample(FeePoolingExample example) {
        return feePoolingMapperl.countByExample(example);
    }


}
