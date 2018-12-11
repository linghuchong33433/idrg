package com.fartecx.controller.farmManager;


import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.service.FarmAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/fm/v1")
public class FarmAreaController {

    @Autowired
    private FarmAreaService farmAreaService;



    /**
     * @api {get} /api/fm/v1/areas
     * @apiGroup FarmArea
     * @apiVersion 1.0.0
     * @apiDescription 农场区域地块信息获取接口
     * @apiParam {Integer} flag flag参数
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
    @GetMapping("/areas")
    public Result findFarmAndFarmArea(Integer flag){
        try {
            ExecutionResult executionResult=farmAreaService.findFarmAndFarmArea(flag);
            return new Result(0, "查询成功", executionResult);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}
