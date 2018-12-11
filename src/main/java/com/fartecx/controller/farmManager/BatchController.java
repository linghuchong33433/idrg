package com.fartecx.controller.farmManager;


import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.BatchEntity;
import com.fartecx.service.BatchsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/fm/v1")
public class BatchController {

    @Autowired
    private BatchsService batchsService;



    /**
     * @api {get} api/fm/v1/batchs
     * @apiGroup batch
     * @apiVersion 1.0.0
     * @apiDescription 批次列表获取接口
     * @apiParam {Integer} pageNum 第几页从1开始[必填]
     * @apiParam {Integer} pageSize 一页多少条[必填]
     * @apiParam {String} keyword 关键字
     * @apiParam {String}  farm farm农场id
     * @apiParam {Integer} year，可选，要查询的批次年份。
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
    @GetMapping("/batchs")
    public Result findBatchByfarmAndYear(Integer pageNum
            , Integer pageSize
            , String keyword,String farm,Integer year){
        try {
            int num = pageNum == null ? 0: pageNum;
            int size = pageSize == null ? 10: pageSize;
            ExecutionResult executionResult=batchsService.findBatchByfarmAndYear(size,num,keyword,farm,year);
            return new Result(0, "查询成功", executionResult);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }




    /**
     * @api {Post} api/fm/v1/batchs
     * @apiGroup batch
     * @apiVersion 1.0.0
     * @apiDescription 添加农场农作物批次
     * @apiParam batchEntity 农作物批次对象
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

    @PostMapping("/batchs")
    public Result saveBatch(@RequestBody BatchEntity batchEntity){
        try {
            batchsService.saveBatch(batchEntity);
            return new Result(0, "保存成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {Put} api/fm/v1//batchs/{id}
     * @apiGroup batch
     * @apiVersion 1.0.0
     * @apiDescription 更改批次描述信息
     * @apiParam batchEntity 农作物批次对象
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


    @PutMapping("/batchs/{id}")
    public Result updateBatch(@RequestBody BatchEntity batchEntity,@PathVariable("id") String id){
        try {
            batchsService.updateBatch(batchEntity,id);
            return new Result(0, "更新成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {Delete} api/fm/v1/batchs/{id}
     * @apiGroup batch
     * @apiVersion 1.0.0
     * @apiDescription 移除批次信息
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


    @DeleteMapping("/batchs/{id}")
    public Result deleteBatch(@PathVariable("id") String id){
        try {
            batchsService.deleteBatch(id);
            return new Result(0, "删除成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }




}



