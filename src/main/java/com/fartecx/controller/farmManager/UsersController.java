package com.fartecx.controller.farmManager;


import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/fm/v1")
public class UsersController {

    @Autowired
    private UsersService usersService;

    /**
     * @api {get} api/fm/v1/users
     * @apiGroup user
     * @apiVersion 1.0.0
     * @apiDescription 系统用户基本信息列表获取接口
     * @apiParam {Integer} pageNum 第几页从1开始[必填]
     * @apiParam {Integer} pageSize 一页多少条[必填]
     * @apiParam {String} keyword 关键字
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

    @GetMapping("/users")
    public Result findUsersByName(Integer pageNum
            , Integer pageSize
            , String keyword){
        try {
            int num = pageNum == null ? 0: pageNum;
            int size = pageSize == null ? 10: pageSize;
            ExecutionResult executionResult=usersService.findUsersByName(size,num,keyword);
            return new Result(0, "查询成功", executionResult);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}
