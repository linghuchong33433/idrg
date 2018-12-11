package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.CustomDao;
import com.fartecx.dao.QaEntityDao;
import com.fartecx.model.ApiQaModel;
import com.fartecx.pojo.QaEntity;
import com.fartecx.service.MaterialService;
import com.fartecx.service.QaService;
import com.fartecx.utils.MapToBeanUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/27
 * Time:11:25
 * ========================
 */
@Transactional
@Service
public class QaServiceImpl implements QaService {

    @Autowired
    private CustomDao customDao;

    @Autowired
    private QaEntityDao qaEntityDao;

    @Override
    public QaEntity get(String id) {
        return qaEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        qaEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(QaEntity entity) {
        qaEntityDao.insert(entity);
    }

    @Override
    public void update(QaEntity entity) {
        qaEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize, String tiopicid) {
        PageHelper.startPage(pageNum,pageSize);
        String sql = "select q.type,q.content,u.userNameCN,u.header,q.modifyTime,q.flag,q.image from topic t inner join " +
                "qa q on t.id = q.topicId inner join user u on t.createPerson = u.id where t.id ="+ tiopicid;
        List<Map> selectList =  customDao.selectAll(sql);
        //TODO 返回值List<Map> 需要转为对象返回
        return null;
    }
}
