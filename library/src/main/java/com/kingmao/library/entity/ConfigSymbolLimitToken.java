package com.kingmao.library.entity;

import java.util.Date;

public class ConfigSymbolLimitToken {
    private Integer id;

    private String symbol;

    private String token;

    private Date ctime;

    private Date utime;

    private Byte isLimit;

    private Byte shareState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public Byte getIsLimit() {
        return isLimit;
    }

    public void setIsLimit(Byte isLimit) {
        this.isLimit = isLimit;
    }

    public Byte getShareState() {
        return shareState;
    }

    public void setShareState(Byte shareState) {
        this.shareState = shareState;
    }
}