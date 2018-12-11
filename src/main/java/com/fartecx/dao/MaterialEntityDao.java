package com.fartecx.dao;

import com.fartecx.pojo.MaterialEntity;
import com.fartecx.pojo.MaterialEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialEntityDao {
    int countByExample(MaterialEntityQuery example);

    int deleteByExample(MaterialEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(MaterialEntity record);

    int insertSelective(MaterialEntity record);

    List<MaterialEntity> selectByExample(MaterialEntityQuery example);

    MaterialEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MaterialEntity record, @Param("example") MaterialEntityQuery example);

    int updateByExample(@Param("record") MaterialEntity record, @Param("example") MaterialEntityQuery example);

    int updateByPrimaryKeySelective(MaterialEntity record);

    int updateByPrimaryKey(MaterialEntity record);
}