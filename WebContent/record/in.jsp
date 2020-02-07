<%@ page language="java" contentType="text/html; charset=UTF-8"
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
body {
	min-width: 850px;
}

.nav {
	float: left;
}

#content {
	text-align: center;
	height: 100%;
}

table {
	border-collapse: collapse;
	border: solid 1px #ccc;
	width: 600px;
}

td {
	border: solid 1px #ccc;
	font-size: 12px;
	height: 30px;
	padding-left: 10px;
}

input {
	font-size: 12px;
	width: 500px;
	height: 23px;
	border: none;
}

textarea {
	width: 98%;
	height: 200px;
	border: none;
}

.d {
	background-color: #066;
	color: #fff;
	border: none;
	width: 200px;
	height: 30px;
	cursor: pointer;
}

.over {
	background-color: #f60;
	color: #fff;
	border: none;
	width: 200px;
	height: 30px;
	cursor: pointer;
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
				<ul style="display: block;">
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

		<h3>
			请输入<span style="color: red;">入</span>库商品数据
		</h3>
		<div>
			<form action="inStorage.do" method="post">

				<table border="1" class="t1" style="margin: 5px auto;">
					<tr>
						<td width="70">名称：</td>
						<td><input type="text" name="name" required="required"></td>
					</tr>
					<tr>
						<td height="62">生产厂家：</td>
						<td><input type="text" name="manufacturer"></td>
					</tr>
					<tr>
						<td height="62">型号：</td>
						<td><input type="text" name="model"></td>
					</tr>
					<tr>
						<td height="62">规格：</td>
						<td><input type="text" name="specification"></td>
					</tr>
					<tr>
						<td height="62">数量：</td>
						<td><input type="number" name="quantity" required="required" /></td>
					</tr>

					<tr>
						<td height="62">日期：</td>
						<td><input type="date" name="date" required="required" /></td>
					</tr>
					<tr>
						<td height="62">时间：</td>
						<td><input type="time" name="time" contenteditable="true"
							accesskey="true" required="required" /></td>
					</tr>
					<tr>
						<td height="62">入库单位：</td>
						<td><input type="text" name="fromunit"></td>
					</tr>
					<tr>
						<td height="62">种类：</td>
						<td><input type="text" name="zl"></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="提交" class="d" onmouseover="this.className='over'"
							onmouseout="this.className='d'" /></td>
					</tr>
				</table>
			</form>
		</div>

	</div>
</body>
</html>