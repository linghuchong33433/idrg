package com.fartecx.dao;

import com.fartecx.pojo.JobStaffEntity;
import com.fartecx.pojo.JobStaffEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobStaffEntityDao {
    int countByExample(JobStaffEntityQuery example);

    int deleteByExample(JobStaffEntityQuery example);

    int insert(JobStaffEntity record);

    int insertSelective(JobStaffEntity record);

    List<JobStaffEntity> selectByExample(JobStaffEntityQuery example);

    int updateByExampleSelective(@Param("record") JobStaffEntity record, @Param("example") JobStaffEntityQuery example);

    int updateByExample(@Param("record") JobStaffEntity record, @Param("example") JobStaffEntityQuery example);
}