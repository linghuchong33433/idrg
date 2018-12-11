package com.fartecx.dao;

import com.fartecx.pojo.BatchEntity;
import com.fartecx.pojo.BatchEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchEntityDao {
    int countByExample(BatchEntityQuery example);

    int deleteByExample(BatchEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(BatchEntity record);

    int insertSelective(BatchEntity record);

    List<BatchEntity> selectByExample(BatchEntityQuery example);

    BatchEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BatchEntity record, @Param("example") BatchEntityQuery example);

    int updateByExample(@Param("record") BatchEntity record, @Param("example") BatchEntityQuery example);

    int updateByPrimaryKeySelective(BatchEntity record);

    int updateByPrimaryKey(BatchEntity record);
}