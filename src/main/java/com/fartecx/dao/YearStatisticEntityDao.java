package com.fartecx.dao;

import com.fartecx.pojo.YearStatisticEntity;
import com.fartecx.pojo.YearStatisticEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearStatisticEntityDao {
    int countByExample(YearStatisticEntityQuery example);

    int deleteByExample(YearStatisticEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(YearStatisticEntity record);

    int insertSelective(YearStatisticEntity record);

    List<YearStatisticEntity> selectByExample(YearStatisticEntityQuery example);

    YearStatisticEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") YearStatisticEntity record, @Param("example") YearStatisticEntityQuery example);

    int updateByExample(@Param("record") YearStatisticEntity record, @Param("example") YearStatisticEntityQuery example);

    int updateByPrimaryKeySelective(YearStatisticEntity record);

    int updateByPrimaryKey(YearStatisticEntity record);
}