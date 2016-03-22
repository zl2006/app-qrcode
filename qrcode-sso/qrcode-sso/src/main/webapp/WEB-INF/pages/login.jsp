<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath =
        request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
    request.setAttribute("basePath", basePath);
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>开店助手-互联网营销-登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" href='${applicationScope.pageConfig["resources.path"] }/css/pure/0.6.0/pure-min.css'>
    <link rel="stylesheet" href='${applicationScope.pageConfig["resources.path"] }/css/site/site.css'>
    <link rel="stylesheet" href='${applicationScope.pageConfig["resources.path"] }/app/qrcode-sso/css/login.css'>
</head>
<body>
<!-- 头部-->
<div id="top"> <!-- logo,搜索码/会员区域 -->
    <a class="logo-main">超级营销</a>
    <img src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-sso/images/split.png' class="logo-split" alt="split" style="width:1px">
    <a class="logo-second">码世界</a>
    <div class="info">
        <a href="#">服务市场</a> | <a href="#">帮助中心</a>
    </div>
</div>
<!--top end-->

<div id="content_wrap">
    <div id="content">
        <div id="description">
            <img src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-sso/images/login.jpg' width="500px">
        </div>
        <div id="login">
            <form action="${basePath}/dologin.do" method="post">
            	<input type="hidden" value="${param.return_url}" name="return_url">
                <div class="title">用户登录</div>
                <input type="text" name="username" placeholder="支持用户名/手机/邮箱">
                <input type="password" name="password" placeholder="密码">
                <input type="text" name="kaptcha" placeholder="验证码" style="width:150px;margin-right:10px"><img width="80" src="${basePath }/kaptcha.do" style="vertical-align:middle">
                <input type="submit" value="登 录">
                
                <c:if test="${not empty errors.loginID }">
                	<label class="vError" id="err_username">${errors.loginID }</label>
                </c:if>
                <c:if test="${not empty errors.password }">
                	<label class="vError" id="err_password">${errors.password }</label>
                </c:if>
                <c:if test="${not empty errors.kaptcha }">
                	<label class="vError" id="err_kaptcha">${errors.kaptcha }</label>
                </c:if>
                <div id="operator" style="bottom: 5px;right: 10px; position: absolute;">
                    <a id="forget-btn">忘了密码</a>  | <a id="register-btn">注册新帐号</a> | <a id="advice-btn">意见反馈</a>
                </div>
            </form>
        </div>
    </div>
</div>

<script type="text/javascript" src='${applicationScope.pageConfig["resources.path"] }/js/normal/base-require/2.1.11/require.min.js'></script>
<script type="text/javascript" src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-sso/js/require.config.js'></script>

</body>
</html>