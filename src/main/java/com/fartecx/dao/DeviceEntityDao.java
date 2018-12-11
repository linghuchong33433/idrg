package com.fartecx.dao;

import com.fartecx.pojo.DeviceEntity;
import com.fartecx.pojo.DeviceEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceEntityDao {
    int countByExample(DeviceEntityQuery example);

    int deleteByExample(DeviceEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceEntity record);

    int insertSelective(DeviceEntity record);

    List<DeviceEntity> selectByExample(DeviceEntityQuery example);

    DeviceEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceEntity record, @Param("example") DeviceEntityQuery example);

    int updateByExample(@Param("record") DeviceEntity record, @Param("example") DeviceEntityQuery example);

    int updateByPrimaryKeySelective(DeviceEntity record);

    int updateByPrimaryKey(DeviceEntity record);
}