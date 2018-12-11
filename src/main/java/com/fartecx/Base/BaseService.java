package com.fartecx.Base;

import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.ExpertEntity;

/**
 * Service基类，增删查改
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:00:00
 * ========================
 */
public interface BaseService<T> {

    T get(String id);

    void delete(String id);

    void save(T entity);

    void update(T entity);

    ExecutionResult list(Integer pageNum, Integer pageSize, String keyword);
}
