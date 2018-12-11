package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.CustomDao;
import com.fartecx.dao.TopicEntityDao;
import com.fartecx.pojo.QaEntity;
import com.fartecx.service.PubTopicsService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/27
 * Time:10:04
 * ========================
 */
@Transactional
@Service
public class PubTopicsServiceImpl implements PubTopicsService {

    @Autowired
    private TopicEntityDao topicEntityDao;
    @Autowired
    private CustomDao customDao;

    @Override
    public QaEntity get(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void save(QaEntity entity) {

    }

    @Override
    public void update(QaEntity entity) {

    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String keyword) {
        return null;
    }

    @Override
    public List<Map> list(Integer pageNum, Integer pageSize, String keyword, String my) {
        PageHelper.startPage(pageNum,pageSize);
        String sql=null;
        if (null == my && null == keyword) {
            sql = "select t.id,t.name,t.modifyDate,q.image,u.userNameCN,u.header from topic t inner join " +
                    "qa q on t.id = q.topicId inner join user u on t.createPerson = u.id";
        }else if (null == my && null != keyword){
            sql ="select t.id,t.name,t.modifyDate,q.image,u.userNameCN,u.header from topic t inner join" +
                    " qa q on t.id = q.topicId inner join user u on t.createPerson = u.id where t.name like "+keyword;
        }else if (null == keyword && null != my) {
            sql ="select t.id,t.name,t.modifyDate,q.image,u.userNameCN,u.header from topic t inner join" +
                    " qa q on t.id = q.topicId inner join user u on t.createPerson = u.id where t.createPserson = "+my;
        }else {
            sql ="select t.id,t.name,t.modifyDate,q.image,u.userNameCN,u.header from topic t inner join" +
                    " qa q on t.id = q.topicId inner join user u on t.createPerson = u.id where t.createPserson = "+ my
                    +" and t.name like "+keyword;
        }
        List<Map> list = customDao.selectAll(sql);
        return list;
    }
}
