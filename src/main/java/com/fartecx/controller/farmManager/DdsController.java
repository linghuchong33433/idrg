package com.fartecx.controller.farmManager;


import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.service.DdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/fm/v1/")
@CrossOrigin

public class DdsController {


    @Autowired
    private DdsService ddsService;



    /**
     * @api {get} api/fm/v1/dds
     * @apiGroup deviceData
     * @apiVersion 1.0.0
     * @apiDescription 设备数据查询接口
     * @apiParam {String} device: 必选，设备ID.
     * @apiParam {Date} from: 可选，要查询的起始时间。
     * @apiParam {Date} to: 可选，要查询的起始时间。
     * @apiParam {Double} temp:返回温度。
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

    @GetMapping("/dds")
    public Result findDeviceData(String device, Date from, Date to, Double temp){
        try {
            ExecutionResult executionResult=ddsService.findDeviceData(device,from,to,temp);
            return new Result(0, "查询成功", executionResult);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}
