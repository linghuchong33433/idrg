package com.fartecx.controller.farmManager;

import com.fartecx.config.Result;
import com.fartecx.pojo.JobLogEntity;
import com.fartecx.service.JobLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 工作任务日志表
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/26
 * Time:13:44
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/fm/v1")
public class JobLogController {

    @Autowired
    private JobLogService jobLogService;

    /**
     * @api {post} /api/fm/v1/
     * @apiGroup joblog
     * @apiVersion 1.0.0
     * @apiDescription 添加任务执行日志
     * @apiParam {Object} entity 实体类[必选]
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
    @PostMapping("/jls")
    public Object save(@RequestBody JobLogEntity entity) {
        try {
            jobLogService.save(entity);
            return new Result(0,"添加成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

}
