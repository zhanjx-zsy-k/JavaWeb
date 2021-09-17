<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/11
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/13_cookie_session/loginServlet" method="get">
    用戶名:<input type="text" name="username" value="${cookie.username.value}">
    密碼:<input type="password" name="password" >
    <input type="submit" value="登錄">

</form>

</body>
</html>
