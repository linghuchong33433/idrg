package com.fartecx.model;

import lombok.Data;

import java.util.Date;

/**
 * 添加农场雇员信息
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:15:40
 * ========================
 */
@Data
public class FarmStaffModel {
    /**
     * user id, uuid
     */
    private String id;

    /**
     * 注册账号，为手机号或邮箱。
     */
    private String username;

    /**
     * 用户名称
     */
    private String usernamecn;

    /**
     * MD5 hashed password
     */
    private String password;

    /**
     * 0: unlock(useable); 1::locked(unuseable).
     */
    private Integer locked;

    /**
     * salt for hash password
     */
    private String salt;

    /**
     * 更新时间
     */
    private Date modifydate;

    private String phone;

    private String email;

    /**
     * 头像路径URL
     */
    private String header;
    /**
     * 所属农场
     */
    private String farm;

    /**
     * 更新时间
     */
    private Date modifytime;

    /**
     * 标志位,1为管理员。
     */
    private Integer flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsernamecn() {
        return usernamecn;
    }

    public void setUsernamecn(String usernamecn) {
        this.usernamecn = usernamecn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
