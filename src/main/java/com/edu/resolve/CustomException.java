package com.edu.resolve;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author zk
 * @Date 2023/7/7 16:09
 * @注释：
 */
/*
* @RestControllerAdvice是一个组合注解包含@ControllerAdvice，@ResponseBody
* @ControllerAdvice效果相当于@Controller
* @ResponseBody使返回的值为字符串，而不是跳转界面。
 */
@RestControllerAdvice
public class CustomException {


    /**
     * 处理算术异常
     * @return
     */
    // 可以不写value，有默认值（可以不写括号）
    // 声明处理哪些异常
    @ExceptionHandler(ArithmeticException.class)
    public String handle(){
        return "msg";

    }
}
