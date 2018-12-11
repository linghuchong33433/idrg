package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.RoleEntityDao;
import com.fartecx.pojo.RoleEntity;
import com.fartecx.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/12/9
 * Time:23:52
 * ========================
 */
@Transactional
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleEntityDao roleEntityDao;

    @Override
    public RoleEntity get(String id) {
        return roleEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        roleEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(RoleEntity entity) {

    }

    @Override
    public void update(RoleEntity entity) {

    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String keyword) {
        return null;
    }
}
