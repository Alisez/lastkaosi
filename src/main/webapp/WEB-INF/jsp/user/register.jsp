<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2017/7/26
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>

    <meta charset="utf-8">
    <title>Fullscreen Responsive Register Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- CSS -->
    <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
    <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=Oleo+Script:400,700'>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/register/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/register/css/style.css">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->


</head>

<body>
<p>这是一个段落。</p>
<button>切换</button>

<div class="header">
    <div class="container">
        <div class="row">
            <div class="logo span4">
                <h1>注册页面 </h1>
            </div>
            <div class="links span8">
                <a class="home" href="" rel="tooltip" data-placement="bottom" data-original-title="Home"></a>
                <a class="blog" href="" rel="tooltip" data-placement="bottom" data-original-title="Blog"></a>
            </div>
        </div>
    </div>
</div>

<div class="register-container container">
    <div class="row">
        <div class="iphone span5">
            <img src="${pageContext.request.contextPath}/resources/register/img/iphone.png" alt="">
        </div>
        <div class="register span6">
            <form action="" method="post">
                <h2>用户<span class="red"><strong>注册</strong></span></h2>
                <label for="username">用户名</label>
                <input type="text" id="username" name="username" placeholder="填写用户名">
                <label for="email">邮箱</label>
                <input type="text" id="email" name="email" placeholder="填写邮箱">
                <label for="password">密码</label>
                <input type="password" id="password" name="password" placeholder="填写密码">

                <label>手机验证码</label>
                <input name="mobileCode" maxlength="6" id="phoneCode" placeholder="填写验证码" type="text">
                <button id="getPhoneCode" type="button" class="getphoneCode" >获取验证码</button>

                <button type="submit">注册</button>
            </form>
        </div>
    </div>
</div>
<div align="center">Collect from <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a></div>
<!-- Javascript -->
<script src="${pageContext.request.contextPath}/resources/register/js/jquery-1.8.2.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/register/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/register/js/jquery.backstretch.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/register/js/scripts.js"></script>
<script type="text/javascript">

    $(function(){
        //1. 点击 delete 时, 弹出 确定是要删除 xx 的信息吗 ? 若确定, 执行删除, 若不确定, 则取消
        $(".getphoneCode").click(function(){

            var flag = confirm("确定要删除的信息吗?");
            if(flag){
                var $tr = $(this).parent().parent();
                //删除, 使用 ajax 的方式
                var url = this.href;
                var args = {"time":new Date()};
                $.post(url, args, function(data){
                    //若 data 的返回值为 1, 则提示 删除成功, 且把当前行删除
                    if(data == "1"){
                        alert("删除成功!");
                        $tr.remove();
                    }else{
                        //若 data 的返回值不是 1, 提示删除失败.
                        alert("删除失败!");
                    }
                });
            }

            //取消超链接的默认行为
            return false;
        });
    })

</script>

</body>
</html>
