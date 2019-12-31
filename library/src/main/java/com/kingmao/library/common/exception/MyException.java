package com.kingmao.library.common.exception;

/**
 * @author qinxuan
 * @date 2019/12/24
 */
public class MyException extends RuntimeException {

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public MyException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }
}
