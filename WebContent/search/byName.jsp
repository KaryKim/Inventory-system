<%@ page language="java" contentType="text/html"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
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
body{
min-width: 600px;
 background-image: url(images/33.png);    
 background-size:cover; 
}
.nav {
	float: left;
}

#content {
	text-align: center;
	height: 100%;
}
input[type=text] {
	font-size: 13px;
/* 	min-height: 32px; */
	margin: 0;
	padding: 7px 8px;
	outline: none;
	color: #333;
	background-color: #fff;
	background-repeat: no-repeat;
	background-position: right center;
	border: 1px solid #ccc;
	border-radius: 3px;
	box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.075);
	-moz-box-sizing: border-box;
	box-sizing: border-box;
	transition: all 0.15s ease-in;
	-webkit-transition: all 0.15s ease-in 0;
	vertical-align: middle;
}

.button {
	position: relative;
	display: inline-block;
	margin: 0;
	padding: 8px 15px;
	font-size: 13px;
	font-weight: bold;
	color: #333;
	text-shadow: 0 1px 0 rgba(255, 255, 255, 0.9);
	white-space: nowrap;
	background-color: #eaeaea;
	background-image: -moz-linear-gradient(#fafafa, #eaeaea);
	background-image: -webkit-linear-gradient(#fafafa, #eaeaea);
	background-image: linear-gradient(#fafafa, #eaeaea);
	background-repeat: repeat-x;
	border-radius: 3px;
	border: 1px solid #ddd;
	border-bottom-color: #c5c5c5;
	box-shadow: 0 1px 3px rgba(0, 0, 0, .05);
	vertical-align: middle;
	cursor: pointer;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
	-webkit-touch-callout: none;
	-webkit-user-select: none;
	-khtml-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
	-webkit-appearance: none;
}

.button:hover, .button:active {
	background-position: 0 -15px;
	border-color: #ccc #ccc #b5b5b5;
}

.button:active {
	background-color: #dadada;
	border-color: #b5b5b5;
	background-image: none;
	box-shadow: inset 0 3px 5px rgba(0, 0, 0, .15);
}

.button:focus, input[type=text]:focus, input[type=password]:focus {
	outline: none;
	border-color: #51a7e8;
	box-shadow: inset 0 1px 2px rgba(0, 0, 0, .075), 0 0 5px
		rgba(81, 167, 232, .5);
}

label[for=search] {
padding-left: 3px;
}

#search label {
	font-weight: 200;
	padding: 5px 0;
}

#search input[type=text] {
	font-size: 18px;
	width: 305px;
}

#search .button {
	padding: 10px;
	width: 90px;
}
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
				<ul>
					<li><a href="<%=request.getContextPath()%>/record/out.jsp"><span>出库</span></a></li>
					<li><a href="<%=request.getContextPath()%>/record/in.jsp"><span>入库</span></a></li>

				</ul></li>
			<li class="nav-item"><a href="javascript:;"><i
					class="my-icon nav-icon icon_2"></i><span>搜索</span><i
					class="my-icon nav-more"></i></a>
				<ul style="display: block;">
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
		<div>
			<form action="queryByName.do" method="post">
			
					<div id="search">
						<label for="search"><h3>请输入需要搜索的商品名称</h3> </label> <input
							type="text" name="name" placeholder="模糊查询"> <input class="button" type="submit"
							value="搜索">
					</div>
			
			</form>
		</div>
	</div>
</body>
</html>