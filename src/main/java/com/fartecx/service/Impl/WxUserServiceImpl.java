package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.WxUserEntityDao;
import com.fartecx.pojo.WxUserEntity;
import com.fartecx.pojo.WxUserEntityQuery;
import com.fartecx.service.WxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/12/8
 * Time:20:47
 * ========================
 */
@Transactional
@Service
public class WxUserServiceImpl implements WxUserService {

    @Autowired
    private WxUserEntityDao entityDao;

    @Override
    public WxUserEntity get(String id) {
        return entityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        entityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(WxUserEntity entity) {
        entityDao.insert(entity);
    }

    @Override
    public void update(WxUserEntity entity) {

    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String keyword) {

        return null;
    }

    @Override
    public WxUserEntity findOneByOpenId(String openid) {
        WxUserEntity entity = null;
        WxUserEntityQuery query = new WxUserEntityQuery();
        WxUserEntityQuery.Criteria criteria = query.createCriteria();
        if (openid != null) {
            criteria.andWeidEqualTo(openid);
        }
        List<WxUserEntity> list = entityDao.selectByExample(query);
        if (list.size() != 0) {
            entity = list.get(0);
        }
        return entity;
    }

    @Override
    public void deletebyOpenId(String openid) {
        try {
            WxUserEntityQuery query = new WxUserEntityQuery();
            WxUserEntityQuery.Criteria criteria = query.createCriteria();
            criteria.andWeidEqualTo(openid);
            entityDao.deleteByExample(query);
        }catch (Exception e) {
            throw new RuntimeException("删除失败");
        }
    }
}
