package com.fartecx.controller.system;

import com.fartecx.config.Result;
import com.fartecx.pojo.MaterialTypeEntity;
import com.fartecx.service.MaterialTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 投入品类型
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/23
 * Time:18:37
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/m/v1")
public class MaterialTypeController {

    @Autowired
    private MaterialTypeService materialTypeService;

    /**
     * @api {delete} /api/m/v1/
     * @apiGroup materialType
     * @apiVersion 1.0.0
     * @apiDescription 移除物质（投入品）类型
     * @apiParam {String} id 类型id[必选]
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
    @DeleteMapping("/mts/{id}")
    public Object delete(@PathVariable("id")String id){
        try{
            materialTypeService.delete(id);
            return new Result(0,"删除成功");
        } catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {put} /api/m/v1/
     * @apiGroup materialType
     * @apiVersion 1.0.0
     * @apiDescription 更新物质（投入品）类型
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
    @PutMapping("/mts")
    public Object update(@RequestBody MaterialTypeEntity entity){
        try{
            materialTypeService.update(entity);
            return new Result(0,"修改成功");
        } catch (Exception e) {
            return new Result(1, e.getMessage());
        }
    }

    /**
     * @api {post} /api/m/v1/
     * @apiGroup materialType
     * @apiVersion 1.0.0
     * @apiDescription 添加物质（投入品）类型
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
    @PostMapping("/mts")
    public Object save(@RequestBody MaterialTypeEntity entity){
        try{
            materialTypeService.save(entity);
           return new Result(0,"添加成功");
        } catch (Exception e) {
         return new Result(1,e.getMessage());
        }
    }
}
