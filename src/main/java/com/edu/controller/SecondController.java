package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author zk
 * @Date 2023/7/6 15:24
 * @since 11
 * @注释：参数类型传递
 * 1 普通参数类型传递 add(),add1
 * 注意：表单的name属性，要和方法的参数名相同。此时会自动把数据封装上。当不一致时，通过RequestParam注解指定要封装的表单数据
 * 2 数组
 * 3 对象
 * 4 包装，List，Map（了解）
 * 5 JSON格式字符串（重点）
 */
@Controller
public class SecondController {

    @GetMapping("add")
    public String add(String username){
        System.out.println("username值：" + username);
        return "success";

    }
}
