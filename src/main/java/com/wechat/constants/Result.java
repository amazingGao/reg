package com.wechat.constants;

import java.io.Serializable;

/**
 * @Author: Ghd
 * @Date: 2019/8/28 17:00
 */
public class Result implements Serializable{

    private static final long serialVersionUID = -5372450875750675775L;
    private Integer code;
    private String msg;
    private Object data;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result buildSuccess() {
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage());
    }

    public static Result buildSuccessWithMsg(String msg) {
        return new Result(ResultEnum.SUCCESS.getCode(), msg);
    }

    public static Result buildSuccessWithData(Object data) {
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), data);
    }

    public static Result buildSuccess(String msg, Object data) {
        return new Result(ResultEnum.SUCCESS.getCode(), msg, data);
    }

    public static Result buildFailure() {
        return new Result(ResultEnum.FAILURE.getCode(), ResultEnum.FAILURE.getMessage());
    }

    public static Result buildFailureWithMsg(String msg) {
        return new Result(ResultEnum.FAILURE.getCode(), msg);
    }

    public static Result buildFailureWithdata(Object data) {
        return new Result(ResultEnum.FAILURE.getCode(), ResultEnum.FAILURE.getMessage(), data);
    }

    public static Result buildFailure(String msg, Object data) {
        return new Result(ResultEnum.FAILURE.getCode(), msg, data);
    }

    public static Result getInstance(Integer code, String message) {
        return new Result(code, message);
    }

    public static Result getInstance(Integer code, String message, Object data) {
        return new Result(code, message, data);
    }

    private Result() {
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public Object getData() {
        return this.data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Result)) {
            return false;
        } else {
            Result other = (Result)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$code = this.getCode();
                    Object other$code = other.getCode();
                    if (this$code == null) {
                        if (other$code == null) {
                            break label47;
                        }
                    } else if (this$code.equals(other$code)) {
                        break label47;
                    }

                    return false;
                }

                Object this$msg = this.getMsg();
                Object other$msg = other.getMsg();
                if (this$msg == null) {
                    if (other$msg != null) {
                        return false;
                    }
                } else if (!this$msg.equals(other$msg)) {
                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Result;
    }

    @Override
    public int hashCode() {
        int i = 1;
        Object $code = this.getCode();
        int result = i * 59 + ($code == null ? 43 : $code.hashCode());
        Object $msg = this.getMsg();
        result = result * 59 + ($msg == null ? 43 : $msg.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Result(code=" + this.getCode() + ", msg=" + this.getMsg() + ", data=" + this.getData() + ")";
    }


}
