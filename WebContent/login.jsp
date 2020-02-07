<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>库存物资管理系统</title>
<style type="text/css">
#wrap {
	position: relative;
}
/*给登录框设置背景颜色*/
#login-liner {
	/*设置背景渐变色*/
	background: -webkit-linear-gradient(top, #667EEA, #764BA2);
	width: 400px;
	height: 500px;
	position: absolute;
	top: 50%;
	left: 50%;
	margin-top: -250px;
	margin-left: -200px;
}

#sysTitle {
	color: transparent;
	-webkit-text-stroke: 1px black;
	letter-spacing: 0.04em;
}

#failPrompt {
	color: red;
}
</style>
<link href="css/login.css" type="text/css" rel="stylesheet">
</head>

<body background="images/background.jpg">
	<div id="login-outer">
		<div id="login-liner" align="center">
			<h1 id="sysTitle">库存物资管理系统</h1>
			<div class="login">
				<div class="message">管理员登录</div>
				<div id="darkbannerwrap"></div>

				<form method="post" action="login.do">
					<input name="username" placeholder="用户名" required type="text">
					<hr class="hr15">
					<input name="password" placeholder="密码" required type="password">
					<hr class="hr15">
					<input value="登录" style="width: 100%;" type="submit">
					<!-- <hr class="hr20"> -->
					<%
						String login = (String)request.getAttribute("login");
					if(login!=null){
						if(login.equals("fail")){
					%>
					<p id="failPrompt">用户名或密码错误</p>
					<%
						}
					}
					%>
				</form>

			</div>
		</div>
	</div>

</body>

</html>