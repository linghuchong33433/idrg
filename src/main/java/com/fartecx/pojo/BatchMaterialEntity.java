package com.fartecx.pojo;

import java.io.Serializable;

public class BatchMaterialEntity implements Serializable {
    /**
     * 批次日志ID
     */
    private String id;

    /**
     * 批次
     */
    private String batchlog;

    /**
     * 使用的投入品
     */
    private String material;

    /**
     * 投入品用量
     */
    private Double used;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBatchlog() {
        return batchlog;
    }

    public void setBatchlog(String batchlog) {
        this.batchlog = batchlog == null ? null : batchlog.trim();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public Double getUsed() {
        return used;
    }

    public void setUsed(Double used) {
        this.used = used;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", batchlog=").append(batchlog);
        sb.append(", material=").append(material);
        sb.append(", used=").append(used);
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
        BatchMaterialEntity other = (BatchMaterialEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBatchlog() == null ? other.getBatchlog() == null : this.getBatchlog().equals(other.getBatchlog()))
            && (this.getMaterial() == null ? other.getMaterial() == null : this.getMaterial().equals(other.getMaterial()))
            && (this.getUsed() == null ? other.getUsed() == null : this.getUsed().equals(other.getUsed()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBatchlog() == null) ? 0 : getBatchlog().hashCode());
        result = prime * result + ((getMaterial() == null) ? 0 : getMaterial().hashCode());
        result = prime * result + ((getUsed() == null) ? 0 : getUsed().hashCode());
        return result;
    }
}