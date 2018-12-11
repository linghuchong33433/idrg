package com.fartecx.controller.farmManager;

import com.fartecx.config.Result;
import com.fartecx.pojo.BatchEntity;
import com.fartecx.pojo.BatchLogEntity;
import com.fartecx.pojo.FarmAreaEntity;
import com.fartecx.service.BlsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fm/v1")
@CrossOrigin
public class BlsController {

    @Autowired
    private BlsService blsService;

    /**
     * @api {POST} api/fm/v1/bls
     * @apiGroup batchLog
     * @apiVersion 1.0.0
     * @apiDescription 添加批次耕作日志
     * @apiParam {Integer} pageNum 第几页从1开始[必填]
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
     * @apiErrorExamp
     * le {json}   错误返回样例
     * {
     * "code": 1,
     * "message": "查询失败"
     * }
     */

    @PostMapping("/bls")
    public Result saveBatchLog(@RequestBody BatchLogEntity batchLogEntity){
        try {
            blsService.saveBatchLog(batchLogEntity);
            return new Result(0, "添加成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }




    /**
     * @api {get} api/fm/v1/bls/{id}
     * @apiGroup batch
     * @apiVersion 1.0.0
     * @apiDescription 更改批次耕作日志
     * @apiParam batchEntity
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
    @PutMapping("/bls{id}")
    public Result saveBatch(@RequestBody BatchEntity batchEntity){
        try {
            blsService.saveBatch(batchEntity);
            return new Result(0, "添加成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }


    /**
     * @api {DELETE} api/fm/v1/bls/{id}
     * @apiGroup batchLog
     * @apiVersion 1.0.0
     * @apiDescription 移除批次耕作日志
     * @apiParam {String} id
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
    @DeleteMapping("/bls{id}")
    public Result deleteBatchLog(@PathVariable("id") String id){
        try {
            blsService.deleteBatchLog(id);
            return new Result(0, "删除成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

}
