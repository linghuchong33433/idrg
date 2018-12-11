package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.TopicEntityDao;
import com.fartecx.pojo.TopicEntity;
import com.fartecx.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/30
 * Time:14:51
 * ========================
 */
@Service
@Transactional
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicEntityDao topicEntityDao;

    @Override
    public TopicEntity get(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void save(TopicEntity entity) {
        topicEntityDao.insert(entity);
    }

    @Override
    public void update(TopicEntity entity) {

    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String keyword) {
        return null;
    }
}
