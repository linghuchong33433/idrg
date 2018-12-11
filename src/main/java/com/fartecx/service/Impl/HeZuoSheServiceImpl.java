package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.AblePersonEntityDao;
import com.fartecx.dao.HeZuoSheEntityDao;
import com.fartecx.pojo.AblePersonEntity;
import com.fartecx.pojo.AblePersonEntityQuery;
import com.fartecx.pojo.HeZuoSheEntity;
import com.fartecx.pojo.HeZuoSheEntityQuery;
import com.fartecx.service.HeZuoSheService;
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
public class HeZuoSheServiceImpl implements HeZuoSheService {

    @Autowired
    private HeZuoSheEntityDao heZuoSheEntityDao;

    @Override
    public HeZuoSheEntity get(String id) {

        return heZuoSheEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        heZuoSheEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(HeZuoSheEntity entity) {
        heZuoSheEntityDao.insert(entity);
    }

    @Override
    public void update(HeZuoSheEntity entity) {
        heZuoSheEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize,String keyword) {
        PageHelper.startPage(pageNum,pageSize);
        Page page = (Page) heZuoSheEntityDao.selectByExample(null);
        ExecutionResult result = new ExecutionResult();
        result.setCurrent(page.getPageNum());
        result.setPages(page.getPages());
        result.setTotal(page.getResult().size());
        result.setRecords(page.getResult());
        return result;
    }
}
