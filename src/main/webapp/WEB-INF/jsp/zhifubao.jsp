<%@page
	import="org.springframework.security.core.context.SecurityContextHolder"%>
<%@page import="org.springframework.util.StringUtils"%>
<%@page import="org.springframework.security.core.Authentication"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="com.outh2.user.WeiXinUser"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Login</title>
</head>
<%
    String name = (String)request.getAttribute("name");
	String token = (String)request.getAttribute("token");
	String imgurl = (String)request.getAttribute("imgurl");
%>
<body>
	<h3>支付宝用户信息详细</h3>
	<table width="954px" border="0" cellspacing="0" cellpadding="0" align="center" style="background-color: #fffe31;">
  <tr>
    <td width="9"></td>
    <td>

      <div style="margin-top:10px;margin-bottom:10px;">
         <p>姓名 ：<%=name  %></p>
         <p><img src=<%=imgurl %> style="width:130px;height:150px;" /></p>
         <p>token： <%=token %></p>
      </div>

    </td>
  </tr>
</table>
</body>
</html>