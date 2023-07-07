package com.edu.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author zk
 * @Date 2023/7/7 15:08
 * @注释：文件下载的编写代码方式
 * 好处：任何文件下载都可以通过弹窗保存 并且可以统计下载次数
 */
@Controller
@RequestMapping("fileDownload")
public class FileDownloadController {

    @GetMapping("download")
    @ResponseBody
    public void method(String name, HttpSession session, HttpServletResponse response) throws IOException {
        System.out.println("与前端的？前的 name对应的名称" + name);

        //获得要下载文件的绝对路径
        String path = session.getServletContext().getRealPath("/D:\\download/");

        //文件的完整路径：绝对路径拼接上名称
        String real_path = path + "\\" + name;

        //设置响应头  告知浏览器，要以附件的形式保存内容   filename=浏览器显示的下载文件名
        response.setHeader("content-disposition","attachment;filename=" + name);

        //读取目标文件，写出给客户端
        IOUtils.copy(new FileInputStream(real_path),response.getOutputStream());

    }
}
