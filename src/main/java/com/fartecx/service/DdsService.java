package com.fartecx.service;

import com.fartecx.config.ExecutionResult;

import java.util.Date;

public interface DdsService {
    ExecutionResult findDeviceData(String device, Date from, Date to, Double temp);
}
