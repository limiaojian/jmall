package com.jmall.interceptor;

import com.alibaba.fastjson.JSON;
import com.jmall.util.BaseResult;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 1、对返回结果进行统一包装成{"data":"","code":200,"msg":"success"}的格式
 * 2、最终都会对通过各自的@ResponseBody输出
 */
@ControllerAdvice
public class DefaultResultHandler implements ResponseBodyAdvice {

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        if(body instanceof BaseResult){//异常处理器处理之后的对象就是BaseResult对象
            return body;
        }else{
            BaseResult result = new BaseResult(body,200);
            if(body instanceof String){//返回类型是String类型时，会报错com.jmall.util.BaseResult cannot be cast to java.lang.String
                return JSON.toJSONString(result);
            }
            return result;
        }
    }
}
