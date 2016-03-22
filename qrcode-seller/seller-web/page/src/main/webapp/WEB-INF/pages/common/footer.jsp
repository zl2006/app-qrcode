<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 尾部区-->
<div id="footer">
    Copyright @2011-2014 http://www.aibaicai.com/湖南YY工作室 版权所有 邮编：414000
</div><!--footer end-->

<script type="text/javascript" src='${applicationScope.pageConfig["resources.path"] }/js/normal/base-require/2.1.11/require.min.js'></script>
<script type="text/javascript" src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-seller/js/require.config.js'></script>
<script type="text/javascript">
    requirejs(['jqsuperslide','sticky'], function (slide,sticky) {
        sticky("#menu", {top:0, left:0});
        slide("#site-menu").slide({ type: "menu", titCell: ".menu-item", targetCell: ".menu-item-sub", delayTime: 400, triggerTime: 0, returnDefault: false  });
    })
</script>