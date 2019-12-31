package com.kingmao.library.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
* @author qinxuan
*/
public class ConfigCoinSymbol implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 币种简称，大写：BTC
     */
    private String coinSymbol;

    /**
     * erc20合约地址
     */
    private String contractAddress;

    /**
     * 合约精度
     */
    private Integer contractPrecision;

    /**
     * 资产显示精度
     */
    private Integer showPrecision;

    /**
     * 场外是否出现 0不出现，1出现
     */
    private Byte otcOpen;

    /**
     * 是否为法币，0:数字货币，1法币
     */
    private Byte isFiat;

    /**
     * 是否为计价货币 0非计价货币，1计价货币
     */
    private Byte isQuote;

    /**
     * 是否开启；0关闭，1开启
     */
    private Byte isOpen;

    /**
     * 是否开放充值，0关闭充值，1开放充值；
     */
    private Byte depositOpen;

    /**
     * 是否开启提现，0关闭提现，1开启提现；
     */
    private Byte withdrawOpen;

    /**
     * 是否维护与各币种汇率,用户脚本计算汇率；0否，1是；
     */
    private Byte useRate;

    /**
     * 币种资产类型；例如：mex属于eth资产；lyb属于xas资产；主链币，资产类型就是本身；
     */
    private String tokenBase;

    /**
     * 根据地址查询的,区块链浏览器地址，http开头，”/“结尾
     */
    private String chainAddress;

    /**
     * 根据txid查询的区块链浏览器地址，http开头，”/“结尾
     */
    private String chainTx;

    /**
     * 充值到账确认数
     */
    private Integer depositConfirm;

    /**
     * 来自矿工奖励的充值确认数
     */
    private Integer miningDepositConfirm;

    /**
     * 单次提现最大值
     */
    private BigDecimal withdrawMax;

    /**
     * 单次提现最小值
     */
    private BigDecimal withdrawMin;

    /**
     * 已认证每日提币最大值
     */
    private BigDecimal withdrawMaxDay;

    /**
     * 未认证每日提币最大值
     */
    private BigDecimal withdrawMaxDayNoAuth;

    /**
     * 地址长度，用于提现地址校验
     */
    private Integer addressLen;

    /**
     * 前台展示名称
     */
    private String name;

    /**
     * 币种logo图片地址
     */
    private String icon;

    /**
     * 冗余设计
     */
    private String link;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 上线状态（1沙盒、2线上）
     */
    private Byte releaseStatus;

    /**
     * 
     */
    private Date ctime;

    /**
     * 
     */
    private Date mtime;

    /**
     * 汇率计算公式（在币种不出现在usdt、eth、btc三个大区，并且不是计价货币时用这个公司技术btc汇率）
     */
    private String btcRateMath;

    /**
     * 是否需要重新发布 1是，0否
     */
    private Byte isRelease;

    /**
     * 是否免费 1.是 0.否
     */
    private Byte isFree;

    /**
     * 单次充值最小值
     */
    private BigDecimal depositMin;

    /**
     * 0未审核 1审核通过 2审核拒绝
     */
    private Byte securityStatus;

    /**
     * 审计评级评级，结果为1,2,3,4,5  数字越大表示安全等级越高
     */
    private Byte securityGrade;

    /**
     * tag类型: 0：无tag 1:有tag非必填 2：有tag且必填
     */
    private Byte tagType;

    /**
     * 是否支持token 0：不支持 1：支持
     */
    private Byte supportToken;

    /**
     * 地址校验正则表达式
     */
    private String regular;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoinSymbol() {
        return coinSymbol;
    }

    public void setCoinSymbol(String coinSymbol) {
        this.coinSymbol = coinSymbol == null ? null : coinSymbol.trim();
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress == null ? null : contractAddress.trim();
    }

    public Integer getContractPrecision() {
        return contractPrecision;
    }

    public void setContractPrecision(Integer contractPrecision) {
        this.contractPrecision = contractPrecision;
    }

    public Integer getShowPrecision() {
        return showPrecision;
    }

    public void setShowPrecision(Integer showPrecision) {
        this.showPrecision = showPrecision;
    }

    public Byte getOtcOpen() {
        return otcOpen;
    }

    public void setOtcOpen(Byte otcOpen) {
        this.otcOpen = otcOpen;
    }

    public Byte getIsFiat() {
        return isFiat;
    }

    public void setIsFiat(Byte isFiat) {
        this.isFiat = isFiat;
    }

    public Byte getIsQuote() {
        return isQuote;
    }

    public void setIsQuote(Byte isQuote) {
        this.isQuote = isQuote;
    }

    public Byte getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Byte isOpen) {
        this.isOpen = isOpen;
    }

    public Byte getDepositOpen() {
        return depositOpen;
    }

    public void setDepositOpen(Byte depositOpen) {
        this.depositOpen = depositOpen;
    }

    public Byte getWithdrawOpen() {
        return withdrawOpen;
    }

    public void setWithdrawOpen(Byte withdrawOpen) {
        this.withdrawOpen = withdrawOpen;
    }

    public Byte getUseRate() {
        return useRate;
    }

    public void setUseRate(Byte useRate) {
        this.useRate = useRate;
    }

    public String getTokenBase() {
        return tokenBase;
    }

    public void setTokenBase(String tokenBase) {
        this.tokenBase = tokenBase == null ? null : tokenBase.trim();
    }

    public String getChainAddress() {
        return chainAddress;
    }

    public void setChainAddress(String chainAddress) {
        this.chainAddress = chainAddress == null ? null : chainAddress.trim();
    }

    public String getChainTx() {
        return chainTx;
    }

    public void setChainTx(String chainTx) {
        this.chainTx = chainTx == null ? null : chainTx.trim();
    }

    public Integer getDepositConfirm() {
        return depositConfirm;
    }

    public void setDepositConfirm(Integer depositConfirm) {
        this.depositConfirm = depositConfirm;
    }

    public Integer getMiningDepositConfirm() {
        return miningDepositConfirm;
    }

    public void setMiningDepositConfirm(Integer miningDepositConfirm) {
        this.miningDepositConfirm = miningDepositConfirm;
    }

    public BigDecimal getWithdrawMax() {
        return withdrawMax;
    }

    public void setWithdrawMax(BigDecimal withdrawMax) {
        this.withdrawMax = withdrawMax;
    }

    public BigDecimal getWithdrawMin() {
        return withdrawMin;
    }

    public void setWithdrawMin(BigDecimal withdrawMin) {
        this.withdrawMin = withdrawMin;
    }

    public BigDecimal getWithdrawMaxDay() {
        return withdrawMaxDay;
    }

    public void setWithdrawMaxDay(BigDecimal withdrawMaxDay) {
        this.withdrawMaxDay = withdrawMaxDay;
    }

    public BigDecimal getWithdrawMaxDayNoAuth() {
        return withdrawMaxDayNoAuth;
    }

    public void setWithdrawMaxDayNoAuth(BigDecimal withdrawMaxDayNoAuth) {
        this.withdrawMaxDayNoAuth = withdrawMaxDayNoAuth;
    }

    public Integer getAddressLen() {
        return addressLen;
    }

    public void setAddressLen(Integer addressLen) {
        this.addressLen = addressLen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Byte getReleaseStatus() {
        return releaseStatus;
    }

    public void setReleaseStatus(Byte releaseStatus) {
        this.releaseStatus = releaseStatus;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public String getBtcRateMath() {
        return btcRateMath;
    }

    public void setBtcRateMath(String btcRateMath) {
        this.btcRateMath = btcRateMath == null ? null : btcRateMath.trim();
    }

    public Byte getIsRelease() {
        return isRelease;
    }

    public void setIsRelease(Byte isRelease) {
        this.isRelease = isRelease;
    }

    public Byte getIsFree() {
        return isFree;
    }

    public void setIsFree(Byte isFree) {
        this.isFree = isFree;
    }

    public BigDecimal getDepositMin() {
        return depositMin;
    }

    public void setDepositMin(BigDecimal depositMin) {
        this.depositMin = depositMin;
    }

    public Byte getSecurityStatus() {
        return securityStatus;
    }

    public void setSecurityStatus(Byte securityStatus) {
        this.securityStatus = securityStatus;
    }

    public Byte getSecurityGrade() {
        return securityGrade;
    }

    public void setSecurityGrade(Byte securityGrade) {
        this.securityGrade = securityGrade;
    }

    public Byte getTagType() {
        return tagType;
    }

    public void setTagType(Byte tagType) {
        this.tagType = tagType;
    }

    public Byte getSupportToken() {
        return supportToken;
    }

    public void setSupportToken(Byte supportToken) {
        this.supportToken = supportToken;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular == null ? null : regular.trim();
    }

    public static class Builder {
        private ConfigCoinSymbol obj;

        public Builder() {
            this.obj = new ConfigCoinSymbol();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder coinSymbol(String coinSymbol) {
            obj.coinSymbol = coinSymbol;
            return this;
        }

        public Builder contractAddress(String contractAddress) {
            obj.contractAddress = contractAddress;
            return this;
        }

        public Builder contractPrecision(Integer contractPrecision) {
            obj.contractPrecision = contractPrecision;
            return this;
        }

        public Builder showPrecision(Integer showPrecision) {
            obj.showPrecision = showPrecision;
            return this;
        }

        public Builder otcOpen(Byte otcOpen) {
            obj.otcOpen = otcOpen;
            return this;
        }

        public Builder isFiat(Byte isFiat) {
            obj.isFiat = isFiat;
            return this;
        }

        public Builder isQuote(Byte isQuote) {
            obj.isQuote = isQuote;
            return this;
        }

        public Builder isOpen(Byte isOpen) {
            obj.isOpen = isOpen;
            return this;
        }

        public Builder depositOpen(Byte depositOpen) {
            obj.depositOpen = depositOpen;
            return this;
        }

        public Builder withdrawOpen(Byte withdrawOpen) {
            obj.withdrawOpen = withdrawOpen;
            return this;
        }

        public Builder useRate(Byte useRate) {
            obj.useRate = useRate;
            return this;
        }

        public Builder tokenBase(String tokenBase) {
            obj.tokenBase = tokenBase;
            return this;
        }

        public Builder chainAddress(String chainAddress) {
            obj.chainAddress = chainAddress;
            return this;
        }

        public Builder chainTx(String chainTx) {
            obj.chainTx = chainTx;
            return this;
        }

        public Builder depositConfirm(Integer depositConfirm) {
            obj.depositConfirm = depositConfirm;
            return this;
        }

        public Builder miningDepositConfirm(Integer miningDepositConfirm) {
            obj.miningDepositConfirm = miningDepositConfirm;
            return this;
        }

        public Builder withdrawMax(BigDecimal withdrawMax) {
            obj.withdrawMax = withdrawMax;
            return this;
        }

        public Builder withdrawMin(BigDecimal withdrawMin) {
            obj.withdrawMin = withdrawMin;
            return this;
        }

        public Builder withdrawMaxDay(BigDecimal withdrawMaxDay) {
            obj.withdrawMaxDay = withdrawMaxDay;
            return this;
        }

        public Builder withdrawMaxDayNoAuth(BigDecimal withdrawMaxDayNoAuth) {
            obj.withdrawMaxDayNoAuth = withdrawMaxDayNoAuth;
            return this;
        }

        public Builder addressLen(Integer addressLen) {
            obj.addressLen = addressLen;
            return this;
        }

        public Builder name(String name) {
            obj.name = name;
            return this;
        }

        public Builder icon(String icon) {
            obj.icon = icon;
            return this;
        }

        public Builder link(String link) {
            obj.link = link;
            return this;
        }

        public Builder sort(Integer sort) {
            obj.sort = sort;
            return this;
        }

        public Builder releaseStatus(Byte releaseStatus) {
            obj.releaseStatus = releaseStatus;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public Builder mtime(Date mtime) {
            obj.mtime = mtime;
            return this;
        }

        public Builder btcRateMath(String btcRateMath) {
            obj.btcRateMath = btcRateMath;
            return this;
        }

        public Builder isRelease(Byte isRelease) {
            obj.isRelease = isRelease;
            return this;
        }

        public Builder isFree(Byte isFree) {
            obj.isFree = isFree;
            return this;
        }

        public Builder depositMin(BigDecimal depositMin) {
            obj.depositMin = depositMin;
            return this;
        }

        public Builder securityStatus(Byte securityStatus) {
            obj.securityStatus = securityStatus;
            return this;
        }

        public Builder securityGrade(Byte securityGrade) {
            obj.securityGrade = securityGrade;
            return this;
        }

        public Builder tagType(Byte tagType) {
            obj.tagType = tagType;
            return this;
        }

        public Builder supportToken(Byte supportToken) {
            obj.supportToken = supportToken;
            return this;
        }

        public Builder regular(String regular) {
            obj.regular = regular;
            return this;
        }

        public ConfigCoinSymbol build() {
            return this.obj;
        }
    }
}