package com.fartecx.dao;

import com.fartecx.pojo.MaterialTypeEntity;
import com.fartecx.pojo.MaterialTypeEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialTypeEntityDao {
    int countByExample(MaterialTypeEntityQuery example);

    int deleteByExample(MaterialTypeEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(MaterialTypeEntity record);

    int insertSelective(MaterialTypeEntity record);

    List<MaterialTypeEntity> selectByExample(MaterialTypeEntityQuery example);

    MaterialTypeEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MaterialTypeEntity record, @Param("example") MaterialTypeEntityQuery example);

    int updateByExample(@Param("record") MaterialTypeEntity record, @Param("example") MaterialTypeEntityQuery example);

    int updateByPrimaryKeySelective(MaterialTypeEntity record);

    int updateByPrimaryKey(MaterialTypeEntity record);
}