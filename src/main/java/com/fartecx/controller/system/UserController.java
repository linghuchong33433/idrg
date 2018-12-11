package com.fartecx.controller.system;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.UserEntity;
import com.fartecx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/23
 * Time:19:10
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/m/v1")
public class UserController {


    @Autowired
    private UserService userService;

    /**
     * @api {get} /api/m/v1/u
     * @apiGroup user
     * @apiVersion 1.0.0
     * @apiDescription 获取用户列表
     * @apiParam {Integer} offset 第几页从1开始[可选]
     * @apiParam {Integer} limit 一页多少条[可选]
     * @apiParam {String} keyword 关键字Base64为[可选]
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
    @GetMapping("/u")
    public Object list(Integer offset, Integer limit,String keyword) {
        try {
            int num = offset == null ? 0: offset;
            int size = limit ==null ? 10 : limit;
            ExecutionResult result = userService.list(num, size,keyword);
            return new Result(0, "保存成功", result);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {delete} /api/m/v1/u
     * @apiGroup user
     * @apiVersion 1.0.0
     * @apiDescription 删除用户
     * @apiParam {Object} entity 实体类[必选]
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
    @DeleteMapping("/u/{id}")
    public Object delete(@PathVariable("id") String id) {
        try {
            userService.delete(id);
            return new Result(0, "删除成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {put} /api/m/v1/
     * @apiGroup user
     * @apiVersion 1.0.0
     * @apiDescription 修改用户
     * @apiParam {Object} entity 实体类[必选]
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
    @PutMapping("/u")
    public Object update(@RequestBody UserEntity entity) {
        try {
            userService.update(entity);
            return new Result(0, "修改成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {post} /api/m/v1/
     * @apiGroup user
     * @apiVersion 1.0.0
     * @apiDescription 添加用户
     * @apiParam {Object} entity 实体类[必选]
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
    @PostMapping("/u")
    public Object save(@RequestBody UserEntity entity) {
        try {
            userService.save(entity);
            return new Result(0, "保存成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}
