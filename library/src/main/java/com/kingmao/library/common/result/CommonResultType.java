package com.kingmao.library.common.result;

/**
 * @author qinxuan
 * @date 2019/12/9
 */
public enum CommonResultType {
    USER_NOT_LOGIN(1001, "用户未登录", ""),
    USER_FOREEON(1002, "用户被冻结", ""),
    SUCCESS(0, "ok", "系统级别操作成功，默认值"),
    FAIL(1, "fail", "系统级别操作失败，例如trycatch"),
    ;


    private int code;
    private String msg;
    private String desc;


    CommonResultType(int code, String msg, String desc) {
        this.code = code;
        this.msg = msg;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
