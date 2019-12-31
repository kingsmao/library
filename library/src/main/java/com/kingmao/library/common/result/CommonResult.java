package com.kingmao.library.common.result;

import java.io.Serializable;
import java.util.Map;

/**
 * @author qinxuan
 * @date 2019/12/10
 */

public class CommonResult<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public static class Builder {
        /**
         * 返回成功默认模板
         *
         * @return
         */
        public static CommonResult<Map<String, Object>> success() {
            CommonResult<Map<String, Object>> vo = new CommonResult<>();
            vo.setCode(CommonResultType.SUCCESS.getCode());
            vo.setMsg(CommonResultType.SUCCESS.getMsg());
            return vo;
        }

        /**
         * 返回失败默认模板
         *
         * @return
         */
        public static CommonResult<Map<String, Object>> fail() {
            CommonResult<Map<String, Object>> vo = new CommonResult<>();
            vo.setCode(CommonResultType.FAIL.getCode());
            vo.setMsg(CommonResultType.FAIL.getMsg());
            return vo;
        }
    }

    /**
     * 添加返回数据
     *
     * @param data
     * @return
     */
    public CommonResult<T> initData(T data) {
        this.data = data;
        return this;
    }

    /**
     * 重写code，添加返回数据
     *
     * @param code
     * @param data
     * @return
     */
    public CommonResult<T> initCodeAndData(Integer code, T data) {
        this.code = code;
        this.data = data;
        return this;
    }

}
