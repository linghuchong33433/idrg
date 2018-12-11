package com.fartecx.controller.farmManager;

import com.fartecx.config.Result;
import com.fartecx.pojo.JobStaffEntity;
import com.fartecx.service.JobStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 工作任务表
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/26
 * Time:11:22
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/fm/v1")
public class JobStaffController {

    @Autowired
    private JobStaffService staffService;

    /**
     * @api {delete} /api/fm/v1/jss/{id}
     * @apiGroup jobstaff
     * @apiVersion 1.0.0
     * @apiDescription 移除任务执行人员
     * @apiParam {String} id 任务id[必选]
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
    @DeleteMapping("/jss/{id}")
    public Object delete(@PathVariable("id") String id) {
        try {
            staffService.delete(id);
            return new Result(0,"保存成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {get} /api/fm/v1/jss
     * @apiGroup jobstaff
     * @apiVersion 1.0.0
     * @apiDescription 添加任务执行人员
     * @apiParam {Object} entity 实体类[必选]
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
    @PostMapping("/jss")
    public Object save(@RequestBody JobStaffEntity entity) {
        try {
            staffService.save(entity);
            return new Result(0,"保存成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }
}
