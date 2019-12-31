package com.kingmao.library.entity;

/**
 * @author qinxuan
 * @date 2019/12/12
 */
public class Coin {
    private byte otcOpen;

    private byte withdrawOpen;

    private String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public byte getOtcOpen() {
        return otcOpen;
    }

    public void setOtcOpen(byte otcOpen) {
        this.otcOpen = otcOpen;
    }

    public byte getWithdrawOpen() {
        return withdrawOpen;
    }

    public void setWithdrawOpen(byte withdrawOpen) {
        this.withdrawOpen = withdrawOpen;
    }
}
