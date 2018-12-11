package com.fartecx.dao;

import com.fartecx.pojo.SessionsEntity;
import com.fartecx.pojo.SessionsEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionsEntityDao {
    int countByExample(SessionsEntityQuery example);

    int deleteByExample(SessionsEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(SessionsEntity record);

    int insertSelective(SessionsEntity record);

    List<SessionsEntity> selectByExampleWithBLOBs(SessionsEntityQuery example);

    List<SessionsEntity> selectByExample(SessionsEntityQuery example);

    SessionsEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SessionsEntity record, @Param("example") SessionsEntityQuery example);

    int updateByExampleWithBLOBs(@Param("record") SessionsEntity record, @Param("example") SessionsEntityQuery example);

    int updateByExample(@Param("record") SessionsEntity record, @Param("example") SessionsEntityQuery example);

    int updateByPrimaryKeySelective(SessionsEntity record);

    int updateByPrimaryKeyWithBLOBs(SessionsEntity record);
}