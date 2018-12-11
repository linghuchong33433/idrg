package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.AblePersonEntityDao;
import com.fartecx.dao.MediaEntityDao;
import com.fartecx.pojo.*;
import com.fartecx.service.AblePersonService;
import com.fartecx.service.MediaService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/24
 * Time:20:14
 * ========================
 */
@Service
@Transactional
public class MediaServiceImpl implements MediaService {

    @Autowired
    private MediaEntityDao mediaEntityDao;

    @Override
    public MediaEntity get(String id) {

        return mediaEntityDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        mediaEntityDao.deleteByPrimaryKey(id);
    }

    @Override
    public void save(MediaEntity entity) {
        mediaEntityDao.insert(entity);
    }

    @Override
    public void update(MediaEntity entity) {
        mediaEntityDao.updateByPrimaryKeySelective(entity);
    }

    @Override
    public ExecutionResult list(Integer pageNum, Integer pageSize,String keyword) {
        MediaEntityQuery query = new MediaEntityQuery();
        MediaEntityQuery.Criteria criteria = query.createCriteria();
        if (null != keyword && !"".equals(keyword)) {
            criteria.andIdLike("%"+keyword+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        Page page = (Page) mediaEntityDao.selectByExample(query);
        ExecutionResult result = new ExecutionResult();
        result.setCurrent(page.getPageNum());
        result.setPages(page.getPages());
        result.setTotal(page.getResult().size());
        result.setRecords(page.getResult());
        return result;
    }

    @Override
    public MediaEntity findMedia(UserEntity userEntity) {
        MediaEntity mediaEntity = mediaEntityDao.selectByPrimaryKey(userEntity.getId());
        return mediaEntity;
    }
}
