package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class FarmEntity implements Serializable {
    /**
     * ID
命名规则：
省份代码（如广东44）+城市大写车牌代码（如云浮44W） + 3位数字编码
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
    private Date modifydate;

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
    private Integer showorder;

    /**
     * 联系人
     */
    private String contactperson;

    private String contactphone;

    /**
     * 联系地址
     */
    private String contactaddr;

    /**
     * 备注
     */
    private String desc;

    /**
     * 营业执照（business licence）的照片路径
     */
    private String bl;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
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
        this.geojson = geojson == null ? null : geojson.trim();
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getShoworder() {
        return showorder;
    }

    public void setShoworder(Integer showorder) {
        this.showorder = showorder;
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson == null ? null : contactperson.trim();
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone == null ? null : contactphone.trim();
    }

    public String getContactaddr() {
        return contactaddr;
    }

    public void setContactaddr(String contactaddr) {
        this.contactaddr = contactaddr == null ? null : contactaddr.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setdesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getBl() {
        return bl;
    }

    public void setBl(String bl) {
        this.bl = bl == null ? null : bl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", position=").append(position);
        sb.append(", zoom=").append(zoom);
        sb.append(", geojson=").append(geojson);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", owner=").append(owner);
        sb.append(", flag=").append(flag);
        sb.append(", showorder=").append(showorder);
        sb.append(", contactperson=").append(contactperson);
        sb.append(", contactphone=").append(contactphone);
        sb.append(", contactaddr=").append(contactaddr);
        sb.append(", desc=").append(desc);
        sb.append(", bl=").append(bl);
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
        FarmEntity other = (FarmEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getZoom() == null ? other.getZoom() == null : this.getZoom().equals(other.getZoom()))
            && (this.getGeojson() == null ? other.getGeojson() == null : this.getGeojson().equals(other.getGeojson()))
            && (this.getModifydate() == null ? other.getModifydate() == null : this.getModifydate().equals(other.getModifydate()))
            && (this.getOwner() == null ? other.getOwner() == null : this.getOwner().equals(other.getOwner()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getShoworder() == null ? other.getShoworder() == null : this.getShoworder().equals(other.getShoworder()))
            && (this.getContactperson() == null ? other.getContactperson() == null : this.getContactperson().equals(other.getContactperson()))
            && (this.getContactphone() == null ? other.getContactphone() == null : this.getContactphone().equals(other.getContactphone()))
            && (this.getContactaddr() == null ? other.getContactaddr() == null : this.getContactaddr().equals(other.getContactaddr()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getBl() == null ? other.getBl() == null : this.getBl().equals(other.getBl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getZoom() == null) ? 0 : getZoom().hashCode());
        result = prime * result + ((getGeojson() == null) ? 0 : getGeojson().hashCode());
        result = prime * result + ((getModifydate() == null) ? 0 : getModifydate().hashCode());
        result = prime * result + ((getOwner() == null) ? 0 : getOwner().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getShoworder() == null) ? 0 : getShoworder().hashCode());
        result = prime * result + ((getContactperson() == null) ? 0 : getContactperson().hashCode());
        result = prime * result + ((getContactphone() == null) ? 0 : getContactphone().hashCode());
        result = prime * result + ((getContactaddr() == null) ? 0 : getContactaddr().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getBl() == null) ? 0 : getBl().hashCode());
        return result;
    }
}