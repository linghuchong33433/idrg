package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class FarmAreaEntity implements Serializable {
    /**
     * 区域ID，为农场ID+3位数字地块编码
     */
    private String id;

    /**
     * 所属农场
     */
    private String farm;

    /**
     * 3位数字地块编码
     */
    private String code;

    /**
     * 父区域ID
     */
    private String parent;

    /**
     * 地块面积
     */
    private Double area;

    /**
     * 种植区域名称
     */
    private String name;

    /**
     * 种植区域在农场GeoJson中的名字。
     */
    private String regionname;

    /**
     * 区域颜色
     */
    private String color;

    /**
     * 标志位，1有效。0无效。删除地块信息时，若该地块关联了耕作、批次等信息，则不会真正删除，而是将该标志位设置为0.
     */
    private Integer flag;

    /**
     * 种植区域描述
     */
    private String desc;

    /**
     * 更新时间
     */
    private Date modifytime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm == null ? null : farm.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent == null ? null : parent.trim();
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname == null ? null : regionname.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
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

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", farm=").append(farm);
        sb.append(", code=").append(code);
        sb.append(", parent=").append(parent);
        sb.append(", area=").append(area);
        sb.append(", name=").append(name);
        sb.append(", regionname=").append(regionname);
        sb.append(", color=").append(color);
        sb.append(", flag=").append(flag);
        sb.append(", desc=").append(desc);
        sb.append(", modifytime=").append(modifytime);
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
        FarmAreaEntity other = (FarmAreaEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFarm() == null ? other.getFarm() == null : this.getFarm().equals(other.getFarm()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getParent() == null ? other.getParent() == null : this.getParent().equals(other.getParent()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getRegionname() == null ? other.getRegionname() == null : this.getRegionname().equals(other.getRegionname()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFarm() == null) ? 0 : getFarm().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getParent() == null) ? 0 : getParent().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getRegionname() == null) ? 0 : getRegionname().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        return result;
    }
}