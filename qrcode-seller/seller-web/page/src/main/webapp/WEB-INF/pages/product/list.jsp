<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
            <li class="n_child select">-活动列表</li>
            <li class="n_child">-策划活动</li>
            <li class="n_child">-活动分析</li>
        </ul>
        <h3 class="on n_parent"><i class="fa fa-male"></i>产品管理</h3>
        <ul style="display: none;">
            <li class="n_child">-产品列表</li>
            <li class="n_child">-新增产品</li>
        </ul>
    </div><!--nav end-->
    <div id="content_wrap"><!--内容区-->
        <div class="content">
            <div class="posi"><!--面包屑-->
                当前位置：产品与码管理 -- <span class="select">产品列表</span>
            </div><!--posi-->
            <form class="pure-form search"><!--搜索表单-->
                <label for="name">活动名称：</label>
                <input id="name" type="text" placeholder="请输入活动名称" style="width:20%">

                <label for="type">服务类型：</label>
                <input id="type" type="text" placeholder="选择服务类型" style="width:20%">

                <label for="state">状态：</label>
                <select id="state" style="width: 20%">
                    <option>有效</option>
                    <option>无效</option>
                </select>

                <button type="submit" class="pure-button pure-button-primary"><i class="fa fa-search"></i>搜索</button>
            </form><!--search end-->
            <table class="pure-table search-res" width="100%"><!--搜索结果 -->
                <thead>
                <tr>
                    <th>序号</th>
                    <th>活动名称</th>
                    <th>服务类型</th>
                    <th>活动时间</th>
                    <th>参与限制</th>
                    <th>状态</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>1</td>
                    <td>恒大冰泉扫码送积分</td>
                    <td>扫码溯源</td>
                    <td>2015-1-1到2016-1-1</td>
                    <td>无限制</td>
                    <td>进行中</td>
                    <td width="160">
                        <button class="button-xsmall pure-button pure-button-primary">编辑</button>
                        <button class="pure-button pure-button-primary button-xsmall" style="background-color: #ff4f00"> 中止 </button>
                        <button class="button-xsmall pure-button pure-button-primary">延期</button>
                    </td>
                </tr>

                <tr class="odd">
                    <td>2</td>
                    <td>双十一大转盘抽奖</td>
                    <td>大转盘抽奖</td>
                    <td>2015-1-1到2016-7-1</td>
                    <td>会员</td>
                    <td>进行中</td>
                    <td>
                        <button class="button-xsmall pure-button pure-button-primary">编辑</button>
                        <button class="pure-button pure-button-primary button-xsmall" style="background-color: #ff4f00"> 中止 </button>
                        <button class="button-xsmall pure-button pure-button-primary">延期</button>
                    </td>
                </tr>

                <tr>
                    <td>3</td>
                    <td>测试一</td>
                    <td>碰碰有礼</td>
                    <td>2015-1-1到2016-7-1</td>
                    <td>会员</td>
                    <td>到期</td>
                    <td>
                        <button class="button-xsmall pure-button pure-button-primary">查看</button>
                    </td>
                </tr>

                <tr class="odd">
                    <td>4</td>
                    <td>测试一</td>
                    <td>碰碰有礼</td>
                    <td>2015-1-1到2016-7-1</td>
                    <td>会员</td>
                    <td>到期</td>
                    <td>
                        <button class="button-xsmall pure-button pure-button-primary">查看</button>
                    </td>
                </tr>

                <tr>
                    <td>5</td>
                    <td>测试一</td>
                    <td>碰碰有礼</td>
                    <td>2015-1-1到2016-7-1</td>
                    <td>会员</td>
                    <td>到期</td>
                    <td>
                        <button class="button-xsmall pure-button pure-button-primary">查看</button>
                    </td>
                </tr>

                <tr class="odd">
                    <td>6</td>
                    <td>测试一</td>
                    <td>碰碰有礼</td>
                    <td>2015-1-1到2016-7-1</td>
                    <td>会员</td>
                    <td>到期</td>
                    <td>
                        <button class="button-xsmall pure-button pure-button-primary">查看</button>
                    </td>
                </tr>

                <tr>
                    <td>7</td>
                    <td>测试一</td>
                    <td>碰碰有礼</td>
                    <td>2015-1-1到2016-7-1</td>
                    <td>会员</td>
                    <td>到期</td>
                    <td>
                        <button class="button-xsmall pure-button pure-button-primary">查看</button>
                    </td>
                </tr>

                <tr class="odd">
                    <td>8</td>
                    <td>测试一</td>
                    <td>碰碰有礼</td>
                    <td>2015-1-1到2016-7-1</td>
                    <td>会员</td>
                    <td>到期</td>
                    <td>
                        <button class="button-xsmall pure-button pure-button-primary">查看</button>
                    </td>
                </tr>

                <tr>
                    <td>9</td>
                    <td>测试一</td>
                    <td>碰碰有礼</td>
                    <td>2015-1-1到2016-7-1</td>
                    <td>会员</td>
                    <td>到期</td>
                    <td>
                        <button class="button-xsmall pure-button pure-button-primary">查看</button>
                    </td>
                </tr>

                <tr class="odd">
                    <td>10</td>
                    <td>测试一</td>
                    <td>碰碰有礼</td>
                    <td>2015-1-1到2016-7-1</td>
                    <td>会员</td>
                    <td>到期</td>
                    <td>
                        <button class="button-xsmall pure-button pure-button-primary">查看</button>
                    </td>
                </tr>
                </tbody>
            </table>
            <ul class="pagination" id="pagination"></ul><!-- 分页组件 -->
        </div><!-- content end-->
    </div>
</div><!--main end-->

<script type="text/javascript">
    requirejs(['jqpaginator','jqsuperslide','sticky'], function ($,slide,sticky) {
    	slide("#nav").slide({titCell:"h3", targetCell:"ul",defaultIndex:1,effect:"slideDown",delayTime:300,trigger:"click",defaultPlay:false,returnDefault:false});

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
        });
    })
</script>