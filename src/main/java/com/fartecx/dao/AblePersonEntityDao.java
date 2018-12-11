package com.fartecx.dao;

import com.fartecx.pojo.AblePersonEntity;
import com.fartecx.pojo.AblePersonEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AblePersonEntityDao {
    int countByExample(AblePersonEntityQuery example);

    int deleteByExample(AblePersonEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(AblePersonEntity record);

    int insertSelective(AblePersonEntity record);

    List<AblePersonEntity> selectByExample(AblePersonEntityQuery example);

    AblePersonEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AblePersonEntity record, @Param("example") AblePersonEntityQuery example);

    int updateByExample(@Param("record") AblePersonEntity record, @Param("example") AblePersonEntityQuery example);

    int updateByPrimaryKeySelective(AblePersonEntity record);

    int updateByPrimaryKey(AblePersonEntity record);
}