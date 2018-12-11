package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class BatchEntity implements Serializable {
    /**
     * 批次ID
命名规则：
农场ID + 年份 + 3位编码，共计13位。
即：
省份代码（如广东44）+城市大写车牌代码（如云浮44W） + 3位农场编码 + 4位年份 + 2位编码
     */
    private String id;

    /**
     * 批次所属农场
     */
    private String farm;

    /**
     * 批次所在年份
     */
    private Integer year;

    /**
     * 年度批次号
     */
    private String code;

    /**
     * 地块描述
     */
    private String desc;

    /**
     * 更新时间
     */
    private Date modifytime;

    /**
     * 批次产值，元
     */
    private Double chanzhi;

    /**
     * 批次产量，千克
     */
    private Double chanliang;

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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Double getChanzhi() {
        return chanzhi;
    }

    public void setChanzhi(Double chanzhi) {
        this.chanzhi = chanzhi;
    }

    public Double getChanliang() {
        return chanliang;
    }

    public void setChanliang(Double chanliang) {
        this.chanliang = chanliang;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", farm=").append(farm);
        sb.append(", year=").append(year);
        sb.append(", code=").append(code);
        sb.append(", desc=").append(desc);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", chanzhi=").append(chanzhi);
        sb.append(", chanliang=").append(chanliang);
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
        BatchEntity other = (BatchEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFarm() == null ? other.getFarm() == null : this.getFarm().equals(other.getFarm()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()))
            && (this.getChanzhi() == null ? other.getChanzhi() == null : this.getChanzhi().equals(other.getChanzhi()))
            && (this.getChanliang() == null ? other.getChanliang() == null : this.getChanliang().equals(other.getChanliang()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFarm() == null) ? 0 : getFarm().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        result = prime * result + ((getChanzhi() == null) ? 0 : getChanzhi().hashCode());
        result = prime * result + ((getChanliang() == null) ? 0 : getChanliang().hashCode());
        return result;
    }
}