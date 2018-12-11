package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.DeviceTypeEntityDao;
import com.fartecx.pojo.DeviceTypeEntity;
import com.fartecx.pojo.DeviceTypeEntityQuery;
import com.fartecx.service.DtsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class DtsServiceImpl implements DtsService {

    @Autowired
    private DeviceTypeEntityDao deviceTypeEntityDao;

    @Override
    public ExecutionResult findAllDeviceType() {
        DeviceTypeEntityQuery deviceTypeEntityQuery = new DeviceTypeEntityQuery();
        deviceTypeEntityQuery.setOrderByClause(" ORDER BY id");
        List<DeviceTypeEntity> deviceTypeEntities = deviceTypeEntityDao.selectByExample(deviceTypeEntityQuery);


        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setRecords(deviceTypeEntities);
        return executionResult;

    }
}
