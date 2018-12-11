package com.fartecx.model;

import lombok.Data;

import java.util.Date;

/**
 * Farm与FarmAuth接收参数
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/24
 * Time:01:11
 * ========================
 */
@Data
public class FarmModel {
    /**
     * ID
     * 命名规则：
     * 省份代码（如广东44）+城市大写车牌代码（如云浮44W） + 3位数字编码
     */
    private String id;
    /**
     * 农场编码(本市范围），3位数字。
     */

    private String code;
    /**
     * 农场名称
     */

    private String name;
    /**
     * 位置经纬度，逗号分隔（经度, 纬度)
     */

    private String position;
    /**
     * 默认地图级别
     */

    private Integer zoom;
    /**
     * 农场的地理信息文件(GeoJson)路径
     */

    private String geojson;
    /**
     * 更新时间
     */

    private Date modifyDate;
    /**
     * 农场主用户ID
     */

    private String owner;
    /**
     * 标志位，0表示禁用，1为审核通过，2审核不通过，3新提交的申请
     */

    private Integer flag;
    /**
     * 显示顺序
     */

    private Integer showOrder;
    /**
     * 联系人
     */

    private String contactPerson;

    private String contactPhone;
    /**
     * 联系地址
     */

    private String contactAddr;
    /**
     * 备注
     */

    private String descStr;
    /**
     * 营业执照（business licence）的照片路径
     */

    private String bl;

    /**
     * 申请认证日期
     */
    private Date applyDate;
    /**
     * 认证日期
     */
    private Date authDate;
    /**
     * 备注，可填写认证失败原因。
     */
    private String note;
    /**
     * 此参数表示是业务管理员直接创建的，设置农场状态为通过
     */
    private String create;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getZoom() {
        return zoom;
    }

    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

    public String getGeojson() {
        return geojson;
    }

    public void setGeojson(String geojson) {
        this.geojson = geojson;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactAddr() {
        return contactAddr;
    }

    public void setContactAddr(String contactAddr) {
        this.contactAddr = contactAddr;
    }

    public String getDescStr() {
        return descStr;
    }

    public void setDescStr(String descStr) {
        this.descStr = descStr;
    }

    public String getBl() {
        return bl;
    }

    public void setBl(String bl) {
        this.bl = bl;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Date getAuthDate() {
        return authDate;
    }

    public void setAuthDate(Date authDate) {
        this.authDate = authDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }
}
