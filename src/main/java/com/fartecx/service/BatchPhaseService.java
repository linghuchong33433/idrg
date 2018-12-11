package com.fartecx.service;

import com.fartecx.Base.BaseService;
import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.BatchPhaseEntity;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:08:48
 * ========================
 */
public interface BatchPhaseService extends BaseService<BatchPhaseEntity> {
    ExecutionResult findAllBatchPhase();
}
