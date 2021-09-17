<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.atguigu.pojo.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/2
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border: 1px blue solid;
            width: 600px;
            border-collapse: collapse;
        }
        td,th{
            border: 1px blue solid;
        }
    </style>
</head>
<body>

<table border="1" cellspacing="0">
    <c:forEach begin="1" end="10" var="i">
        <tr>
            <td>
                    ${i}
            </td>
        </tr>
    </c:forEach>

</table>
<hr>
<%
    request.setAttribute("arr", new String[]{"1234567489", "232163416", "3211962113325"});
%>
<c:forEach items="${arr}" var="item">
    ${item}<br>

</c:forEach>
<hr>
<%
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("key1", "value1");
    map.put("key2", "value2");
    map.put("key3", "value3");
    request.setAttribute("map", map);
%>
<c:forEach items="${requestScope.map}" var="item">
    ${item.value}<br>
</c:forEach>
<hr>
<%
    List<Student> studentList = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
        studentList.add(new Student(i, "username" + i, "password" + 1, 18 + i, "phone" + i));
    }
    request.setAttribute("stus", studentList);
%>
<table>
    <tr>
        <th>编号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>年龄</th>
        <th>电话</th>
        <th>操作</th>
    </tr>
    <c:forEach begin="2" end="7" step="2" varStatus="status" items="${stus}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.username}</td>
            <td>${item.password}</td>
            <td>${item.age}</td>
            <td>${item.phone}</td>
            <td>删除、修改</td>
        </tr>

    </c:forEach>
</table>
</body>
</html>
