package com.fartecx.model;

import lombok.Data;

/**
 * 根据手机号修改密码
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/26
 * Time:15:51
 * ========================
 */
@Data
public class EmailPwdModel {

    private Integer type;//type = 2 为修改密码

    private String email;//邮箱地址

    private String oldPwd;//旧密码

    private String newPwd;//新密码

    private String code;//发到验证码

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPwd() {
        return oldPwd;
    }

    public void setOldPwd(String oldPwd) {
        this.oldPwd = oldPwd;
    }

    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
