package com.fartecx.dao;

import com.fartecx.pojo.JobEntity;
import com.fartecx.pojo.JobEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobEntityDao {
    int countByExample(JobEntityQuery example);

    int deleteByExample(JobEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(JobEntity record);

    int insertSelective(JobEntity record);

    List<JobEntity> selectByExample(JobEntityQuery example);

    JobEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JobEntity record, @Param("example") JobEntityQuery example);

    int updateByExample(@Param("record") JobEntity record, @Param("example") JobEntityQuery example);

    int updateByPrimaryKeySelective(JobEntity record);

    int updateByPrimaryKey(JobEntity record);
}