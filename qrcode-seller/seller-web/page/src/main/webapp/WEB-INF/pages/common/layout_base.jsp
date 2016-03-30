<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" href='${applicationScope.pageConfig["resources.path"] }/css/pure/0.6.0/pure-min.css'>
    <link rel="stylesheet" href='${applicationScope.pageConfig["resources.path"] }/css/site/site.css'>
    <script type="text/javascript" src='${applicationScope.pageConfig["resources.path"] }/js/normal/base-require/2.1.11/require.min.js'></script>
	<script type="text/javascript" src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-seller/js/require.config.js'></script>
</head>
<body>
	<tiles:insertAttribute name="top" />
	<tiles:insertAttribute name="menu" />
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />
</body>
</html>