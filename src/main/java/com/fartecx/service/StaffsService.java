package com.fartecx.service;

import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.StaffEntity;

public interface StaffsService {

    ExecutionResult findStaffByUsers(Integer pageNum,Integer pageSize,String keyword,String farmId);

    void save(StaffEntity staffEntity);
}
