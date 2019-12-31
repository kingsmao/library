package com.kingmao.library.service;


import com.kingmao.library.entity.FeePooling;
import com.kingmao.library.entity.FeePoolingExample;

import java.util.List;

/**
 * @author qinxuan
 */
public interface HealthService {
    List<FeePooling> findAll(FeePoolingExample example);

    int countByExample(FeePoolingExample example);
}
