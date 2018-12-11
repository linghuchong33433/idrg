package com.fartecx.service;

import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.BatchEntity;
import com.fartecx.pojo.BatchLogEntity;

public interface BlsService {
    ExecutionResult findBatchLogById(String batch);

    void saveBatchLog(BatchLogEntity batchLogEntity);

    void saveBatch(BatchEntity batchEntity);

    void deleteBatchLog(String id);
}
