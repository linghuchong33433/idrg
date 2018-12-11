package com.fartecx.controller.system;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.HeZuoSheEntity;
import com.fartecx.service.HeZuoSheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 合作社
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:09:39
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/m/v1")
public class HeZuoSheController {

    @Autowired
    private HeZuoSheService heZuoSheService;
    
    
    /**
     * @api {get} /api/fm/v1/hzs
     * @apiGroup HeZuoShe
     * @apiVersion 1.0.0
     * @apiDescription 查询合作社列表
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
    @GetMapping("/hzs")
    public Object list(Integer offset, Integer limit, String keyword) {
        try {
            int num = offset == null ? 0 : offset;
            int size = limit == null ? 10 : limit;
            ExecutionResult result = heZuoSheService.list(num,size,keyword);
            return new Result(0, "查询成功",result);
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {delete} /api/fm/v1/hzs
     * @apiGroup HeZuoShe
     * @apiVersion 1.0.0
     * @apiDescription 移除合作社信息
     * @apiParam {String} id 车辆信息id[必选]
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
    @DeleteMapping("/hzs/{id}")
    public Object delete(@PathVariable("id") String id) {
        try {
            heZuoSheService.delete(id);
            return new Result(0, "删除成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
    
    /**
     * @api {put} /api/fm/v1/hzs
     * @apiGroup HeZuoShe
     * @apiVersion 1.0.0
     * @apiDescription 修改合作社信息
     * @apiParam {Object}  entity 实体类[必选]
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
    @PutMapping("/hzs")
    public Object update(@RequestBody HeZuoSheEntity entity) {
        try {
            heZuoSheService.update(entity);
            return new Result(0, "修改成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
    
    /**
     * @api {post} /api/fm/v1/hzs
     * @apiGroup HeZuoShe
     * @apiVersion 1.0.0
     * @apiDescription 添加合作社信息
     * @apiParam {Object}  entity 实体类[必选]
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
     * "code": 1,h
     * "message": "查询失败"
     * }
     */
    @PostMapping("/hzs")
    public Object save(@RequestBody HeZuoSheEntity entity) {
        try {
           heZuoSheService.save(entity);
            return new Result(0, "保存成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }
}
