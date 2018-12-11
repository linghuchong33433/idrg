package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class BatchLogEntity implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 批次
     */
    private String batch;

    /**
     * 批次耕作的阶段
     */
    private String phase;

    /**
     * 地块描述
     */
    private String desc;

    /**
     * 耕作日期
     */
    private Date operationdate;

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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase == null ? null : phase.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Date getOperationdate() {
        return operationdate;
    }

    public void setOperationdate(Date operationdate) {
        this.operationdate = operationdate;
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
        sb.append(", batch=").append(batch);
        sb.append(", phase=").append(phase);
        sb.append(", desc=").append(desc);
        sb.append(", operationdate=").append(operationdate);
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
        BatchLogEntity other = (BatchLogEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBatch() == null ? other.getBatch() == null : this.getBatch().equals(other.getBatch()))
            && (this.getPhase() == null ? other.getPhase() == null : this.getPhase().equals(other.getPhase()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getOperationdate() == null ? other.getOperationdate() == null : this.getOperationdate().equals(other.getOperationdate()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBatch() == null) ? 0 : getBatch().hashCode());
        result = prime * result + ((getPhase() == null) ? 0 : getPhase().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getOperationdate() == null) ? 0 : getOperationdate().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        return result;
    }
}