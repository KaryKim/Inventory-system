<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style type="text/css">
.header {
	text-align: right;
	background: #000000;
}

.header img {
	width: 30px;
	height: 30px;
	vertical-align: middle;
}

.header a {
	color: white;
	text-align: center;
	vertical-align: middle;
	text-decoration: none;
}

.header a:hover {
	color: red;
}

.header a:active {
	color: red;
}
</style>
<div class="header">
	<a href="<%=request.getContextPath()%>/main.jsp"><img
		src="<%=request.getContextPath()%>/images/home.png" />主页</a> <a
		href="<%=request.getContextPath()%>/login.jsp"><img src="<%=request.getContextPath()%>/images/exit.png" />退出</a>
</div>


