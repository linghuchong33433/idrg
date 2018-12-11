package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.*;
import com.fartecx.pojo.*;
import com.fartecx.service.UsersService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserEntityDao userEntityDao;

    @Autowired
    private RoleEntityDao roleEntityDao;

    @Autowired
    private UserRoleEntityDao userRoleEntityDao;

    @Autowired
    private RrolePermissionEntityDao rrolePermissionEntityDao;

    @Autowired
    private PermissionEntityDao permissionEntityDao;


    @Override
    public ExecutionResult findUsersByName(Integer pageSize, Integer pageNum, String keyword) {

        UserEntityQuery userEntityQuery = new UserEntityQuery();
        UserEntityQuery.Criteria criteria = userEntityQuery.createCriteria();
        if(keyword!=null&&!"".equals(keyword)){
            criteria.andUsernameLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        Page<UserEntity> page =(Page<UserEntity>) userEntityDao.selectByExample(userEntityQuery);

        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setPages(page.getPages());
        executionResult.setTotal((int)page.getTotal());
        executionResult.setCurrent(pageNum);
        executionResult.setRecords(page.getResult());

        return executionResult;

    }

    @Override
    public void changePassword(String userId, String newPassword) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userId);
        userEntity.setPassword(newPassword);
        userEntityDao.updateByPrimaryKeySelective(userEntity);
    }

    @Override
    public UserEntity findByUsername(String username) {
        UserEntityQuery userEntityQuery = new UserEntityQuery();
        UserEntityQuery.Criteria criteria = userEntityQuery.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<UserEntity> userEntities = userEntityDao.selectByExample(userEntityQuery);
        return userEntities.get(0);
    }

    @Override
    public Set<String> findRoles(String username) {
        Set<String> roles = new HashSet<>();
        UserEntityQuery userEntityQuery = new UserEntityQuery();
        UserEntityQuery.Criteria criteria = userEntityQuery.createCriteria();
        criteria.andUsernamecnEqualTo(username);
        List<UserEntity> userEntities = userEntityDao.selectByExample(userEntityQuery);
        String id = userEntities.get(0).getId();
        UserRoleEntityQuery userRoleEntityQuery = new UserRoleEntityQuery();
        UserRoleEntityQuery.Criteria criteria1 = userRoleEntityQuery.createCriteria();
        criteria1.andUseridEqualTo(id);
        List<UserRoleEntityKey> userRoleEntityKeys = userRoleEntityDao.selectByExample(userRoleEntityQuery);
        if (userRoleEntityKeys != null) {
            for (UserRoleEntityKey userRoleEntityKey : userRoleEntityKeys) {
                roles.add(userRoleEntityKey.getRoleid());
            }
        }
        return roles;

    }

    @Override
    public Set<String> findPermissions(String username) {
        Set<String> permissions = new HashSet<>();
        Set<String> roles = findRoles(username);
        if (roles != null) {
            for (String role : roles) {
                RrolePermissionEntityQuery rrolePermissionEntityQuery = new RrolePermissionEntityQuery();
                RrolePermissionEntityQuery.Criteria criteria = rrolePermissionEntityQuery.createCriteria();
                criteria.andRoleidEqualTo(role);
                List<RrolePermissionEntityKey> rrolePermissionEntityKeys = rrolePermissionEntityDao.selectByExample(rrolePermissionEntityQuery);
                if (rrolePermissionEntityKeys != null) {
                    for (RrolePermissionEntityKey rrolePermissionEntityKey : rrolePermissionEntityKeys) {
                        String permissionid = rrolePermissionEntityKey.getPermissionid();
                        permissions.add(permissionid);
                    }
                }
            }
        }
        return permissions;
    }

    @Override
    public UserEntity wxlogin(String username, String password) {
        UserEntityQuery query = new UserEntityQuery();
        UserEntityQuery.Criteria criteria = query.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        List<UserEntity> list = userEntityDao.selectByExample(query);
        return list.size() >0 ? list.get(0) : null;
    }

    @Override
    public UserEntity get(String id) {
        return userEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void save(UserEntity entity) {

    }

    @Override
    public void update(UserEntity entity) {

    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String keyword) {
        return null;
    }
}
