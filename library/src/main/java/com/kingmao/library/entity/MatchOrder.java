package com.kingmao.library.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
* @author qinxuan
*/
public class MatchOrder implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Byte orderType;

    /**
     * 
     */
    private BigDecimal volume;

    /**
     * 
     */
    private BigDecimal price;

    /**
     * 
     */
    private String desc;

    /**
     * 
     */
    private Byte state;

    /**
     * 
     */
    private Date ctime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public static class Builder {
        private MatchOrder obj;

        public Builder() {
            this.obj = new MatchOrder();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder orderType(Byte orderType) {
            obj.orderType = orderType;
            return this;
        }

        public Builder volume(BigDecimal volume) {
            obj.volume = volume;
            return this;
        }

        public Builder price(BigDecimal price) {
            obj.price = price;
            return this;
        }

        public Builder desc(String desc) {
            obj.desc = desc;
            return this;
        }

        public Builder state(Byte state) {
            obj.state = state;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public MatchOrder build() {
            return this.obj;
        }
    }
}