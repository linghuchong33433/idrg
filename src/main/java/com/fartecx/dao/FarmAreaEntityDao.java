package com.fartecx.dao;

import com.fartecx.pojo.FarmAreaEntity;
import com.fartecx.pojo.FarmAreaEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FarmAreaEntityDao {
    int countByExample(FarmAreaEntityQuery example);

    int deleteByExample(FarmAreaEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(FarmAreaEntity record);

    int insertSelective(FarmAreaEntity record);

    List<FarmAreaEntity> selectByExample(FarmAreaEntityQuery example);

    FarmAreaEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FarmAreaEntity record, @Param("example") FarmAreaEntityQuery example);

    int updateByExample(@Param("record") FarmAreaEntity record, @Param("example") FarmAreaEntityQuery example);

    int updateByPrimaryKeySelective(FarmAreaEntity record);

    int updateByPrimaryKey(FarmAreaEntity record);
}