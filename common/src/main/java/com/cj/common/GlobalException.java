package com.cj.common;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(RuntimeException.class)
    // 将错误抛出去 ，不能处理掉
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public RespBean runtimeException(RuntimeException e){
        return RespBean.error(e.getMessage());
    }
}
