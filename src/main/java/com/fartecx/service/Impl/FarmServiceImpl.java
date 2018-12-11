package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.FarmEntityDao;
import com.fartecx.pojo.FarmEntity;
import com.fartecx.pojo.FarmEntityQuery;
import com.fartecx.service.FarmService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Service
public class FarmServiceImpl implements FarmService {

    @Autowired
    private FarmEntityDao farmEntityDao;

    @Override
    public ExecutionResult findFarmsByName(Integer pageSize, Integer pageNum, String keyword) {

        FarmEntityQuery farmEntityQuery = new FarmEntityQuery();
        FarmEntityQuery.Criteria criteria = farmEntityQuery.createCriteria();
        if(keyword!=null&&!"".equals(keyword)){
            criteria.andNameLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        Page<FarmEntity> page =(Page<FarmEntity>) farmEntityDao.selectByExample(farmEntityQuery);

        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setPages(page.getPages());
        executionResult.setTotal((int)page.getTotal());
        executionResult.setCurrent(pageNum);
        executionResult.setRecords(page.getResult());

        return executionResult;

    }

    @Override
    public ExecutionResult findOtherFarmsById(String id) {
        FarmEntity farmEntity = farmEntityDao.selectByPrimaryKey(id);
        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setRecords(farmEntity);
        return executionResult;
    }
}
