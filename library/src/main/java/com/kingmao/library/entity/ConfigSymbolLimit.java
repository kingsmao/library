package com.kingmao.library.entity;

import java.util.Date;

public class ConfigSymbolLimit {
    private Integer id;

    private Integer configSymbolId;

    private String symbol;

    private Integer isLimit;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConfigSymbolId() {
        return configSymbolId;
    }

    public void setConfigSymbolId(Integer configSymbolId) {
        this.configSymbolId = configSymbolId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getIsLimit() {
        return isLimit;
    }

    public void setIsLimit(Integer isLimit) {
        this.isLimit = isLimit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ConfigSymbolLimit{" +
                "id=" + id +
                ", configSymbolId=" + configSymbolId +
                ", symbol='" + symbol + '\'' +
                ", isLimit=" + isLimit +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}