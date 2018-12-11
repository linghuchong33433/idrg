package com.fartecx.service;

import com.fartecx.Base.BaseService;
import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.ShowFarmEntity;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:00:03
 * ========================
 */
public interface ShowFarmService extends BaseService<ShowFarmEntity> {
    ExecutionResult findShowById(String id);

}
