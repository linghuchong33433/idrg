package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.DeviceDataEntityDao;
import com.fartecx.pojo.DeviceDataEntity;
import com.fartecx.pojo.DeviceDataEntityQuery;
import com.fartecx.service.DdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class DdsServiceImpl implements DdsService {
    @Autowired
    private DeviceDataEntityDao deviceDataEntityDao;

    @Override
    public ExecutionResult findDeviceData(String device, Date from, Date to, Double temp) {
        DeviceDataEntityQuery deviceDataEntityQuery = new DeviceDataEntityQuery();
        DeviceDataEntityQuery.Criteria criteria = deviceDataEntityQuery.createCriteria();
        criteria.andDeviceEqualTo(device);
        if (from != null && to != null) {
            criteria.andTBetween(from, to);
        }
        List<DeviceDataEntity> deviceDataEntities = deviceDataEntityDao.selectByExample(deviceDataEntityQuery);
        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setRecords(deviceDataEntities);
        return executionResult;


    }
}
