package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.BatchPhaseEntityDao;
import com.fartecx.dao.UserEntityDao;
import com.fartecx.model.EmailPwdModel;
import com.fartecx.model.PhonePwdModel;
import com.fartecx.pojo.BatchPhaseEntity;
import com.fartecx.pojo.BatchPhaseEntityQuery;
import com.fartecx.pojo.UserEntity;
import com.fartecx.pojo.UserEntityQuery;
import com.fartecx.service.BatchPhaseService;
import com.fartecx.service.UserService;
import com.fartecx.utils.MD5;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:08:36
 * ========================
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityDao userEntityDao;

    @Override
    public UserEntity get(String id) {
        return userEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        userEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(UserEntity entity) {
        String password = entity.getPassword();
        String s = MD5.md5(password);
        entity.setPassword(s);
        userEntityDao.insert(entity);
    }

    @Override
    public void update(UserEntity entity) {
        userEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String keyword) {
        PageHelper.startPage(pageNum,pageSize);
        UserEntityQuery query = new UserEntityQuery();
        UserEntityQuery.Criteria criteria = query.createCriteria();
        if(keyword!=null&&!"".equals(keyword)){
            criteria.andUsernameLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        Page page = (Page)userEntityDao.selectByExample(query);

        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setPages(page.getPages());
        executionResult.setTotal((int)page.getTotal());
        executionResult.setCurrent(pageNum);
        executionResult.setRecords(page.getResult());
        return executionResult;
    }

    @Override
    public void updatePwdByPhone(PhonePwdModel model) {
        UserEntityQuery query = new UserEntityQuery();
        UserEntityQuery.Criteria criteria = query.createCriteria();
        criteria.andPhoneEqualTo(model.getPhone());
        List<UserEntity> list = userEntityDao.selectByExample(query);
        UserEntity entity = list.get(0);
        entity.setPassword(model.getNewPwd());
        userEntityDao.updateByPrimaryKeySelective(entity);
        //TODO 确保手机号唯一

    }

    @Override
    public void updatePwdByEamil(EmailPwdModel model) {

    }
}
