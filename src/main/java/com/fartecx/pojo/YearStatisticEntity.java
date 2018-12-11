package com.fartecx.pojo;

import java.io.Serializable;

public class YearStatisticEntity implements Serializable {
    private String id;

    /**
     * 地区，如：欧洲、中国、广东、湖南
     */
    private String geo;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 产量, kg
     */
    private Double chanliang;

    /**
     * 产值
     */
    private Double chanzhi;

    /**
     * 价格, 元
     */
    private Double jiage;

    /**
     * 进口量, kg
     */
    private Double jinkou;

    /**
     * 进口产值，元
     */
    private Double jkchanzhi;

    /**
     * 出口量, kg
     */
    private Double chukou;

    /**
     * 出口产值，元
     */
    private Double ckchanzhi;

    /**
     * 消费量
     */
    private Double xiaofei;

    /**
     * 毛利率
     */
    private Double maolilv;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo == null ? null : geo.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getChanliang() {
        return chanliang;
    }

    public void setChanliang(Double chanliang) {
        this.chanliang = chanliang;
    }

    public Double getChanzhi() {
        return chanzhi;
    }

    public void setChanzhi(Double chanzhi) {
        this.chanzhi = chanzhi;
    }

    public Double getJiage() {
        return jiage;
    }

    public void setJiage(Double jiage) {
        this.jiage = jiage;
    }

    public Double getJinkou() {
        return jinkou;
    }

    public void setJinkou(Double jinkou) {
        this.jinkou = jinkou;
    }

    public Double getJkchanzhi() {
        return jkchanzhi;
    }

    public void setJkchanzhi(Double jkchanzhi) {
        this.jkchanzhi = jkchanzhi;
    }

    public Double getChukou() {
        return chukou;
    }

    public void setChukou(Double chukou) {
        this.chukou = chukou;
    }

    public Double getCkchanzhi() {
        return ckchanzhi;
    }

    public void setCkchanzhi(Double ckchanzhi) {
        this.ckchanzhi = ckchanzhi;
    }

    public Double getXiaofei() {
        return xiaofei;
    }

    public void setXiaofei(Double xiaofei) {
        this.xiaofei = xiaofei;
    }

    public Double getMaolilv() {
        return maolilv;
    }

    public void setMaolilv(Double maolilv) {
        this.maolilv = maolilv;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", geo=").append(geo);
        sb.append(", year=").append(year);
        sb.append(", chanliang=").append(chanliang);
        sb.append(", chanzhi=").append(chanzhi);
        sb.append(", jiage=").append(jiage);
        sb.append(", jinkou=").append(jinkou);
        sb.append(", jkchanzhi=").append(jkchanzhi);
        sb.append(", chukou=").append(chukou);
        sb.append(", ckchanzhi=").append(ckchanzhi);
        sb.append(", xiaofei=").append(xiaofei);
        sb.append(", maolilv=").append(maolilv);
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
        YearStatisticEntity other = (YearStatisticEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGeo() == null ? other.getGeo() == null : this.getGeo().equals(other.getGeo()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getChanliang() == null ? other.getChanliang() == null : this.getChanliang().equals(other.getChanliang()))
            && (this.getChanzhi() == null ? other.getChanzhi() == null : this.getChanzhi().equals(other.getChanzhi()))
            && (this.getJiage() == null ? other.getJiage() == null : this.getJiage().equals(other.getJiage()))
            && (this.getJinkou() == null ? other.getJinkou() == null : this.getJinkou().equals(other.getJinkou()))
            && (this.getJkchanzhi() == null ? other.getJkchanzhi() == null : this.getJkchanzhi().equals(other.getJkchanzhi()))
            && (this.getChukou() == null ? other.getChukou() == null : this.getChukou().equals(other.getChukou()))
            && (this.getCkchanzhi() == null ? other.getCkchanzhi() == null : this.getCkchanzhi().equals(other.getCkchanzhi()))
            && (this.getXiaofei() == null ? other.getXiaofei() == null : this.getXiaofei().equals(other.getXiaofei()))
            && (this.getMaolilv() == null ? other.getMaolilv() == null : this.getMaolilv().equals(other.getMaolilv()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGeo() == null) ? 0 : getGeo().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getChanliang() == null) ? 0 : getChanliang().hashCode());
        result = prime * result + ((getChanzhi() == null) ? 0 : getChanzhi().hashCode());
        result = prime * result + ((getJiage() == null) ? 0 : getJiage().hashCode());
        result = prime * result + ((getJinkou() == null) ? 0 : getJinkou().hashCode());
        result = prime * result + ((getJkchanzhi() == null) ? 0 : getJkchanzhi().hashCode());
        result = prime * result + ((getChukou() == null) ? 0 : getChukou().hashCode());
        result = prime * result + ((getCkchanzhi() == null) ? 0 : getCkchanzhi().hashCode());
        result = prime * result + ((getXiaofei() == null) ? 0 : getXiaofei().hashCode());
        result = prime * result + ((getMaolilv() == null) ? 0 : getMaolilv().hashCode());
        return result;
    }
}