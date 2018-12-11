package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.OrderEntityDao;
import com.fartecx.pojo.OrderEntity;
import com.fartecx.pojo.OrderEntityQuery;
import com.fartecx.service.OrdersService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrderEntityDao orderEntityDao;


    @Override
    public ExecutionResult FindOrders(Integer pageNum, Integer pageSize, String batch) {
        OrderEntityQuery orderEntityQuery = new OrderEntityQuery();
        OrderEntityQuery.Criteria criteria = orderEntityQuery.createCriteria();
        if (batch != null && !"".equals(batch)) {
            criteria.andBatchLike("%" + batch + "%");
        }
        PageHelper.startPage(pageNum, pageSize, " batch");
        PageHelper.orderBy(" modifyTime");
        List<OrderEntity> orderEntities = orderEntityDao.selectByExample(orderEntityQuery);

        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setRecords(orderEntities);
        return executionResult;

    }

    @Override
    public void saveOrders(OrderEntity orderEntity) {
        orderEntityDao.insert(orderEntity);
    }

    @Override
    public void updateOrder(String id, OrderEntity orderEntity) {
        orderEntity.setId(id);
        orderEntityDao.updateByPrimaryKeySelective(orderEntity);
    }

    @Override
    public void deleteOrder(String id) {
        orderEntityDao.deleteByPrimaryKey(id);
    }
}
