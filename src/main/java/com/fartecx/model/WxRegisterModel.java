package com.fartecx.model;

import lombok.Data;

/**
 * 用于接收提交注册接收参数
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/12/8
 * Time:14:32
 * ========================
 */
@Data
public class WxRegisterModel {

    private String userName;//注册账号，手机号，邮箱

    private String password;//登录密码

    private String code;//发送到邮箱的验证码

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
