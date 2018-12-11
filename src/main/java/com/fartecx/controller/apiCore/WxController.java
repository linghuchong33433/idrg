package com.fartecx.controller.apiCore;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fartecx.config.Result;
import com.fartecx.model.WXLoginModel;
import com.fartecx.model.WxLoginSuccessModel;
import com.fartecx.model.WxResultModel;
import com.fartecx.pojo.*;
import com.fartecx.service.*;
import com.fartecx.utils.ConfigReadUtil;
import com.fartecx.utils.HttpUtils;
import com.fartecx.utils.MD5;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * 小程序
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/26
 * Time:14:03
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1")
public class WxController {

    @Autowired
    private UsersService userService;

    @Autowired
    private MediaService mediaService;

    @Autowired
    private WxUserService wxUserService;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private RoleService roleService;


    /**
     * @api {get} api/v1/my
     * @apiGroup wx
     * @apiVersion 1.0.0
     * @apiDescription 获取我的基本信息
     * @apiSuccess {String} message 访问状态
     * @apiSuccess {int} code 返回码
     * @apiSuccess {List} data 数据信息get
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
    @GetMapping("/my")
    public Result getUser() {
        String principal = (String) SecurityUtils.getSubject().getPrincipal();
        try {
            UserEntity userEntity = userService.findByUsername(principal);
            return new Result(0, "查询成功", userEntity);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {get} api/v1/myms
     * @apiGroup wx
     * @apiVersion 1.0.0
     * @apiDescription 返回我的讲座列表。
     * @apiSuccess {String} message 访问状态
     * @apiSuccess {int} code 返回码
     * @apiSuccess {List} data 数据信息get
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
    @GetMapping("/myms")
    public Result getUserMedia() {
        String principal = (String) SecurityUtils.getSubject().getPrincipal();
        try {
            UserEntity userEntity = userService.findByUsername(principal);
            MediaEntity mediaEntity = mediaService.findMedia(userEntity);
            return new Result(0, "查询成功", mediaEntity);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {get} /api/v1/code2session
     * @apiGroup wx
     * @apiVersion 1.0.0
     * @apiDescription 根据code获取sessionid
     * @apiParam {String} code 微信code[必选]
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
    @RequestMapping("/code2session")
    private Object getSessionByCode(String code, HttpSession session) {
        //读取配置文件
        ConfigReadUtil s = ConfigReadUtil.getInstance();
        String requestUrl = s.getConfigItem("requestUrl");
        String appId = s.getConfigItem("appId");
        String appSecret = s.getConfigItem("appSecret");
        String grantType = s.getConfigItem("grantType");
        JSONObject result = new JSONObject();
        try {
            String url = requestUrl + "?appid=" + appId + "&secret=" + appSecret + "&js_code=" + code + "&grant_type="
                    + grantType;
            // 发送请求
            String data = HttpUtils.get(url);
            JSONObject jsonObject = JSON.parseObject(data);
            session.setAttribute(session.getId(), jsonObject.get("openid").toString());
            WxUserEntity entity = isWxUser(jsonObject.get("openid").toString());
            if (null != entity) {
                //设置返回的用户信息
                UserEntity userEntity = userService.get(entity.getUid());
                WxLoginSuccessModel model = new WxLoginSuccessModel();
                model.setUid(userEntity.getId());
                model.setHeader(userEntity.getHeader());
                model.setUserName(userEntity.getUsername());
                //对返回数据进行封装返回
                WxResultModel resultModel = new WxResultModel();
                resultModel.setUser(model);
                resultModel.setRelation(true);
                resultModel.setSessionid(session.getId());

                result.put("code", 0);
                result.put("msg", "登录成功");
                result.put("data", resultModel);

            } else {
                WxResultModel resultModel = new WxResultModel();
                resultModel.setRelation(false);
                resultModel.setSessionid(session.getId());
                result.put("code", 0);
                result.put("data", resultModel);
                result.put("msg", "无关联用户");
            }
            return result;
        } catch (Exception e) {
            result.put("code", 1);
            result.put("msg", e.getMessage());
            result.put("data", null);
            return result;
        }
    }

    /**
     * @api {get} /api/v1/wxlogin
     * @apiGroup wx
     * @apiVersion 1.0.0
     * @apiDescription 小程序登录
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
    @PostMapping("/wxlogin")
    public Object login(@RequestBody WXLoginModel loginModel, HttpSession session) {
        try {
            WxLoginSuccessModel loginSuccessModel = null;
            //从session中获取openid
            String openid = session.getAttribute(session.getId()).toString();
            //判断openid是否已经关联用户，如果已经关联解除关联从新绑定
            WxUserEntity wxUserEntity = wxUserService.findOneByOpenId(openid);
            if (null != wxUserEntity) {
                wxUserService.deletebyOpenId(wxUserEntity.getWeid());
            }
            if (0 == loginModel.getType()) {

                //用邮箱验证码登录
                String sessionCode = MD5.md5(session.getAttribute("loginMailCode").toString());
                String userCode = MD5.md5(loginModel.getPassword());
                UserEntity userEntity = userService.findByUsername(loginModel.getUsername());

                if (null != userEntity) {
                    if (sessionCode.equalsIgnoreCase(userCode)) {
                        //查找该用户的所属角色
                        String roleName = "";
                        UserRoleEntityKey roleEntityKey = userRoleService.get(userEntity.getId());
                        if (null != roleEntityKey) {
                            RoleEntity roleEntity = roleService.get(roleEntityKey.getRoleid());
                            roleName = roleEntity.getRolename();
                        }
                        loginSuccessModel = new WxLoginSuccessModel();
                        loginSuccessModel.setUid(userEntity.getId());
                        loginSuccessModel.setHeader(userEntity.getHeader());
                        loginSuccessModel.setUserName(userEntity.getUsername());
                        loginSuccessModel.setUserNameCN(userEntity.getUsernamecn());
                        loginSuccessModel.setRole(roleName);

                        session.setAttribute("user", loginSuccessModel);
                    }
                } else {
                    return new Result(1, "用户名不存在");
                }
            } else {
                //用用户名密码登录
                UserEntity userEntity = userService.wxlogin(loginModel.getUsername(),loginModel.getPassword());
                if (null != userEntity) {
                    //查找该用户的所属角色
                    String roleName = "";
                    UserRoleEntityKey roleEntityKey = userRoleService.get(userEntity.getId());
                    if (null != roleEntityKey) {
                        RoleEntity roleEntity = roleService.get(roleEntityKey.getRoleid());
                        roleName = roleEntity.getRolename();
                    }
                    loginSuccessModel = new WxLoginSuccessModel();
                    loginSuccessModel.setUid(userEntity.getId());
                    loginSuccessModel.setHeader(userEntity.getHeader());
                    loginSuccessModel.setUserName(userEntity.getUsername());
                    loginSuccessModel.setUserNameCN(userEntity.getUsernamecn());
                    loginSuccessModel.setRole(roleName);

                    session.setAttribute("user", loginSuccessModel);
                }else {
                    return new Result(1, "用户名或密码错误");
                }
            }
            return new Result(0, "登录成功",loginSuccessModel);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(1, "登录失败");
        }
    }

    /**
     * @api {get} /api/v1/wxlogout
     * @apiGroup wx
     * @apiVersion 1.0.0
     * @apiDescription 小程序退出
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
    @RequestMapping("/wxlogout")
    public Object logout(HttpSession session) {
        try {
            //解除openid和用户的绑定
            String openid = session.getAttribute(session.getId()).toString();
            wxUserService.deletebyOpenId(openid);
            // 清除session
            Enumeration<String> em = session.getAttributeNames();
            while (em.hasMoreElements()) {

                session.removeAttribute(em.nextElement().toString());
            }
            return new Result(0, "退出成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(1, "退出失败");
        }
    }

    /**
     * 判断openid是否关联用户
     *
     * @param openid
     * @return
     */
    private WxUserEntity isWxUser(String openid) {
        WxUserEntity entity = wxUserService.findOneByOpenId(openid);
        return entity;
    }
}
