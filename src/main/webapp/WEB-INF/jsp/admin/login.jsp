<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>登录页面</title>
    <link rel="stylesheet" href="<c:url value="/static/css/user/base.css"/>">
    <link rel="stylesheet" href="<c:url value="/static/css/user/login.css"/>">
</head>
<body>
<div class="bg"></div>
<div class="container">
    <div class="line bouncein">
        <div class="xs6 xm4 xs3-move xm4-move">
            <div style="height:150px;"></div>
            <div class="media media-y margin-big-bottom">
            </div>
            <form action="<c:url value="/admin/dologin"/>" method="post">
                <div class="panel loginbox">
                    <div class="text-center margin-big padding-big-top">
                        <h1>欢迎使用宠物购买管理系统</h1>
                    </div>
                    ${msg}
                    <div class="panel-body"style="padding:30px; padding-bottom:10px; padding-top:10px;">
                        <div class="form-group">
                            <div class="field field-icon-right">
                                <input type="text" class="input input-big" name="adminName" id="name" placeholder="账号" />
                                <span class="icon icon-user margin-small"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="field field-icon-right">
                                <input type="password" class="input input-big" name="adminPwd" id="password"  placeholder="密码" />
                                <span class="icon icon-key margin-small"></span>
                            </div>
                        </div>
                        <div class="form-group v_container">
                            <div class="field">
                                <input type="text" class="input input-big" id="code_input" name="code" placeholder="验证码" />
                                <div id="v_container" style="width: 100px;height: 45px;" class="passcode"></div>
                            </div>
                        </div>
                    <div style="padding:30px;">
                        <input type="submit" id="button" class="button button-block bg-main text-big input-big" value="登录">
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
<script src="<c:url value="/static/js/user/gVerify.js"/>"></script>
<script>

    var verifyCode = new GVerify("v_container");

    document.getElementById("button").onclick = function(){
        /*获取inputi面的值*/
        var res = verifyCode.validate(document.getElementById("code_input").value);
        if(res){
            return;
        }else{
            alert("验证码错误");
            return false;
        }
    }
</script>
</html>
