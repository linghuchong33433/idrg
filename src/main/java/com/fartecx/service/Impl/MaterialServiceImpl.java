package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.AblePersonEntityDao;
import com.fartecx.dao.MaterialEntityDao;
import com.fartecx.pojo.AblePersonEntity;
import com.fartecx.pojo.AblePersonEntityQuery;
import com.fartecx.pojo.MaterialEntity;
import com.fartecx.pojo.MaterialEntityQuery;
import com.fartecx.service.AblePersonService;
import com.fartecx.service.MaterialService;
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
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialEntityDao materialEntityDao;

    @Override
    public MaterialEntity get(String id) {

        return materialEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        materialEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(MaterialEntity entity) {
        materialEntityDao.insert(entity);
    }

    @Override
    public void update(MaterialEntity entity) {
        materialEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize,String keyword) {
        MaterialEntityQuery query = new MaterialEntityQuery();
        if (null != keyword && "".equals(keyword)) {
            MaterialEntityQuery.Criteria criteria = query.createCriteria();
            //  0查询不可用物资；1查询可用物资
            criteria.andFlagEqualTo(Integer.parseInt(keyword));
        }
        PageHelper.startPage(pageNum,pageSize);
        Page page = (Page) materialEntityDao.selectByExample(null);
        ExecutionResult result = new ExecutionResult();
        result.setCurrent(page.getPageNum());
        result.setPages(page.getPages());
        result.setTotal(page.getResult().size());
        result.setRecords(page.getResult());
        return result;
    }
}
