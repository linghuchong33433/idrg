package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class FarmAuthEntity implements Serializable {
    private String id;

    /**
     * 申请认证日期
     */
    private Date applydate;

    /**
     * 认证日期
     */
    private Date authdate;

    /**
     * 备注，可填写认证失败原因。
     */
    private String note;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public Date getAuthdate() {
        return authdate;
    }

    public void setAuthdate(Date authdate) {
        this.authdate = authdate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", applydate=").append(applydate);
        sb.append(", authdate=").append(authdate);
        sb.append(", note=").append(note);
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
        FarmAuthEntity other = (FarmAuthEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getApplydate() == null ? other.getApplydate() == null : this.getApplydate().equals(other.getApplydate()))
            && (this.getAuthdate() == null ? other.getAuthdate() == null : this.getAuthdate().equals(other.getAuthdate()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getApplydate() == null) ? 0 : getApplydate().hashCode());
        result = prime * result + ((getAuthdate() == null) ? 0 : getAuthdate().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }
}