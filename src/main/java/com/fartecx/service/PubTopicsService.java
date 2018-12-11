package com.fartecx.service;

import com.fartecx.Base.BaseService;
import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.QaEntity;

import java.util.List;
import java.util.Map;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/27
 * Time:10:02
 * ========================
 */
public interface PubTopicsService extends BaseService<QaEntity> {

    //公共服务平台技术问答列表
    List<Map> list(Integer pageNum, Integer pageSize, String keyword, String my);
}
