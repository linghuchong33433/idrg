package com.fartecx.controller.farmManager;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.JobEntity;
import com.fartecx.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 工作任务表
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:17:36
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/fm/v1")
public class JobController {

    @Autowired
    private JobService jobService;

    /**
     * @api {get} /api/fm/v1/jobs
     * @apiGroup job
     * @apiVersion 1.0.0
     * @apiDescription 查询所有列表
     * @apiParam {String} id 任务id[必选]
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
    @GetMapping("/jobs")
    public Object list(Integer pageNum,Integer pageSize,String batch,String phase) {
        try {
            int num = pageNum == null ? 0: pageNum;
            int size = pageSize == null ? 10: pageSize;
            ExecutionResult result = jobService.list(num,size,batch,phase);
            return new Result(0,"查询成功",result);
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    //TODO 从session获取用户信息根据登录用户查询任务列表

    /**
     * @api {delete} /api/fm/v1/jobs
     * @apiGroup job
     * @apiVersion 1.0.0
     * @apiDescription 删除任务
     * @apiParam {String} id 任务id[必选]
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
    @DeleteMapping("/jobs/{id}")
    public Object delete(@PathVariable("id")String id) {
        try {
            jobService.delete(id);
            return new Result(0,"删除成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {put} /api/fm/v1/jobs
     * @apiGroup job
     * @apiVersion 1.0.0
     * @apiDescription 修改任务
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
    @PutMapping("/jobs")
    public Object update(@RequestBody JobEntity entity) {
        try {
            jobService.update(entity);
            return new Result(0,"修改成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {post} /api/fm/v1/jobs
     * @apiGroup job
     * @apiVersion 1.0.0
     * @apiDescription 添加任务
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
    @PostMapping("/jobs")
    public Object save(@RequestBody JobEntity entity) {
        try {
            jobService.save(entity);
            return new Result(0,"保存成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }
}
