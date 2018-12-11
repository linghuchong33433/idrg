package com.fartecx.dao;

import com.fartecx.pojo.MediaEntity;
import com.fartecx.pojo.MediaEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MediaEntityDao {
    int countByExample(MediaEntityQuery example);

    int deleteByExample(MediaEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(MediaEntity record);

    int insertSelective(MediaEntity record);

    List<MediaEntity> selectByExample(MediaEntityQuery example);

    MediaEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MediaEntity record, @Param("example") MediaEntityQuery example);

    int updateByExample(@Param("record") MediaEntity record, @Param("example") MediaEntityQuery example);

    int updateByPrimaryKeySelective(MediaEntity record);

    int updateByPrimaryKey(MediaEntity record);
}