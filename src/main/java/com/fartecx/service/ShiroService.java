package com.fartecx.service;

import com.fartecx.dao.ShiroDao;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiroService {

    private ShiroDao shiroDao;

    public void setShiroDao(ShiroDao shiroDao) {
        this.shiroDao = shiroDao;
    }

    public void doLogin(String username, String password) throws Exception {
        Subject subject = SecurityUtils.getSubject();
        if(!subject.isAuthenticated()){
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            token.setRememberMe(true);
            try {
                subject.login(token);
            } catch (UnknownAccountException uae) {
                throw new Exception("账户不存在");
            } catch (IncorrectCredentialsException ice) {
                throw new Exception("密码不正确");
            } catch (LockedAccountException lae) {
                throw new Exception("用户被锁定了");
            } catch (AuthenticationException ae) {
                ae.printStackTrace();
                throw new Exception("未知错误");
            }
        }
    }

    public String getPasswordByUserName(String username) {
        return shiroDao.getPasswordByUserName(username);
    }
    public List<String> getPermissionByUserName(String username){
        return shiroDao.getPermissionByUserName(username);
    }
}
