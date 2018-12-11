package com.fartecx.dao;

import com.fartecx.pojo.ExpertEntity;
import com.fartecx.pojo.ExpertEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpertEntityDao {
    int countByExample(ExpertEntityQuery example);

    int deleteByExample(ExpertEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(ExpertEntity record);

    int insertSelective(ExpertEntity record);

    List<ExpertEntity> selectByExample(ExpertEntityQuery example);

    ExpertEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ExpertEntity record, @Param("example") ExpertEntityQuery example);

    int updateByExample(@Param("record") ExpertEntity record, @Param("example") ExpertEntityQuery example);

    int updateByPrimaryKeySelective(ExpertEntity record);

    int updateByPrimaryKey(ExpertEntity record);
}