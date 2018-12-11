package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsernamecn() {
        return usernamecn;
    }

    public void setUsernamecn(String usernamecn) {
        this.usernamecn = usernamecn == null ? null : usernamecn.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getLocked() {
        return locked;
    }

    public String getCredentialsSalt() {
        return username + salt;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
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
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header == null ? null : header.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", usernamecn=").append(usernamecn);
        sb.append(", password=").append(password);
        sb.append(", locked=").append(locked);
        sb.append(", salt=").append(salt);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", header=").append(header);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserEntity other = (UserEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getUsernamecn() == null ? other.getUsernamecn() == null : this.getUsernamecn().equals(other.getUsernamecn()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getLocked() == null ? other.getLocked() == null : this.getLocked().equals(other.getLocked()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getModifydate() == null ? other.getModifydate() == null : this.getModifydate().equals(other.getModifydate()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getHeader() == null ? other.getHeader() == null : this.getHeader().equals(other.getHeader()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getUsernamecn() == null) ? 0 : getUsernamecn().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getLocked() == null) ? 0 : getLocked().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getModifydate() == null) ? 0 : getModifydate().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getHeader() == null) ? 0 : getHeader().hashCode());
        return result;
    }
}