package com.fartecx.service;

import com.fartecx.Base.BaseService;
import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.JobEntity;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:17:36
 * ========================
 */
public interface JobService extends BaseService<JobEntity> {
    ExecutionResult list(Integer pageNum, Integer pageSize, String batch,String phase);
}
