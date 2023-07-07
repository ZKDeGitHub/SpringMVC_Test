package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author zk
 * @Date 2023/7/6 15:24
 * @注释：普通参数类型传递
 * 表单的name属性，要和方法的参数名相同。此时会自动把数据封装上。当不一致时，通过RequestParam注解指定要封装的表单数据
 * @since 11
 */
@Controller
public class SecondController {

    @GetMapping("add")
    public String add(String username){
        System.out.println("username值：" + username);
        return "success";

    }
}
