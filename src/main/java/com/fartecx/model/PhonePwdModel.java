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
public class PhonePwdModel {

    private String phone;//手机号

    private String oldPwd;//旧密码

    private String newPwd;//新密码

    private String code;//验证码
}
