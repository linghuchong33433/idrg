package com.fartecx.model;

import lombok.Data;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/12/5
 * Time:08:19
 * ========================
 */
@Data
public class RegisterModel {

    private int type;//注册类型，0是邮箱，1是手机号 需要生成一个默认的useranmeCn

    private String userNameCN;//用户名称

    private String userName;//注册账号，手机号，邮箱

    private String password;//登录密码

    private int locked;//0 可用  1 不可用

    private String salt;//salt for hash password
}
