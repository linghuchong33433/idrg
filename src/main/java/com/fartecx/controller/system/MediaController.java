package com.fartecx.controller.system;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.AblePersonEntity;
import com.fartecx.pojo.MediaEntity;
import com.fartecx.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 讲座信息表
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:11:42
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/m/v1")
public class MediaController {

    @Autowired
    private MediaService mediaService;

    /**
     * @api {get} /api/m/v1/ms
     * @apiGroup media
     * @apiVersion 1.0.0
     * @apiDescription 查询讲座信息
     * @apiParam {Integer} offset 第几页从1开始[可选]
     * @apiParam {Integer} limit 一页多少条[可选]
     * @apiParam {String} keyword 搜索关键字Base64位[可选]
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
    @RequestMapping("/ms")
    public Object list(Integer offset,Integer limit,String keyword) {
        try {
            int num = offset == null ? 0: offset;
            int size = limit == null ? 10: limit;
            ExecutionResult result = mediaService.list(num, size, keyword);
            return new Result(0, "查询成功", result);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }


    /**
     * @api {delete} /api/m/v1/ms
     * @apiGroup media
     * @apiVersion 1.0.0
     * @apiDescription 删除讲座信息
     * @apiParam {String} id id[必选]
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
    @DeleteMapping("/ms/{id}")
    public Object delete(@PathVariable("id") String id) {
        try {
            mediaService.delete(id);
            return new Result(0, "删除成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }

    }

    /**
     * @api {put} /api/m/v1/ms
     * @apiGroup media
     * @apiVersion 1.0.0
     * @apiDescription 更改讲座信息
     * @apiParam {Object} entity 实体对象[必填]
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
    @PutMapping(value = "/ms")
    public Object update(@RequestBody MediaEntity entity) {
        try {
            mediaService.update(entity);
            return new Result(0, "修改成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {post} /api/m/v1/ms
     * @apiGroup media
     * @apiVersion 1.0.0
     * @apiDescription 添加讲座信息
     * @apiParam {Object} entity 实体对象[必填]
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
    @PostMapping("/ms")
    public Object save(@RequestBody MediaEntity entity) {
        try {
            mediaService.save(entity);
            return new Result(0,"添加成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

}
