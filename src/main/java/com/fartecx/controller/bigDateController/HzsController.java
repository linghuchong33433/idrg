package com.fartecx.controller.bigDateController;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.service.HzsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/bd/v1")
public class HzsController {

    @Autowired
    private HzsService hzsService;


    /**
     * @api {get} api/bd/v1/hzs
     * @apiGroup heZuoShe
     * @apiVersion 1.0.0
     * @apiDescription 罗定专业合作社信息获取接口
     * @apiParam {Integer} pageNum 第几页从1开始[必填]
     * @apiParam {Integer} pageSize 一页多少条[必填]
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


    @GetMapping("/hzs")
    public Result findHeZuoShe(Integer pageNum
            , Integer pageSize){
        try {
            int num = null == pageNum ? 0 : pageNum;
            int size = null == pageSize ?10 : pageSize;
            ExecutionResult executionResult=hzsService.findHeZuoShe(num,size);
            return new Result(0, "查询成功", executionResult);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

}
