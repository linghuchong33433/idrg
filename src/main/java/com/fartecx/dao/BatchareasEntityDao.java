package com.fartecx.dao;

import com.fartecx.pojo.BatchareasEntity;
import com.fartecx.pojo.BatchareasEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchareasEntityDao {
    int countByExample(BatchareasEntityQuery example);

    int deleteByExample(BatchareasEntityQuery example);

    int insert(BatchareasEntity record);

    int insertSelective(BatchareasEntity record);

    List<BatchareasEntity> selectByExample(BatchareasEntityQuery example);

    int updateByExampleSelective(@Param("record") BatchareasEntity record, @Param("example") BatchareasEntityQuery example);

    int updateByExample(@Param("record") BatchareasEntity record, @Param("example") BatchareasEntityQuery example);
}