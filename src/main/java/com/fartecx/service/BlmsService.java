package com.fartecx.service;

import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.BatchLogEntity;

public interface BlmsService {
    void saveBatchLogAndMaterial(BatchLogEntity batchLogEntity, String batchLog, String material, Double use);

    void DeleteBatchAndBatchMaterial( String id);
}
