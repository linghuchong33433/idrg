package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class JobLogEntity implements Serializable {
    private String id;

    /**
     * 任务ID
     */
    private String job;

    /**
     * 任务操作人员
     */
    private String staff;

    /**
     * 更新时间
     */
    private Date modifydate;

    /**
     * 标志位，1接受任务，2完成任务
     */
    private Integer flag;

    /**
     * 描述
     */
    private String desc;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff == null ? null : staff.trim();
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getDesc() {
        return desc;
    }

    public void setdesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", job=").append(job);
        sb.append(", staff=").append(staff);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", flag=").append(flag);
        sb.append(", desc=").append(desc);
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
        JobLogEntity other = (JobLogEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getJob() == null ? other.getJob() == null : this.getJob().equals(other.getJob()))
            && (this.getStaff() == null ? other.getStaff() == null : this.getStaff().equals(other.getStaff()))
            && (this.getModifydate() == null ? other.getModifydate() == null : this.getModifydate().equals(other.getModifydate()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getJob() == null) ? 0 : getJob().hashCode());
        result = prime * result + ((getStaff() == null) ? 0 : getStaff().hashCode());
        result = prime * result + ((getModifydate() == null) ? 0 : getModifydate().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        return result;
    }
}