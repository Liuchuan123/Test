<%--
  Created by IntelliJ IDEA.
  User: LIUCHUAN
  Date: 2018/12/7
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
</head>
<body>
    <script type="text/javascript">
        $(function () {
            var date = new Date().getTime()
                $.ajax({
                    url:"/user/page?time="+date,
                    data:"&pn=2&ps=5",
                    type:"GET",
                    success:function (reslut) {
                        alert(reslut.msg);
                    }
                })
        })
    </script>
<input type="text" name="username"><br/>
<input type="text" name="password"><br/>
</body>
</html>
