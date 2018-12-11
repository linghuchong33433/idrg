package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.BatchMaterialEntityDao;
import com.fartecx.dao.BatchPhaseEntityDao;
import com.fartecx.dao.MaterialTypeEntityDao;
import com.fartecx.pojo.BatchPhaseEntity;
import com.fartecx.pojo.BatchPhaseEntityQuery;
import com.fartecx.pojo.MaterialTypeEntity;
import com.fartecx.pojo.MaterialTypeEntityQuery;
import com.fartecx.service.BatchPhaseService;
import com.fartecx.service.MaterialTypeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:08:36
 * ========================
 */
@Transactional
@Service
public class BatchPhaseServiceImpl implements BatchPhaseService {

    @Autowired
    private BatchPhaseEntityDao batchPhaseEntityDao;

    @Override
    public BatchPhaseEntity get(String id) {
        return batchPhaseEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        batchPhaseEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(BatchPhaseEntity entity) {
        batchPhaseEntityDao.insert(entity);
    }

    @Override
    public void update(BatchPhaseEntity entity) {
        batchPhaseEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String keyword) {
        PageHelper.startPage(pageNum,pageSize);
        BatchPhaseEntityQuery query = new BatchPhaseEntityQuery();
        BatchPhaseEntityQuery.Criteria criteria = query.createCriteria();
        if(keyword!=null && !"".equals(keyword)){
            criteria.andNameLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        Page page =(Page) batchPhaseEntityDao.selectByExample(query);

        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setPages(page.getPages());
        executionResult.setTotal((int)page.getTotal());
        executionResult.setCurrent(pageNum);
        executionResult.setRecords(page.getResult());
        return executionResult;
    }

    @Override
    public ExecutionResult findAllBatchPhase() {
        List<BatchPhaseEntity> batchPhaseEntities = batchPhaseEntityDao.selectByExample(null);
        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setRecords(batchPhaseEntities);
        return executionResult;
    }
}
