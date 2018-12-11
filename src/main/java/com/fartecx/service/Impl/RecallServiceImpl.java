package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.RecallEntityDao;
import com.fartecx.pojo.FarmEntity;
import com.fartecx.pojo.FarmEntityQuery;
import com.fartecx.pojo.RecallEntity;
import com.fartecx.pojo.RecallEntityQuery;
import com.fartecx.service.RecallService;
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
 * Date:2018/11/24
 * Time:23:35
 * ========================
 */
@Transactional
@Service
public class RecallServiceImpl implements RecallService {

    @Autowired
    private RecallEntityDao recallEntityDao;

    @Override
    public RecallEntity get(String id) {

        return recallEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        recallEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(RecallEntity entity) {
        recallEntityDao.insert(entity);
    }

    @Override
    public void update(RecallEntity entity) {
        recallEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String keyword) {
        PageHelper.startPage(pageNum,pageSize);
        RecallEntityQuery recallEntityQuery = new RecallEntityQuery();
        RecallEntityQuery.Criteria criteria = recallEntityQuery.createCriteria();
        if(keyword!=null&&!"".equals(keyword)){
            criteria.andDetailLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageNum,pageSize," pubDate DESC");
        Page<RecallEntity> page =(Page<RecallEntity>) recallEntityDao.selectByExample(recallEntityQuery);

        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setPages(page.getPages());
        executionResult.setTotal((int)page.getTotal());
        executionResult.setCurrent(pageNum);
        executionResult.setRecords(page.getResult());

        return executionResult;
    }

    @Override
    public ExecutionResult findRecallById(String id) {
        RecallEntity recallEntity = recallEntityDao.selectByPrimaryKey(id);
        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setRecords(recallEntity);
        return executionResult;
    }
}
