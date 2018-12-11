package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.BatchEntityDao;
import com.fartecx.dao.BatchLogEntityDao;
import com.fartecx.dao.BatchMaterialEntityDao;
import com.fartecx.pojo.*;
import com.fartecx.service.BlsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BlsServiceImpl implements BlsService {

    @Autowired
    private BatchLogEntityDao batchLogEntityDao;

    @Autowired
    private BatchEntityDao batchEntityDao;

    @Autowired
    private BatchMaterialEntityDao batchMaterialEntityDao;

    @Override
    public ExecutionResult findBatchLogById(String batch) {
        BatchLogEntity batchLogEntity = batchLogEntityDao.selectByPrimaryKey(batch);
        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setRecords(batchLogEntity);
        return executionResult;
    }

    @Override
    public void saveBatchLog(BatchLogEntity batchLogEntity) {
        batchLogEntityDao.insert(batchLogEntity);
    }

    @Override
    public void saveBatch(BatchEntity batchEntity) {
        List<BatchEntity> batchEntities = batchEntityDao.selectByExample(null);
    }

    @Override
    public void deleteBatchLog(String id) {

        BatchMaterialEntityQuery batchMaterialEntityQuery = new BatchMaterialEntityQuery();
        BatchMaterialEntityQuery.Criteria criteria1 = batchMaterialEntityQuery.createCriteria();
        criteria1.andBatchlogEqualTo(id);
        List<BatchMaterialEntity> batchMaterialEntities = batchMaterialEntityDao.selectByExample(batchMaterialEntityQuery);
        if (batchMaterialEntities != null && batchMaterialEntities.size() != 0) {
            for (BatchMaterialEntity batchMaterialEntity : batchMaterialEntities) {
                batchMaterialEntityDao.deleteByPrimaryKey(batchMaterialEntity.getId());
            }
        }
        batchLogEntityDao.deleteByPrimaryKey(id);
    }

}
