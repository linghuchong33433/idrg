package com.fartecx.model;

import lombok.Data;

/**
 * 小程序登录成功后返回model
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/12/8
 * Time:22:16
 * ========================
 */
@Data
public class WxLoginSuccessModel {

    private String uid;//用户id

    private String userName;//账号 邮箱手机号

    private String userNameCN;//用户昵称

    private String role;//用户角色

    private String header;//头像路径URL

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNameCN() {
        return userNameCN;
    }

    public void setUserNameCN(String userNameCN) {
        this.userNameCN = userNameCN;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}
