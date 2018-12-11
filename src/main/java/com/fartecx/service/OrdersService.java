package com.fartecx.service;

import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.OrderEntity;

public interface OrdersService {
    ExecutionResult FindOrders(Integer pageNum, Integer pageSize, String batch);

    void saveOrders(OrderEntity orderEntity);

    void updateOrder(String id, OrderEntity orderEntity);

    void deleteOrder(String id);
}
