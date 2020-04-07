package com.yang.jzb.web.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yang hituzi
 * @description 
 * @date 
 */
@ControllerAdvice
public class DefaultExceptionHandler {
    /**
     * 全局异常捕捉处理
     *
     * @param e
     * @return String
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String defaultExceptionHandler(HttpServletRequest req, Exception e) {
        e.printStackTrace();
        return e.getMessage();
    }
}
