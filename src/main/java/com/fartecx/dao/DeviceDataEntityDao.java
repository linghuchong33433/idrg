package com.fartecx.dao;

import com.fartecx.pojo.DeviceDataEntity;
import com.fartecx.pojo.DeviceDataEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceDataEntityDao {
    int countByExample(DeviceDataEntityQuery example);

    int deleteByExample(DeviceDataEntityQuery example);

    int deleteByPrimaryKey(String dataid);

    int insert(DeviceDataEntity record);

    int insertSelective(DeviceDataEntity record);

    List<DeviceDataEntity> selectByExample(DeviceDataEntityQuery example);

    DeviceDataEntity selectByPrimaryKey(String dataid);

    int updateByExampleSelective(@Param("record") DeviceDataEntity record, @Param("example") DeviceDataEntityQuery example);

    int updateByExample(@Param("record") DeviceDataEntity record, @Param("example") DeviceDataEntityQuery example);

    int updateByPrimaryKeySelective(DeviceDataEntity record);

    int updateByPrimaryKey(DeviceDataEntity record);
}