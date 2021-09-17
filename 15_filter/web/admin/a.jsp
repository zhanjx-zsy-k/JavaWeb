<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/13
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    System.out.println("a.jsp");
    Object user = session.getAttribute("user");

    if(user==null){
        request.getRequestDispatcher("/login.jsp").forward(request,response);
        return;
    }

%>
我是a.jsp文件
</body>
</html>
