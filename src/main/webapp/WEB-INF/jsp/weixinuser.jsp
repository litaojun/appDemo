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
    WeiXinUser user = (WeiXinUser)request.getAttribute("weixinuser");
%>
<body>
	<h3>微信用户信息详细</h3>
	<table width="954px" border="0" cellspacing="0" cellpadding="0" align="center" style="background-color: #fffe31;">
  <tr>
    <td width="9"></td>
    <td>

      <div style="margin-top:10px;margin-bottom:10px;">
         <p>城市 ：<%=user.getCity()  %></p>
         <p>国家 ： <%=user.getCountry() %></p>
         <p><img src=<%=user.getHeadimgurl() %> style="width:130px;height:150px;" /></p>
         <p>呢称： <%= user.getNickname() %></p>
         <p>OPENID: <%= user.getOpenid() %></p>
         <p>用户特权信息: <%= user.getPrivilege() %></p>
         <p>省份:  <%= user.getProvince() %></p>
         <p>用户性别 : <%= user.getSex() %></p>
         <p>用户统一标识:<%= user.getUnionid() %></p>
      </div>

    </td>
  </tr>
</table>
</body>
</html>