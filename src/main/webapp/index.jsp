<%--
  Created by IntelliJ IDEA.
  User: JAVASM
  Date: 2023/7/6
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <a href="/down?name=down1.html">文件下载编写代码方式</a>

  <h2>文件上传</h2>
  <form action="/upload3" method="post" enctype="multipart/form-data">
    <input type="file" name="file1"> <br>
    <input type="submit" value="提交">
  </form>

  <h2>普通参数封装</h2>
  <form action="/add" method="get">
    <input type="text" name="username"> <br>
    <input type="submit" value="提交">
  </form>


  </body>
</html>
