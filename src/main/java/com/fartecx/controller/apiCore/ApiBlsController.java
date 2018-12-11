package com.fartecx.controller.apiCore;


import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.service.BlsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/v1")
public class ApiBlsController {

    @Autowired
    private BlsService blsService;


    /**
     * @api {get} api/v1/bls
     * @apiGroup batchLog
     * @apiVersion 1.0.0
     * @apiDescription 批次耕作日志列表获取接口
     * @apiParam {String} batch: 批次id，必选。
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

    @GetMapping("/bls")
    public Result findBatchLogById(String batch){
        try {
            ExecutionResult executionResult=blsService.findBatchLogById(batch);
            return new Result(0, "查询成功", executionResult);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}
