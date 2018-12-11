package com.fartecx.service;

import com.fartecx.Base.BaseService;
import com.fartecx.model.EmailPwdModel;
import com.fartecx.model.PhonePwdModel;
import com.fartecx.pojo.UserEntity;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:08:55
 * ========================
 */
public interface UserService extends BaseService<UserEntity> {

    //根据手机号修改密码
    void updatePwdByPhone(PhonePwdModel model);
    //根据邮箱修改密码
    void updatePwdByEamil(EmailPwdModel model);
}
