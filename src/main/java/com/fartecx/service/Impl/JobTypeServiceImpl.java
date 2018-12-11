package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.AblePersonEntityDao;
import com.fartecx.dao.JobEntityDao;
import com.fartecx.dao.JobTypeEntityDao;
import com.fartecx.pojo.*;

import com.fartecx.service.JobTypeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/24
 * Time:20:14
 * ========================
 */
@Service
@Transactional
public class JobTypeServiceImpl implements JobTypeService {

    @Autowired
    private JobTypeEntityDao jobTypeEntityDao;

    @Override
    public JobTypeEntity get(String id) {
        return jobTypeEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        jobTypeEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(JobTypeEntity entity) {
        jobTypeEntityDao.insert(entity);
    }

    @Override
    public void update(JobTypeEntity entity) {
        jobTypeEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize,String keyword) {
        JobTypeEntityQuery query = new JobTypeEntityQuery();
        if (null != keyword && !"".equals(keyword)) {
            JobTypeEntityQuery.Criteria criteria = query.createCriteria();
            criteria.andNameLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        Page page = (Page) jobTypeEntityDao.selectByExample(query);
        ExecutionResult result = new ExecutionResult();
        result.setCurrent(page.getPageNum());
        result.setPages(page.getPages());
        result.setTotal(page.getResult().size());
        result.setRecords(page.getResult());
        return result;
    }
}
