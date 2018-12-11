package com.fartecx.controller.farmManager;


import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.FarmAreaEntity;
import com.fartecx.service.FarmAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/fm/v1")
public class AreasController {

    @Autowired
    private FarmAreaService farmAreaService;

    /**
     * @api {post} api/fm/v1/areas
     * @apiGroup FarmArea
     * @apiVersion 1.0.0
     * @apiDescription 添加农场区域地块
     * @apiParam  farmAreaEntity 添加areas
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


    @PostMapping("/areas")
    public Result addFarmArea(@RequestBody FarmAreaEntity farmAreaEntity){
        try {
            farmAreaService.addFarmArea(farmAreaEntity);
            return new Result(0, "查询成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }





    /**
     * @api {put} api/fm/v1/areas/{id}
     * @apiGroup farmInfo
     * @apiVersion 1.0.0
     * @apiDescription 更改农场区域地块信息
     * @apiParam  farmAreaEntity 添加areas
     * @apiParam {String} id 一页多少条[必填]
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
    @PutMapping("/areas/{id}")
    public Result addFarmArea(@RequestBody FarmAreaEntity farmAreaEntity,@PathVariable("id")String id){
        try {
            farmAreaService.updateFarmArea(farmAreaEntity,id);
            return new Result(0, "修改成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {delete} api/fm/v1/areas/{id}
     * @apiGroup farmInfo
     * @apiVersion 1.0.0
     * @apiDescription 删除农场区域地块信息
     * @apiParam  farmAreaEntity 添加areas
     * @apiParam {String} id[必填]
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
    @DeleteMapping("/areas/{id}")
    public Result deleteFarmArea(@PathVariable("id")String id){
        try {
            farmAreaService.deleteFarmArea(id);
            return new Result(0, "删除成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }







}
