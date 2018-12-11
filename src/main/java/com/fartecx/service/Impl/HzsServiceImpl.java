package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.HeZuoSheEntityDao;
import com.fartecx.pojo.HeZuoSheEntity;
import com.fartecx.service.HzsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HzsServiceImpl implements HzsService {

    @Autowired
    private HeZuoSheEntityDao heZuoSheEntityDao;

    @Override
    public ExecutionResult findHeZuoShe(Integer pageSize, Integer pageNum) {
        ExecutionResult executionResult = new ExecutionResult();
        if (pageNum != null && !"".equals(pageNum) && pageSize != null && !"".equals(pageSize)) {
            PageHelper.startPage(pageNum, pageSize);
            Page<HeZuoSheEntity> page = (Page<HeZuoSheEntity>) heZuoSheEntityDao.selectByExample(null);


            executionResult.setPages(page.getPages());
            executionResult.setTotal((int) page.getTotal());
            executionResult.setCurrent(pageNum);
            executionResult.setRecords(page.getResult());
        } else {
            List<HeZuoSheEntity> heZuoSheEntities = heZuoSheEntityDao.selectByExample(null);
            executionResult.setRecords(heZuoSheEntities);
        }
        return executionResult;
    }
}
