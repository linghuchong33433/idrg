package com.fartecx.dao;

import com.fartecx.pojo.UserEntity;
import com.fartecx.pojo.UserEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEntityDao {
    int countByExample(UserEntityQuery example);

    int deleteByExample(UserEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    List<UserEntity> selectByExample(UserEntityQuery example);

    UserEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserEntity record, @Param("example") UserEntityQuery example);

    int updateByExample(@Param("record") UserEntity record, @Param("example") UserEntityQuery example);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
}