package com.fartecx.utils;

import com.fartecx.service.ShiroService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.List;

public class MyShiroRealm extends AuthorizingRealm {

    private ShiroService shiroService;

    public ShiroService getShiroService() {
        return shiroService;
    }

    public void setShiroService(ShiroService shiroService) {
        this.shiroService = shiroService;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String) principals.fromRealm(getName()).iterator().next();
        if(username!=null){
            List <String> perms = shiroService.getPermissionByUserName(username);
            if(perms!=null&&!perms.isEmpty()){
                SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
                for (String each:perms){
                    info.addStringPermission(each);
                }
                return info;
            }
        }
        return null;

































    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token=(UsernamePasswordToken)authenticationToken;

        String username = token.getUsername();
        if (username != null && !"".equals(username)) {
            String password = shiroService.getPasswordByUserName(username);
            if (password!=null){
                return new SimpleAuthenticationInfo(username, password, getName());
            }
        }
        return null;
    }
}
