package com.fartecx.dao;

import com.fartecx.pojo.ShowFarmEntity;
import com.fartecx.pojo.ShowFarmEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShowFarmEntityDao {
    int countByExample(ShowFarmEntityQuery example);

    int deleteByExample(ShowFarmEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(ShowFarmEntity record);

    int insertSelective(ShowFarmEntity record);

    List<ShowFarmEntity> selectByExample(ShowFarmEntityQuery example);

    ShowFarmEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShowFarmEntity record, @Param("example") ShowFarmEntityQuery example);

    int updateByExample(@Param("record") ShowFarmEntity record, @Param("example") ShowFarmEntityQuery example);

    int updateByPrimaryKeySelective(ShowFarmEntity record);

    int updateByPrimaryKey(ShowFarmEntity record);
}