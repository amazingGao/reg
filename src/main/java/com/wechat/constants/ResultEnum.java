package com.wechat.constants;

/**
 * @Author: Ghd
 * @Date: 2019/8/28 16:59
 */
public enum ResultEnum {
    SUCCESS(1, "成功"),
    FAILURE(0, "失败");

    private int code;
    private String message;

    private ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
