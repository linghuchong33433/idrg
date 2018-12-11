package com.fartecx.service;

import com.fartecx.Base.BaseService;
import com.fartecx.pojo.MediaEntity;
import com.fartecx.pojo.UserEntity;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:11:38
 * ========================
 */
public interface MediaService extends BaseService<MediaEntity> {

    MediaEntity findMedia(UserEntity userEntity);
}
