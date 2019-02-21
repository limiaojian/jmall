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

    public BaseResult(T data, int code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }
}
