package com.fartecx.service;

import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.BatchEntity;

public interface BatchsService {
    ExecutionResult findBatchByfarmAndYear(Integer pageSize, Integer pageNum, String keyword, String farm, Integer year);

    void saveBatch(BatchEntity batchEntity);

    void updateBatch(BatchEntity batchEntity, String id);

    void deleteBatch(String id) throws Exception;

    ExecutionResult findAllBatchs(String id);
}
