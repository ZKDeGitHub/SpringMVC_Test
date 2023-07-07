package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * @Author zk
 * @Date 2023/7/7 11:41
 * @since 11
 * @注释：文件上传
 * 注意点：文件的name属性值要和 controller的形参名保持一致
 * WEB-INF是受保护的资源，url直接输入对应.jsp文件无法直接跳转
 * 只可以通过内部方法跳转，本例中就是从WEB-INF下的index.jsp跳转，才可以跳转到对应的.jsp文件
 */
@Controller
@RequestMapping("fileUpload")
public class FileUploadController {

    /**
     *
     * @param fileName
     * @param request
     * @return
     * @throws IOException
     * MVC的单文件上传
     * 本方法中的 MultipartFile参数名称fileName要与前端form表单中name名称保持一致。
     */
    @PostMapping("uploadSingle")
    public String method1(MultipartFile fileName, HttpServletRequest request) throws IOException {

        // 获取文件全路径：路径名称 拼接 文件名
        String path = request.getServletContext().getRealPath("/WEB-INF/files/") + fileName.getOriginalFilename();

        // 新建文件对象
        File file = new File(path);
        // 上传文件
        fileName.transferTo(file);
        return "success";
    }

}
