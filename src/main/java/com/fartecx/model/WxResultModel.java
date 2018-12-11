package com.fartecx.model;

import lombok.Data;

/**
 * code2session是返回值
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/12/9
 * Time:09:09
 * ========================
 */
@Data
public class WxResultModel {

    private String sessionid;//sessionid

    private boolean relation;  //是否有关联用户

    private WxLoginSuccessModel user;//用户信息

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public boolean isRelation() {
        return relation;
    }

    public void setRelation(boolean relation) {
        this.relation = relation;
    }

    public WxLoginSuccessModel getUser() {
        return user;
    }

    public void setUser(WxLoginSuccessModel user) {
        this.user = user;
    }
}
