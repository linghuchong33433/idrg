package com.fartecx.dao;

import com.fartecx.pojo.RecallEntity;
import com.fartecx.pojo.RecallEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecallEntityDao {
    int countByExample(RecallEntityQuery example);

    int deleteByExample(RecallEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(RecallEntity record);

    int insertSelective(RecallEntity record);

    List<RecallEntity> selectByExample(RecallEntityQuery example);

    RecallEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RecallEntity record, @Param("example") RecallEntityQuery example);

    int updateByExample(@Param("record") RecallEntity record, @Param("example") RecallEntityQuery example);

    int updateByPrimaryKeySelective(RecallEntity record);

    int updateByPrimaryKey(RecallEntity record);
}