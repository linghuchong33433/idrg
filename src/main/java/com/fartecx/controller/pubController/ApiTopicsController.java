package com.fartecx.controller.pubController;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.dao.CustomDao;
import com.fartecx.pojo.TopicEntity;
import com.fartecx.service.PubTopicsService;
import com.fartecx.service.QaService;
import com.fartecx.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.ref.PhantomReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 公共服务平台技术问答列表
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/27
 * Time:09:42
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/pub/v1")
public class ApiTopicsController {

    @Autowired
    private PubTopicsService pubTopicsService;

    @Autowired
    private TopicService topicService;

    /**
     * @api {get} /api/pub/v1/topics
     * @apiGroup pub_topic
     * @apiVersion 1.0.0
     * @apiDescription 获取技术问答主题列表
     * @apiParam {Integer} offset 第几页从1开始[可选]
     * @apiParam {Integer} limit 一页多少条[可选]
     * @apiParam {String} keyword 搜索关键字base64位[可选]
     * @apiParam {String} my 带上此参数获取与自己相关的，不带参数获取所有列表[可选]
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
    @GetMapping("/topics")
    public Object list(Integer offset,Integer limit,String keyword,String myId) {
        try {
            Integer num = null == offset ? 0 : offset;
            Integer size = null == limit ? 10 : limit;
            String key = "".equals(keyword) ? null : keyword;
            String my = "".equals(myId) ? null : myId;
            List<Map> reslut = pubTopicsService.list(num,size,key,my);
            return new Result(0,"查询成功",reslut);
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {post} /api/pub/v1/topics
     * @apiGroup pub_topic
     * @apiVersion 1.0.0
     * @apiDescription 获取技术问答主题列表
     * @apiParam {Object} object 字段（name 技术问答主题名称 createperson  主题创建人ID）[可选]
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
    @PostMapping("/topics")
    public Object save(@RequestBody TopicEntity entity) {
        try {
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            entity.setId(UUID.randomUUID().toString());
            entity.setCreatedate(sdf.parse(sdf.format(new Date())));
            entity.setNeedverify(0);
            topicService.save(entity);
            return new Result(0,"添加成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }
}
