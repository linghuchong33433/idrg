package com.fartecx.dao;

import com.fartecx.pojo.TruckEntity;
import com.fartecx.pojo.TruckEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TruckEntityDao {
    int countByExample(TruckEntityQuery example);

    int deleteByExample(TruckEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(TruckEntity record);

    int insertSelective(TruckEntity record);

    List<TruckEntity> selectByExample(TruckEntityQuery example);

    TruckEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TruckEntity record, @Param("example") TruckEntityQuery example);

    int updateByExample(@Param("record") TruckEntity record, @Param("example") TruckEntityQuery example);

    int updateByPrimaryKeySelective(TruckEntity record);

    int updateByPrimaryKey(TruckEntity record);
}