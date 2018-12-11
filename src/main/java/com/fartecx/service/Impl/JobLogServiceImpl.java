package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.JobLogEntityDao;
import com.fartecx.pojo.JobLogEntity;
import com.fartecx.service.JobLogService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/26
 * Time:13:37
 * ========================
 */
@Transactional
@Service
public class JobLogServiceImpl implements JobLogService {

    @Autowired
    private JobLogEntityDao jobLogEntityDao;

    @Override
    public JobLogEntity get(String id) {
        return jobLogEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        jobLogEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(JobLogEntity entity) {
        jobLogEntityDao.insert(entity);
    }

    @Override
    public void update(JobLogEntity entity) {
        jobLogEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String keyword) {
        PageHelper.startPage(pageNum,pageSize);
        Page page = (Page) jobLogEntityDao.selectByExample(null);
        ExecutionResult result = new ExecutionResult();
        result.setCurrent(page.getPageNum());
        result.setPages(page.getPages());
        result.setTotal(page.getResult().size());
        result.setRecords(page.getResult());
        return result;
    }
}
