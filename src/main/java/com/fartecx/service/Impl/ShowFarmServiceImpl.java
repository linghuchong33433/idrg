package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.ExpertEntityDao;
import com.fartecx.dao.ShowFarmEntityDao;
import com.fartecx.pojo.ExpertEntity;
import com.fartecx.pojo.ExpertEntityQuery;
import com.fartecx.pojo.ShowFarmEntity;
import com.fartecx.pojo.ShowFarmEntityQuery;
import com.fartecx.service.ExpertService;
import com.fartecx.service.ShowFarmService;
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
 * Time:23:11
 * ========================
 */
@Service
@Transactional
public class ShowFarmServiceImpl implements ShowFarmService {

    @Autowired
    private ShowFarmEntityDao showFarmEntityDao;

    @Override
    public ShowFarmEntity get(String id) {

        return showFarmEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        showFarmEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(ShowFarmEntity entity) {
        showFarmEntityDao.insert(entity);
    }

    @Override
    public void update(ShowFarmEntity entity) {
        showFarmEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String keyword) {
        ShowFarmEntityQuery query = new ShowFarmEntityQuery();
        ShowFarmEntityQuery.Criteria criteria = query.createCriteria();
        if (null != keyword && !"".equals(keyword)) {
            criteria.andFarmLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageNum,pageSize," pubDate DESC");
        Page page = (Page) showFarmEntityDao.selectByExample(query);
        ExecutionResult result = new ExecutionResult();
        result.setCurrent(page.getPageNum());
        result.setPages(page.getPages());
        result.setTotal(page.getResult().size());
        result.setRecords(page.getResult());
        return result;
    }

    @Override
    public ExecutionResult findShowById(String id) {
        ShowFarmEntity showFarmEntity = showFarmEntityDao.selectByPrimaryKey(id);
        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setRecords(showFarmEntity);
        return executionResult;
    }
}
