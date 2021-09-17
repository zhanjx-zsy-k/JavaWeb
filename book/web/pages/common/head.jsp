<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/3
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%
    String basePath = request.getScheme()
            + "://" + request.getServerName()
            +":"
            + request.getServerPort()
            + request.getContextPath()
            + "/";
    pageContext.setAttribute("basePath",basePath);
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<base href="<%= basePath%>">
<%--http://localhost8080/book/
    http://localhost:8080/book/
--%>
<link type="text/css" rel="stylesheet" href="static/css/style.css">
<script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>