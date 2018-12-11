package com.fartecx.controller.pubController;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.service.RecallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/pub/v1")
public class RecallController {


    @Autowired
    private RecallService recallService;


    /**
     * @api {get} api/pub/v1/recall
     * @apiGroup recall
     * @apiVersion 1.0.0
     * @apiDescription 召回信息列表获取
     * @apiParam {Integer} offset 第几页从1开始[可选]
     * @apiParam {Integer} limit 一页多少条[可选]
     * @apiParam {String} keyword，可选，base64编码的搜索关键字
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

    @GetMapping("/recall")
    public Result findRecall(Integer offset,Integer limit,String keyword){
        try {
            int num = offset == null ? 0: offset;
            int size = limit == null ? 10: limit;
            ExecutionResult executionResult=recallService.list(num,size,keyword);
            return new Result(0, "查询成功", executionResult);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }





    /**
     * @api {get} api/pub/v1/recall/{id}
     * @apiGroup recall
     * @apiVersion 1.0.0
     * @apiDescription 召回信息详情获取
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

    @GetMapping("/recall/{id}")
    public Result findRecallById(@PathVariable("id") String id){
        try {
            ExecutionResult executionResult=recallService.findRecallById(id);
            return new Result(0, "查询成功", executionResult);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}
