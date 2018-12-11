package com.fartecx.dao;

import com.fartecx.pojo.JobLogEntity;
import com.fartecx.pojo.JobLogEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobLogEntityDao {
    int countByExample(JobLogEntityQuery example);

    int deleteByExample(JobLogEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(JobLogEntity record);

    int insertSelective(JobLogEntity record);

    List<JobLogEntity> selectByExample(JobLogEntityQuery example);

    JobLogEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JobLogEntity record, @Param("example") JobLogEntityQuery example);

    int updateByExample(@Param("record") JobLogEntity record, @Param("example") JobLogEntityQuery example);

    int updateByPrimaryKeySelective(JobLogEntity record);

    int updateByPrimaryKey(JobLogEntity record);
}