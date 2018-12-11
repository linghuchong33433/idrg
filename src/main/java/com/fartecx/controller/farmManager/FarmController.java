package com.fartecx.controller.farmManager;


import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fm/v1")
@CrossOrigin
public class FarmController {

    @Autowired
    private FarmService farmService;


    /**
     * @api {get} /api/fm/v1/farms
     * @apiGroup farm
     * @apiVersion 1.0.0
     * @apiDescription 农场列表获取接口
     * @apiParam {Integer} pageNum 每页条数
     * @apiParam {Integer} pageSize 当前页
     * @apiParam {String} keyword 搜索关键字
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
    @GetMapping("/farms")
    public Result findFarmsByName(Integer pageNum
                                  ,Integer pageSize
                                  ,String keyword){
        try {
            int num = pageNum == null ? 0: pageNum;
            int size = pageSize == null ? 10: pageSize;
            ExecutionResult executionResult=farmService.findFarmsByName(num,size,keyword);
            return new Result(0, "查询成功", executionResult);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }




    /**
     * @api {get} /api/fm/v1/farms/{id}
     * @apiGroup farm
     * @apiVersion 1.0.0
     * @apiDescription 农场信息获取接口
     * @apiParam {String} id 农场id
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
    @GetMapping("/farms/{id}")
    public Result findOtherFarmsById(@PathVariable("id") String id){
        try {
            ExecutionResult executionResult=farmService.findOtherFarmsById(id);
            return new Result(0, "查询成功", executionResult);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }



}
