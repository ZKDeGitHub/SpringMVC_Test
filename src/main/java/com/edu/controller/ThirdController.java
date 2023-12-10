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

    /**
     * 也可以获取HttpSession 对象
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @GetMapping("method1")
    public String method1(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //原生对象
        System.out.println(request);
        System.out.println(response);

        request.setCharacterEncoding("UTF-8");
        request.setAttribute("msg","hello");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf8");
        response.getWriter().write("response 写出去");
        return "success";
    }
}
