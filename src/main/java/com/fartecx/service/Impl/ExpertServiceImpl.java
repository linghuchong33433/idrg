package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.ExpertEntityDao;
import com.fartecx.pojo.ExpertEntity;
import com.fartecx.pojo.ExpertEntityQuery;
import com.fartecx.service.ExpertService;
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
public class ExpertServiceImpl implements ExpertService {

    @Autowired
    private ExpertEntityDao expertEntityDao;

    @Override
    public ExpertEntity get(String id) {

        return expertEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        expertEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(ExpertEntity entity) {
        expertEntityDao.insert(entity);
    }

    @Override
    public void update(ExpertEntity entity) {
        expertEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String keyword) {
        ExpertEntityQuery query = new ExpertEntityQuery();

        if (null != keyword && !"".equals(keyword)) {
            ExpertEntityQuery.Criteria criteria = query.createCriteria();
            criteria.andShenLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        Page page = (Page) expertEntityDao.selectByExample(query);
        ExecutionResult result = new ExecutionResult();
        result.setCurrent(page.getPageNum());
        result.setPages(page.getPages());
        result.setTotal(page.getResult().size());
        result.setRecords(page.getResult());
        return result;
    }
}
