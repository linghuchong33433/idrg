package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.AblePersonEntityDao;
import com.fartecx.dao.JobEntityDao;
import com.fartecx.pojo.AblePersonEntity;
import com.fartecx.pojo.AblePersonEntityQuery;
import com.fartecx.pojo.JobEntity;
import com.fartecx.pojo.JobEntityQuery;
import com.fartecx.service.AblePersonService;
import com.fartecx.service.JobService;
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
public class JobServiceImpl implements JobService {

    @Autowired
    private JobEntityDao jobEntityDao;

    @Override
    public JobEntity get(String id) {

        return jobEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        jobEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(JobEntity entity) {
        jobEntityDao.insert(entity);
    }

    @Override
    public void update(JobEntity entity) {
        jobEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize,String batch) {
        return null;
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String batch, String phase) {
        JobEntityQuery query = new JobEntityQuery();
        JobEntityQuery.Criteria criteria = query.createCriteria();
        if (null != batch && !"".equals(batch)) {
            criteria.andBatchEqualTo("%"+batch+"%");
        }else if (null != phase && !"".equals(phase)){
            criteria.andPhaseEqualTo(Integer.parseInt(phase));
        }
        PageHelper.startPage(pageNum,pageSize);
        Page page = (Page) jobEntityDao.selectByExample(query);
        ExecutionResult result = new ExecutionResult();
        result.setCurrent(page.getPageNum());
        result.setPages(page.getPages());
        result.setTotal(page.getResult().size());
        result.setRecords(page.getResult());
        return result;
    }
}
