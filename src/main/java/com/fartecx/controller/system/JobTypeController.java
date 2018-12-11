package com.fartecx.controller.system;

import com.fartecx.config.Result;
import com.fartecx.pojo.JobTypeEntity;
import com.fartecx.service.JobTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * 制作类型
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:00:17
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/m/v1")
public class JobTypeController {

    @Autowired
    private JobTypeService jobTypeService;

    /**
     * @api {delete} /api/m/v1/
     * @apiGroup jobType
     * @apiVersion 1.0.0
     * @apiDescription 移除耕作类型
     * @apiParam {String} id 耕作类型id[必选]
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
    @DeleteMapping("/jts/{id}")
    public Object delete(@PathVariable("id") String id) {
        try {
            jobTypeService.delete(id);
            return new Result(0, "删除成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {put} /api/m/v1/
     * @apiGroup jobType
     * @apiVersion 1.0.0
     * @apiDescription 修改耕作类型
     * @apiSampleRequest localhost:8080/api/m/v1/jts
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
    @PutMapping("/jts")
    public Object update(@RequestBody JobTypeEntity entity) {
        try {
            jobTypeService.update(entity);
            return new Result(0,"修改成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {post} /api/m/v1/
     * @apiGroup jobType
     * @apiVersion 1.0.0
     * @apiDescription 添加耕作类型
     * @apiSampleRequest localhost:8080/api/m/v1/jts
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
    @PostMapping("/jts")
    public Object save(@RequestBody JobTypeEntity entity) {

        try {
            entity.setId(UUID.randomUUID().toString());
            jobTypeService.save(entity);
            return new Result(0, "添加成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}
