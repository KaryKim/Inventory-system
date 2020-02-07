<%@page import="com.ll.entity.InStorageMerchandise"%>
<%@page import="com.ll.entity.OutStorageMerchandise"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.Map,java.util.List"%>
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
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/table.css" />
<style type="text/css">
body {
	min-width: 850px;
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
				<ul>
					<li><a href="<%=request.getContextPath()%>/search/byName.jsp"><span>按名称</span></a></li>
							<li><a href="<%=request.getContextPath()%>/search/byzhonglei.jsp"><span>按种类</span></a></li>
					<li><a href="<%=request.getContextPath()%>/search/byDate.jsp"><span>按日期</span></a></li>
				</ul></li>
			<li class="nav-item"><a href="javascript:;"><i
					class="my-icon nav-icon icon_3"></i><span>统计</span><i
					class="my-icon nav-more"></i></a>
				<ul style="display: block;">
					<li><a href="<%=request.getContextPath()%>/count/byDay.jsp"><span>按日</span></a></li>
					<li><a href="<%=request.getContextPath()%>/count/byMonth.jsp"><span>按月</span></a></li>
					<li><a href="<%=request.getContextPath()%>/count/byYear.jsp"><span>按年</span></a></li>
				</ul></li>
		</ul>
	</div>
	<div id="content">
		<%
			Map recordResult = (Map) request.getAttribute("countResult");
			List inResult = (List) recordResult.get("inStorage");
			List outResult = (List) recordResult.get("outStorage");
			int inStorageNumber = (Integer) recordResult.get("inStorageNumber");
			int outStorageNumber = (Integer) recordResult.get("outStorageNumber");
		%>
			<div>
				<h3>
					该年<span style="color: red">出</span>库总量<span style="color: red"><%=outStorageNumber%></span>件
				</h3>
				<table border="1" class="t1">
					<tr>
						<th>名称</th>
						<th>制造商</th>
						<th>型号</th>
						<th>规格</th>
						<th>数量</th>
						<th>日期</th>
						<th>时间</th>
						<th>出库单位</th>
						<th>种类</th>
					</tr>


					<%
						if (outResult.size() <= 0) {
					%>
					<td colspan="9">该年没有出库商品</td>
					<%
						} else
							for (int i = 0; i < outResult.size(); i++) {
								OutStorageMerchandise osm = (OutStorageMerchandise) outResult.get(i);
					%>
					<tr>
						<td><%=osm.getName()%></td>
						<td><%=osm.getManufacturer()%></td>
						<td><%=osm.getModel()%></td>
						<td><%=osm.getSpecification()%></td>
						<td><span style="color: red; font-weight: bold"><%=osm.getQuantity()%></span></td>
						<td><%=osm.getDate().toString()%></td>
						<td><%=osm.getTime().toString()%></td>
						<td><%=osm.getTounit()%></td>
						<td><%=osm.getZl()%></td>
					</tr>
					<%
						}
					%>
				</table>
			</div>
			<div>
				<h3>
					该年<span style="color: red">入</span>库总量<span style="color: red"><%=inStorageNumber%></span>件
				</h3>
				<table border="1" class="t1">
					<tr>
						<th>名称</th>
						<th>制造商</th>
						<th>型号</th>
						<th>规格</th>
						<th>数量</th>
						<th>日期</th>
						<th>时间</th>
						<th>入库单位</th>
						<th>种类</th>
					</tr>


					<%
						if (inResult.size() <= 0) {
					%>
					<td colspan="9">该年没有入库商品</td>
					<%
						} else
							for (int i = 0; i < inResult.size(); i++) {
								InStorageMerchandise ism = (InStorageMerchandise) inResult.get(i);
					%>
					<tr>
						<td><%=ism.getName()%></td>
						<td><%=ism.getManufacturer()%></td>
						<td><%=ism.getModel()%></td>
						<td><%=ism.getSpecification()%></td>
						<td><span style="color: red; font-weight: bold"><%=ism.getQuantity()%></span></td>
						<td><%=ism.getDate().toString()%></td>
						<td><%=ism.getTime().toString()%></td>
						<td><%=ism.getFromunit()%></td>
						<td><%=ism.getZl()%></td>
					</tr>
					<%
						}
					%>

				</table>
			</div>

	</div>
</body>
</html>