package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class ExpertServiceLogEntity implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 发起人ID
     */
    private String q;

    /**
     * 提供服务的专家ID
     */
    private String a;

    /**
     * 开始时间
     */
    private Date start;

    /**
     * 结束时间
     */
    private Date finish;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q == null ? null : q.trim();
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a == null ? null : a.trim();
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", q=").append(q);
        sb.append(", a=").append(a);
        sb.append(", start=").append(start);
        sb.append(", finish=").append(finish);
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
        ExpertServiceLogEntity other = (ExpertServiceLogEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getQ() == null ? other.getQ() == null : this.getQ().equals(other.getQ()))
            && (this.getA() == null ? other.getA() == null : this.getA().equals(other.getA()))
            && (this.getStart() == null ? other.getStart() == null : this.getStart().equals(other.getStart()))
            && (this.getFinish() == null ? other.getFinish() == null : this.getFinish().equals(other.getFinish()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getQ() == null) ? 0 : getQ().hashCode());
        result = prime * result + ((getA() == null) ? 0 : getA().hashCode());
        result = prime * result + ((getStart() == null) ? 0 : getStart().hashCode());
        result = prime * result + ((getFinish() == null) ? 0 : getFinish().hashCode());
        return result;
    }
}