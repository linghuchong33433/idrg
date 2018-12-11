package com.fartecx.controller.system;

import com.fartecx.config.Result;
import com.fartecx.pojo.AnnounceEntity;
import com.fartecx.service.AnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 公共信息
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/24
 * Time:23:51
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/m/v1")
public class AnnounceController {

    @Autowired
    private AnnounceService announceService;

    /**
     * @api {delete} /api/m/v1/annou/{id}
     * @apiGroup announce
     * @apiVersion 1.0.0
     * @apiDescription 移除公告信息
     * @apiParam {String} id 公共id[必填]
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
    @DeleteMapping("/annou/{id}")
    public Object delete(@PathVariable("id") String id) {
        try {
            announceService.delete(id);
            return new Result(0,"删除成功");
        } catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {put} /api/m/v1/annou
     * @apiGroup announce
     * @apiVersion 1.0.0
     * @apiDescription 修改公告信息
     * @apiParam {Object} entity 实体对象[必填]
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
    @PutMapping("/annou")
    public Object update(@RequestBody AnnounceEntity entity) {
        try {
            announceService.update(entity);
            return new Result(0,"修改成功");
        } catch (Exception e) {
            return new Result(0,e.getMessage());
        }
    }

    /**
     * @api {post} /api/m/v1/annou
     * @apiGroup announce
     * @apiVersion 1.0.0
     * @apiDescription 添加公告信息
     * @apiParam {Object} entity 实体对象[必填]
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
    @PostMapping("/annou")
    public Object save(@RequestBody AnnounceEntity entity) {
        try {
            announceService.save(entity);
            return new Result(0,"保存成功");
        } catch (Exception e) {
            return new Result(0,e.getMessage());
        }

    }
}
