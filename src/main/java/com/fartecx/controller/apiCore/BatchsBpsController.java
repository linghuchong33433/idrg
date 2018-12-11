package com.fartecx.controller.apiCore;


import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.service.BatchPhaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/v1/batchs/")
public class BatchsBpsController {


    @Autowired
    private BatchPhaseService batchPhaseService;

    /**
     * @api {get} api/v1/batchs/bps
     * @apiGroup batchPhase
     * @apiVersion 1.0.0
     * @apiDescription 批次耕作耗材列表获取接口
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


    @GetMapping("/bps")
    public Result findAllBatchPhase(){
        try {
            ExecutionResult executionResult=batchPhaseService.findAllBatchPhase();
            return new Result(0, "查询成功", executionResult);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}
