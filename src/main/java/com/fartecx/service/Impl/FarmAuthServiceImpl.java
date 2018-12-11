package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.FarmAuthEntityDao;
import com.fartecx.dao.MaterialTypeEntityDao;
import com.fartecx.pojo.FarmAuthEntity;
import com.fartecx.pojo.FarmAuthEntityQuery;
import com.fartecx.pojo.MaterialTypeEntity;
import com.fartecx.pojo.MaterialTypeEntityQuery;
import com.fartecx.service.FarmAuthService;
import com.fartecx.service.MaterialTypeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
public class FarmAuthServiceImpl implements FarmAuthService {

    @Autowired
    private FarmAuthEntityDao farmAuthEntityDao;

    @Override
    public FarmAuthEntity get(String id) {

        return farmAuthEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        farmAuthEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(FarmAuthEntity entity) {
        farmAuthEntityDao.insert(entity);
    }

    @Override
    public void update(FarmAuthEntity entity) {
        farmAuthEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String keyword) {
        PageHelper.startPage(pageNum,pageSize);
        Page page =(Page) farmAuthEntityDao.selectByExample(null);

        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setPages(page.getPages());
        executionResult.setTotal((int)page.getTotal());
        executionResult.setCurrent(pageNum);
        executionResult.setRecords(page.getResult());
        return executionResult;
    }
}
