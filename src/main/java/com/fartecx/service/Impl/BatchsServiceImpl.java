package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.*;
import com.fartecx.pojo.*;
import com.fartecx.service.BatchsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@Transactional
public class BatchsServiceImpl implements BatchsService {

    @Autowired
    private BatchEntityDao batchEntityDao;

    @Autowired
    private JobEntityDao jobEntityDao;

    @Autowired
    private BatchLogEntityDao batchLogEntityDao;

    @Autowired
    private BatchMaterialEntityDao batchMaterialEntityDao;

    @Autowired
    private MaterialEntityDao materialEntityDao;

    @Autowired
    private FarmEntityDao farmEntityDao;

    @Override
    public ExecutionResult findBatchByfarmAndYear(Integer pageSize, Integer pageNum, String keyword, String farm, Integer year) {
        BatchEntityQuery batchEntityQuery = new BatchEntityQuery();
        BatchEntityQuery.Criteria criteria = batchEntityQuery.createCriteria();
        if (keyword != null && !"".equals(keyword)) {
            criteria.andIdLike("%" + keyword + "%");
        }
        PageHelper.startPage(pageNum, pageSize);
        if (farm != null && !"".equals(farm)) {
            criteria.andFarmLike("%" + farm + "%");
        }
        if (year != null ) {
            criteria.andYearEqualTo(year);
        }
        PageHelper.orderBy("farm");
        PageHelper.orderBy("year desc");
        PageHelper.orderBy("code");
        Page<BatchEntity> page =(Page<BatchEntity>) batchEntityDao.selectByExample(batchEntityQuery);


        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setPages(page.getPages());
        executionResult.setTotal((int)page.getTotal());
        executionResult.setCurrent(pageNum);
        executionResult.setRecords(page.getResult());

        return executionResult;
    }

    @Override
    public void saveBatch(BatchEntity batchEntity) {
        batchEntityDao.insertSelective(batchEntity);
    }

    @Override
    public void updateBatch(BatchEntity batchEntity, String id) {
        batchEntityDao.updateByPrimaryKeySelective(batchEntity);
    }

    @Override
    public void deleteBatch(String id) throws Exception {
        JobEntityQuery jobEntityQuery = new JobEntityQuery();
        JobEntityQuery.Criteria criteria = jobEntityQuery.createCriteria();
        criteria.andBatchEqualTo(id);
        List<JobEntity> jobEntities = jobEntityDao.selectByExample(jobEntityQuery);
        if (jobEntities != null && jobEntities.size() != 0) {
            throw new Exception("关联表job中有信息，不能删除");
        } else {
            batchEntityDao.deleteByPrimaryKey(id);
        }
    }

    @Override
    public ExecutionResult findAllBatchs(String id) {
        //定义返回map
        Map map = new HashMap();
        //保存batch表中数据
        BatchEntity batchEntity = batchEntityDao.selectByPrimaryKey(id);
        map.put("",batchEntity.getId() );
        map.put("",batchEntity.getChanliang());
        //保存farm表中数据
        FarmEntity farmEntity = farmEntityDao.selectByPrimaryKey(batchEntity.getFarm());
        map.put("",farmEntity.getName());
        //定义list保存所有log表数据
        List<Map> list = new ArrayList<>();
        BatchLogEntityQuery batchLogEntityQuery = new BatchLogEntityQuery();
        BatchLogEntityQuery.Criteria criteria = batchLogEntityQuery.createCriteria();
        criteria.andBatchEqualTo(id);
        List<BatchLogEntity> batchLogEntities = batchLogEntityDao.selectByExample(batchLogEntityQuery);
        List<Map> logs = new ArrayList();
        //查询batchMaterial表
        for (BatchLogEntity batchLogEntity : batchLogEntities) {
            BatchMaterialEntityQuery batchMaterialEntityQuery = new BatchMaterialEntityQuery();
            BatchMaterialEntityQuery.Criteria criteria1 = batchMaterialEntityQuery.createCriteria();
            criteria1.andBatchlogEqualTo(batchLogEntity.getId());
            List<BatchMaterialEntity> batchMaterialEntities = batchMaterialEntityDao.selectByExample(batchMaterialEntityQuery);
            List materials = new ArrayList();
            for (BatchMaterialEntity batchMaterialEntity : batchMaterialEntities) {
                //添加materials
                materials.add(batchMaterialEntity.getId());
            }
            //添加logs
            Map logMap = new HashMap();
            logMap.put("phase",batchLogEntity.getPhase());
            logMap.put("operationDate",batchLogEntity.getOperationdate());
            logMap.put("desc",batchLogEntity.getDesc());
            logMap.put("materials",materials);
            logs.add(logMap);
        }

        map.put("logs",logs);

        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setRecords(map);
        return executionResult;
    }
}
