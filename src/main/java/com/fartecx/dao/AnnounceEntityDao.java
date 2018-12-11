package com.fartecx.dao;

import com.fartecx.pojo.AnnounceEntity;
import com.fartecx.pojo.AnnounceEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnnounceEntityDao {
    int countByExample(AnnounceEntityQuery example);

    int deleteByExample(AnnounceEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(AnnounceEntity record);

    int insertSelective(AnnounceEntity record);

    List<AnnounceEntity> selectByExample(AnnounceEntityQuery example);

    AnnounceEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AnnounceEntity record, @Param("example") AnnounceEntityQuery example);

    int updateByExample(@Param("record") AnnounceEntity record, @Param("example") AnnounceEntityQuery example);

    int updateByPrimaryKeySelective(AnnounceEntity record);

    int updateByPrimaryKey(AnnounceEntity record);
}