package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.AblePersonEntityDao;
import com.fartecx.dao.TruckEntityDao;
import com.fartecx.pojo.AblePersonEntity;
import com.fartecx.pojo.AblePersonEntityQuery;
import com.fartecx.pojo.TruckEntity;
import com.fartecx.pojo.TruckEntityQuery;
import com.fartecx.service.AblePersonService;
import com.fartecx.service.TruckService;
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
public class TruckServiceImpl implements TruckService {

    @Autowired
    private TruckEntityDao truckEntityDao;

    @Override
    public TruckEntity get(String id) {

        return truckEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        truckEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(TruckEntity entity) {
        truckEntityDao.insert(entity);
    }

    @Override
    public void update(TruckEntity entity) {
        truckEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize,String keyword) {
        TruckEntityQuery query = new TruckEntityQuery();
        TruckEntityQuery.Criteria criteria = query.createCriteria();
        if (null != keyword && !"".equals(keyword)) {
            criteria.andNoLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        Page page = (Page) truckEntityDao.selectByExample(query);
        ExecutionResult result = new ExecutionResult();
        result.setCurrent(page.getPageNum());
        result.setPages(page.getPages());
        result.setTotal(page.getResult().size());
        result.setRecords(page.getResult());
        return result;
    }
}
