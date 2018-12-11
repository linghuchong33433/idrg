package com.fartecx.service;

import com.fartecx.config.ExecutionResult;

import java.util.Map;

public interface StatisticService {
    Map findStatistic(String group, String region);
}
