package com.fartecx.controller.farmManager;


import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.BatchLogEntity;
import com.fartecx.service.BlmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/fm/v1")
public class BlmsController {


    @Autowired
    private BlmsService blmsService;

    /**
     * @api {POST} api/fm/v1/blms
     * @apiGroup batchLog
     * @apiVersion 1.0.0
     * @apiDescription 添加批次耕作耗材
     * @apiParam {String} batchLog: 批次耕作日志ID，必选。
     * @apiParam {String} material: 耕作物资ID，必选
     * @apiParam {Double} use: 耕作物资用量，必选
     * @apiParam batchLogEntity
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


    @PostMapping("/blms")
    public Object saveBatchLogAndMaterial(@RequestBody BatchLogEntity batchLogEntity,
                                          String batchLog,
                                          String material,
                                          Double use) {
        try {
            blmsService.saveBatchLogAndMaterial(batchLogEntity,batchLog,material,use);
            return new Result(0, "添加成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }




    /**
     * @api {DELETE} api/fm/v1/blms/{id}
     * @apiGroup batchMaterial
     * @apiVersion 1.0.0
     * @apiDescription 移除批次耕作耗材
     * @apiParam {String} id
     * @apiParam BatchLogEntity
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
    @DeleteMapping("/blms/{id}")
    public Object DeleteBatchAndBatchMaterial(@PathVariable("id") String id) {
        try {
            blmsService.DeleteBatchAndBatchMaterial(id);
            return new Result(0, "删除成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}
