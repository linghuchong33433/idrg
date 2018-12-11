package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class ShowFarmEntity implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 农场
     */
    private String farm;

    /**
     * 简介
     */
    private String brief;

    /**
     * 宣传图片URL，用于在主页显示，点击后跳转的秀的详情页。
     */
    private String image;

    /**
     * 农场秀详情页
     */
    private String detail;

    /**
     * 农场秀发布时间
     */
    private Date pubdate;

    /**
     * 标志位：0：记录无效。1：记录有效
     */
    private Integer flag;

    /**
     * 排序
     */
    private Integer showorder;

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

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", farm=").append(farm);
        sb.append(", brief=").append(brief);
        sb.append(", image=").append(image);
        sb.append(", detail=").append(detail);
        sb.append(", pubdate=").append(pubdate);
        sb.append(", flag=").append(flag);
        sb.append(", showorder=").append(showorder);
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
        ShowFarmEntity other = (ShowFarmEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFarm() == null ? other.getFarm() == null : this.getFarm().equals(other.getFarm()))
            && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()))
            && (this.getPubdate() == null ? other.getPubdate() == null : this.getPubdate().equals(other.getPubdate()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getShoworder() == null ? other.getShoworder() == null : this.getShoworder().equals(other.getShoworder()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFarm() == null) ? 0 : getFarm().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        result = prime * result + ((getPubdate() == null) ? 0 : getPubdate().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getShoworder() == null) ? 0 : getShoworder().hashCode());
        return result;
    }
}