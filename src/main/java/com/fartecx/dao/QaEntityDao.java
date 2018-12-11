package com.fartecx.dao;

import com.fartecx.pojo.QaEntity;
import com.fartecx.pojo.QaEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaEntityDao {
    int countByExample(QaEntityQuery example);

    int deleteByExample(QaEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(QaEntity record);

    int insertSelective(QaEntity record);

    List<QaEntity> selectByExample(QaEntityQuery example);

    QaEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") QaEntity record, @Param("example") QaEntityQuery example);

    int updateByExample(@Param("record") QaEntity record, @Param("example") QaEntityQuery example);

    int updateByPrimaryKeySelective(QaEntity record);

    int updateByPrimaryKey(QaEntity record);
}