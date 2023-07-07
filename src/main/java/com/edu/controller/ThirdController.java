package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author zk
 * @Date 2023/7/6 16:30
 * @注释：获取ServletAPI
 * @since 11
 */
@Controller
@RequestMapping("third")
public class ThirdController {

    @GetMapping("method1")
    public String method1(HttpServletRequest httpServletRequest, HttpServletResponse response) throws IOException {
        httpServletRequest.setAttribute("msg","hello");
        response.setContentType("text/html;charset=utf8");
        response.getWriter().write("response 写出去");
        return "success";
    }
}
