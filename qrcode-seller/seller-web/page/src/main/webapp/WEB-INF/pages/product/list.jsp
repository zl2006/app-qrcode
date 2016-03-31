<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
	<title>超级营销-码世界,产品列表</title>
	<link rel="stylesheet" href='${applicationScope.pageConfig["resources.path"] }/app/qrcode-seller/css/site/index.css'>
</head>

<!--页面主体区-->
<div id="main" class="clearfix">
    <div id="nav"><!--导航区-->
        <span class="title">常用功能</span>
        <h3 class="on n_parent"><i class="fa fa-male"></i>码管理</h3>
        <ul style="display: block;">
            <li class="n_child">-生成码</li>
            <li class="n_child">-制码跟踪</li>
        </ul>
        <h3 class="on n_parent"><i class="fa fa-male"></i>产品管理</h3>
        <ul><!-- style="display: none;" --> 
            <li class="n_child select">-产品列表</li>
            <li class="n_child">-新增产品</li>
        </ul>
    </div><!--nav end-->
    <div id="content_wrap"><!--内容区-->
        <div class="content">
            <div class="posi"><!--面包屑-->
                当前位置：产品与码管理 -- <span class="select">产品列表</span>
            </div><!--posi-->
            <form class="pure-form search" id="query_form" action="${basePath}/product/list.do" method="post"><!--搜索表单-->
            	<input type="hidden" value="${data.pagination.index}" name="pagination.index" id="pagination_index">
                <label for="name">产品名称：</label>
                <input name="name" type="text" placeholder="请输入产品名称" style="width:20%" value="${params.name }">

                <label for="prdCode">产品编码：</label>
                <input name="prdCode" type="text" placeholder="选择服务类型" style="width:20%" value="${params.prdCode }">

                <label for="state">状态：</label>
                <select name="status" style="width: 20%">
                	<option selected="selected" value="">所有</option>
                    <option value="1" <c:if test="${ params.status == 1}">selected="selected"</c:if>  >有效</option>
                    <option value="0" <c:if test="${ params.status == 0}">selected="selected"</c:if>  >无效</option>
                </select>
				
				<button id="submitBtn" class="pure-button pure-button-primary">搜索</button>
            </form><!--search end-->
            <table class="pure-table search-res" width="100%"><!--搜索结果 -->
                <thead>
                <tr>
                    <th>序号</th>
                    <th>名称</th>
                    <th>编码</th>
                    <th>品牌</th>
                    <th>价格</th>
                    <th>状态</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="item" varStatus="status" items="${data.result}">
                <tr  class="pointer <c:if test="${ (status.index+1) % 2 == 0}">odd</c:if>"  view="${basePath }/product/view.do?productId=${item.productId }"  >
                    <td>${status.index + 1 + ( data.pagination.index * data.pagination.pageSize )}</td>
                    <td>${item.name }</td>
                    <td>${item.prdCode }</td>
                    <td>${item.brand }</td>
                    <td>${item.price }</td>
                    <td><c:choose><c:when test="${item.status == 1}">有效</c:when><c:when test="${item.status == 0}">无效</c:when> </c:choose></td>
                    <td width="160">
                        <a href="javascript:void(0)" >编辑 </a>&nbsp;
                        <a href="javascript:void(0)"> 查看 </a>
                    </td>
                </tr>
                </c:forEach>
                </tbody>
            </table>
            <ul class="pagination" id="pagination"></ul><!-- 分页组件 -->
        </div><!-- content end-->
    </div>
</div><!--main end-->

<script type="text/javascript" src='${applicationScope.pageConfig["resources.path"] }/app/common/business/1.0/page.js' page='{"module":"business","oper":"list"}' data='{"base_path" : "${basePath}" ,"row_click":true, "currentPage" : ${data.pagination.index+1} , "totalPages" : ${data.pagination.totalPage}}'></script>
<script type="text/javascript">
    requirejs(['jqpaginator','jqsuperslide','sticky'], function ($,slide,sticky) {
    	slide("#nav").slide({titCell:"h3", targetCell:"ul",defaultIndex:1,effect:"slideDown",delayTime:300,trigger:"click",defaultPlay:false,returnDefault:false});
		/*
        $("#pagination").jqPaginator({
            totalPages: 100,
            visiblePages: 10,
            currentPage: 1,
            first: '<li class="first"><a href="javascript:void(0);">首页<\/a><\/li>',
            prev: '<li class="prev"><a href="javascript:void(0);"><i class="arrow arrow2"><\/i>上一页<\/a><\/li>',
            next: '<li class="next"><a href="javascript:void(0);">下一页<i class="arrow arrow3"><\/i><\/a><\/li>',
            last: '<li class="last"><a href="javascript:void(0);">末页<\/a><\/li>',
            page: '<li class="page"><a href="javascript:void(0);">{{page}}<\/a><\/li>',
            onPageChange: function (n) {
                $("#demo2-text").html("当前第" + n + "页");
            }
        });*/
    })
</script>