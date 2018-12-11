package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.AblePersonEntityDao;
import com.fartecx.dao.JobStaffEntityDao;
import com.fartecx.pojo.*;
import com.fartecx.service.AblePersonService;
import com.fartecx.service.JobStaffService;
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
public class JobStaffServiceImpl implements JobStaffService {

    @Autowired
    private JobStaffEntityDao jobStaffEntityDao;

    @Override
    public JobStaffEntity get(String id) {
        return null;
    }

    @Override
    public void delete(String id) {
        JobStaffEntityQuery query = new JobStaffEntityQuery();
        JobStaffEntityQuery.Criteria criteria = query.createCriteria();
        criteria.andJobEqualTo(id);
        jobStaffEntityDao.deleteByExample(query);
    }

    @Override
    public void save(JobStaffEntity entity) {
        jobStaffEntityDao.insert(entity);
    }

    @Override
    public void update(JobStaffEntity entity) {

    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String keyword) {
        PageHelper.startPage(pageNum,pageSize);
        JobStaffEntityQuery query = new JobStaffEntityQuery();
        JobStaffEntityQuery.Criteria criteria = query.createCriteria();
        criteria.andJobEqualTo(keyword);
        Page page = (Page) jobStaffEntityDao.selectByExample(query);
        ExecutionResult result = new ExecutionResult();
        result.setCurrent(page.getPageNum());
        result.setPages(page.getPages());
        result.setTotal(page.getResult().size());
        result.setRecords(page.getResult());
        return result;
    }
}
