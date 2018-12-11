package com.fartecx.service;

import com.fartecx.Base.BaseService;
import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.UserEntity;

import java.util.Set;

public interface UsersService extends BaseService<UserEntity> {
    ExecutionResult findUsersByName(Integer pageSize, Integer pageNum, String keyword);


     void changePassword(String userId, String newPassword);//修改密码

     UserEntity findByUsername(String username);// 根据用户名查找用户
     Set<String> findRoles(String username);// 根据用户名查找其角色
     Set<String> findPermissions(String username); //根据用户名查找其权限

    UserEntity wxlogin(String username,String password);

}



