package com.fartecx.controller.userManager;


import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.utils.MD5;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class LoginController {

    /**
     * @api {get} api/v1/login
     * @apiGroup login
     * @apiVersion 1.0.0
     * @apiDescription 登录  通过http://120.77.154.146:8080/ldrg/code/getVerifyCode 获取验证码
     * @apiParam {String} user，用户名（手机号、邮箱）。
     * @apiParam {String} pwd，密码，md5加密后的密码。
     * @apiParam {String} code, 必须，4位数验证码。
     * @apiSuccess {String} message 访问状态
     * @apiSuccess {int} code 返回码
     * @apiSuccess {List} data 数据信息
     * @apiSuccessExample {json} 成功返回样例：
     * {
     * "code": 0,
     * "message": "登录成功"
     * }
     * @apiErrorExample {json}   错误返回样例
     * {
     * "code": 1,
     * "message": "登录失败"
     * }
     */

    @GetMapping("/login")
    public Result login(String username, String password, String code,
                        HttpServletRequest request) {
        //String sessionCode = (String) request.getSession().getAttribute("verifyCodeValue");
        //System.out.println(sessionCode);
       // if (code != null && code.equalsIgnoreCase(sessionCode)) {

            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            try {
                subject.login(token);
                return new Result(0, "登陆成功");
            } catch (AuthenticationException e) {
                return new Result(1, e.getMessage());
            }

        //}
      //  return new Result(1, "验证码错误");

    }


}
