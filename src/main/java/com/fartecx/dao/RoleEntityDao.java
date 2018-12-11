package com.fartecx.dao;

import com.fartecx.pojo.RoleEntity;
import com.fartecx.pojo.RoleEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleEntityDao {
    int countByExample(RoleEntityQuery example);

    int deleteByExample(RoleEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(RoleEntity record);

    int insertSelective(RoleEntity record);

    List<RoleEntity> selectByExample(RoleEntityQuery example);

    RoleEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RoleEntity record, @Param("example") RoleEntityQuery example);

    int updateByExample(@Param("record") RoleEntity record, @Param("example") RoleEntityQuery example);

    int updateByPrimaryKeySelective(RoleEntity record);

    int updateByPrimaryKey(RoleEntity record);
}