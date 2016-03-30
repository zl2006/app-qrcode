<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 头部-->
<div id="top">
	<!-- logo,搜索码/会员区域 -->
	<a class="logo-main">超级营销</a> <img
		src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-seller/images/site/split.png'
		class="logo-split" alt="split" width="1"> <a class="logo-second">码世界</a>
	<form class="pure-form search-frm" action="#">
		<div class="type"
			style="height: 34px; background-color: gainsboro; border: 1px solid #ccc; width: 60px; display: inline-block; vertical-align: middle; padding-left: 5px; margin-right: -6px">
			<label>会员</label>
			<div style="display: none"></div>
		</div>
		<input class="ctx" type="text">
		<button class="pure-button button-secondary">搜索</button>
	</form>
	<div class="info">
		<a>服务市场</a> | <a>帮助中心</a> | <a href="login.html">退出</a><br> <a>liangzhou20066</a> | <a href="login.html">个人中心</a>
	</div>
</div>
<!--top end-->