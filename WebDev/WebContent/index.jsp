<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>Java Web开发示例</title>
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="this is my page">
		<meta http-equiv="content-type" content="text/html; charset=utf-8">
		<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-2.0.0.min.js"></script>
		<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-ui"></script>
		<link href="http://www.francescomalagrino.com/BootstrapPageGenerator/3/css/bootstrap-combined.min.css" rel="stylesheet" media="screen">
		<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/bootstrap.min.js"></script>
	</head>
	<body>
	<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<div class="page-header">
				<h1>
					Java Web开发示例<small>源于《Java Web整合开发王者归来》</small>
				</h1>
			</div>
			<div class="row-fluid">
				<div class="span4">
					<ul>
					<p>Servlet相关示例 </p>
						<li>
							<a href="FirstServlet" >简单Servelet</a>
						</li>
						<li>
							<a href="FirstServlet2" >Get和Post方法</a>
						</li>
						<li>
							<a href="RequestServlet" >Request参数获取</a>
						</li>
						<li>
							<a href="html/identity.html" >图片验证码</a> 
						</li>
						<li>
							<a href="InitParamServlet" >初始化参数</a>
						</li>
						<li>
							<a href="ContextParamServlet" >上下文参数</a>
						</li>
						<li>
							<a href="InjectionServlet" >参数注入</a>
						</li>
						<li>
							<a href="html/search.html" >Get参数提交</a>
						</li>
						<li>
							<a href="html/postPersonalInformation.html" >Post参数提交</a>
						</li>
						<li>
							<a href="html/upload.html" >Post文件上传</a> 
						</li>
						<li>
							<a href="jsp/progressUpload.jsp" >带进度条的文件上传</a>
						</li>
						<li>
							<a href="LifeCycleServlet" >Servlet生命周期</a>
						</li>
						<li>
							<a href="ForwardServlet" >Forward转向</a>
						</li>
						<li>
							<a href="RedirectServlet" >Redirect重定向</a>
						</li>
						<li>
							<a href="ThreadSafetyServlet" >Servlet线程安全</a>
						</li>
					</ul>
				</div>
				<div class="span4">
					<ul>
					<p>Cookie、Session及Filter相关示例 </p>
						<li>
							<a href="jsp/cookie.jsp" >cookie简单示例</a>
						</li>
						<li>
							<a href="jsp/setCookie.jsp" >设置cookie属性</a>
						</li>
						<li>
							<a href="jsp/javascript.jsp" >Javascript读取cookie属性</a>
						</li>
						<li>
							<a href="jsp/loginCookie.jsp" >cookie永久登录</a>
						</li>
						<li>
							<a href="jsp/session.jsp" >Session机制</a>
						</li>
						<li>
							天气预报
						</li>
						<li>
							房产家居
						</li>
						<li>
							网络游戏
						</li>
					</ul>
				</div>
				<div class="span4">
					<ul>
					<p>Listener相关示例 </p>
						<li>
							新闻资讯
						</li>
						<li>
							体育竞技
						</li>
						<li>
							娱乐八卦
						</li>
						<li>
							前沿科技
						</li>
						<li>
							环球财经
						</li>
						<li>
							天气预报
						</li>
						<li>
							房产家居
						</li>
						<li>
							网络游戏
						</li>
					</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	</body>
</html>