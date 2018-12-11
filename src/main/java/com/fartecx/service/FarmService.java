package com.fartecx.service;

import com.fartecx.config.ExecutionResult;

public interface FarmService {
    ExecutionResult findFarmsByName(Integer limit, Integer offset, String keyword);

    ExecutionResult findOtherFarmsById(String id);
}
