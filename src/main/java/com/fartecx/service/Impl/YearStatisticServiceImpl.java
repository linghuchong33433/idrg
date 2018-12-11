package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.AblePersonEntityDao;
import com.fartecx.dao.YearStatisticEntityDao;
import com.fartecx.pojo.*;
import com.fartecx.service.AblePersonService;
import com.fartecx.service.YearStatisticService;
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
public class YearStatisticServiceImpl implements YearStatisticService {

    @Autowired
    private YearStatisticEntityDao yearStatisticEntityDao;

    @Override
    public YearStatisticEntity get(String id) {

        return yearStatisticEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        YearStatisticEntityQuery query = new YearStatisticEntityQuery();
        YearStatisticEntityQuery.Criteria criteria = query.createCriteria();
        criteria.andYearEqualTo(Integer.parseInt(id));
        yearStatisticEntityDao.deleteByExample(query);
    }

    @Override
    public void save(YearStatisticEntity entity) {
        yearStatisticEntityDao.insert(entity);
    }

    @Override
    public void update(YearStatisticEntity entity) {
        yearStatisticEntityDao.updateByPrimaryKey(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize,String keyword) {
        PageHelper.startPage(pageNum,pageSize);
        Page page = (Page) yearStatisticEntityDao.selectByExample(null);
        ExecutionResult result = new ExecutionResult();
        result.setCurrent(page.getPageNum());
        result.setPages(page.getPages());
        result.setTotal(page.getResult().size());
        result.setRecords(page.getResult());
        return result;
    }
}
