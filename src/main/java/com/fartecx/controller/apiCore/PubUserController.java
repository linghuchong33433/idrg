package com.fartecx.controller.apiCore;

import com.fartecx.config.Result;
import com.fartecx.dao.UserEntityDao;
import com.fartecx.model.EmailPwdModel;
import com.fartecx.model.PhonePwdModel;
import com.fartecx.pojo.UserEntity;
import com.fartecx.service.UserService;
import com.fartecx.utils.MD5;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * 公共服务平台的用户修改
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/26
 * Time:14:16
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/v1")
public class PubUserController {

    @Autowired
    private UserService userService;

    /**
     * @api {put} /api/v1/pwd
     * @apiGroup pub_user
     * @apiVersion 1.0.0
     * @apiDescription 根据手机修改密码
     * @apiParam {Object} entity 字段为（phone 手机号，oldPwd 旧密码，newPwd 新密码，code 验证码）
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
    @PutMapping("/pwd")
    public Object updatePwdByPhone(@RequestBody PhonePwdModel model) {
        try {
            userService.updatePwdByPhone(model);
            return new Result(0,"修改成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {get} /api/v1/pwde
     * @apiGroup pub_user
     * @apiVersion 1.0.0
     * @apiDescription 根据邮箱修改密码
     * @apiParam {Object} entity 字段为（email 邮箱地址，oldPwd 旧密码，newPwd 新密码）
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
    @PutMapping("/pwde")
    public Object updatePwdByEmail(@RequestBody EmailPwdModel model, HttpSession session) {
        try {
            if (2 == model.getType()) {
                userService.updatePwdByEamil(model);
                String sessionCode = MD5.md5(session.getAttribute("updatePwdMailCode").toString());
                String code = MD5.md5(model.getCode());
                if (sessionCode.equalsIgnoreCase(code)) {
                    if (model.getOldPwd().equals(model.getNewPwd())) {
                        UserEntity userEntity = new UserEntity();
                        userEntity.setPassword(model.getNewPwd());
                        userService.update(userEntity);
                    }else {
                        return new Result(1, "密码不一致");
                    }
                }else {
                    return new Result(1, "验证码错误");
                }
                return new Result(0, "修改成功");
            }else {
                return new Result(1, "参数错误");
            }
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {put} /api/v1/user
     * @apiGroup pub_user
     * @apiVersion 1.0.0
     * @apiDescription 用户信息修改
     * @apiParam {Object} entity 字段为（id，username 注册账号，为手机号或邮箱，usernamecn 用户名称，password 密码，locked 是否可用，phone 手机号，email 邮箱，header 头像）
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
    @PutMapping("/user")
    public Object update(@RequestBody UserEntity entity) {
        try {
            userService.update(entity);
            return new Result(0,"修改成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }
}
