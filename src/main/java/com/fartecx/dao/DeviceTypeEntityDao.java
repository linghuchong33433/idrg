package com.fartecx.dao;

import com.fartecx.pojo.DeviceTypeEntity;
import com.fartecx.pojo.DeviceTypeEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceTypeEntityDao {
    int countByExample(DeviceTypeEntityQuery example);

    int deleteByExample(DeviceTypeEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceTypeEntity record);

    int insertSelective(DeviceTypeEntity record);

    List<DeviceTypeEntity> selectByExample(DeviceTypeEntityQuery example);

    DeviceTypeEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceTypeEntity record, @Param("example") DeviceTypeEntityQuery example);

    int updateByExample(@Param("record") DeviceTypeEntity record, @Param("example") DeviceTypeEntityQuery example);

    int updateByPrimaryKeySelective(DeviceTypeEntity record);

    int updateByPrimaryKey(DeviceTypeEntity record);
}