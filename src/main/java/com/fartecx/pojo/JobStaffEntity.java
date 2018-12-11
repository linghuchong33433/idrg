package com.fartecx.pojo;

import java.io.Serializable;

public class JobStaffEntity implements Serializable {
    /**
     * 任务ID
     */
    private String job;

    /**
     * 员工
     */
    private String staff;

    private static final long serialVersionUID = 1L;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", job=").append(job);
        sb.append(", staff=").append(staff);
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
        JobStaffEntity other = (JobStaffEntity) that;
        return (this.getJob() == null ? other.getJob() == null : this.getJob().equals(other.getJob()))
            && (this.getStaff() == null ? other.getStaff() == null : this.getStaff().equals(other.getStaff()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJob() == null) ? 0 : getJob().hashCode());
        result = prime * result + ((getStaff() == null) ? 0 : getStaff().hashCode());
        return result;
    }
}