package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: zk
 * @description: Restfule风格
 * @date: 2023/12/10 13:18
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * rest风格参数的接收
     * 实现效果：http://localhost:8080/restPath/zhangsan/nan
     */
    @GetMapping("/restPath/{name}/{sex}")
    public void fun1(@PathVariable String sex, @PathVariable String name){
        System.out.println(name);
        System.out.println(sex);
    }

    /**
     * 如果参数名和路径名中的不一致时，需要通过@PathVariable的参数指定获取路径上的值，也没有顺序
     */
    @GetMapping("/restPath/{name}/{sex}")
    public void fun2(@PathVariable("name") String abc,@PathVariable("sex") String bbb){
        System.out.println(abc);
        System.out.println(bbb);
    }

}
