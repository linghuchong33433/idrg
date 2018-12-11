package com.fartecx.controller.bigDateController;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api/bd/v1")
public class StatisticController {

    @Autowired
    private StatisticService statisticService;


    /**
     * @api {get} api/bd/v1/statistic
     * @apiGroup yearStatistic、geo
     * @apiVersion 1.0.0
     * @apiDescription 世界各国大数据查询接口
     * @apiParam {String} group，可选，返回下一级的统计数据
     * @apiParam {String} region, 可选，返回本级统计数据
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



    @GetMapping("/statistic")
    public Result findStatistic(String group,
                                  String region){
        try {
            Map map =statisticService.findStatistic(group,region);
            return new Result(0, "查询成功", map);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}
