package com.jmall.util;

public class BaseResult<T> {

    private T data;
    private int code = 200;
    private String msg = "success";

    public BaseResult(){

    }

    public BaseResult(T data) {
        this.data = data;
    }

    public BaseResult(T data,int code) {
        this.data=data;
        this.code=code;
    }

    public BaseResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResult(T data, int code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
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
}
