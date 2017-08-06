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
<div class="header">
    <div class="container">
        <div class="row">
            <div class="logo span4">
                <h1>注册页面 </h1>
            </div>
            <div class="links span8">
                <a class="home" href="" rel="tooltip" data-placement="bottom" data-original-title="Home"></a>
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
            <form id ="userForm" action="${pageContext.request.contextPath }/user/register" method="post" enctype="multipart/form-data">
                <h2>用户<span class="red"><strong>注册</strong></span></h2>
                <label for="username">用户名</label>
                <input type="text" id="username" name="username" placeholder="填写用户名">
                <br/>
                <div id="message1"></div>
                <br/>
                <label for="password">密码</label>
                <input type="password" id="password" name="password" placeholder="填写密码">
                <input type="button" id="btn2" value="更换验证方式" />
                <label for="validate">邮箱</label>
                <input type="text" id="validate" name="email" placeholder="填写邮箱">
                <br/>
                <div id="message2"></div>
                <br/>
                <input type="button" id="btn" value="免费获取验证码"  disabled="disabled" onclick="settime(this)"/>
                <br/>
                <div id="message3"></div>
                <br/>
                <input type="text" id="verification " name="verification" placeholder="填写验证码">


                <button type="submit" onsubmit="return sures()">注册</button>
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
        $(":input[name='username']").change(function(){
            var val=$(this).val();
            val=$.trim(val);
            if(val!=""){
                var url="${pageContext.request.contextPath}/validateuser/doUserName";
                var args={"username":val,"time":new Date()};
                $.post(url,args,function(data){
                    if (data>=1) {
                        $("#message1").html("该用户名已经存在");
                        $("#message1").val("1");
                    }else {
                        $("#message1").html("该用户名可以使用");
                        $("#message1").val("0");
                    }
                });
            }
        });

        $(":input[id='validate']").keyup(function(){
            var val=$(this).val();
            val=$.trim(val);
            if(val!=""&&$("label[for='validate']").text()=="邮箱"){
                var url="${pageContext.request.contextPath}/validateuser/doEmail";
                var args={"email":val,"time":new Date()};
                $.post(url,args,function(data){
                    if (data>=1) {
                        $("#message2").html("该邮箱已经存在");
                        $("#message2").val("1");
                        $("#btn").attr("disabled","disabled");
                    }else {
                        $("#message2").html("");
                        $("#message2").val("0");
                        $("#btn").removeAttr("disabled");
                    }
                });
            }else if(val!=""&&$("label[for='validate']").text()=="手机"){
                var url="${pageContext.request.contextPath}/validateuser/doEmail";
                var args={"email":val,"time":new Date()};
                $.post(url,args,function(data){
                    if (data>=1) {
                        $("#message2").html("该手机已经存在");
                        $("#message2").val("1");
                        $("#btn").attr("disabled","disabled");
                    }else {
                        $("#message2").html("");
                        $("#message2").val("0");
                        $("#btn").removeAttr("disabled");
                    }
                });
            }
        });

        $("#btn").click(function(){
            var val=$("input[id='validate']").val();
            val=$.trim(val);
            if(val!=""){
                if ($("label[for='validate']").text()=="邮箱"){
                var url="${pageContext.request.contextPath}/validateuser/getEmail";
                var args={"email":val,"time":new Date()};
                $.post(url,args,function(data){
                    if (val!=data){
                        $("#message3").html(data);
                    } else{
                        $("#message3").val(val);

                    }
                });
                }else{
                    var url="${pageContext.request.contextPath}/validateuser/getPhone";
                    var args={"phone":val,"time":new Date()};
                    $.post(url,args,function(data){
                        if (val!=data){
                            $("#message3").html(data);
                        } else{
                            $("#message3").val(val);

                        }
                    });
                }
            }
        });
        $("#btn2").click(function(){
            var val=$("label[for='validate']").text();
            if (val=="邮箱") {
                $("input[id='validate']").attr('placeholder', '填写手机')
                $("input[id='validate']").attr('name','phone')
                $("label[for='validate']").text('手机')
            }else {
                $("input[id='validate']").attr('placeholder', '填写邮箱')
                $("input[id='validate']").attr('name','email')
                $("label[for='validate']").text('邮箱')
            }


        })






    });
    var countdown=60;
    function settime(obj) {
        var val=$("input[id='validate']").val();
        val=$.trim(val);
        if(val!=null){
        if (countdown == 0) {
            obj.removeAttribute("disabled");
            obj.value="免费获取验证码";
            countdown = 60;
            return;
        } else {
            obj.setAttribute("disabled", true);
            obj.value="重新发送(" + countdown + ")";
            countdown--;
        }
        setTimeout(function() {
                settime(obj) }
            ,1000)
        }
    }
    $("form").submit(function(e){
        if($("#message1").val()!=$("#message2").val()!=0){
            e.preventDefault();
            alert("用户名或验证方式不符合条件")
        }if($("#message3").val()!=$("input[id='validate']").val()){
            e.preventDefault();
            alert("验证地址不正确")
        }if($("#btn").val()=="免费获取验证码"){
            e.preventDefault();
            alert(("验证码已过期"))
        }if ($("#verification ").val()!="845623"){
            e.preventDefault();
            alert(("验证码不正确"))
        }
    });



</script>

</body>
</html>
