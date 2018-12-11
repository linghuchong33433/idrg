package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class MediaEntity implements Serializable {
    private String id;

    /**
     * 讲座内容简介。
     */
    private String brief;

    private String url;

    /**
     * 讲座创建人ID
     */
    private String createperson;

    /**
     * 上传时间
     */
    private Date uploaddate;

    /**
     * 默认显示顺序，越小越靠前
     */
    private Integer showorder;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getCreateperson() {
        return createperson;
    }

    public void setCreateperson(String createperson) {
        this.createperson = createperson == null ? null : createperson.trim();
    }

    public Date getUploaddate() {
        return uploaddate;
    }

    public void setUploaddate(Date uploaddate) {
        this.uploaddate = uploaddate;
    }

    public Integer getShoworder() {
        return showorder;
    }

    public void setShoworder(Integer showorder) {
        this.showorder = showorder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", brief=").append(brief);
        sb.append(", url=").append(url);
        sb.append(", createperson=").append(createperson);
        sb.append(", uploaddate=").append(uploaddate);
        sb.append(", showorder=").append(showorder);
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
        MediaEntity other = (MediaEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getCreateperson() == null ? other.getCreateperson() == null : this.getCreateperson().equals(other.getCreateperson()))
            && (this.getUploaddate() == null ? other.getUploaddate() == null : this.getUploaddate().equals(other.getUploaddate()))
            && (this.getShoworder() == null ? other.getShoworder() == null : this.getShoworder().equals(other.getShoworder()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getCreateperson() == null) ? 0 : getCreateperson().hashCode());
        result = prime * result + ((getUploaddate() == null) ? 0 : getUploaddate().hashCode());
        result = prime * result + ((getShoworder() == null) ? 0 : getShoworder().hashCode());
        return result;
    }
}