package com.jmall.interceptor;

import com.jmall.util.BaseResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理器
 */
@ControllerAdvice
public class DefaultExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value=Exception.class)
    public BaseResult errorHandler(Exception ex){
        return new BaseResult(500,ex.getMessage());
    }

}
