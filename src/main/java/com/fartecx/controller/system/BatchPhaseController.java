package com.fartecx.controller.system;

import com.fartecx.config.Result;
import com.fartecx.pojo.BatchPhaseEntity;
import com.fartecx.service.BatchPhaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 批次阶段
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/23
 * Time:19:01
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/m/v1")
public class BatchPhaseController {

    @Autowired
    private BatchPhaseService batchPhaseService;

    /**
     * @api {delete} /api/m/v1/
     * @apiGroup batchPhase
     * @apiVersion 1.0.0
     * @apiDescription 移除批次状态
     * @apiSampleRequest localhost:8080/api/m/v1/bps/{id}
     * @apiParam {String} id 批次状态id[必选]
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
    @DeleteMapping("/bps/{id}")
    public Object delete(@PathVariable("id") String id) {
        try {
            batchPhaseService.delete(id);
            return new Result(0, "删除成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {put} /api/m/v1/
     * @apiGroup batchPhase
     * @apiVersion 1.0.0
     * @apiDescription 更新批次状态
     * @apiParam {Object} entity 实体类[必选]
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
    @PutMapping("/bps")
    public Object update(@RequestBody BatchPhaseEntity entity) {
        try {
            batchPhaseService.update(entity);
            return new Result(0, "修改成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {post} /api/m/v1/
     * @apiGroup batchPhase
     * @apiVersion 1.0.0
     * @apiDescription 添加批次状态
     * @apiParam {Object} entity 实体类[必选]
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
    @PostMapping("/bps")
    public Object save(@RequestBody BatchPhaseEntity entity) {
        try {
            batchPhaseService.save(entity);
            return new Result(0, "添加成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}
