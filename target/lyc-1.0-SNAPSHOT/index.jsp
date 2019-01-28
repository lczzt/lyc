<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/26
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>cehsi</title>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="<%=basePath%>/css/bootstrap.min.css">
    <script language='javascript' src="<%=basePath%>/js/jquery.min.js"></script>
    <script language='javascript' src="<%=basePath%>/js/bootstrap.min.js"></script>
    <script language='javascript' src="<%=basePath%>/js/index.js"></script>
</head>
<body>

</body>
</html>
