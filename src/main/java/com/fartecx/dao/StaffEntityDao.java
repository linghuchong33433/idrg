package com.fartecx.dao;

import com.fartecx.pojo.StaffEntity;
import com.fartecx.pojo.StaffEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffEntityDao {
    int countByExample(StaffEntityQuery example);

    int deleteByExample(StaffEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(StaffEntity record);

    int insertSelective(StaffEntity record);

    List<StaffEntity> selectByExample(StaffEntityQuery example);

    StaffEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") StaffEntity record, @Param("example") StaffEntityQuery example);

    int updateByExample(@Param("record") StaffEntity record, @Param("example") StaffEntityQuery example);

    int updateByPrimaryKeySelective(StaffEntity record);

    int updateByPrimaryKey(StaffEntity record);
}