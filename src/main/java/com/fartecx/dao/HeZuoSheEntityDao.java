package com.fartecx.dao;

import com.fartecx.pojo.HeZuoSheEntity;
import com.fartecx.pojo.HeZuoSheEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HeZuoSheEntityDao {
    int countByExample(HeZuoSheEntityQuery example);

    int deleteByExample(HeZuoSheEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(HeZuoSheEntity record);

    int insertSelective(HeZuoSheEntity record);

    List<HeZuoSheEntity> selectByExample(HeZuoSheEntityQuery example);

    HeZuoSheEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HeZuoSheEntity record, @Param("example") HeZuoSheEntityQuery example);

    int updateByExample(@Param("record") HeZuoSheEntity record, @Param("example") HeZuoSheEntityQuery example);

    int updateByPrimaryKeySelective(HeZuoSheEntity record);

    int updateByPrimaryKey(HeZuoSheEntity record);
}