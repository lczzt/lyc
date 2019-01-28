<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/23
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <script language='javascript' src="<%=basePath%>/js/jquery.min.js"></script>
    <script language='javascript' src="<%=basePath%>/js/bootstrap.min.js"></script>
    <script language='javascript' src="<%=basePath%>/js/index.js"></script>
</head>
<style>
    .row{
        height: calc(100% - 72px) !important;
        width: calc(100% - -15px) !important;
    }
    .menuStyle{
        color: red;
    }
</style>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Brand</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
                <li><a href="#">Link</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">Dropdown <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">One more separated link</a></li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-left">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">Link</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">Dropdown <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div class="row">
    <div class="col-md-2" style="height: 100%;width: 150px !important;">
        <c:forEach  items="${userMenu}" var="menu">
            <p class="text-center groupMenu" onclick="clickMenu(${menu.MENU_ID},this)" style="cursor: pointer">${menu.MENU_TEXT}</p>
        </c:forEach>
    </div>
    <div class="col-md-10" style="overflow: hidden;height: 100%;width: calc(100% - 150px) !important;">
        <div class="SecondMenu" style="height: 60px;overflow: hidden;">

            <%--<p class="text-center" style="cursor: pointer;float: left;">2222222222222222</p>--%>
            <%--<p class="text-center" style="cursor: pointer;float: left;margin-left: 25px;">2222222222222222</p>--%>
            <%--<p class="text-center" style="cursor: pointer;float: left;margin-left: 25px;">2222222222222222</p>--%>
            <%--<p class="text-center" style="cursor: pointer;float: left;margin-left: 25px;">2222222222222222</p>--%>
        </div>
        <div class="mainBox">
            <iframe src="jsp/login.jsp" id="reportFrame"
                    frameborder="0" scrolling="no" marginheight="0" marginwidth="0"
                    width="1210px" height="100%"></iframe>
        </div>

    </div>
</div>
</body>
</html>
