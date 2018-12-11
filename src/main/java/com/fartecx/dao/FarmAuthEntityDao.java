package com.fartecx.dao;

import com.fartecx.pojo.FarmAuthEntity;
import com.fartecx.pojo.FarmAuthEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FarmAuthEntityDao {
    int countByExample(FarmAuthEntityQuery example);

    int deleteByExample(FarmAuthEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(FarmAuthEntity record);

    int insertSelective(FarmAuthEntity record);

    List<FarmAuthEntity> selectByExample(FarmAuthEntityQuery example);

    FarmAuthEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FarmAuthEntity record, @Param("example") FarmAuthEntityQuery example);

    int updateByExample(@Param("record") FarmAuthEntity record, @Param("example") FarmAuthEntityQuery example);

    int updateByPrimaryKeySelective(FarmAuthEntity record);

    int updateByPrimaryKey(FarmAuthEntity record);
}