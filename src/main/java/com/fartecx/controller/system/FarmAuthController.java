package com.fartecx.controller.system;

import com.fartecx.config.Result;
import com.fartecx.model.FarmModel;
import com.fartecx.pojo.FarmAuthEntity;
import com.fartecx.pojo.FarmEntity;
import com.fartecx.service.FarmAuthService;
import com.fartecx.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 农场与农场权限
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/24
 * Time:01:05
 * ========================
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/v1")
public class FarmAuthController {

    @Autowired
    private FarmService farmService;
    @Autowired
    private FarmAuthService farmAuthService;

    /**
     * @api {get} /api/v1/farm
     * @apiGroup farm
     * @apiVersion 1.0.0
     * @apiDescription 农场认证信息查看
     * @apiParam {String} id 农场信息id[必选]
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
    @GetMapping("/farm/{id}")
    public Object get(@PathVariable("id") String id) {
        try {
            //TODO 返回结果待修改
            FarmAuthEntity model = farmAuthService.get(id);
            return new Result(0, "查询成功", model);
        } catch (Exception e) {
            return new Result(1, "查询失败");
        }
    }

    /**
     * @api {post} /api/v1/farm
     * @apiGroup farm
     * @apiVersion 1.0.0
     * @apiDescription 提交农场申请认证
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
    @PostMapping("/farm")
    public Object save(@RequestBody FarmModel model) {

        try {
            int flag = 0; //0 禁用 1 通过 2不通过 3 新提交的申请
            //判断是否由业务管理员直接创建的
            boolean isCreate = null != model.getCreate() ? false : true;
            boolean isOwner = null != model.getOwner() ? false : true;
            if (isCreate == isOwner) {
                flag = 1;
            } else {
                flag = 3;
            }
            //添加农场信息
            FarmEntity farmEntity = new FarmEntity();
            farmEntity.setId(model.getId());
            farmEntity.setCode(model.getCode());
            farmEntity.setName(model.getName());
            farmEntity.setPosition(model.getPosition());
            farmEntity.setZoom(model.getZoom());
            farmEntity.setGeojson(model.getGeojson());
            farmEntity.setModifydate(model.getModifyDate());
            farmEntity.setOwner(model.getOwner());
            farmEntity.setFlag(flag);
            farmEntity.setShoworder(model.getShowOrder());
            farmEntity.setContactperson(model.getContactPerson());
            farmEntity.setContactphone(model.getContactPhone());
            farmEntity.setContactaddr(model.getContactAddr());
            farmEntity.setdesc(model.getDescStr());
            farmEntity.setBl(model.getBl());

            //添加农场权限
            FarmAuthEntity authEntity = new FarmAuthEntity();
            authEntity.setId(model.getId());
            authEntity.setApplydate(model.getApplyDate());
            authEntity.setAuthdate(model.getAuthDate());
            farmAuthService.save(authEntity);
            return new Result(0, "查询成功", model);
        } catch (Exception e) {
            return new Result(1, "查询失败");
        }
    }
}
