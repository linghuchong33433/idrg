package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.BatchPhaseEntityDao;
import com.fartecx.pojo.BatchLogEntity;
import com.fartecx.pojo.BatchPhaseEntity;
import com.fartecx.service.BpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BpsServiceImpl implements BpsService {

    @Autowired
    private BatchPhaseEntityDao batchPhaseEntityDao;

    @Override
    public ExecutionResult findbatchPhase() {
        List<BatchPhaseEntity> batchPhaseEntities = batchPhaseEntityDao.selectByExample(null);
        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setRecords(batchPhaseEntities);
        return executionResult;
    }

    @Override
    public BatchPhaseEntity get(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void save(BatchPhaseEntity entity) {

    }

    @Override
    public void update(BatchPhaseEntity entity) {

    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String keyword) {
        return null;
    }
}
