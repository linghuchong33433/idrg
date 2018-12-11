package com.fartecx.service;

import com.fartecx.Base.BaseService;
import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.RecallEntity;


/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/24
 * Time:23:31
 * ========================
 */
public interface RecallService extends BaseService<RecallEntity> {

    ExecutionResult findRecallById(String id);

}
