package com.fartecx.controller.apiCore;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.service.BatchsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ApiBatchsController {


    @Autowired
    private BatchsService batchsService;

    /**
     * @api {get} api/fm/v1/batchs/{id}
     * @apiGroup form、batch、batchLog、batchMaterial、material
     * @apiVersion 1.0.0
     * @apiDescription 批次追踪信息获取接口
     * @apiParam {String} id
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

    @GetMapping("/batchs/{id}")
    public Result findAllBatchs(@PathVariable("id") String id){
        try {
            ExecutionResult executionResult=batchsService.findAllBatchs(id);
            return new Result(0, "查询成功", executionResult);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}
