package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class JobEntity implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 批次
     */
    private String batch;

    /**
     * 工作类型
     */
    private String type;

    /**
     * 开始日期
     */
    private Date fromdate;

    private Date todate;

    /**
     * 录入时间
     */
    private Date createdate;

    /**
     * 设备名称
     */
    private String desc;

    /**
     * 阶段：0创建；1进行中；2已提交；3已完成；
     */
    private Integer phase;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getDesc() {
        return desc;
    }

    public void setdesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Integer getPhase() {
        return phase;
    }

    public void setPhase(Integer phase) {
        this.phase = phase;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", batch=").append(batch);
        sb.append(", type=").append(type);
        sb.append(", fromdate=").append(fromdate);
        sb.append(", todate=").append(todate);
        sb.append(", createdate=").append(createdate);
        sb.append(", desc=").append(desc);
        sb.append(", phase=").append(phase);
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
        JobEntity other = (JobEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBatch() == null ? other.getBatch() == null : this.getBatch().equals(other.getBatch()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getFromdate() == null ? other.getFromdate() == null : this.getFromdate().equals(other.getFromdate()))
            && (this.getTodate() == null ? other.getTodate() == null : this.getTodate().equals(other.getTodate()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getPhase() == null ? other.getPhase() == null : this.getPhase().equals(other.getPhase()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBatch() == null) ? 0 : getBatch().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getFromdate() == null) ? 0 : getFromdate().hashCode());
        result = prime * result + ((getTodate() == null) ? 0 : getTodate().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getPhase() == null) ? 0 : getPhase().hashCode());
        return result;
    }
}