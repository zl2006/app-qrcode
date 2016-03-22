<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--菜单区域-->
<div id="menu">
    <ul id="site-menu">
        <li class="select menu-item"><a href="index.html">首页</a></li>
        <li class="menu-item">
            <span><a href="activity/list.html">营销服务</a></span>
            <div class="menu-item-sub menu-service">
                <div class="service-category">
                    <div class="service-cat-title">基础营销</div>
                    <div class="service-list">
                        <div class="list-wrap">
                            <div class="service-item">
                                <img src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-seller/images/demo/discut.jpg' >限时打折
                            </div>
                            <div class="service-item"><img src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-seller/images/demo/fav.gif' >收藏有礼</div>
                            <div class="service-item"><img src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-seller/images/demo/mangsend.jpg' >满就送</div>
                            <div class="service-item"><img src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-seller/images/demo/jian.jpg' >满就减</div>
                            <div class="service-item"><img src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-seller/images/demo/mail.jpg' >满包邮</div>
                        </div>
                    </div>
                </div>
                <div class="service-category">
                    <div class="service-cat-title">互动应用</div>
                    <div class="service-list">
                        <div class="list-wrap">
                            <div class="service-item"><img src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-seller/images/demo/pengpeng.jpg' >碰碰有礼</div>
                            <div class="service-item"><img src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-seller/images/demo/zhuangpan.jpg' >大转盘</div>
                            <div class="service-item"><img src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-seller/images/demo/paopao.jpg' >泡泡堂</div>
                        </div>
                    </div>
                </div>
                <div class="service-category">
                    <div class="service-cat-title">溯源验真</div>
                    <div class="service-list">
                        <div class="list-wrap">
                            <div class="service-item"><img src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-seller/images/demo/ma1.jpg' >扫码溯源</div>
                            <div class="service-item"><a href="activity/scan_check/admin/add.html"><img src='${applicationScope.pageConfig["resources.path"] }/app/qrcode-seller/images/demo/ma2.jpg' >扫码验真</a></div>
                        </div>
                    </div>
                </div>
            </div>
        </li>
        <li class="menu-item">
            <span><a href="#">会员管理</a></span>
            <ul class="menu-item-sub">
                <li><a href="#">会员管理</a></li>
                <li><a href="#">标签管理</a></li>
            </ul>
        </li>
        <li class="menu-item">
            <span><a href="#">数据分析</a></span>
            <ul class="menu-item-sub">
                <li><a href="#">活动分析</a></li>
                <li><a href="#">流量分析</a></li>
                <li><a href="#">商品分析</a></li>
                <li><a href="#">会员分析</a></li>
            </ul>
        </li>
        <li class="menu-item">
            <span><a href="#">移动商城</a></span>
            <ul class="menu-item-sub">
                <li><a href="#">产品管理</a></li>
                <li><a href="#">商城装修</a></li>
                <li><a href="#">内容发布</a></li>
            </ul>
        </li>
        <li class="menu-item">帮助中心</li>
    </ul>
</div><!--men end-->