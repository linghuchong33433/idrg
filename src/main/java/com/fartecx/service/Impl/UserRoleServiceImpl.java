package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.AblePersonEntityDao;
import com.fartecx.dao.UserRoleEntityDao;
import com.fartecx.pojo.AblePersonEntity;
import com.fartecx.pojo.AblePersonEntityQuery;
import com.fartecx.pojo.UserRoleEntityKey;
import com.fartecx.pojo.UserRoleEntityQuery;
import com.fartecx.service.AblePersonService;
import com.fartecx.service.UserRoleService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleEntityDao userRoleEntityDao;

    @Override
    public UserRoleEntityKey get(String id) {
        UserRoleEntityQuery query = new UserRoleEntityQuery();
        UserRoleEntityQuery.Criteria criteria = query.createCriteria();
        criteria.andUseridEqualTo(id);
        List<UserRoleEntityKey> list = userRoleEntityDao.selectByExample(query);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void save(UserRoleEntityKey entity){
    }

    @Override
    public void update(UserRoleEntityKey entity) {

    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize,String keyword) {

        return null;
    }
}
