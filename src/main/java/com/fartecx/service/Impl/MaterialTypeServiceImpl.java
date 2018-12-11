package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.MaterialTypeEntityDao;
import com.fartecx.pojo.*;
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
public class MaterialTypeServiceImpl implements MaterialTypeService {

    @Autowired
    private MaterialTypeEntityDao materialTypeEntityDao;

    @Override
    public MaterialTypeEntity get(String id) {

        return materialTypeEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        materialTypeEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(MaterialTypeEntity entity) {
        materialTypeEntityDao.insert(entity);
    }

    @Override
    public void update(MaterialTypeEntity entity) {
        materialTypeEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String keyword) {
        MaterialTypeEntityQuery query = new MaterialTypeEntityQuery();
        MaterialTypeEntityQuery.Criteria criteria = query.createCriteria();
        if(keyword!=null&&!"".equals(keyword)){
            criteria.andNameLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        Page page =(Page) materialTypeEntityDao.selectByExample(query);

        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setPages(page.getPages());
        executionResult.setTotal((int)page.getTotal());
        executionResult.setCurrent(pageNum);
        executionResult.setRecords(page.getResult());
        return executionResult;
    }
}
