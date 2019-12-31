package com.kingmao.library.dao;

import com.kingmao.library.entity.FeePooling;
import com.kingmao.library.entity.FeePoolingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* @author qinxuan
*/
public interface FeePoolingMapper extends SqlMapper {
    int countByExample(FeePoolingExample example);

    int deleteByExample(FeePoolingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FeePooling record);

    int insertSelective(FeePooling record);

    FeePooling selectOnlyOneByExample(FeePoolingExample example);

    List<FeePooling> selectByExample(FeePoolingExample example);

    FeePooling selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FeePooling record, @Param("example") FeePoolingExample example);

    int updateByExample(@Param("record") FeePooling record, @Param("example") FeePoolingExample example);

    int updateByPrimaryKeySelective(FeePooling record);

    int updateByPrimaryKey(FeePooling record);
}