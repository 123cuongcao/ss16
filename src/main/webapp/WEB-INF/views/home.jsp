<%@ page import="ra.rikkeiacademy.model.User" %><%--
  Created by IntelliJ IDEA.
  User: hung1
  Date: 11/21/2023
  Time: 9:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>CHào mừng<%=((User)session.getAttribute("user_login")).getFullName()%> quay trở lại trang web!</h1>
</body>
</html>
