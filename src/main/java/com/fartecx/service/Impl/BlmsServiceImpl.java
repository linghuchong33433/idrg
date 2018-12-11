package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.BatchEntityDao;
import com.fartecx.dao.BatchLogEntityDao;
import com.fartecx.dao.BatchMaterialEntityDao;
import com.fartecx.dao.MaterialEntityDao;
import com.fartecx.pojo.*;
import com.fartecx.service.BlmsService;
import com.fartecx.service.BlsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Service
public class BlmsServiceImpl implements BlmsService {

    @Autowired
    private MaterialEntityDao materialEntityDao;

    @Autowired
    private BatchLogEntityDao batchLogEntityDao;

    @Autowired
    private BatchEntityDao batchEntityDao;

    @Autowired
    private BatchMaterialEntityDao batchMaterialEntityDao;


    @Override
    public void saveBatchLogAndMaterial(BatchLogEntity batchLogEntity, String batchLog, String material, Double use) {
        batchLogEntity.setId(batchLog);
        batchLogEntityDao.insertSelective(batchLogEntity);
        MaterialEntity materialEntity = materialEntityDao.selectByPrimaryKey(material);
        use+= materialEntity.getUsed();
        materialEntity.setUsed(use);
        materialEntityDao.updateByPrimaryKeySelective(materialEntity);

    }

    @Override
    public void DeleteBatchAndBatchMaterial(String id) {
        //查询关联的batchlog表
        BatchLogEntityQuery batchLogEntityQuery = new BatchLogEntityQuery();
        BatchLogEntityQuery.Criteria criteria = batchLogEntityQuery.createCriteria();
        criteria.andBatchEqualTo(id);
        List<BatchLogEntity> batchLogEntities = batchLogEntityDao.selectByExample(batchLogEntityQuery);
        //查询关联的batchmaterial表
        if (batchLogEntities != null && batchLogEntities.size() != 0) {
            for (BatchLogEntity batchLogEntity : batchLogEntities) {
                BatchMaterialEntityQuery batchMaterialEntityQuery = new BatchMaterialEntityQuery();
                BatchMaterialEntityQuery.Criteria criteria1 = batchMaterialEntityQuery.createCriteria();
                criteria1.andBatchlogEqualTo(batchLogEntity.getId());
                List<BatchMaterialEntity> batchMaterialEntities = batchMaterialEntityDao.selectByExample(batchMaterialEntityQuery);
                if (batchMaterialEntities != null && batchMaterialEntities.size() != 0) {
                    for (BatchMaterialEntity batchMaterialEntity : batchMaterialEntities) {
                        batchMaterialEntityDao.deleteByPrimaryKey(batchMaterialEntity.getId());
                    }
                }
                batchLogEntityDao.deleteByPrimaryKey(batchLogEntity.getId());
            }
        }
        batchEntityDao.deleteByPrimaryKey(id);
    }
}
