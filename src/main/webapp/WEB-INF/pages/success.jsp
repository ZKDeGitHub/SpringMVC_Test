<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这是首页
<%--用于接受FourthController中的method2的msg和age--%>
<%--也可以直接写名称--%>
<%--${requestScope.msg}--%>
${msg}
<%--${sessionScope.age}--%>
${age}
</body>
</html>