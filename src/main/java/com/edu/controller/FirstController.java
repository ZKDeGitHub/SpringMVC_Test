package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author zk
 * @Date 2023/7/6 14:30
 * @注释：测试用
 * @since 11
 */
@Controller
public class FirstController {

    @GetMapping("login")
    public String method1(){
        System.out.println("处理登陆请求");
        return "success";
    }
}
