package com.fartecx.controller.farmManager;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.MaterialEntity;
import com.fartecx.service.MaterialService;
import javafx.geometry.Pos;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 农场投入类型
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:17:05
 * ========================
 */
@RestController
@RequestMapping("/api/fm/v1")
@CrossOrigin
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    /**
     * @api {get} /api/fm/v1/ms
     * @apiGroup material
     * @apiVersion 1.0.0
     * @apiDescription 农场物资信息列表
     * @apiParam {Integer} pageNum 当前页[可选]
     * @apiParam {Integer} pageSize 一页多少条[可选]
     * @apiParam {String} falg 投入产品状态 （不传 查询所有 0 不可用 1 可用）  [可选]
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
    @GetMapping("/ms")
    public Object list(Integer pageNum,Integer pageSize,String flag) {
        try {
            int num = pageNum == null ? 0: pageNum;
            int size = pageSize == null ? 10: pageSize;
            ExecutionResult result = materialService.list(num,size,flag);
            return new Result(0,"查询成功",result);
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }
    /**
     * @api {pur} /api/m/v1/ms/{id}
     * @apiGroup material
     * @apiVersion 1.0.0
     * @apiDescription 移除农场投入类型
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
    @DeleteMapping("/ms/{id}")
    public Object delete(@PathVariable("id")String id) {
        try {
            materialService.delete(id);
            return new Result(0,"删除成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {put} /api/m/v1/ms
     * @apiGroup material
     * @apiVersion 1.0.0
     * @apiDescription 修改农场投入类型
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
    @PutMapping("/ms")
    public Object update(@RequestBody MaterialEntity entity) {
        try {
            materialService.update(entity);
            return new Result(0,"修改成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {get} /api/m/v1/ms
     * @apiGroup material
     * @apiVersion 1.0.0
     * @apiDescription 添加农场投入类型
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
    @PostMapping("/ms")
    public Object save(@RequestBody MaterialEntity entity) {
        try {
            materialService.save(entity);
            return new Result(0,"添加成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }
}
