package com.fartecx.controller.farmManager;


import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.OrderEntity;
import com.fartecx.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/fm/v1")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;


    /**
     * @api {get} api/fm/v1/orders
     * @apiGroup order
     * @apiVersion 1.0.0
     * @apiDescription 订单列表获取接口
     * @apiParam {Integer} pageNum 第几页从1开始[必填]
     * @apiParam {Integer} pageSize 一页多少条[必填]
     * @apiParam {String} batch，可选，查询该批次的任务
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

    @GetMapping("/orders")
    public Result FindOrders(Integer pageNum, Integer pageSize, String batch) {
        try {
            int num = pageNum == null ? 0 : pageNum;
            int size = pageSize == null ? 10 : pageSize;
            ExecutionResult executionResult = ordersService.FindOrders(num, size, batch);
            return new Result(0, "查询成功", executionResult);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }


    /**
     * @api {POST} api/fm/v1/orders
     * @apiGroup order
     * @apiVersion 1.0.0
     * @apiDescription 添加订单
     * @apiParam orderEntity
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
    @PostMapping("/orders")
    public Result saveOrders(@RequestBody OrderEntity orderEntity) {
        try {
            ordersService.saveOrders(orderEntity);
            return new Result(0, "添加成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }


    /**
     * @api {PUT} api/fm/v1/orders/{id}
     * @apiGroup order
     * @apiVersion 1.0.0
     * @apiDescription 更改订单信息
     * @apiParam {String} id
     * @apiParam OrderEntity
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
    @PutMapping("/orders/{id}")
    public Result updateOrder(@PathVariable("id") String id,
                              @RequestBody OrderEntity orderEntity) {
        try {
            ordersService.updateOrder(id, orderEntity);
            return new Result(0, "更改成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }


    /**
     * @api {DELETE} api/fm/v1/orders/{id}
     * @apiGroup order
     * @apiVersion 1.0.0
     * @apiDescription 移除订单信息
     * @apiParam {String} ID
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

    @DeleteMapping("/orders/{id}")
    public Result deleteOrder(@PathVariable("id") String id) {
        try {
            ordersService.deleteOrder(id);
            return new Result(0, "删除成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

}
