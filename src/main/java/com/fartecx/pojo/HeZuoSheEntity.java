package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class HeZuoSheEntity implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 合作社名称
     */
    private String name;

    /**
     * 位置经纬度，逗号分隔（经度, 纬度)
     */
    private String position;

    /**
     * 标志位，0不在地图上显示，1正常显示
     */
    private Integer flag;

    /**
     * 描述
     */
    private String desc;

    /**
     * 默认排序，越大越靠后。
     */
    private Integer defaultorder;

    /**
     * 更新时间
     */
    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getDesc() {
        return desc;
    }

    public void setdesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Integer getDefaultorder() {
        return defaultorder;
    }

    public void setDefaultorder(Integer defaultorder) {
        this.defaultorder = defaultorder;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", position=").append(position);
        sb.append(", flag=").append(flag);
        sb.append(", desc=").append(desc);
        sb.append(", defaultorder=").append(defaultorder);
        sb.append(", modifydate=").append(modifydate);
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
        HeZuoSheEntity other = (HeZuoSheEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getDefaultorder() == null ? other.getDefaultorder() == null : this.getDefaultorder().equals(other.getDefaultorder()))
            && (this.getModifydate() == null ? other.getModifydate() == null : this.getModifydate().equals(other.getModifydate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getDefaultorder() == null) ? 0 : getDefaultorder().hashCode());
        result = prime * result + ((getModifydate() == null) ? 0 : getModifydate().hashCode());
        return result;
    }
}