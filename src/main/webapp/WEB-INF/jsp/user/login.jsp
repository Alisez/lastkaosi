<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2017/7/29
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Fullscreen Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- CSS -->
    <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/login/css/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/login/css/supersized.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/login/css/style.css">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>
<div class="page-container">
    <h1>Login</h1>
    <form action="" method="post">
        <input type="text" name="username" class="username" placeholder="用户名">
        <input type="password" name="password" class="password" placeholder="密码">
        <button type="submit">Sign me in</button>
        <div class="error"><span>+</span></div>
    </form>
    <div class="connect">
        <p>Or connect with:</p>
        <p>
            <a class="facebook" href=""></a>
            <a class="twitter" href=""></a>
        </p>
    </div>
</div>
<div align="center">Collect from <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a></div>

<!-- Javascript -->
<script src="${pageContext.request.contextPath}/resources/login/js/jquery-1.8.2.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/login/js/supersized.3.2.7.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/login/js/supersized-init.js"></script>
<script src="${pageContext.request.contextPath}/resources/login/js/scripts.js"></script>

</body>
</html>
