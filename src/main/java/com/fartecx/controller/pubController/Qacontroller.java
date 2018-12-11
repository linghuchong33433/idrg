package com.fartecx.controller.pubController;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.pojo.QaEntity;
import com.fartecx.service.QaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取技术问答
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/27
 * Time:11:31
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping("/api/pub/v1")
public class Qacontroller {

    @Autowired
    private QaService qaService;

    /**
     * @api {get} /api/pub/v1/qa
     * @apiGroup pub_qa
     * @apiVersion 1.0.0
     * @apiDescription 获取技术问答主题列表
     * @apiParam {Integer} offset 第几页从1开始[可选]
     * @apiParam {Integer} limit 一页多少条[可选]
     * @apiParam {String} tiopicid 主题ID[必选]
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
    @GetMapping("/qa")
    public Object list(Integer offset,Integer limit,String tiopicid) {
        try {
            Integer num = null == offset ? 0 : offset;
            Integer size = null == limit ? 10 : limit;
            ExecutionResult reslut = qaService.list(num,size,tiopicid);
            return new Result(0,"查询成功",reslut);
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    @PostMapping("/qa")
    private Object save(@RequestBody QaEntity entity) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            entity.setModifytime(new Date());
            qaService.save(entity);
            return new Result(0,"添加成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }
}
