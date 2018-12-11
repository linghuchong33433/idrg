package com.fartecx.utils;


import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;

import javax.servlet.http.HttpServletRequest;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/22
 * Time:13:41
 * ========================
 */
public class FartecxError {

    public static final int CODE_OK = 0;
    public static final int CODE_OTHER = 1;
    public static final int CODE_INVALID_PARAM = 2;
    public static final int CODE_NEED_VERIFYCODE = 3;
    public static final int CODE_ALREADY_EXIST = 4;

    public static final String[] ERROR_MESSAGES = {"",
            "其他错误",
            "",
            "请输入验证码",
            "已存在"
    };


    public Integer error;
    public String message;
    public Object obj;

    public FartecxError() {
        this.error = CODE_OK;
        this.message = "";
    }
    public FartecxError(int code, String message) {
        this.error = code;
        this.message = message;
    }
    @Override
    public String toString() {
        return "FartecxError{" +
                "error=" + error +
                ", message=" + message +
                ", obj=" + obj.toString() +
                "}";
    }

    public boolean hasError() {
        return this.error != CODE_OK;
    }

    static public FartecxError fromRequest(HttpServletRequest request) {
        if (null == request) {
            return new FartecxError();
        }
        String exceptionClassName = (String)request.getAttribute("shiroLoginFailure");
        if(UnknownAccountException.class.getName().equals(exceptionClassName)) {
            return new FartecxError(CODE_INVALID_PARAM, "无效的用户名/密码");
        } else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
            return new FartecxError(CODE_INVALID_PARAM, "无效的用户名/密码");
        } else if("postVerify.error".equals(exceptionClassName)) {
            return new FartecxError(CODE_NEED_VERIFYCODE, "验证码错误");
        } else if(exceptionClassName != null) {
            return new FartecxError(CODE_OTHER, ERROR_MESSAGES[CODE_OTHER]);
        }
        Object verify = request.getAttribute("needVerifyCode");
        if(null != verify) {
            boolean needVerifyCode = (boolean)verify;
            if (needVerifyCode) {
                return new FartecxError(CODE_NEED_VERIFYCODE, ERROR_MESSAGES[CODE_NEED_VERIFYCODE]);
            }
        }
        return new FartecxError();
    }
}
