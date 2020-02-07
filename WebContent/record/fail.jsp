<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>库存物资管理系统</title>

<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/nav.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/font/iconfont.css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/nav.js"></script>
<style type="text/css">
.nav {
	float: left;
}
body {
	
	min-width: 350px;
}
#content {
	text-align: center;
	height: 100%;
	
}
#content img{width: 100px;height: 100px;}
 
</style>
</head>
<body>
<jsp:include page="../head.jsp"></jsp:include>
		<div class="nav">
		<div class="nav-top">
			<div id="mini"
				style="border-bottom: 1px solid rgba(255, 255, 255, .1)">
				<img src="<%=request.getContextPath()%>/images/mini.png">
			</div>
		</div>
		<ul>
			<li class="nav-item"><a href="javascript:;"><i
					class="my-icon nav-icon icon_1"></i><span>录入</span><i
					class="my-icon nav-more"></i></a>
				<ul  style="display: block;">
					<li><a href="<%=request.getContextPath()%>/record/out.jsp"><span>出库</span></a></li>
					<li><a href="<%=request.getContextPath()%>/record/in.jsp"><span>入库</span></a></li>

				</ul></li>
			<li class="nav-item"><a href="javascript:;"><i
					class="my-icon nav-icon icon_2"></i><span>搜索</span><i
					class="my-icon nav-more"></i></a>
				<ul>
					<li><a href="<%=request.getContextPath()%>/search/byName.jsp"><span>按名称</span></a></li>
					
					<li><a href="<%=request.getContextPath()%>/search/byzhonglei.jsp"><span>按种类</span></a></li>
					<li><a href="<%=request.getContextPath()%>/search/byDate.jsp"><span>按日期</span></a></li>
				</ul></li>
			<li class="nav-item"><a href="javascript:;"><i
					class="my-icon nav-icon icon_3"></i><span>统计</span><i
					class="my-icon nav-more"></i></a>
				<ul>
					<li><a href="<%=request.getContextPath()%>/count/byDay.jsp"><span>按日</span></a></li>
					<li><a href="<%=request.getContextPath()%>/count/byMonth.jsp"><span>按月</span></a></li>
					<li><a href="<%=request.getContextPath()%>/count/byYear.jsp"><span>按年</span></a></li>
				</ul></li>
		</ul>
	</div>

	<div id="content">
	
			<img src="<%=request.getContextPath()%>/images/hongcha.png"/> 
			  <h3 style="color: red;">录入数据失败</h3>
    		
	</div>
</body>
</html>