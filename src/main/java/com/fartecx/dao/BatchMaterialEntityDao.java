package com.fartecx.dao;

import com.fartecx.pojo.BatchMaterialEntity;
import com.fartecx.pojo.BatchMaterialEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchMaterialEntityDao {
    int countByExample(BatchMaterialEntityQuery example);

    int deleteByExample(BatchMaterialEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(BatchMaterialEntity record);

    int insertSelective(BatchMaterialEntity record);

    List<BatchMaterialEntity> selectByExample(BatchMaterialEntityQuery example);

    BatchMaterialEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BatchMaterialEntity record, @Param("example") BatchMaterialEntityQuery example);

    int updateByExample(@Param("record") BatchMaterialEntity record, @Param("example") BatchMaterialEntityQuery example);

    int updateByPrimaryKeySelective(BatchMaterialEntity record);

    int updateByPrimaryKey(BatchMaterialEntity record);
}