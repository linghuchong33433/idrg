package com.fartecx.model;

import lombok.Data;

/**
 * 小程序登录接收前台传递参数
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/12/9
 * Time:23:23
 * ========================
 */
@Data
public class WXLoginModel {

    private Integer type;//0 为用邮箱验证码登录

    private String username;//用户名

    private String password;//密码

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
