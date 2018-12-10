<%--
  Created by IntelliJ IDEA.
  User: LIUCHUAN
  Date: 2018/12/4
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-3.3.1.min.js"></script>
    <script>
        $(function () {
            var username=false;
            var password=false;
            var repassword=false;
            // 用户名
            $(":text:eq(0)").blur(function () {
                if($(this).val()==""){
                    $(this).next().css("color","red").html("×");
                    username=false;
                }
                else {
                    $(this).next().css("color","green").html("√");
                    username=true;
                }
            })
            // 密码
            $(":password:eq(0)").blur(function () {
                if($(this).val()==""){
                    $(this).next().css("color","red").html("密码不能为空");
                    password=false;
                }
                else if (!$(this).val().match(/^\w{6,12}$/)){
                    $(this).next().css("color","red").html("密码输入格式不对");
                    password=false;
                }
                // }
                else {
                    $(this).next().css("color","green").html("√");
                    password=true;
                }
            })
            // 确认密码
            $(":password:eq(1)").blur(function () {
                if($(this).val()==""||$(this).val() != $(":password:eq(0)").val()){
                    $(this).next().css("color","red").html("×");
                    repassword=false;
                }
                else {
                    $(this).next().css("color","green").html("√");
                    repassword=true;
                }
            })

            $(":submit").click(function () {
                if (username==false||password==false||repassword==false||$(":file:eq(0)").val()==""){
                    alert("请添加完整信息");
                    return false;
                }
            })

        });
    </script>
</head>
<body>
    <form action="/register" method="post" enctype="multipart/form-data">
        用户名：<input type="text" name="username"><span></span><br>
        密码：<input type="password" name="password"><span></span><br>
        确认密码：<input type="password"><span></span><br>
        头像：<input type="file" name="file"><span></span><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
