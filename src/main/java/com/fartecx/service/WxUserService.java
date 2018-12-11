package com.fartecx.service;

import com.fartecx.Base.BaseService;
import com.fartecx.pojo.WxUserEntity;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/12/8
 * Time:20:46
 * ========================
 */
public interface WxUserService extends BaseService<WxUserEntity> {

    //根据openid查询是否存在关联
    WxUserEntity findOneByOpenId(String openid);

    //根据openid删除数据
    void deletebyOpenId(String openid);
}
