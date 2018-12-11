package com.fartecx.service;

import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.DeviceEntity;

public interface DevsService {

    void save(DeviceEntity entity);

    ExecutionResult findDevsByFarmId(Integer pageSize, Integer pageNum, String farmId);

    void update(DeviceEntity entity);

    void delete(String id);
}
