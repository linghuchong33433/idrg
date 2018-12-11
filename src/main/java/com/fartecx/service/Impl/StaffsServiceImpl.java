package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.CustomDao;
import com.fartecx.dao.StaffEntityDao;
import com.fartecx.pojo.StaffEntity;
import com.fartecx.service.StaffsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StaffsServiceImpl implements StaffsService {

    @Autowired
    private CustomDao customDao;
    @Autowired
    private StaffEntityDao staffEntityDao;

    @Override
    public void save(StaffEntity staffEntity) {
        staffEntityDao.insert(staffEntity);
    }

    @Override
    public ExecutionResult findStaffByUsers(Integer pageNum, Integer pageSize, String keyword, String farmId) {
        PageHelper.startPage(pageNum, pageSize);
        String sql = null;
        if(keyword.equals("")) {
            sql = "select * from user inner join staff on staff.id = user.id where staff.farm = "+farmId;
        }else {
            sql = "select * from user inner join staff on staff.id = user.id where " +
                    "staff.farm = " + farmId +
                    "and user.userName = "+keyword;
        }
        Page page =(Page) customDao.selectAll(sql);
        ExecutionResult executionResult = new ExecutionResult();
        executionResult.setPages(page.getPages());
        executionResult.setTotal((int)page.getTotal());
        executionResult.setCurrent(pageNum);
        executionResult.setRecords(page.getResult());
        return executionResult;
    }


}
