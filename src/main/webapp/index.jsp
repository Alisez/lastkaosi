<%@ page isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset="UTF-8">
    <title>wangEditor 一个页面多个编辑器</title>
    <style type="text/css">
        .toolbar {
            background-color: #f1f1f1;
            border: 1px solid #ccc;
        }
        .text {
            border: 1px solid #ccc;
            height: 200px;
        }
    </style>
</head>
<body>
<input type="button" id="btn" value="免费获取验证码" onclick="settime(this)" />
<font color="red">${pageContext.request.contextPath }</font>
<div id="div1" class="toolbar">
</div>
<div style="padding: 5px 0; color: #ccc">中间隔离带</div>
<div id="div2" class="text">
    <p>第一个 demo（菜单和编辑器区域分开）</p>
</div>

<div id="div3">
    <p>第二个 demo（常规）</p>
</div>

<!-- 引用js -->

<script type="text/javascript" src="resources/wangEditor.min.js"></script>
<script src="/resources/register/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
    var E = window.wangEditor

    var editor1 = new E('#div1', '#div2')
    editor1.create()

    var editor2 = new E('#div3')
    editor2.create()
</script>
<script type="text/javascript">
    var countdown=60;
    function settime(obj) {
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
</script>
</body>
</html>
