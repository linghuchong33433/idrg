package com.fartecx.dao;

import com.fartecx.pojo.PermissionEntity;
import com.fartecx.pojo.PermissionEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionEntityDao {
    int countByExample(PermissionEntityQuery example);

    int deleteByExample(PermissionEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(PermissionEntity record);

    int insertSelective(PermissionEntity record);

    List<PermissionEntity> selectByExample(PermissionEntityQuery example);

    PermissionEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PermissionEntity record, @Param("example") PermissionEntityQuery example);

    int updateByExample(@Param("record") PermissionEntity record, @Param("example") PermissionEntityQuery example);

    int updateByPrimaryKeySelective(PermissionEntity record);

    int updateByPrimaryKey(PermissionEntity record);
}