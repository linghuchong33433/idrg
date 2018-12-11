package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.AblePersonEntityDao;
import com.fartecx.pojo.AblePersonEntity;
import com.fartecx.pojo.AblePersonEntityQuery;
import com.fartecx.service.AblePersonService;
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
public class AblePersonServiceImpl implements AblePersonService {

    @Autowired
    private AblePersonEntityDao ablePersonEntityDao;

    @Override
    public AblePersonEntity get(String id) {

        return ablePersonEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        ablePersonEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(AblePersonEntity entity) {
        ablePersonEntityDao.insert(entity);
    }

    @Override
    public void update(AblePersonEntity entity) {
        ablePersonEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize,String keyword) {
        AblePersonEntityQuery query = new AblePersonEntityQuery();
        AblePersonEntityQuery.Criteria criteria = query.createCriteria();
        if (null != keyword && !"".equals(keyword)) {

            criteria.andNameLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageNum,pageSize," modifyDate DESC");
        Page page = (Page) ablePersonEntityDao.selectByExample(query);
        ExecutionResult result = new ExecutionResult();
        result.setCurrent(page.getPageNum());
        result.setPages(page.getPages());
        result.setTotal(page.getResult().size());
        result.setRecords(page.getResult());
        return result;
    }
}
