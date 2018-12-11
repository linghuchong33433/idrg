package com.fartecx.controller.farmManager;

import com.fartecx.config.ExecutionResult;
import com.fartecx.config.Result;
import com.fartecx.model.FarmStaffModel;
import com.fartecx.pojo.StaffEntity;
import com.fartecx.pojo.UserEntity;
import com.fartecx.service.StaffsService;
import com.fartecx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/fm/v1")
public class StaffsController {

    @Autowired
    private StaffsService staffsService;
    @Autowired
    private UserService userService;

    /**
     * @api {get} /api/fm/v1/
     * @apiGroup staffs
     * @apiVersion 1.0.0
     * @apiDescription 根据id查询农场数据
     * @apiParam {Integer} pageNum 当前页[可选]
     * @apiParam {Integer} pageSize 一页多少条[可选]
     * @apiParam {String} keyword 搜索关键字Base64位[可选]
     * @apiParam {String} farmId 农场id[必选]
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
    @GetMapping("/staffs")
    public Object list(Integer pageNum,Integer pageSize,String keyword,String farmId) {
        try {
            int num = null == pageNum ? 0: pageNum;
            int size = null == pageSize ? 10: pageSize;
            String key = null == keyword ? "": keyword;
            ExecutionResult result = staffsService.findStaffByUsers(num,size,key,farmId);
            return new Result(0,"查询成功",result);
        }catch (Exception e) {
        return new Result(1,"查询失败");
        }
    }

    /**
     * @api {put} /api/fm/v1/staffs
     * @apiGroup staffs
     * @apiVersion 1.0.0
     * @apiDescription 修改农场雇员
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
    @PutMapping("/staffs")
    public Object update(@RequestBody FarmStaffModel model) {
        try {

            return new Result(0,"修改成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }

    /**
     * @api {post} /api/fm/v1/staffs
     * @apiGroup staffs
     * @apiVersion 1.0.0
     * @apiDescription 增加农场雇员
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
    @PostMapping("/staffs")
    public Object save(@RequestBody FarmStaffModel model) {
        try {
            //TODO 将角色设置为农场操作人员对应字段
            //添加用户信息
            UserEntity userEntity = new UserEntity();
            String uuid = UUID.randomUUID().toString();
            userEntity.setId(uuid);
            userEntity.setUsername(model.getUsername());
            userEntity.setUsernamecn(model.getUsernamecn());
            userEntity.setPassword(model.getPassword());
            userEntity.setLocked(model.getLocked());
            userEntity.setSalt(model.getSalt());
            userEntity.setModifydate(model.getModifydate());
            userEntity.setPhone(model.getPhone());
            userEntity.setEmail(model.getEmail());
            userEntity.setHeader(model.getHeader());
            userService.save(userEntity);

            //关联农场信息
            StaffEntity staffEntity = new StaffEntity();
            staffEntity.setFarm(model.getFarm());
            staffEntity.setModifytime(model.getModifytime());
            staffEntity.setFlag(model.getFlag());
            staffsService.save(staffEntity);
            return new Result(0,"添加成功");
        }catch (Exception e) {
            return new Result(1,e.getMessage());
        }
    }
}
