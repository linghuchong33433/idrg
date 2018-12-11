package com.fartecx.service.Impl;

import com.fartecx.dao.UserEntityDao;
import com.fartecx.model.RegisterModel;
import com.fartecx.pojo.UserEntity;
import com.fartecx.pojo.UserEntityQuery;
import com.fartecx.pojo.WxUserEntity;
import com.fartecx.service.RegisterService;
import com.fartecx.service.WxUserService;
import com.fartecx.utils.MD5;
import com.fartecx.utils.SendMailCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/12/5
 * Time:08:24
 * ========================
 */
@Transactional
@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserEntityDao entityDao;

    @Autowired
    private WxUserService wxUserService;

    @Override
    public void register(UserEntity model,String openId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //存储用户信息
        String uuid = UUID.randomUUID().toString();
        model.setId(uuid);
        model.setUsernamecn(UUID.randomUUID().toString().substring(0,12));
        try {
            model.setModifydate(sdf.parse(sdf.format(new Date())));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        model.setLocked(0);
        model.setSalt("aaaaaaa");
        entityDao.insert(model);
        //将微信与用户进行绑定
        WxUserEntity wxUserEntity = new WxUserEntity();
        wxUserEntity.setUid(uuid);
        wxUserEntity.setWeid(openId);
        wxUserService.save(wxUserEntity);
    }

    @Override
    public void code(String id) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setLocked(1);
        entityDao.updateByPrimaryKeySelective(userEntity);
    }

    @Override
    public int findOneByEmail(String email) {
        UserEntityQuery query = new UserEntityQuery();
        UserEntityQuery.Criteria criteria = query.createCriteria();
        if (null != email && !"".equals(email)) {
            criteria.andUsernameEqualTo(email);
        }
        List<UserEntity> list = entityDao.selectByExample(query);
        return list.size();
    }
}
