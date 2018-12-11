package com.fartecx.dao;

import com.fartecx.pojo.ExpertServiceLogEntity;
import com.fartecx.pojo.ExpertServiceLogEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpertServiceLogEntityDao {
    int countByExample(ExpertServiceLogEntityQuery example);

    int deleteByExample(ExpertServiceLogEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(ExpertServiceLogEntity record);

    int insertSelective(ExpertServiceLogEntity record);

    List<ExpertServiceLogEntity> selectByExample(ExpertServiceLogEntityQuery example);

    ExpertServiceLogEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ExpertServiceLogEntity record, @Param("example") ExpertServiceLogEntityQuery example);

    int updateByExample(@Param("record") ExpertServiceLogEntity record, @Param("example") ExpertServiceLogEntityQuery example);

    int updateByPrimaryKeySelective(ExpertServiceLogEntity record);

    int updateByPrimaryKey(ExpertServiceLogEntity record);
}