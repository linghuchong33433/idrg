package com.fartecx.dao;

import com.fartecx.pojo.WxUserEntity;
import com.fartecx.pojo.WxUserEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxUserEntityDao {
    int countByExample(WxUserEntityQuery example);

    int deleteByExample(WxUserEntityQuery example);

    int deleteByPrimaryKey(String uid);

    int insert(WxUserEntity record);

    int insertSelective(WxUserEntity record);

    List<WxUserEntity> selectByExample(WxUserEntityQuery example);

    WxUserEntity selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") WxUserEntity record, @Param("example") WxUserEntityQuery example);

    int updateByExample(@Param("record") WxUserEntity record, @Param("example") WxUserEntityQuery example);

    int updateByPrimaryKeySelective(WxUserEntity record);

    int updateByPrimaryKey(WxUserEntity record);
}