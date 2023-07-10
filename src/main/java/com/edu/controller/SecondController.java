package com.edu.controller;

import com.edu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

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

    /**
     * json
     * 传入的json的key值名称要与User的成员变量名称一致
     * @param user
     * @return
     */
    @PostMapping("json1")
    public String method(@RequestBody User user){
        System.out.println(user);
        return "success";
    }


    /**
     * 参数为对象类型
     * @param user
     * @return
     */
    @GetMapping("add3")
    public String add3(User user){
        System.out.println("add3的user：" + user);
        return "success";
    }

    /**
     * 数组
     * @param hobby
     * @return
     */
    @GetMapping("arr")
    public String add2(String[] hobby){
        System.out.println("add2的数组：" + Arrays.toString(hobby) );
        return "success";
    }


    /**
     * 普通参数传递类型
     * 表单的name属性，要和方法的参数名相同，此时会自动把数据封装上
     * 当不一致时，通过RequestParam注解指定要封装的表单数据
     * @param abc
     * @return
     */
    @GetMapping("add1")
    public String add1(@RequestParam("username") String abc){
        System.out.println("add1的username值：" + abc);
        return "success";
    }

    /**
     * 普通参数传递类型
     * 表单的name属性，要和方法的参数名相同，此时会自动把数据封装上
     * @param username
     * @return
     */
    @GetMapping("add")
    public String add(String username){
        System.out.println("username值：" + username);
        return "success";
    }

}
