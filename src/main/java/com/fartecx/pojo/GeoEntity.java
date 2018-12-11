package com.fartecx.pojo;

import java.io.Serializable;

public class GeoEntity implements Serializable {
    /**
     * 区域代码
国家用国家代码，比如：中国cn。
省份用省份代码，如广东44。
城市用省份+大写车牌代码，如云浮44W。
县用市+2位编号，如罗定：44W01。
县以下区域用县+2位编码：如44W0101。
最小的区域用县+2位编码+3位编码：如44W0101001.
     */
    private String code;

    /**
     * 所属上级区域的类型：world世界，nation国家，prov省份，city市，county县
     */
    private String type;

    /**
     * 区域名称
     */
    private String name;

    /**
     * 父节点
     */
    private String parent;

    /**
     * 本区域在GeoJson文件中的名称
     */
    private String jsonname;

    /**
     * 地图上显示区域的颜色
     */
    private String color;

    /**
     * 地图上标注的位置
     */
    private String position;

    /**
     * 面积，平方公里
     */
    private Double area;

    private static final long serialVersionUID = 1L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent == null ? null : parent.trim();
    }

    public String getJsonname() {
        return jsonname;
    }

    public void setJsonname(String jsonname) {
        this.jsonname = jsonname == null ? null : jsonname.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", parent=").append(parent);
        sb.append(", jsonname=").append(jsonname);
        sb.append(", color=").append(color);
        sb.append(", position=").append(position);
        sb.append(", area=").append(area);
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
        GeoEntity other = (GeoEntity) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParent() == null ? other.getParent() == null : this.getParent().equals(other.getParent()))
            && (this.getJsonname() == null ? other.getJsonname() == null : this.getJsonname().equals(other.getJsonname()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParent() == null) ? 0 : getParent().hashCode());
        result = prime * result + ((getJsonname() == null) ? 0 : getJsonname().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        return result;
    }
}