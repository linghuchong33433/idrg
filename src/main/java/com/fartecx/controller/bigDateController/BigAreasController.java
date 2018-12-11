package com.fartecx.controller.bigDateController;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.service.AreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api/bd/v1")
public class BigAreasController {

    @Autowired
    private AreasService areasService;


    /**
     * @api {get} api/bd/v1/areas
     * @apiGroup geo(表名)
     * @apiVersion 1.0.0
     * @apiDescription 肉桂种植分布区域信息获取接口
     * @apiParam {String} group，返回下一级的区域信息
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
    public Result findAreas(String group){
        try {
            Map map =areasService.findAreas(group);
            return new Result(0, "查询成功", map);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}
