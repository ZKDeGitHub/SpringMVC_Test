package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author zk
 * @Date 2023/7/6 17:17
 * @注释：
 * @since 11
 */
@Controller
@RequestMapping("fourth")
public class FourthController {

    /**
     * 1 返回值为 ModelAndView，是一个对象
     * @return
     */
    @GetMapping("modelAndView")
    public ModelAndView fun1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","modelAndView模型数据");


        return modelAndView;
    }
}
