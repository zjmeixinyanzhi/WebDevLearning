<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>示例目录</title>
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="this is my page">
		<meta http-equiv="content-type" content="text/html; charset=utf-8">
	</head>
	<body>
		<p>示例：<a href="FirstServlet" >简单Servelet</a> </p>
		<p>示例：<a href="FirstServlet2" >Get和Post方法</a> </p>
		<p>示例：<a href="RequestServlet" >Request参数获取</a> </p>
		<p>示例：<a href="html/identity.html" >图片验证码</a> </p>
		<p>示例：<a href="InitParamServlet" >初始化参数</a> </p>
		<p>示例：<a href="ContextParamServlet" >上下文参数</a> </p>
		<p>示例：<a href="InjectionServlet" >参数注入</a> </p>
		<p>示例：<a href="html/search.html" >Get参数提交</a> </p>
		<p>示例：<a href="html/postPersonalInformation.html" >Post参数提交</a> </p>
		<p>示例：<a href="html/upload.html" >Post文件上传</a> </p>
		<p>示例：<a href="jsp/progressUpload.jsp" >带进度条的文件上传</a> </p>
		<p>示例：<a href="LifeCycleServlet" >Servlet生命周期</a> </p>
		<p>示例：<a href="ForwardServlet" >Forward转向</a> </p>
		<p>示例：<a href="RedirectServlet" >Redirect重定向</a> </p>
		<p>示例：<a href="ThreadSafetyServlet" >Servlet线程安全</a> </p>
	</body>
</html>