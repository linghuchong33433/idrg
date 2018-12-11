package com.fartecx.dao;

import com.fartecx.pojo.JobTypeEntity;
import com.fartecx.pojo.JobTypeEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobTypeEntityDao {
    int countByExample(JobTypeEntityQuery example);

    int deleteByExample(JobTypeEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(JobTypeEntity record);

    int insertSelective(JobTypeEntity record);

    List<JobTypeEntity> selectByExample(JobTypeEntityQuery example);

    JobTypeEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JobTypeEntity record, @Param("example") JobTypeEntityQuery example);

    int updateByExample(@Param("record") JobTypeEntity record, @Param("example") JobTypeEntityQuery example);

    int updateByPrimaryKeySelective(JobTypeEntity record);

    int updateByPrimaryKey(JobTypeEntity record);
}