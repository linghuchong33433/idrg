package com.fartecx.service;

import com.fartecx.model.RegisterModel;
import com.fartecx.pojo.UserEntity;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/12/5
 * Time:08:19
 * ========================
 */
public interface RegisterService {

    void register(UserEntity model,String openId);

    void code(String id);

    //根据邮箱查找用户，确保注册的时候邮箱唯一
    int findOneByEmail(String email);
}
