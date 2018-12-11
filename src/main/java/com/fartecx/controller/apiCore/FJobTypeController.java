package com.fartecx.controller.apiCore;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.service.JobTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 耕作类型获取
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:17:24
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/v1")
public class FJobTypeController {

    @Autowired
    private JobTypeService jobTypeService;

    /**
     * @api {get} /api/v1/
     * @apiGroup jobtype
     * @apiVersion 1.0.0
     * @apiDescription 耕作类型获取
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
    @GetMapping("/jts")
    public Object list(Integer pageNum,Integer pageSize,String keyword) {
        try {
            int num = pageNum == null ? 0: pageNum;
            int size = pageSize == null ? 10: pageSize;
            ExecutionResult result = jobTypeService.list(num,size,keyword);
            return new Result(0,"查询成功",result);
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }
}
