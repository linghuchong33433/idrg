package com.fartecx.service;

import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.FarmAreaEntity;

public interface FarmAreaService {
    ExecutionResult findFarmAndFarmArea(Integer flag);

    void addFarmArea(FarmAreaEntity farmAreaEntity);

    void updateFarmArea(FarmAreaEntity farmAreaEntity, String id);

    void deleteFarmArea(String id);
}
