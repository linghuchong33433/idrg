package com.fartecx.pojo;

import java.io.Serializable;
import java.util.Date;

public class DeviceDataEntity implements Serializable {
    private String dataid;

    /**
     * 数据时间
     */
    private Date t;

    /**
     * 设备
     */
    private String device;

    /**
     * 温度
     */
    private Double temp;

    private static final long serialVersionUID = 1L;

    public String getDataid() {
        return dataid;
    }

    public void setDataid(String dataid) {
        this.dataid = dataid == null ? null : dataid.trim();
    }

    public Date getT() {
        return t;
    }

    public void setT(Date t) {
        this.t = t;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dataid=").append(dataid);
        sb.append(", t=").append(t);
        sb.append(", device=").append(device);
        sb.append(", temp=").append(temp);
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
        DeviceDataEntity other = (DeviceDataEntity) that;
        return (this.getDataid() == null ? other.getDataid() == null : this.getDataid().equals(other.getDataid()))
            && (this.getT() == null ? other.getT() == null : this.getT().equals(other.getT()))
            && (this.getDevice() == null ? other.getDevice() == null : this.getDevice().equals(other.getDevice()))
            && (this.getTemp() == null ? other.getTemp() == null : this.getTemp().equals(other.getTemp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDataid() == null) ? 0 : getDataid().hashCode());
        result = prime * result + ((getT() == null) ? 0 : getT().hashCode());
        result = prime * result + ((getDevice() == null) ? 0 : getDevice().hashCode());
        result = prime * result + ((getTemp() == null) ? 0 : getTemp().hashCode());
        return result;
    }
}