package com.fartecx.dao;

import com.fartecx.pojo.FarmEntity;
import com.fartecx.pojo.FarmEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FarmEntityDao {
    int countByExample(FarmEntityQuery example);

    int deleteByExample(FarmEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(FarmEntity record);

    int insertSelective(FarmEntity record);

    List<FarmEntity> selectByExample(FarmEntityQuery example);

    FarmEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FarmEntity record, @Param("example") FarmEntityQuery example);

    int updateByExample(@Param("record") FarmEntity record, @Param("example") FarmEntityQuery example);

    int updateByPrimaryKeySelective(FarmEntity record);

    int updateByPrimaryKey(FarmEntity record);
}