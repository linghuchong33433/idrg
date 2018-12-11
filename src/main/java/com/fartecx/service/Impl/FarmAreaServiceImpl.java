package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.BatchareasEntityDao;
import com.fartecx.dao.FarmAreaEntityDao;
import com.fartecx.dao.FarmEntityDao;
import com.fartecx.pojo.*;
import com.fartecx.service.FarmAreaService;
import com.fartecx.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class FarmAreaServiceImpl implements FarmAreaService {

    @Autowired
    private FarmAreaEntityDao farmAreaEntityDao;

    @Autowired
    private BatchareasEntityDao batchareasEntityDao;

    @Autowired
    private FarmEntityDao farmEntityDao;

    @Override
    public ExecutionResult findFarmAndFarmArea(Integer flag) {
        List<Map> list = new ArrayList<>();
        FarmEntityQuery farmEntityQuery = new FarmEntityQuery();
        FarmEntityQuery.Criteria criteria = farmEntityQuery.createCriteria();
        if(flag!=null){
            if(flag==0||flag==1){

                FarmEntityQuery.Criteria criteria1 = criteria.andFlagEqualTo(flag);

            }
        }
        List<FarmEntity> farmEntities = farmEntityDao.selectByExample(farmEntityQuery);
        if (farmEntities != null && farmEntities.size() != 0) {
            for (FarmEntity farmEntity : farmEntities) {
                Map map = new HashMap();
                FarmAreaEntityQuery farmAreaEntityQuery = new FarmAreaEntityQuery();
                FarmAreaEntityQuery.Criteria criteria1 = farmAreaEntityQuery.createCriteria();
                criteria1.andFarmEqualTo(farmEntity.getId());
                List<FarmAreaEntity> farmAreaEntities = farmAreaEntityDao.selectByExample(farmAreaEntityQuery);
                map.put("farm", farmEntity);
                map.put("areas", farmAreaEntities);
                list.add(map);
            }
        }

        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setRecords(list);
        return executionResult;
    }

    @Override
    public void addFarmArea(FarmAreaEntity oldFarmAreaEntity) {
        FarmAreaEntity newFarmAreaEntity = new FarmAreaEntity();
        newFarmAreaEntity.setParent("1");
        if (oldFarmAreaEntity.getParent() != null && !"".equals(oldFarmAreaEntity.getParent())) {
            newFarmAreaEntity.setParent(oldFarmAreaEntity.getParent());
        }
        newFarmAreaEntity.setName(oldFarmAreaEntity.getName());
        newFarmAreaEntity.setRegionname(oldFarmAreaEntity.getRegionname());
        newFarmAreaEntity.setColor(oldFarmAreaEntity.getColor());
        newFarmAreaEntity.setArea(oldFarmAreaEntity.getArea());
        newFarmAreaEntity.setdesc(oldFarmAreaEntity.getDesc());
        farmAreaEntityDao.insertSelective(newFarmAreaEntity);

    }

    @Override
    public void updateFarmArea(FarmAreaEntity newFarmAreaEntity, String id) {
        if (newFarmAreaEntity.getParent() == null && "".equals(newFarmAreaEntity.getParent())) {
            newFarmAreaEntity.setParent("1");
        }
        if (newFarmAreaEntity.getId() == null && "".equals(newFarmAreaEntity.getId())) {
            newFarmAreaEntity.setId(id);
        }
        farmAreaEntityDao.updateByPrimaryKeySelective(newFarmAreaEntity);

    }



    @Override
    public void deleteFarmArea(String pid) {
        BatchareasEntityQuery batchareasEntityQuery = new BatchareasEntityQuery();
        BatchareasEntityQuery.Criteria criteria1 = batchareasEntityQuery.createCriteria();
        criteria1.andBatchEqualTo(pid);
        List<BatchareasEntity> batchareasEntities = batchareasEntityDao.selectByExample(batchareasEntityQuery);
        FarmAreaEntityQuery farmAreaEntityQuery = new FarmAreaEntityQuery();
        FarmAreaEntityQuery.Criteria criteria = farmAreaEntityQuery.createCriteria();
        criteria.andParentEqualTo(pid);
        List<FarmAreaEntity> list = farmAreaEntityDao.selectByExample(farmAreaEntityQuery);
        if (list != null && list.size() != 0) {
            for (FarmAreaEntity farmAreaEntity : list) {
                String id = farmAreaEntity.getId();
                if (batchareasEntities != null&&batchareasEntities.size()!=0) {
                    FarmAreaEntity farmAreaEntity1 = new FarmAreaEntity();
                    farmAreaEntity1.setId(id);
                    farmAreaEntity1.setFlag(0);
                    farmAreaEntityDao.updateByPrimaryKeySelective(farmAreaEntity1);
                } else {
                    farmAreaEntityDao.deleteByPrimaryKey(id);
                }
                deleteFarmArea(farmAreaEntity.getId());
            }
        }



    }


}
