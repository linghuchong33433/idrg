package com.fartecx.dao;

import com.fartecx.pojo.BatchPhaseEntity;
import com.fartecx.pojo.BatchPhaseEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchPhaseEntityDao {
    int countByExample(BatchPhaseEntityQuery example);

    int deleteByExample(BatchPhaseEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(BatchPhaseEntity record);

    int insertSelective(BatchPhaseEntity record);

    List<BatchPhaseEntity> selectByExample(BatchPhaseEntityQuery example);

    BatchPhaseEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BatchPhaseEntity record, @Param("example") BatchPhaseEntityQuery example);

    int updateByExample(@Param("record") BatchPhaseEntity record, @Param("example") BatchPhaseEntityQuery example);

    int updateByPrimaryKeySelective(BatchPhaseEntity record);

    int updateByPrimaryKey(BatchPhaseEntity record);
}