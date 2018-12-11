package com.fartecx.controller.system;

import com.fartecx.config.Result;
import com.fartecx.pojo.RecallEntity;
import com.fartecx.service.RecallService;
import org.springframework.web.bind.annotation.*;

/**
 * 召回信息表
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/24
 * Time:23:26
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/m/v1")
public class ReCallController {

    private RecallService recallService;

    /**
     * @api {delete} /api/m/v1/recall{id}
     * @apiGroup recall
     * @apiVersion 1.0.0
     * @apiDescription 移除召回信息
     * @apiParam {String} id 召回信息id[必选]
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
    @DeleteMapping("/recall/{id}")
    public Object delete(@PathVariable("id") String id) {
        try {
            recallService.delete(id);
            return new Result(0, "删除成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {put} /api/m/v1/recall
     * @apiGroup recall
     * @apiVersion 1.0.0
     * @apiDescription 修改召回信息
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
    @PutMapping("/recall")
    public Object update(@RequestBody RecallEntity entity) {
        try {
            recallService.update(entity);
            return new Result(0, "修改成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {post} /api/m/v1/recall
     * @apiGroup recall
     * @apiVersion 1.0.0
     * @apiDescription 增加召回信息
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
    @PostMapping("/recall")
    public Object save(@RequestBody RecallEntity entity) {
        try {
            recallService.save(entity);
            return new Result(0, "保存成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

}
