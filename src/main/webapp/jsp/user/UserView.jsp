<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/27
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="<%=basePath%>/css/bootstrap.min.css">
    <%--<link rel="stylesheet" href="<%=basePath%>/css/bootstrap-editable.css">--%>
    <link rel="stylesheet" href="<%=basePath%>/css/bootstrap-table.css">
    <script language='javascript' src="<%=basePath%>/js/jquery.min.js"></script>
    <script language='javascript' src="<%=basePath%>/js/bootstrap.min.js"></script>
    <script language='javascript' src="<%=basePath%>/js/bootstrap-editable.js"></script>
    <script language='javascript' src="<%=basePath%>/js/bootstrap-table.js"></script>
    <script language='javascript' src="<%=basePath%>/js/bootstrap-table-zh-CN.js"></script>
    <script language='javascript' src="<%=basePath%>/jsp/user/UserView.js"></script>
    <style>
        #tb_users{
            height: calc(100% - 34px) !important;
        }
        #tb_users tr:nth-child(even) {
            background: #fafafa !important;
        }

        #tb_users th {
            background: #efefef !important;
        }
        .myTable .bootstrap-table{
            height: 100% !important;
        }
        .myTable .fixed-table-toolbar{
            height: 50px !important;
        }
        .myTable .fixed-table-pagination{
            height: 60px !important;
        }
        .myTable .fixed-table-container{
            height: calc(100% - 110px) !important;
        }
    </style>
</head>
<body>
<div class="form-inline">
    <div class="form-group">
        <label for="userName">用户名称：</label>
        <input type="text" class="form-control" id="userName" placeholder="请输入用户名">
    </div>
    <div class="form-group">
        <label for="telePhone">手机号码：</label>
        <input type="email" class="form-control" id="telePhone" placeholder="请输入手机号码">
    </div>
    <button type="submit" class="btn btn-primary">查询</button>
</div>
<div class="myTable" style="height: calc(100% - 40px);">
    <table id="tb_users"></table>
</div>
</body>
</html>
