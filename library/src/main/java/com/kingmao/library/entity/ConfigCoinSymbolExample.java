package com.kingmao.library.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* @author qinxuan
*/
public class ConfigCoinSymbolExample  extends AbstractExample{
    /**
     * config_coin_symbol
     */
    protected String orderByClause;

    /**
     * config_coin_symbol
     */
    protected boolean distinct;

    /**
     * config_coin_symbol
     */
    protected List<Criteria> oredCriteria;

    public ConfigCoinSymbolExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolIsNull() {
            addCriterion("coin_symbol is null");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolIsNotNull() {
            addCriterion("coin_symbol is not null");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolEqualTo(String value) {
            addCriterion("coin_symbol =", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotEqualTo(String value) {
            addCriterion("coin_symbol <>", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolGreaterThan(String value) {
            addCriterion("coin_symbol >", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("coin_symbol >=", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolLessThan(String value) {
            addCriterion("coin_symbol <", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolLessThanOrEqualTo(String value) {
            addCriterion("coin_symbol <=", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolLike(String value) {
            addCriterion("coin_symbol like", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotLike(String value) {
            addCriterion("coin_symbol not like", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolIn(List<String> values) {
            addCriterion("coin_symbol in", values, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotIn(List<String> values) {
            addCriterion("coin_symbol not in", values, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolBetween(String value1, String value2) {
            addCriterion("coin_symbol between", value1, value2, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotBetween(String value1, String value2) {
            addCriterion("coin_symbol not between", value1, value2, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andContractAddressIsNull() {
            addCriterion("contract_address is null");
            return (Criteria) this;
        }

        public Criteria andContractAddressIsNotNull() {
            addCriterion("contract_address is not null");
            return (Criteria) this;
        }

        public Criteria andContractAddressEqualTo(String value) {
            addCriterion("contract_address =", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressNotEqualTo(String value) {
            addCriterion("contract_address <>", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressGreaterThan(String value) {
            addCriterion("contract_address >", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressGreaterThanOrEqualTo(String value) {
            addCriterion("contract_address >=", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressLessThan(String value) {
            addCriterion("contract_address <", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressLessThanOrEqualTo(String value) {
            addCriterion("contract_address <=", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressLike(String value) {
            addCriterion("contract_address like", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressNotLike(String value) {
            addCriterion("contract_address not like", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressIn(List<String> values) {
            addCriterion("contract_address in", values, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressNotIn(List<String> values) {
            addCriterion("contract_address not in", values, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressBetween(String value1, String value2) {
            addCriterion("contract_address between", value1, value2, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressNotBetween(String value1, String value2) {
            addCriterion("contract_address not between", value1, value2, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractPrecisionIsNull() {
            addCriterion("contract_precision is null");
            return (Criteria) this;
        }

        public Criteria andContractPrecisionIsNotNull() {
            addCriterion("contract_precision is not null");
            return (Criteria) this;
        }

        public Criteria andContractPrecisionEqualTo(Integer value) {
            addCriterion("contract_precision =", value, "contractPrecision");
            return (Criteria) this;
        }

        public Criteria andContractPrecisionNotEqualTo(Integer value) {
            addCriterion("contract_precision <>", value, "contractPrecision");
            return (Criteria) this;
        }

        public Criteria andContractPrecisionGreaterThan(Integer value) {
            addCriterion("contract_precision >", value, "contractPrecision");
            return (Criteria) this;
        }

        public Criteria andContractPrecisionGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_precision >=", value, "contractPrecision");
            return (Criteria) this;
        }

        public Criteria andContractPrecisionLessThan(Integer value) {
            addCriterion("contract_precision <", value, "contractPrecision");
            return (Criteria) this;
        }

        public Criteria andContractPrecisionLessThanOrEqualTo(Integer value) {
            addCriterion("contract_precision <=", value, "contractPrecision");
            return (Criteria) this;
        }

        public Criteria andContractPrecisionIn(List<Integer> values) {
            addCriterion("contract_precision in", values, "contractPrecision");
            return (Criteria) this;
        }

        public Criteria andContractPrecisionNotIn(List<Integer> values) {
            addCriterion("contract_precision not in", values, "contractPrecision");
            return (Criteria) this;
        }

        public Criteria andContractPrecisionBetween(Integer value1, Integer value2) {
            addCriterion("contract_precision between", value1, value2, "contractPrecision");
            return (Criteria) this;
        }

        public Criteria andContractPrecisionNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_precision not between", value1, value2, "contractPrecision");
            return (Criteria) this;
        }

        public Criteria andShowPrecisionIsNull() {
            addCriterion("show_precision is null");
            return (Criteria) this;
        }

        public Criteria andShowPrecisionIsNotNull() {
            addCriterion("show_precision is not null");
            return (Criteria) this;
        }

        public Criteria andShowPrecisionEqualTo(Integer value) {
            addCriterion("show_precision =", value, "showPrecision");
            return (Criteria) this;
        }

        public Criteria andShowPrecisionNotEqualTo(Integer value) {
            addCriterion("show_precision <>", value, "showPrecision");
            return (Criteria) this;
        }

        public Criteria andShowPrecisionGreaterThan(Integer value) {
            addCriterion("show_precision >", value, "showPrecision");
            return (Criteria) this;
        }

        public Criteria andShowPrecisionGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_precision >=", value, "showPrecision");
            return (Criteria) this;
        }

        public Criteria andShowPrecisionLessThan(Integer value) {
            addCriterion("show_precision <", value, "showPrecision");
            return (Criteria) this;
        }

        public Criteria andShowPrecisionLessThanOrEqualTo(Integer value) {
            addCriterion("show_precision <=", value, "showPrecision");
            return (Criteria) this;
        }

        public Criteria andShowPrecisionIn(List<Integer> values) {
            addCriterion("show_precision in", values, "showPrecision");
            return (Criteria) this;
        }

        public Criteria andShowPrecisionNotIn(List<Integer> values) {
            addCriterion("show_precision not in", values, "showPrecision");
            return (Criteria) this;
        }

        public Criteria andShowPrecisionBetween(Integer value1, Integer value2) {
            addCriterion("show_precision between", value1, value2, "showPrecision");
            return (Criteria) this;
        }

        public Criteria andShowPrecisionNotBetween(Integer value1, Integer value2) {
            addCriterion("show_precision not between", value1, value2, "showPrecision");
            return (Criteria) this;
        }

        public Criteria andOtcOpenIsNull() {
            addCriterion("otc_open is null");
            return (Criteria) this;
        }

        public Criteria andOtcOpenIsNotNull() {
            addCriterion("otc_open is not null");
            return (Criteria) this;
        }

        public Criteria andOtcOpenEqualTo(Byte value) {
            addCriterion("otc_open =", value, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenNotEqualTo(Byte value) {
            addCriterion("otc_open <>", value, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenGreaterThan(Byte value) {
            addCriterion("otc_open >", value, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenGreaterThanOrEqualTo(Byte value) {
            addCriterion("otc_open >=", value, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenLessThan(Byte value) {
            addCriterion("otc_open <", value, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenLessThanOrEqualTo(Byte value) {
            addCriterion("otc_open <=", value, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenIn(List<Byte> values) {
            addCriterion("otc_open in", values, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenNotIn(List<Byte> values) {
            addCriterion("otc_open not in", values, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenBetween(Byte value1, Byte value2) {
            addCriterion("otc_open between", value1, value2, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenNotBetween(Byte value1, Byte value2) {
            addCriterion("otc_open not between", value1, value2, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andIsFiatIsNull() {
            addCriterion("is_fiat is null");
            return (Criteria) this;
        }

        public Criteria andIsFiatIsNotNull() {
            addCriterion("is_fiat is not null");
            return (Criteria) this;
        }

        public Criteria andIsFiatEqualTo(Byte value) {
            addCriterion("is_fiat =", value, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatNotEqualTo(Byte value) {
            addCriterion("is_fiat <>", value, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatGreaterThan(Byte value) {
            addCriterion("is_fiat >", value, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_fiat >=", value, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatLessThan(Byte value) {
            addCriterion("is_fiat <", value, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatLessThanOrEqualTo(Byte value) {
            addCriterion("is_fiat <=", value, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatIn(List<Byte> values) {
            addCriterion("is_fiat in", values, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatNotIn(List<Byte> values) {
            addCriterion("is_fiat not in", values, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatBetween(Byte value1, Byte value2) {
            addCriterion("is_fiat between", value1, value2, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatNotBetween(Byte value1, Byte value2) {
            addCriterion("is_fiat not between", value1, value2, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsQuoteIsNull() {
            addCriterion("is_quote is null");
            return (Criteria) this;
        }

        public Criteria andIsQuoteIsNotNull() {
            addCriterion("is_quote is not null");
            return (Criteria) this;
        }

        public Criteria andIsQuoteEqualTo(Byte value) {
            addCriterion("is_quote =", value, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteNotEqualTo(Byte value) {
            addCriterion("is_quote <>", value, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteGreaterThan(Byte value) {
            addCriterion("is_quote >", value, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_quote >=", value, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteLessThan(Byte value) {
            addCriterion("is_quote <", value, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteLessThanOrEqualTo(Byte value) {
            addCriterion("is_quote <=", value, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteIn(List<Byte> values) {
            addCriterion("is_quote in", values, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteNotIn(List<Byte> values) {
            addCriterion("is_quote not in", values, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteBetween(Byte value1, Byte value2) {
            addCriterion("is_quote between", value1, value2, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_quote not between", value1, value2, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNull() {
            addCriterion("is_open is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNotNull() {
            addCriterion("is_open is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenEqualTo(Byte value) {
            addCriterion("is_open =", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotEqualTo(Byte value) {
            addCriterion("is_open <>", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThan(Byte value) {
            addCriterion("is_open >", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_open >=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThan(Byte value) {
            addCriterion("is_open <", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThanOrEqualTo(Byte value) {
            addCriterion("is_open <=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenIn(List<Byte> values) {
            addCriterion("is_open in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotIn(List<Byte> values) {
            addCriterion("is_open not in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenBetween(Byte value1, Byte value2) {
            addCriterion("is_open between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotBetween(Byte value1, Byte value2) {
            addCriterion("is_open not between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenIsNull() {
            addCriterion("deposit_open is null");
            return (Criteria) this;
        }

        public Criteria andDepositOpenIsNotNull() {
            addCriterion("deposit_open is not null");
            return (Criteria) this;
        }

        public Criteria andDepositOpenEqualTo(Byte value) {
            addCriterion("deposit_open =", value, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenNotEqualTo(Byte value) {
            addCriterion("deposit_open <>", value, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenGreaterThan(Byte value) {
            addCriterion("deposit_open >", value, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenGreaterThanOrEqualTo(Byte value) {
            addCriterion("deposit_open >=", value, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenLessThan(Byte value) {
            addCriterion("deposit_open <", value, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenLessThanOrEqualTo(Byte value) {
            addCriterion("deposit_open <=", value, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenIn(List<Byte> values) {
            addCriterion("deposit_open in", values, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenNotIn(List<Byte> values) {
            addCriterion("deposit_open not in", values, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenBetween(Byte value1, Byte value2) {
            addCriterion("deposit_open between", value1, value2, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenNotBetween(Byte value1, Byte value2) {
            addCriterion("deposit_open not between", value1, value2, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenIsNull() {
            addCriterion("withdraw_open is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenIsNotNull() {
            addCriterion("withdraw_open is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenEqualTo(Byte value) {
            addCriterion("withdraw_open =", value, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenNotEqualTo(Byte value) {
            addCriterion("withdraw_open <>", value, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenGreaterThan(Byte value) {
            addCriterion("withdraw_open >", value, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenGreaterThanOrEqualTo(Byte value) {
            addCriterion("withdraw_open >=", value, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenLessThan(Byte value) {
            addCriterion("withdraw_open <", value, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenLessThanOrEqualTo(Byte value) {
            addCriterion("withdraw_open <=", value, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenIn(List<Byte> values) {
            addCriterion("withdraw_open in", values, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenNotIn(List<Byte> values) {
            addCriterion("withdraw_open not in", values, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenBetween(Byte value1, Byte value2) {
            addCriterion("withdraw_open between", value1, value2, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenNotBetween(Byte value1, Byte value2) {
            addCriterion("withdraw_open not between", value1, value2, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andUseRateIsNull() {
            addCriterion("use_rate is null");
            return (Criteria) this;
        }

        public Criteria andUseRateIsNotNull() {
            addCriterion("use_rate is not null");
            return (Criteria) this;
        }

        public Criteria andUseRateEqualTo(Byte value) {
            addCriterion("use_rate =", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateNotEqualTo(Byte value) {
            addCriterion("use_rate <>", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateGreaterThan(Byte value) {
            addCriterion("use_rate >", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateGreaterThanOrEqualTo(Byte value) {
            addCriterion("use_rate >=", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateLessThan(Byte value) {
            addCriterion("use_rate <", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateLessThanOrEqualTo(Byte value) {
            addCriterion("use_rate <=", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateIn(List<Byte> values) {
            addCriterion("use_rate in", values, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateNotIn(List<Byte> values) {
            addCriterion("use_rate not in", values, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateBetween(Byte value1, Byte value2) {
            addCriterion("use_rate between", value1, value2, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateNotBetween(Byte value1, Byte value2) {
            addCriterion("use_rate not between", value1, value2, "useRate");
            return (Criteria) this;
        }

        public Criteria andTokenBaseIsNull() {
            addCriterion("token_base is null");
            return (Criteria) this;
        }

        public Criteria andTokenBaseIsNotNull() {
            addCriterion("token_base is not null");
            return (Criteria) this;
        }

        public Criteria andTokenBaseEqualTo(String value) {
            addCriterion("token_base =", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseNotEqualTo(String value) {
            addCriterion("token_base <>", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseGreaterThan(String value) {
            addCriterion("token_base >", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseGreaterThanOrEqualTo(String value) {
            addCriterion("token_base >=", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseLessThan(String value) {
            addCriterion("token_base <", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseLessThanOrEqualTo(String value) {
            addCriterion("token_base <=", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseLike(String value) {
            addCriterion("token_base like", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseNotLike(String value) {
            addCriterion("token_base not like", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseIn(List<String> values) {
            addCriterion("token_base in", values, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseNotIn(List<String> values) {
            addCriterion("token_base not in", values, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseBetween(String value1, String value2) {
            addCriterion("token_base between", value1, value2, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseNotBetween(String value1, String value2) {
            addCriterion("token_base not between", value1, value2, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andChainAddressIsNull() {
            addCriterion("chain_address is null");
            return (Criteria) this;
        }

        public Criteria andChainAddressIsNotNull() {
            addCriterion("chain_address is not null");
            return (Criteria) this;
        }

        public Criteria andChainAddressEqualTo(String value) {
            addCriterion("chain_address =", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressNotEqualTo(String value) {
            addCriterion("chain_address <>", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressGreaterThan(String value) {
            addCriterion("chain_address >", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressGreaterThanOrEqualTo(String value) {
            addCriterion("chain_address >=", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressLessThan(String value) {
            addCriterion("chain_address <", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressLessThanOrEqualTo(String value) {
            addCriterion("chain_address <=", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressLike(String value) {
            addCriterion("chain_address like", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressNotLike(String value) {
            addCriterion("chain_address not like", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressIn(List<String> values) {
            addCriterion("chain_address in", values, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressNotIn(List<String> values) {
            addCriterion("chain_address not in", values, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressBetween(String value1, String value2) {
            addCriterion("chain_address between", value1, value2, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressNotBetween(String value1, String value2) {
            addCriterion("chain_address not between", value1, value2, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainTxIsNull() {
            addCriterion("chain_tx is null");
            return (Criteria) this;
        }

        public Criteria andChainTxIsNotNull() {
            addCriterion("chain_tx is not null");
            return (Criteria) this;
        }

        public Criteria andChainTxEqualTo(String value) {
            addCriterion("chain_tx =", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxNotEqualTo(String value) {
            addCriterion("chain_tx <>", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxGreaterThan(String value) {
            addCriterion("chain_tx >", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxGreaterThanOrEqualTo(String value) {
            addCriterion("chain_tx >=", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxLessThan(String value) {
            addCriterion("chain_tx <", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxLessThanOrEqualTo(String value) {
            addCriterion("chain_tx <=", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxLike(String value) {
            addCriterion("chain_tx like", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxNotLike(String value) {
            addCriterion("chain_tx not like", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxIn(List<String> values) {
            addCriterion("chain_tx in", values, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxNotIn(List<String> values) {
            addCriterion("chain_tx not in", values, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxBetween(String value1, String value2) {
            addCriterion("chain_tx between", value1, value2, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxNotBetween(String value1, String value2) {
            addCriterion("chain_tx not between", value1, value2, "chainTx");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmIsNull() {
            addCriterion("deposit_confirm is null");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmIsNotNull() {
            addCriterion("deposit_confirm is not null");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmEqualTo(Integer value) {
            addCriterion("deposit_confirm =", value, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmNotEqualTo(Integer value) {
            addCriterion("deposit_confirm <>", value, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmGreaterThan(Integer value) {
            addCriterion("deposit_confirm >", value, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit_confirm >=", value, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmLessThan(Integer value) {
            addCriterion("deposit_confirm <", value, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmLessThanOrEqualTo(Integer value) {
            addCriterion("deposit_confirm <=", value, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmIn(List<Integer> values) {
            addCriterion("deposit_confirm in", values, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmNotIn(List<Integer> values) {
            addCriterion("deposit_confirm not in", values, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmBetween(Integer value1, Integer value2) {
            addCriterion("deposit_confirm between", value1, value2, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit_confirm not between", value1, value2, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andMiningDepositConfirmIsNull() {
            addCriterion("mining_deposit_confirm is null");
            return (Criteria) this;
        }

        public Criteria andMiningDepositConfirmIsNotNull() {
            addCriterion("mining_deposit_confirm is not null");
            return (Criteria) this;
        }

        public Criteria andMiningDepositConfirmEqualTo(Integer value) {
            addCriterion("mining_deposit_confirm =", value, "miningDepositConfirm");
            return (Criteria) this;
        }

        public Criteria andMiningDepositConfirmNotEqualTo(Integer value) {
            addCriterion("mining_deposit_confirm <>", value, "miningDepositConfirm");
            return (Criteria) this;
        }

        public Criteria andMiningDepositConfirmGreaterThan(Integer value) {
            addCriterion("mining_deposit_confirm >", value, "miningDepositConfirm");
            return (Criteria) this;
        }

        public Criteria andMiningDepositConfirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("mining_deposit_confirm >=", value, "miningDepositConfirm");
            return (Criteria) this;
        }

        public Criteria andMiningDepositConfirmLessThan(Integer value) {
            addCriterion("mining_deposit_confirm <", value, "miningDepositConfirm");
            return (Criteria) this;
        }

        public Criteria andMiningDepositConfirmLessThanOrEqualTo(Integer value) {
            addCriterion("mining_deposit_confirm <=", value, "miningDepositConfirm");
            return (Criteria) this;
        }

        public Criteria andMiningDepositConfirmIn(List<Integer> values) {
            addCriterion("mining_deposit_confirm in", values, "miningDepositConfirm");
            return (Criteria) this;
        }

        public Criteria andMiningDepositConfirmNotIn(List<Integer> values) {
            addCriterion("mining_deposit_confirm not in", values, "miningDepositConfirm");
            return (Criteria) this;
        }

        public Criteria andMiningDepositConfirmBetween(Integer value1, Integer value2) {
            addCriterion("mining_deposit_confirm between", value1, value2, "miningDepositConfirm");
            return (Criteria) this;
        }

        public Criteria andMiningDepositConfirmNotBetween(Integer value1, Integer value2) {
            addCriterion("mining_deposit_confirm not between", value1, value2, "miningDepositConfirm");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxIsNull() {
            addCriterion("withdraw_max is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxIsNotNull() {
            addCriterion("withdraw_max is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxEqualTo(BigDecimal value) {
            addCriterion("withdraw_max =", value, "withdrawMax");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxNotEqualTo(BigDecimal value) {
            addCriterion("withdraw_max <>", value, "withdrawMax");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxGreaterThan(BigDecimal value) {
            addCriterion("withdraw_max >", value, "withdrawMax");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("withdraw_max >=", value, "withdrawMax");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxLessThan(BigDecimal value) {
            addCriterion("withdraw_max <", value, "withdrawMax");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("withdraw_max <=", value, "withdrawMax");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxIn(List<BigDecimal> values) {
            addCriterion("withdraw_max in", values, "withdrawMax");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxNotIn(List<BigDecimal> values) {
            addCriterion("withdraw_max not in", values, "withdrawMax");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdraw_max between", value1, value2, "withdrawMax");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdraw_max not between", value1, value2, "withdrawMax");
            return (Criteria) this;
        }

        public Criteria andWithdrawMinIsNull() {
            addCriterion("withdraw_min is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMinIsNotNull() {
            addCriterion("withdraw_min is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMinEqualTo(BigDecimal value) {
            addCriterion("withdraw_min =", value, "withdrawMin");
            return (Criteria) this;
        }

        public Criteria andWithdrawMinNotEqualTo(BigDecimal value) {
            addCriterion("withdraw_min <>", value, "withdrawMin");
            return (Criteria) this;
        }

        public Criteria andWithdrawMinGreaterThan(BigDecimal value) {
            addCriterion("withdraw_min >", value, "withdrawMin");
            return (Criteria) this;
        }

        public Criteria andWithdrawMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("withdraw_min >=", value, "withdrawMin");
            return (Criteria) this;
        }

        public Criteria andWithdrawMinLessThan(BigDecimal value) {
            addCriterion("withdraw_min <", value, "withdrawMin");
            return (Criteria) this;
        }

        public Criteria andWithdrawMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("withdraw_min <=", value, "withdrawMin");
            return (Criteria) this;
        }

        public Criteria andWithdrawMinIn(List<BigDecimal> values) {
            addCriterion("withdraw_min in", values, "withdrawMin");
            return (Criteria) this;
        }

        public Criteria andWithdrawMinNotIn(List<BigDecimal> values) {
            addCriterion("withdraw_min not in", values, "withdrawMin");
            return (Criteria) this;
        }

        public Criteria andWithdrawMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdraw_min between", value1, value2, "withdrawMin");
            return (Criteria) this;
        }

        public Criteria andWithdrawMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdraw_min not between", value1, value2, "withdrawMin");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayIsNull() {
            addCriterion("withdraw_max_day is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayIsNotNull() {
            addCriterion("withdraw_max_day is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayEqualTo(BigDecimal value) {
            addCriterion("withdraw_max_day =", value, "withdrawMaxDay");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayNotEqualTo(BigDecimal value) {
            addCriterion("withdraw_max_day <>", value, "withdrawMaxDay");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayGreaterThan(BigDecimal value) {
            addCriterion("withdraw_max_day >", value, "withdrawMaxDay");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("withdraw_max_day >=", value, "withdrawMaxDay");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayLessThan(BigDecimal value) {
            addCriterion("withdraw_max_day <", value, "withdrawMaxDay");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("withdraw_max_day <=", value, "withdrawMaxDay");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayIn(List<BigDecimal> values) {
            addCriterion("withdraw_max_day in", values, "withdrawMaxDay");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayNotIn(List<BigDecimal> values) {
            addCriterion("withdraw_max_day not in", values, "withdrawMaxDay");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdraw_max_day between", value1, value2, "withdrawMaxDay");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdraw_max_day not between", value1, value2, "withdrawMaxDay");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayNoAuthIsNull() {
            addCriterion("withdraw_max_day_no_auth is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayNoAuthIsNotNull() {
            addCriterion("withdraw_max_day_no_auth is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayNoAuthEqualTo(BigDecimal value) {
            addCriterion("withdraw_max_day_no_auth =", value, "withdrawMaxDayNoAuth");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayNoAuthNotEqualTo(BigDecimal value) {
            addCriterion("withdraw_max_day_no_auth <>", value, "withdrawMaxDayNoAuth");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayNoAuthGreaterThan(BigDecimal value) {
            addCriterion("withdraw_max_day_no_auth >", value, "withdrawMaxDayNoAuth");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayNoAuthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("withdraw_max_day_no_auth >=", value, "withdrawMaxDayNoAuth");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayNoAuthLessThan(BigDecimal value) {
            addCriterion("withdraw_max_day_no_auth <", value, "withdrawMaxDayNoAuth");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayNoAuthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("withdraw_max_day_no_auth <=", value, "withdrawMaxDayNoAuth");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayNoAuthIn(List<BigDecimal> values) {
            addCriterion("withdraw_max_day_no_auth in", values, "withdrawMaxDayNoAuth");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayNoAuthNotIn(List<BigDecimal> values) {
            addCriterion("withdraw_max_day_no_auth not in", values, "withdrawMaxDayNoAuth");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayNoAuthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdraw_max_day_no_auth between", value1, value2, "withdrawMaxDayNoAuth");
            return (Criteria) this;
        }

        public Criteria andWithdrawMaxDayNoAuthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdraw_max_day_no_auth not between", value1, value2, "withdrawMaxDayNoAuth");
            return (Criteria) this;
        }

        public Criteria andAddressLenIsNull() {
            addCriterion("address_len is null");
            return (Criteria) this;
        }

        public Criteria andAddressLenIsNotNull() {
            addCriterion("address_len is not null");
            return (Criteria) this;
        }

        public Criteria andAddressLenEqualTo(Integer value) {
            addCriterion("address_len =", value, "addressLen");
            return (Criteria) this;
        }

        public Criteria andAddressLenNotEqualTo(Integer value) {
            addCriterion("address_len <>", value, "addressLen");
            return (Criteria) this;
        }

        public Criteria andAddressLenGreaterThan(Integer value) {
            addCriterion("address_len >", value, "addressLen");
            return (Criteria) this;
        }

        public Criteria andAddressLenGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_len >=", value, "addressLen");
            return (Criteria) this;
        }

        public Criteria andAddressLenLessThan(Integer value) {
            addCriterion("address_len <", value, "addressLen");
            return (Criteria) this;
        }

        public Criteria andAddressLenLessThanOrEqualTo(Integer value) {
            addCriterion("address_len <=", value, "addressLen");
            return (Criteria) this;
        }

        public Criteria andAddressLenIn(List<Integer> values) {
            addCriterion("address_len in", values, "addressLen");
            return (Criteria) this;
        }

        public Criteria andAddressLenNotIn(List<Integer> values) {
            addCriterion("address_len not in", values, "addressLen");
            return (Criteria) this;
        }

        public Criteria andAddressLenBetween(Integer value1, Integer value2) {
            addCriterion("address_len between", value1, value2, "addressLen");
            return (Criteria) this;
        }

        public Criteria andAddressLenNotBetween(Integer value1, Integer value2) {
            addCriterion("address_len not between", value1, value2, "addressLen");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("link not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusIsNull() {
            addCriterion("release_status is null");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusIsNotNull() {
            addCriterion("release_status is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusEqualTo(Byte value) {
            addCriterion("release_status =", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusNotEqualTo(Byte value) {
            addCriterion("release_status <>", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusGreaterThan(Byte value) {
            addCriterion("release_status >", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("release_status >=", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusLessThan(Byte value) {
            addCriterion("release_status <", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusLessThanOrEqualTo(Byte value) {
            addCriterion("release_status <=", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusIn(List<Byte> values) {
            addCriterion("release_status in", values, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusNotIn(List<Byte> values) {
            addCriterion("release_status not in", values, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusBetween(Byte value1, Byte value2) {
            addCriterion("release_status between", value1, value2, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("release_status not between", value1, value2, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNull() {
            addCriterion("mtime is null");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNotNull() {
            addCriterion("mtime is not null");
            return (Criteria) this;
        }

        public Criteria andMtimeEqualTo(Date value) {
            addCriterion("mtime =", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotEqualTo(Date value) {
            addCriterion("mtime <>", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThan(Date value) {
            addCriterion("mtime >", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mtime >=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThan(Date value) {
            addCriterion("mtime <", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThanOrEqualTo(Date value) {
            addCriterion("mtime <=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeIn(List<Date> values) {
            addCriterion("mtime in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotIn(List<Date> values) {
            addCriterion("mtime not in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeBetween(Date value1, Date value2) {
            addCriterion("mtime between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotBetween(Date value1, Date value2) {
            addCriterion("mtime not between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andBtcRateMathIsNull() {
            addCriterion("btc_rate_math is null");
            return (Criteria) this;
        }

        public Criteria andBtcRateMathIsNotNull() {
            addCriterion("btc_rate_math is not null");
            return (Criteria) this;
        }

        public Criteria andBtcRateMathEqualTo(String value) {
            addCriterion("btc_rate_math =", value, "btcRateMath");
            return (Criteria) this;
        }

        public Criteria andBtcRateMathNotEqualTo(String value) {
            addCriterion("btc_rate_math <>", value, "btcRateMath");
            return (Criteria) this;
        }

        public Criteria andBtcRateMathGreaterThan(String value) {
            addCriterion("btc_rate_math >", value, "btcRateMath");
            return (Criteria) this;
        }

        public Criteria andBtcRateMathGreaterThanOrEqualTo(String value) {
            addCriterion("btc_rate_math >=", value, "btcRateMath");
            return (Criteria) this;
        }

        public Criteria andBtcRateMathLessThan(String value) {
            addCriterion("btc_rate_math <", value, "btcRateMath");
            return (Criteria) this;
        }

        public Criteria andBtcRateMathLessThanOrEqualTo(String value) {
            addCriterion("btc_rate_math <=", value, "btcRateMath");
            return (Criteria) this;
        }

        public Criteria andBtcRateMathLike(String value) {
            addCriterion("btc_rate_math like", value, "btcRateMath");
            return (Criteria) this;
        }

        public Criteria andBtcRateMathNotLike(String value) {
            addCriterion("btc_rate_math not like", value, "btcRateMath");
            return (Criteria) this;
        }

        public Criteria andBtcRateMathIn(List<String> values) {
            addCriterion("btc_rate_math in", values, "btcRateMath");
            return (Criteria) this;
        }

        public Criteria andBtcRateMathNotIn(List<String> values) {
            addCriterion("btc_rate_math not in", values, "btcRateMath");
            return (Criteria) this;
        }

        public Criteria andBtcRateMathBetween(String value1, String value2) {
            addCriterion("btc_rate_math between", value1, value2, "btcRateMath");
            return (Criteria) this;
        }

        public Criteria andBtcRateMathNotBetween(String value1, String value2) {
            addCriterion("btc_rate_math not between", value1, value2, "btcRateMath");
            return (Criteria) this;
        }

        public Criteria andIsReleaseIsNull() {
            addCriterion("is_release is null");
            return (Criteria) this;
        }

        public Criteria andIsReleaseIsNotNull() {
            addCriterion("is_release is not null");
            return (Criteria) this;
        }

        public Criteria andIsReleaseEqualTo(Byte value) {
            addCriterion("is_release =", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseNotEqualTo(Byte value) {
            addCriterion("is_release <>", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseGreaterThan(Byte value) {
            addCriterion("is_release >", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_release >=", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseLessThan(Byte value) {
            addCriterion("is_release <", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseLessThanOrEqualTo(Byte value) {
            addCriterion("is_release <=", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseIn(List<Byte> values) {
            addCriterion("is_release in", values, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseNotIn(List<Byte> values) {
            addCriterion("is_release not in", values, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseBetween(Byte value1, Byte value2) {
            addCriterion("is_release between", value1, value2, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseNotBetween(Byte value1, Byte value2) {
            addCriterion("is_release not between", value1, value2, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsFreeIsNull() {
            addCriterion("is_free is null");
            return (Criteria) this;
        }

        public Criteria andIsFreeIsNotNull() {
            addCriterion("is_free is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreeEqualTo(Byte value) {
            addCriterion("is_free =", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotEqualTo(Byte value) {
            addCriterion("is_free <>", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeGreaterThan(Byte value) {
            addCriterion("is_free >", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_free >=", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeLessThan(Byte value) {
            addCriterion("is_free <", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeLessThanOrEqualTo(Byte value) {
            addCriterion("is_free <=", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeIn(List<Byte> values) {
            addCriterion("is_free in", values, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotIn(List<Byte> values) {
            addCriterion("is_free not in", values, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeBetween(Byte value1, Byte value2) {
            addCriterion("is_free between", value1, value2, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotBetween(Byte value1, Byte value2) {
            addCriterion("is_free not between", value1, value2, "isFree");
            return (Criteria) this;
        }

        public Criteria andDepositMinIsNull() {
            addCriterion("deposit_min is null");
            return (Criteria) this;
        }

        public Criteria andDepositMinIsNotNull() {
            addCriterion("deposit_min is not null");
            return (Criteria) this;
        }

        public Criteria andDepositMinEqualTo(BigDecimal value) {
            addCriterion("deposit_min =", value, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinNotEqualTo(BigDecimal value) {
            addCriterion("deposit_min <>", value, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinGreaterThan(BigDecimal value) {
            addCriterion("deposit_min >", value, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_min >=", value, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinLessThan(BigDecimal value) {
            addCriterion("deposit_min <", value, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_min <=", value, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinIn(List<BigDecimal> values) {
            addCriterion("deposit_min in", values, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinNotIn(List<BigDecimal> values) {
            addCriterion("deposit_min not in", values, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_min between", value1, value2, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_min not between", value1, value2, "depositMin");
            return (Criteria) this;
        }

        public Criteria andSecurityStatusIsNull() {
            addCriterion("security_status is null");
            return (Criteria) this;
        }

        public Criteria andSecurityStatusIsNotNull() {
            addCriterion("security_status is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityStatusEqualTo(Byte value) {
            addCriterion("security_status =", value, "securityStatus");
            return (Criteria) this;
        }

        public Criteria andSecurityStatusNotEqualTo(Byte value) {
            addCriterion("security_status <>", value, "securityStatus");
            return (Criteria) this;
        }

        public Criteria andSecurityStatusGreaterThan(Byte value) {
            addCriterion("security_status >", value, "securityStatus");
            return (Criteria) this;
        }

        public Criteria andSecurityStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("security_status >=", value, "securityStatus");
            return (Criteria) this;
        }

        public Criteria andSecurityStatusLessThan(Byte value) {
            addCriterion("security_status <", value, "securityStatus");
            return (Criteria) this;
        }

        public Criteria andSecurityStatusLessThanOrEqualTo(Byte value) {
            addCriterion("security_status <=", value, "securityStatus");
            return (Criteria) this;
        }

        public Criteria andSecurityStatusIn(List<Byte> values) {
            addCriterion("security_status in", values, "securityStatus");
            return (Criteria) this;
        }

        public Criteria andSecurityStatusNotIn(List<Byte> values) {
            addCriterion("security_status not in", values, "securityStatus");
            return (Criteria) this;
        }

        public Criteria andSecurityStatusBetween(Byte value1, Byte value2) {
            addCriterion("security_status between", value1, value2, "securityStatus");
            return (Criteria) this;
        }

        public Criteria andSecurityStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("security_status not between", value1, value2, "securityStatus");
            return (Criteria) this;
        }

        public Criteria andSecurityGradeIsNull() {
            addCriterion("security_grade is null");
            return (Criteria) this;
        }

        public Criteria andSecurityGradeIsNotNull() {
            addCriterion("security_grade is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityGradeEqualTo(Byte value) {
            addCriterion("security_grade =", value, "securityGrade");
            return (Criteria) this;
        }

        public Criteria andSecurityGradeNotEqualTo(Byte value) {
            addCriterion("security_grade <>", value, "securityGrade");
            return (Criteria) this;
        }

        public Criteria andSecurityGradeGreaterThan(Byte value) {
            addCriterion("security_grade >", value, "securityGrade");
            return (Criteria) this;
        }

        public Criteria andSecurityGradeGreaterThanOrEqualTo(Byte value) {
            addCriterion("security_grade >=", value, "securityGrade");
            return (Criteria) this;
        }

        public Criteria andSecurityGradeLessThan(Byte value) {
            addCriterion("security_grade <", value, "securityGrade");
            return (Criteria) this;
        }

        public Criteria andSecurityGradeLessThanOrEqualTo(Byte value) {
            addCriterion("security_grade <=", value, "securityGrade");
            return (Criteria) this;
        }

        public Criteria andSecurityGradeIn(List<Byte> values) {
            addCriterion("security_grade in", values, "securityGrade");
            return (Criteria) this;
        }

        public Criteria andSecurityGradeNotIn(List<Byte> values) {
            addCriterion("security_grade not in", values, "securityGrade");
            return (Criteria) this;
        }

        public Criteria andSecurityGradeBetween(Byte value1, Byte value2) {
            addCriterion("security_grade between", value1, value2, "securityGrade");
            return (Criteria) this;
        }

        public Criteria andSecurityGradeNotBetween(Byte value1, Byte value2) {
            addCriterion("security_grade not between", value1, value2, "securityGrade");
            return (Criteria) this;
        }

        public Criteria andTagTypeIsNull() {
            addCriterion("tag_type is null");
            return (Criteria) this;
        }

        public Criteria andTagTypeIsNotNull() {
            addCriterion("tag_type is not null");
            return (Criteria) this;
        }

        public Criteria andTagTypeEqualTo(Byte value) {
            addCriterion("tag_type =", value, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeNotEqualTo(Byte value) {
            addCriterion("tag_type <>", value, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeGreaterThan(Byte value) {
            addCriterion("tag_type >", value, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tag_type >=", value, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeLessThan(Byte value) {
            addCriterion("tag_type <", value, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tag_type <=", value, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeIn(List<Byte> values) {
            addCriterion("tag_type in", values, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeNotIn(List<Byte> values) {
            addCriterion("tag_type not in", values, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeBetween(Byte value1, Byte value2) {
            addCriterion("tag_type between", value1, value2, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tag_type not between", value1, value2, "tagType");
            return (Criteria) this;
        }

        public Criteria andSupportTokenIsNull() {
            addCriterion("support_token is null");
            return (Criteria) this;
        }

        public Criteria andSupportTokenIsNotNull() {
            addCriterion("support_token is not null");
            return (Criteria) this;
        }

        public Criteria andSupportTokenEqualTo(Byte value) {
            addCriterion("support_token =", value, "supportToken");
            return (Criteria) this;
        }

        public Criteria andSupportTokenNotEqualTo(Byte value) {
            addCriterion("support_token <>", value, "supportToken");
            return (Criteria) this;
        }

        public Criteria andSupportTokenGreaterThan(Byte value) {
            addCriterion("support_token >", value, "supportToken");
            return (Criteria) this;
        }

        public Criteria andSupportTokenGreaterThanOrEqualTo(Byte value) {
            addCriterion("support_token >=", value, "supportToken");
            return (Criteria) this;
        }

        public Criteria andSupportTokenLessThan(Byte value) {
            addCriterion("support_token <", value, "supportToken");
            return (Criteria) this;
        }

        public Criteria andSupportTokenLessThanOrEqualTo(Byte value) {
            addCriterion("support_token <=", value, "supportToken");
            return (Criteria) this;
        }

        public Criteria andSupportTokenIn(List<Byte> values) {
            addCriterion("support_token in", values, "supportToken");
            return (Criteria) this;
        }

        public Criteria andSupportTokenNotIn(List<Byte> values) {
            addCriterion("support_token not in", values, "supportToken");
            return (Criteria) this;
        }

        public Criteria andSupportTokenBetween(Byte value1, Byte value2) {
            addCriterion("support_token between", value1, value2, "supportToken");
            return (Criteria) this;
        }

        public Criteria andSupportTokenNotBetween(Byte value1, Byte value2) {
            addCriterion("support_token not between", value1, value2, "supportToken");
            return (Criteria) this;
        }

        public Criteria andRegularIsNull() {
            addCriterion("regular is null");
            return (Criteria) this;
        }

        public Criteria andRegularIsNotNull() {
            addCriterion("regular is not null");
            return (Criteria) this;
        }

        public Criteria andRegularEqualTo(String value) {
            addCriterion("regular =", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularNotEqualTo(String value) {
            addCriterion("regular <>", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularGreaterThan(String value) {
            addCriterion("regular >", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularGreaterThanOrEqualTo(String value) {
            addCriterion("regular >=", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularLessThan(String value) {
            addCriterion("regular <", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularLessThanOrEqualTo(String value) {
            addCriterion("regular <=", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularLike(String value) {
            addCriterion("regular like", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularNotLike(String value) {
            addCriterion("regular not like", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularIn(List<String> values) {
            addCriterion("regular in", values, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularNotIn(List<String> values) {
            addCriterion("regular not in", values, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularBetween(String value1, String value2) {
            addCriterion("regular between", value1, value2, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularNotBetween(String value1, String value2) {
            addCriterion("regular not between", value1, value2, "regular");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private ConfigCoinSymbolExample example;

        protected Criteria(ConfigCoinSymbolExample example) {
            super();
            this.example = example;
        }

        public ConfigCoinSymbolExample example() {
            return this.example;
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}