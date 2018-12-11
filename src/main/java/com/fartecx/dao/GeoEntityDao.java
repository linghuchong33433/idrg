package com.fartecx.dao;

import com.fartecx.pojo.GeoEntity;
import com.fartecx.pojo.GeoEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeoEntityDao {
    int countByExample(GeoEntityQuery example);

    int deleteByExample(GeoEntityQuery example);

    int deleteByPrimaryKey(String code);

    int insert(GeoEntity record);

    int insertSelective(GeoEntity record);

    List<GeoEntity> selectByExample(GeoEntityQuery example);

    GeoEntity selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") GeoEntity record, @Param("example") GeoEntityQuery example);

    int updateByExample(@Param("record") GeoEntity record, @Param("example") GeoEntityQuery example);

    int updateByPrimaryKeySelective(GeoEntity record);

    int updateByPrimaryKey(GeoEntity record);
}