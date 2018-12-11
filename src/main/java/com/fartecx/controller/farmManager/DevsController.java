package com.fartecx.controller.farmManager;


import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.DeviceEntity;
import com.fartecx.service.DevsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fm/v1")
@CrossOrigin
public class DevsController  {

    @Autowired
    private DevsService devsService;

    /**
     * @api {get} api/fm/v1/devs
     * @apiGroup Devs
     * @apiVersion 1.0.0
     * @apiDescription 农场设备信息获取接口
     * @apiParam {Integer} limit，可选，分页大小，默认一页返回10条记录。
     * @apiParam {Integer} offset，可选，查询第几页，从0开始，默认返回第一页。
     * @apiParam {String} farm，可选，要查询设备所属的农场ID。
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
    @GetMapping("/devs")
    public Result findDevsByFarmId(Integer pageNum
            , Integer pageSize
            , String farmId){
        try {
            int num = pageNum == null ? 0: pageNum;
            int size = pageSize == null ? 10: pageSize;
            ExecutionResult executionResult=devsService.findDevsByFarmId(size,num,farmId);
            return new Result(0, "查询成功", executionResult);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }

    }

    /**
     * @api {get} api/fm/v1/devs
     * @apiGroup Devs
     * @apiVersion 1.0.0
     * @apiDescription 农场设备信息获取接口
     * @apiParam {Integer} limit，可选，分页大小，默认一页返回10条记录。
     * @apiParam {Integer} offset，可选，查询第几页，从0开始，默认返回第一页。
     * @apiParam {String} farm，可选，要查询设备所属的农场ID。
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
    @DeleteMapping("/devs/{id}")
    public Result delete(@PathVariable("id") String id){
        try {
            devsService.delete(id);
            return new Result(0, "删除成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }

    }

    /**
     * @api {put} /api/fm/v1/devs
     * @apiGroup Devs
     * @apiVersion 1.0.0
     * @apiDescription 修改设备信息
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
    @PutMapping("/devs")
    public Object update(@RequestBody DeviceEntity entity) {
        try {
            devsService.update(entity);
            return new Result(0,"修改成功");
        }catch (Exception e) {
            return new Result(1,"修改失败");
        }
    }

    /**
     * @api {post} /api/fm/v1/devs
     * @apiGroup Devs
     * @apiVersion 1.0.0
     * @apiDescription 添加设备信息
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
    @PostMapping("/devs")
    public Object save(@RequestBody DeviceEntity entity) {
        try {
            devsService.save(entity);
            return new Result(0,"添加成功");
        }catch (Exception e) {
            return new Result(1,"添加失败");
        }
    }

}
