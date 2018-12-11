package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class MaterialEntity implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 所属农场
     */
    private String farm;

    /**
     * 投入品类型
     */
    private String type;

    /**
     * 数量
     */
    private Double count;

    /**
     * 已用
     */
    private Double used;

    /**
     * 有效期
     */
    private Date validdate;

    /**
     * 商品编号
     */
    private String code;

    /**
     * 供货商
     */
    private String supplier;

    /**
     * 更新时间
     */
    private Date modifydate;

    /**
     * 录入时间
     */
    private Date inputdate;

    /**
     * 设备名称
     */
    private String desc;

    /**
     * 标志位，0不可用；1可用。
     */
    private Integer flag;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm == null ? null : farm.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public Double getUsed() {
        return used;
    }

    public void setUsed(Double used) {
        this.used = used;
    }

    public Date getValiddate() {
        return validdate;
    }

    public void setValiddate(Date validdate) {
        this.validdate = validdate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Date getInputdate() {
        return inputdate;
    }

    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }

    public String getDesc() {
        return desc;
    }

    public void setdesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", farm=").append(farm);
        sb.append(", type=").append(type);
        sb.append(", count=").append(count);
        sb.append(", used=").append(used);
        sb.append(", validdate=").append(validdate);
        sb.append(", code=").append(code);
        sb.append(", supplier=").append(supplier);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", inputdate=").append(inputdate);
        sb.append(", desc=").append(desc);
        sb.append(", flag=").append(flag);
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
        MaterialEntity other = (MaterialEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFarm() == null ? other.getFarm() == null : this.getFarm().equals(other.getFarm()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getUsed() == null ? other.getUsed() == null : this.getUsed().equals(other.getUsed()))
            && (this.getValiddate() == null ? other.getValiddate() == null : this.getValiddate().equals(other.getValiddate()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getSupplier() == null ? other.getSupplier() == null : this.getSupplier().equals(other.getSupplier()))
            && (this.getModifydate() == null ? other.getModifydate() == null : this.getModifydate().equals(other.getModifydate()))
            && (this.getInputdate() == null ? other.getInputdate() == null : this.getInputdate().equals(other.getInputdate()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFarm() == null) ? 0 : getFarm().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getUsed() == null) ? 0 : getUsed().hashCode());
        result = prime * result + ((getValiddate() == null) ? 0 : getValiddate().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getSupplier() == null) ? 0 : getSupplier().hashCode());
        result = prime * result + ((getModifydate() == null) ? 0 : getModifydate().hashCode());
        result = prime * result + ((getInputdate() == null) ? 0 : getInputdate().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        return result;
    }
}