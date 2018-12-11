package com.fartecx.dao;

import com.fartecx.pojo.TopicEntity;
import com.fartecx.pojo.TopicEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicEntityDao {
    int countByExample(TopicEntityQuery example);

    int deleteByExample(TopicEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(TopicEntity record);

    int insertSelective(TopicEntity record);

    List<TopicEntity> selectByExample(TopicEntityQuery example);

    TopicEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TopicEntity record, @Param("example") TopicEntityQuery example);

    int updateByExample(@Param("record") TopicEntity record, @Param("example") TopicEntityQuery example);

    int updateByPrimaryKeySelective(TopicEntity record);

    int updateByPrimaryKey(TopicEntity record);
}