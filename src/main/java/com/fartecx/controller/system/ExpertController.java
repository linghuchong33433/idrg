package com.fartecx.controller.system;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.ExpertEntity;
import com.fartecx.service.ExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * 人才信息表
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/24
 * Time:23:09
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/m/v1")
public class ExpertController {

    @Autowired
    private ExpertService expertService;

    /**
     * @api {get} /api/m/v1/exps
     * @apiGroup expert
     * @apiVersion 1.0.0
     * @apiDescription 查询人才信息列表
     * @apiParam {Integer} offset 第几页从1开始[可选]
     * @apiParam {Integer} limit 一页多少条[可选]
     * @apiParam {String} keyword 关键字Base64为[可选]
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
    @GetMapping("/exps")
    public Object list(Integer offset, Integer limit,String keyword) {
        try {
            int num = offset == null ? 0: offset;
            int size = limit == null ? 10: limit;
            ExecutionResult result = expertService.list(num, size, keyword);
            return new Result(0,"查询成功",result);
        } catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {delete} /api/m/v1/exps{id}
     * @apiGroup expert
     * @apiVersion 1.0.0
     * @apiDescription 删除人才信息
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
    @DeleteMapping("/exps/{id}")
    public Object delete(@PathVariable("id") String id) {
        try {
            expertService.delete(id);
            return new Result(1,"删除成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {put} /api/m/v1/exps
     * @apiGroup expert
     * @apiVersion 1.0.0
     * @apiDescription 修改人才信息
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
    @PutMapping("/exps")
    public Object delete(@RequestBody ExpertEntity expertEntity) {
        try {
            expertService.update(expertEntity);
            return new Result(1,"修改成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {post} /api/m/v1/exps
     * @apiGroup expert
     * @apiVersion 1.0.0
     * @apiDescription 添加人才信息
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
    @PostMapping("/exps")
    public Object save(@RequestBody ExpertEntity expertEntity) {
        try {
            expertEntity.setId(UUID.randomUUID().toString());
            expertService.save(expertEntity);
            return new Result(1,"添加成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }
}
