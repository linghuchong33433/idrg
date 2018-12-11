package com.fartecx.dao;

import com.fartecx.pojo.BatchLogEntity;
import com.fartecx.pojo.BatchLogEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchLogEntityDao {
    int countByExample(BatchLogEntityQuery example);

    int deleteByExample(BatchLogEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(BatchLogEntity record);

    int insertSelective(BatchLogEntity record);

    List<BatchLogEntity> selectByExample(BatchLogEntityQuery example);

    BatchLogEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BatchLogEntity record, @Param("example") BatchLogEntityQuery example);

    int updateByExample(@Param("record") BatchLogEntity record, @Param("example") BatchLogEntityQuery example);

    int updateByPrimaryKeySelective(BatchLogEntity record);

    int updateByPrimaryKey(BatchLogEntity record);
}