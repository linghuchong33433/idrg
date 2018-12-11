package com.fartecx.dao;

import com.fartecx.pojo.RrolePermissionEntityKey;
import com.fartecx.pojo.RrolePermissionEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RrolePermissionEntityDao {
    int countByExample(RrolePermissionEntityQuery example);

    int deleteByExample(RrolePermissionEntityQuery example);

    int deleteByPrimaryKey(RrolePermissionEntityKey key);

    int insert(RrolePermissionEntityKey record);

    int insertSelective(RrolePermissionEntityKey record);

    List<RrolePermissionEntityKey> selectByExample(RrolePermissionEntityQuery example);

    int updateByExampleSelective(@Param("record") RrolePermissionEntityKey record, @Param("example") RrolePermissionEntityQuery example);

    int updateByExample(@Param("record") RrolePermissionEntityKey record, @Param("example") RrolePermissionEntityQuery example);
}