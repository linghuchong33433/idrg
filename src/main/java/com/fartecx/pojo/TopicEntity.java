package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class TopicEntity implements Serializable {
    private String id;

    /**
     * 技术问答主题名称
     */
    private String name;

    /**
     * 主题创建人ID
     */
    private String createperson;

    /**
     * 创建时间
     */
    private Date createdate;

    /**
     * 最近更新时间
     */
    private Date modifydate;

    /**
     * 0:未审核，1：已审核，2审核不通过
     */
    private Integer flag;

    /**
     * 待审核的问答数
     */
    private Integer needverify;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCreateperson() {
        return createperson;
    }

    public void setCreateperson(String createperson) {
        this.createperson = createperson == null ? null : createperson.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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

    public Integer getNeedverify() {
        return needverify;
    }

    public void setNeedverify(Integer needverify) {
        this.needverify = needverify;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", createperson=").append(createperson);
        sb.append(", createdate=").append(createdate);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", flag=").append(flag);
        sb.append(", needverify=").append(needverify);
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
        TopicEntity other = (TopicEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCreateperson() == null ? other.getCreateperson() == null : this.getCreateperson().equals(other.getCreateperson()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getModifydate() == null ? other.getModifydate() == null : this.getModifydate().equals(other.getModifydate()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getNeedverify() == null ? other.getNeedverify() == null : this.getNeedverify().equals(other.getNeedverify()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCreateperson() == null) ? 0 : getCreateperson().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getModifydate() == null) ? 0 : getModifydate().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getNeedverify() == null) ? 0 : getNeedverify().hashCode());
        return result;
    }
}