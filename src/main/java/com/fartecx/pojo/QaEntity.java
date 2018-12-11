package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class QaEntity implements Serializable {
    private String id;

    /**
     * 问答类型。'q'问题。'a'回答
     */
    private String type;

    /**
     * 所属主题
     */
    private String topicid;

    /**
     * 技术问答内容
     */
    private String content;

    /**
     * 提出或回答问题的人员
     */
    private String person;

    /**
     * 提出或回答问题的时间
     */
    private Date modifytime;

    /**
     * 0:未审核，1：已审核，2审核不通过
     */
    private Integer flag;

    /**
     * 插图，一次问答可以附加最多三张插图。每个插图在对应的主题目录下的文件名称保持唯一。每个文件的名字长度对多10.
     */
    private String image;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTopicid() {
        return topicid;
    }

    public void setTopicid(String topicid) {
        this.topicid = topicid == null ? null : topicid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", topicid=").append(topicid);
        sb.append(", content=").append(content);
        sb.append(", person=").append(person);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", flag=").append(flag);
        sb.append(", image=").append(image);
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
        QaEntity other = (QaEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTopicid() == null ? other.getTopicid() == null : this.getTopicid().equals(other.getTopicid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getPerson() == null ? other.getPerson() == null : this.getPerson().equals(other.getPerson()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTopicid() == null) ? 0 : getTopicid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getPerson() == null) ? 0 : getPerson().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        return result;
    }
}