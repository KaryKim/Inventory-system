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
body{
min-width: 600px;
 background-image: url(images/21.png);    
 background-size:cover;  

}

#content {
	text-align: center;
	vertical-align: middle;

}
#clock {
  font-family: 'Share Tech Mono', monospace;
  text-align: center;
  vertical-align: middle;
  margin-top: 100px;
}
#clock #time {
  letter-spacing: 0.05em;
  font-size: 48px;
  padding:1px 0;
}
#clock #date {
  letter-spacing: 0.1em;
  font-size: 24px;
}
</style>
<script type="text/javascript">
function startTime()
{
var today=new Date()
var years=today.getFullYear();
var months=today.getMonth();
var d=today.getDate()
var h=today.getHours()
var m=today.getMinutes()
var s=today.getSeconds()
// add a zero in front of numbers<10
months=months+1
months=checkTime(months)
d=checkTime(d)
m=checkTime(m)
s=checkTime(s)
var weekday=new Array(7)
weekday[0]="星期日"
weekday[1]="星期一"
weekday[2]="星期二"
weekday[3]="星期三"
weekday[4]="星期四"
weekday[5]="星期五"
weekday[6]="星期六"
var w=weekday[today.getDay()]
document.getElementById('date').innerHTML=years+"年"+months+"月"+d+"日 "+w;

document.getElementById('time').innerHTML=h+":"+m+":"+s;
t=setTimeout('startTime()',500)
}
function checkTime(i)
{
if (i<10)
{i="0" + i}
return i
}
</script>

</head>
<body onLoad="startTime()">
<jsp:include page="head.jsp"></jsp:include>
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
				<ul>
					<li><a href="<%=request.getContextPath()%>/count/byDay.jsp"><span>按日</span></a></li>
					<li><a href="<%=request.getContextPath()%>/count/byMonth.jsp"><span>按月</span></a></li>
					<li><a href="<%=request.getContextPath()%>/count/byYear.jsp"><span>按年</span></a></li>
				</ul></li>
		</ul>
	</div>

	<div id="content">
			<div id="clock">
				<p id="date"></p>
				<p id="time"></p>
			</div>
	</div>
</body>
</html>