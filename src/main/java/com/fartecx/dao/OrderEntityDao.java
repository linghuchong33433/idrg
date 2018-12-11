package com.fartecx.dao;

import com.fartecx.pojo.OrderEntity;
import com.fartecx.pojo.OrderEntityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderEntityDao {
    int countByExample(OrderEntityQuery example);

    int deleteByExample(OrderEntityQuery example);

    int deleteByPrimaryKey(String id);

    int insert(OrderEntity record);

    int insertSelective(OrderEntity record);

    List<OrderEntity> selectByExample(OrderEntityQuery example);

    OrderEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderEntity record, @Param("example") OrderEntityQuery example);

    int updateByExample(@Param("record") OrderEntity record, @Param("example") OrderEntityQuery example);

    int updateByPrimaryKeySelective(OrderEntity record);

    int updateByPrimaryKey(OrderEntity record);
}