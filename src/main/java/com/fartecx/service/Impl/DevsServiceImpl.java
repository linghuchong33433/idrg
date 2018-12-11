package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.CustomDao;
import com.fartecx.dao.DeviceEntityDao;
import com.fartecx.pojo.DeviceEntity;
import com.fartecx.pojo.DeviceEntityQuery;
import com.fartecx.service.DevsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DevsServiceImpl implements DevsService {

    @Autowired
    private DeviceEntityDao deviceEntityDao;

    @Autowired
    private CustomDao customDao;

    @Override
    public void save(DeviceEntity entity) {
        deviceEntityDao.insert(entity);
    }

    @Override
    public ExecutionResult findDevsByFarmId(Integer pageSize, Integer pageNum, String farmId) {
        PageHelper.startPage(pageNum, pageSize);
        Page page =(Page) customDao.selectAll("SELECT d.id,d.farm,f.`name` farmName,d.type,dt.`name`,d.position,d.`status`,d.url FROM device d INNER JOIN farm f ON f.id=d.farm INNER JOIN devicetype dt ON dt.id=d.type where d.farm="+farmId);
        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setPages(page.getPages());
        executionResult.setTotal((int)page.getTotal());
        executionResult.setCurrent(pageNum);
        executionResult.setRecords(page.getResult());

        return executionResult;
    }

    @Override
    public void update(DeviceEntity entity) {
        deviceEntityDao.updateByPrimaryKey(entity);
    }

    @Override
    public void delete(String id) {
        deviceEntityDao.deleteByPrimaryKey(id);
    }

}
