<%--
  Created by IntelliJ IDEA.
  User: LIUCHUAN
  Date: 2018/11/29
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%System.out.println("jsp执行了"); %>
<html>
<head>
    <title>Title</title>
</head>
<br>
    <form action="/demo1" method="post">
        <input type="text" name="name">
        <input type="checkbox" name="hover" value="学习">
        <input type="checkbox" name="hover" value="运动">
        <input type="checkbox" name="hover" value="睡觉">
        <input type="checkbox" name="hover" value="游戏">
        <<input type="text" name="age" value="${sessionScope.session}">
        <input type="submit" value="提交">
    </form>
req:${req}<br>
session:${sessionScope.session}<br>
session1:${sessionScope.session1}<br>
app:${applicationScope.app}<br>

model:${model}

<form action="/upload" method="post" enctype="multipart/form-data">
    <input type="text" name="name"><br>
    <input type="file" name="file"><br>
    <input type="submit" value="提交">
</form>

<a href="/download?file=a.txt">下载</a>

</body>
</html>
