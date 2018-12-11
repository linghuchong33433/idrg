package com.fartecx.dao;

import com.fartecx.pojo.UserRoleEntityKey;
import com.fartecx.pojo.UserRoleEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleEntityDao {
    int countByExample(UserRoleEntityQuery example);

    int deleteByExample(UserRoleEntityQuery example);

    int deleteByPrimaryKey(UserRoleEntityKey key);

    int insert(UserRoleEntityKey record);

    int insertSelective(UserRoleEntityKey record);

    List<UserRoleEntityKey> selectByExample(UserRoleEntityQuery example);

    int updateByExampleSelective(@Param("record") UserRoleEntityKey record, @Param("example") UserRoleEntityQuery example);

    int updateByExample(@Param("record") UserRoleEntityKey record, @Param("example") UserRoleEntityQuery example);
}