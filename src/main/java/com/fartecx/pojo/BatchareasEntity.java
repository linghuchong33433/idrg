package com.fartecx.pojo;

import java.io.Serializable;

public class BatchareasEntity implements Serializable {
    /**
     * 批次ID
     */
    private String batch;

    /**
     * 地块ID
     */
    private String area;

    private static final long serialVersionUID = 1L;

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", batch=").append(batch);
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
        BatchareasEntity other = (BatchareasEntity) that;
        return (this.getBatch() == null ? other.getBatch() == null : this.getBatch().equals(other.getBatch()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBatch() == null) ? 0 : getBatch().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        return result;
    }
}