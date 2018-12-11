package com.fartecx.controller.system;

import com.alibaba.fastjson.JSONObject;
import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.ShowFarmEntity;
import com.fartecx.service.ShowFarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * 农场秀
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/23
 * Time:14:18
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/m/v1")
public class ShowFarmController {

    @Autowired
    private ShowFarmService showService;

    /**
     * @api {get} /api/m/v1/show
     * @apiGroup showFarm
     * @apiVersion 1.0.0
     * @apiDescription 农场秀管理列表获取
     * @apiParam {Integer} offset 第几页从1开始[可选]
     * @apiParam {Integer} limit 一页多少条[可选]
     * @apiParam {String} keyword 搜索关键字Base64位[可选]
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
    @GetMapping("/show")
    public Object list(Integer offset, Integer limit, String keyword) {

        try {
            int num = offset == null ? 0: offset;
            int size = limit == null ? 10: limit;
            ExecutionResult result = showService.list(num, size, keyword);
            return new Result(0, "查询成功", result);
        } catch (Exception e) {
            return new Result(0, e.getMessage());
        }

    }

    /**
     * @api {delete} /api/m/v1/show/{id}
     * @apiGroup showFarm
     * @apiVersion 1.0.0
     * @apiDescription 移除农场秀数据
     * @apiParam {String} id 农场秀ID[必须]
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
    @DeleteMapping("/show/{id}")
    public Object delete(@PathVariable("id") String id) {
        try {
            showService.delete(id);
            return new Result(0, "shanc成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {put} /api/m/v1/show
     * @apiGroup showFarm
     * @apiVersion 1.0.0
     * @apiDescription 更改农场秀
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
    @PutMapping("/show")
    public Object update(@RequestBody ShowFarmEntity entity) {
        try {
            showService.update(entity);
            return new Result(0, "更新成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {post} /api/m/v1/show
     * @apiGroup showFarm
     * @apiVersion 1.0.0
     * @apiDescription 添加农场秀数据
     * @apiParam {Object} entity 实体类[必须]
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
    @PostMapping("/show")
    public Object save(@RequestBody ShowFarmEntity entity) {
        try {
            entity.setId(UUID.randomUUID().toString());
            showService.save(entity);
            return new Result(0, "添加成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

}
