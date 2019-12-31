package com.kingmao.library.dao;



import com.kingmao.library.entity.MatchOrder;
import com.kingmao.library.entity.MatchOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author qinxuan
*/
public interface MatchOrderMapper extends SqlMapper {
    int countByExample(MatchOrderExample example);

    int deleteByExample(MatchOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MatchOrder record);

    int insertSelective(MatchOrder record);

    MatchOrder selectOnlyOneByExample(MatchOrderExample example);

    List<MatchOrder> selectByExample(MatchOrderExample example);

    MatchOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MatchOrder record, @Param("example") MatchOrderExample example);

    int updateByExample(@Param("record") MatchOrder record, @Param("example") MatchOrderExample example);

    int updateByPrimaryKeySelective(MatchOrder record);

    int updateByPrimaryKey(MatchOrder record);
}