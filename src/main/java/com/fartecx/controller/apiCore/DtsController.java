package com.fartecx.controller.apiCore;


import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.DeviceEntity;
import com.fartecx.service.DtsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fm/v1")
@CrossOrigin
public class DtsController {


    @Autowired
    private DtsService dtsService;


    /**
     * @api {get} api/v1/dts
     * @apiGroup deviceType
     * @apiVersion 1.0.0
     * @apiDescription 设备类型获取接口
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


    @GetMapping("/dts")
    public Object findAllDeviceType() {
        try {
            ExecutionResult executionResult=dtsService.findAllDeviceType();
            return new Result(0, "查询成功", executionResult);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}

