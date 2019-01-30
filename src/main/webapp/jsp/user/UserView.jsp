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
    <link rel="stylesheet" href="<%=basePath%>/css/bootstrap-editable.css">
    <link rel="stylesheet" href="<%=basePath%>/css/bootstrap-table.css">
    <link rel="stylesheet" href="<%=basePath%>/css/bootstrap-datetimepicker.min.css">
    <link rel="stylesheet" href="<%=basePath%>/css/comm.css">
    <script language='javascript' src="<%=basePath%>/js/jquery.min.js"></script>
    <script language='javascript' src="<%=basePath%>/js/bootstrap.min.js"></script>
    <script language='javascript' src="<%=basePath%>/js/bootstrap-editable.js"></script>
    <script language='javascript' src="<%=basePath%>/js/bootstrap-table.js"></script>
    <script language='javascript' src="<%=basePath%>/js/bootstrap-table-zh-CN.js"></script>
    <script language='javascript' src="<%=basePath%>/js/bootstrap-table-editable.js"></script>
    <script language='javascript' src="<%=basePath%>/js/bootbox.min.js"></script>
    <script language='javascript' src="<%=basePath%>/js/moment-with-locales.min.js"></script>
    <script language='javascript' src="<%=basePath%>/js/bootstrap-datetimepicker.min.js"></script>
    <script language='javascript' src="<%=basePath%>/jsp/user/UserView.js"></script>
    <script language='javascript' src="<%=basePath%>/js/comm.js"></script>
    <style>
        .addUserTab tr td{
            border: none !important;
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
    <button type="submit" onclick="queryUser()" class="btn btn-primary">查询</button>
    <button type="submit" onclick="addUser()" class="btn btn-primary">新增</button>
</div>
<div class="myTable" style="height: calc(100% - 40px);">
    <table id="tb"></table>
</div>

<div class="modal fade" id="myModal" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span></button>
                <h4 class="modal-title">添加用户</h4>
            </div>
            <div class="modal-body">
                <table class="table addUserTab">
                    <tr>
                        <td>
                            <div class="form-group">
                                <label class="control-label">登录名:</label>
                                <input type="text" class="form-control" name="maincategoryname" id="userId">
                            </div>
                        </td>
                        <td>
                            <div class="form-group">
                                <label class="control-label">用户姓名:</label>
                                <input type="text" class="form-control" name="maincategoryname" id="addUserName">
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="form-group">
                                <label class="control-label">密码:</label>
                                <input type="text" class="form-control" name="maincategoryname" id="userPass">
                            </div>
                        </td>
                        <td>
                            <div class="form-group">
                                <label class="control-label">邮箱:</label>
                                <input type="text" class="form-control" name="maincategoryname" id="userEmail">
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="form-group">
                                <label class="control-label">电话:</label>
                                <input type="text" class="form-control" name="maincategoryname" id="userPhone">
                            </div>
                        </td>
                        <td>
                            <div class="form-group date">
                                <label class="control-label">生日:</label>
                                <input type="text" class="form-control" name="maincategoryname" id="userBirthday">
                            </div>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="modal-footer">
                <button type="submit" class="btn btn-primary">保存</button>
            </div>
        </div>
    </div>
</div>

</body>
</html>
