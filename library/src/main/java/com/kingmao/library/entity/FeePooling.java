package com.kingmao.library.entity;

import java.io.Serializable;
import java.util.Date;

/**
* @author qinxuan
*/
public class FeePooling implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 收款账户
     */
    private Integer uid;

    /**
     * 超级管理员的电话号码
     */
    private String authPhone;

    /**
     *  归集类型exchange：币币，otc：场外，withdrew：提币
     */
    private String poolingTypes;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 更新时间
     */
    private Date utime;

    /**
     * 商户id
     */
    private Integer companyId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAuthPhone() {
        return authPhone;
    }

    public void setAuthPhone(String authPhone) {
        this.authPhone = authPhone == null ? null : authPhone.trim();
    }

    public String getPoolingTypes() {
        return poolingTypes;
    }

    public void setPoolingTypes(String poolingTypes) {
        this.poolingTypes = poolingTypes == null ? null : poolingTypes.trim();
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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public static class Builder {
        private FeePooling obj;

        public Builder() {
            this.obj = new FeePooling();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder authPhone(String authPhone) {
            obj.authPhone = authPhone;
            return this;
        }

        public Builder poolingTypes(String poolingTypes) {
            obj.poolingTypes = poolingTypes;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public Builder utime(Date utime) {
            obj.utime = utime;
            return this;
        }

        public Builder companyId(Integer companyId) {
            obj.companyId = companyId;
            return this;
        }

        public FeePooling build() {
            return this.obj;
        }
    }
}