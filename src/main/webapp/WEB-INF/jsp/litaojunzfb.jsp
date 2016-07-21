<%@page
	import="org.springframework.security.core.context.SecurityContextHolder"%>
<%@page import="org.springframework.util.StringUtils"%>
<%@page import="org.springframework.security.core.Authentication"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Login</title>
</head>
<%
	  String token = (String)request.getAttribute("retcode");
		String signcontent = (String)request.getAttribute("signcontent");
		String sign = (String)request.getAttribute("sign");
	%>
<body>
	<h3>支付宝返回数据</h3>
	<table width="954px" border="0" cellspacing="0" cellpadding="0" align="center" style="background-color: #272e31;">
  <p>获取TOKEN结果数据</p>
	<p><%=token %></p>
	<p><%=signcontent %></p>
	<p><%=sign %></p>
</table>
</body>
</html>