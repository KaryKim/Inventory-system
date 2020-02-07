<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<ul  style="display: block;">
					<li><a href="javascript:;"><span>按名称</span></a></li>
						<li><a href="javascript:;"><span>按种类</span></a></li>
					<li><a href="javascript:;"><span>按日期</span></a></li>
				</ul></li>
			<li class="nav-item"><a href="javascript:;"><i
					class="my-icon nav-icon icon_3"></i><span>统计</span><i
					class="my-icon nav-more"></i></a>
				<ul>
					<li><a href="javascript:;"><span>按日</span></a></li>
					<li><a href="javascript:;"><span>按月</span></a></li>
					<li><a href="javascript:;"><span>按年</span></a></li>
				</ul></li>
		</ul>
	</div>
