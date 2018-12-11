package com.fartecx.service;

import com.fartecx.Base.BaseService;
import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.AblePersonEntity;
import com.fartecx.pojo.AnnounceEntity;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/24
 * Time:20:13
 * ========================
 */
public interface AnnounceService extends BaseService<AnnounceEntity> {



    ExecutionResult findAnnouncementById(String id);
}
