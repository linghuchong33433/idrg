package com.fartecx.controller.userManager;

import com.fartecx.config.Result;
import com.fartecx.model.WxLoginSuccessModel;
import com.fartecx.model.WxRegisterModel;
import com.fartecx.pojo.UserEntity;
import com.fartecx.pojo.WxUserEntity;
import com.fartecx.service.RegisterService;
import com.fartecx.service.UserService;
import com.fartecx.service.WxUserService;
import com.fartecx.utils.MD5;
import com.fartecx.utils.SendMailCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * 用户注册
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/12/5
 * Time:08:18
 * ========================
 */
@CrossOrigin
@Controller
@RequestMapping("/api/v1")
public class RegisterController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RegisterService service;
    @Autowired
    private WxUserService wxUserService;
    @Autowired
    private UserService userService;

    /**
     * @api {post} /api/v1/register
     * @apiGroup register
     * @apiVersion 1.0.0
     * @apiDescription 注册
     * @apiParam {Object} entity 字段为(username 注册账号，为手机号或邮箱,password 密码,phone 手机号,email 邮件地址)
     * @apiSuccess {String} message 访问状态
     * @apiSuccess {int} code 返回码
     * @apiSuccessExample {json} 成功返回样例：
     * {
     * "code": 0,
     * "message": "注册成功"
     * }
     * @apiErrorExample {json}   错误返回样例
     * {
     * "code": 1,
     * "message": "注册失败"
     * }
     */
    @ResponseBody
    @PostMapping("/register")
    public Object registerUser(@RequestBody WxRegisterModel model, HttpSession session) {

        //  service.register(entity);
//        //生成验证码
//        String code = "";
//        // 随机产生4个字符
//        for (int i = 0; i < 4; i++) {
//            code += randomChar();
//        }
//        logger.debug(code);
//        String s = MD5.md5(code);
//        session.setAttribute("codeM5", s);
//
//        SendMailCode.sendMail(entity.getEmail(),code,entity.getId());

        try {
            String mailCode = (String) session.getAttribute("mailCode");
            String code = model.getCode();
            String s = MD5.md5(code);
            if (code != null && !"".equals(code) && mailCode.equals(s)) {
                UserEntity entity = new UserEntity();
                entity.setUsername(model.getUserName());
                entity.setPassword(model.getPassword());
                int emailUser = service.findOneByEmail(model.getUserName());
                if (emailUser > 0) {
                    return new Result(1, "邮箱已存在");
                } else {
                    //将用户与微信进行绑定；
                    String openId = (String) session.getAttribute(session.getId());
                    service.register(entity, openId);
                    //返回个人信息
                    WxUserEntity wxUserEntity = wxUserService.findOneByOpenId(openId);
                    UserEntity userEntity = userService.get(wxUserEntity.getUid());
                    WxLoginSuccessModel loginModel = new WxLoginSuccessModel();
                    loginModel.setUserName(userEntity.getUsernamecn());//用户昵称
                    loginModel.setHeader(userEntity.getHeader());
                    loginModel.setUid(userEntity.getId());
                    return new Result(0, "注册成功", loginModel);
                }
            } else {
                return new Result(1, "验证码错误");
            }
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {get} /api/v1/sendMailCode
     * @apiGroup register
     * @apiVersion 1.0.0
     * @apiDescription 向邮箱发送验证码
     * @apiParam {Integer} type 0 为登录 1 为注册  2 为修改密码[必选]
     * @apiParam {String} codeValue 输入的图片验证码[必选]
     * @apiParam {String} email 邮箱[必选]
     * @apiSuccess {String} message 访问状态
     * @apiSuccess {int} code 返回码
     * @apiSuccess {List} data 数据信息
     * @apiSuccessExample {json} 成功返回样例：
     * {
     * "code": 0,
     * "data": {
     * },
     * "message": "查询成功"
     * }
     * @apiErrorExample {json}   错误返回样例
     * {
     * "code": 1,
     * "message": "查询失败"
     * }
     */
    @ResponseBody
    @GetMapping("/sendMailCode")
    public Object sendMailCode(Integer type,String codeValue, String email, HttpSession session) {
        try {
            if (0 == type) {
                String code = "";// 随机产生4个字符
                for (int i = 0; i < 4; i++) {
                    code += randomChar();
                }
                String s = MD5.md5(code);
                session.setAttribute("loginMailCode", s);
                SendMailCode.sendMailCode(email, code);
                return new Result(0,"发送成功");
            }else if (1 == type){
                //获取图片验证码
                int emailUser = service.findOneByEmail(email);
                if (emailUser == 0) {
                    String imgCode = session.getAttribute("verifyCodeValue").toString();
                    if (codeValue.equalsIgnoreCase(imgCode)) {
                        String code = "";// 随机产生4个字符
                        for (int i = 0; i < 4; i++) {
                            code += randomChar();
                        }
                        logger.debug(code);
                        String s = MD5.md5(code);
                        session.setAttribute("mailCode", s);
                        SendMailCode.sendMailCode(email, code);
                        return new Result(0, "发送成功");
                    } else {
                        return new Result(1, "验证码错误");
                    }
                } else {
                    return new Result(1, "邮箱已存在");
                }
            }else if(2 == type) {
                String imgCode = session.getAttribute("verifyCodeValue").toString();
                if (codeValue.equalsIgnoreCase(imgCode)) {
                    String code = "";// 随机产生4个字符
                    for (int i = 0; i < 4; i++) {
                        code += randomChar();
                    }
                    logger.debug(code);
                    String s = MD5.md5(code);
                    session.setAttribute("updatePwdMailCode", s);
                    SendMailCode.sendMailCode(email, code);
                    return new Result(0, "发送成功");
                } else {
                    return new Result(1, "验证码错误");
                }
            }else {
                return new Result(1, "参数错误");
            }

        } catch (Exception e) {
            return new Result(1, "发送失败");
        }

    }

    @GetMapping("/code")
    public Result code(String code, HttpServletRequest request) {

        try {
            String sessionCode = (String) request.getSession().getAttribute("codeM5");
            String s = MD5.md5(code);
            if (code != null && !"".equals(code) && sessionCode.equals(s)) {
                return new Result(0, "注册成功");
            }
            return new Result(1, "注册失败");
        } catch (Exception e) {

            return new Result(1, e.getMessage());
        }
    }

    /**
     * 随机参数一个字符
     *
     * @return
     */
    private char randomChar() {
        Random r = new Random();
        String s = "ABCDEFGHJKLMNPRSTUVWXYZ0123456789";
        return s.charAt(r.nextInt(s.length()));
    }


}
