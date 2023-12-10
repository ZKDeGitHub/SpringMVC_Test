package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author zk
 * @Date 2023/7/6 17:17
 * @注释：给域中传值
 * @since 11
 */
@Controller
@RequestMapping("fourth")
public class FourthController {

    /**
     *1 原生请求
     * 原生的 httpRequestServlet，HttpSession，HttpServletResponse
     * @param httpRequestServlet
     * @param session
     * @return
     * @throws IOException
     */
    @GetMapping("method2")
    public String method2(HttpServletRequest httpRequestServlet, HttpSession session) throws IOException {
        httpRequestServlet.setAttribute("msg", "hello");
        session.setAttribute("age", 12);
        return "success";
    }


    /**
     *2 model请求
     *  Model类型，用于传输数据的；
     *  model中的数据，会在View渲染之前，将数据复制一份给request
     *  是由SpringMVC提供的
     * @param model
     * @return
     */
    @GetMapping("method3")
    public String method3(Model model)  {
        model.addAttribute("msg", "你好");
        model.addAttribute("age", 19);
        return "success";
    }

    /**
     * 3 返回值为 ModelAndView，是一个对象
     * 统一管理数据模型和视图的
     * 返回对象为 ModelAndView
     * 是由SpringMVC提供的
     * @return
     */
    @GetMapping("modelAndView")
    public ModelAndView fun1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","modelAndView模型数据");
        modelAndView.addObject("age","30");
        // 设置返回页面
        modelAndView.setViewName("success");

        return modelAndView;
    }
}
