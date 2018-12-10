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
<meta charset="UTF-8">
<title>Title</title>
<script  type="text/javascript" src="../../js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
    $(function () {
            $.get({
                url:"/user/page/"+2+"/"+5,
                success:function (reslut) {
                   var lists = reslut.map.page.list;
                   $.each(lists,function () {
                       alert(this.username+","+this.password)
                   })
                }
            })
    })
</script>
<input type="text" name="username"><br/>
<input type="text" name="password"><br/>
</body>
</html>
