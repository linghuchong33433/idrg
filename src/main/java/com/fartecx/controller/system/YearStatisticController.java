package com.fartecx.controller.system;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.YearStatisticEntity;
import com.fartecx.service.YearStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:11:21
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/m/v1")
public class YearStatisticController {

    @Autowired
    private YearStatisticService statisticService;

    /**
     * @api {get} /api/m/v1/ad
     * @apiGroup yearstatistic
     * @apiVersion 1.0.0
     * @apiDescription 获取年度统计数据
     * @apiParam {Integer} offset 第几页从1开始[可选]
     * @apiParam {Integer} limit 一页多少条[可选]
     * @apiParam {String} keyword 关键字Base64为[可选]
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
    @GetMapping("/ad")
    public Object list(Integer offset, Integer limit,String keyword) {
        try {
            int num = offset == null ? 0: offset;
            int size = limit == null ? 10: limit;
            ExecutionResult result = statisticService.list(num, size, keyword);
            return new Result(0,"查询成功",result);
        } catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {delete} /api/m/v1/ad/{year}
     * @apiGroup yearstatistic
     * @apiVersion 1.0.0
     * @apiDescription 获取年度统计数据
     * @apiParam {String} year 年份[必选]
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
    @DeleteMapping("/ad/{year}")
    public Object delete(@PathVariable("year")String year) {
        try {
            statisticService.delete(year);
            return new Result(0,"查询成功");
        } catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {get} /api/m/v1/ad
     * @apiGroup yearstatistic
     * @apiVersion 1.0.0
     * @apiDescription 添加年度统计数据
     * @apiParam {Object} entity 实体类[必须]
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
    @PutMapping("/ad")
    public Object save(@RequestBody YearStatisticEntity entity) {
        try {
            statisticService.save(entity);
            return new Result(0,"查询成功");
        } catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }
}
