package com.fartecx.controller.system;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.TruckEntity;
import com.fartecx.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

/**
 * 配送车辆
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:09:39
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/fm/v1")
public class TruckController {

    @Autowired
    private TruckService truckService;


    /**
     * @api {get} /api/fm/v1/tr
     * @apiGroup truck
     * @apiVersion 1.0.0
     * @apiDescription 查询车辆信息列表
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
    @GetMapping("/tr")
    public Object list(Integer offset, Integer limit, String keyword) {
        try {
            int num = offset == null ? 0 : offset;
            int size = limit == null ? 10 : limit;
            ExecutionResult result = truckService.list(num,size,keyword);
            return new Result(0, "查询成功",result);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {delete} /api/fm/v1/tr
     * @apiGroup truck
     * @apiVersion 1.0.0
     * @apiDescription 移除车辆信息
     * @apiParam {String} id 车辆信息id[必选]
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
    @DeleteMapping("/tr/{id}")
    public Object delete(@PathVariable("id") String id) {
        try {
            truckService.delete(id);
            return new Result(0, "删除成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {put} /api/fm/v1/tr
     * @apiGroup truck
     * @apiVersion 1.0.0
     * @apiDescription 修改车辆信息
     * @apiParam {Object}  entity 实体类[必选]
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
    @PutMapping("/tr")
    public Object update(@RequestBody TruckEntity entity) {
        try {
            truckService.update(entity);
            return new Result(0, "修改成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {post} /api/fm/v1/tr
     * @apiGroup truck
     * @apiVersion 1.0.0
     * @apiDescription 添加车辆信息
     * @apiParam {Object}  entity 实体类[必选]
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
    @PostMapping("/tr")
    public Object save(@RequestBody TruckEntity entity) {
        try {
           truckService.save(entity);
            return new Result(0, "保存成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}
