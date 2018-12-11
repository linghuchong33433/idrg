package com.fartecx.controller.farmManager;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.service.MaterialTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 物资类型
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:16:44
 * ========================
 */
@RestController
@RequestMapping("/api/fm/v1")
@CrossOrigin
public class MaterialTyperController {

    @Autowired
    private MaterialTypeService materialTypeService;

    /**
     * @api {get} /api/fm/v1/mts
     * @apiGroup materialType
     * @apiVersion 1.0.0
     * @apiDescription 查询物资类型
     * @apiParam {Integer} pageNum 当前页[可选]
     * @apiParam {Integer} pageSize 一页多少条[可选]
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
    @GetMapping("/mts")
    public Object list(Integer pageNum,Integer pageSize,String keyword) {
        try {
            int num = null == pageNum ? 0: pageNum;
            int size = null == pageSize ? 10: pageSize;
            ExecutionResult result = materialTypeService.list(num,size,keyword);
            return new Result(0,"查询成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }
}
