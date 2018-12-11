package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.AblePersonEntityDao;
import com.fartecx.dao.AnnounceEntityDao;
import com.fartecx.pojo.AblePersonEntity;
import com.fartecx.pojo.AblePersonEntityQuery;
import com.fartecx.pojo.AnnounceEntity;
import com.fartecx.pojo.AnnounceEntityQuery;
import com.fartecx.service.AnnounceService;
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
public class AnnounceServiceImpl implements AnnounceService {

    @Autowired
    private AnnounceEntityDao announceEntityDao;

    @Override
    public AnnounceEntity get(String id) {

        return announceEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        announceEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(AnnounceEntity entity) {
        announceEntityDao.insert(entity);
    }

    @Override
    public void update(AnnounceEntity entity) {

        announceEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize,String keyword) {
        AnnounceEntityQuery query = new AnnounceEntityQuery();
        AnnounceEntityQuery.Criteria criteria = query.createCriteria();
        PageHelper.startPage(pageNum,pageSize," pubDate DESC");
        Page page = (Page) announceEntityDao.selectByExample(null);
        ExecutionResult result = new ExecutionResult();
        result.setCurrent(page.getPageNum());
        result.setPages(page.getPages());
        result.setTotal(page.getResult().size());
        result.setRecords(page.getResult());
        return result;
    }

    @Override
    public ExecutionResult findAnnouncementById(String id) {
        AnnounceEntity announceEntity = announceEntityDao.selectByPrimaryKey(id);
        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setRecords(announceEntity);
        return executionResult;
    }
}
