<%@page
	import="org.springframework.security.core.context.SecurityContextHolder"%>
<%@page import="org.springframework.util.StringUtils"%>
<%@page import="org.springframework.security.core.Authentication"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="com.outh2.user.UserDetail"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Login</title>
</head>
<%
  UserDetail user = (UserDetail)request.getAttribute("user");
%>
<body>
	<h3>QQ用户信息详细</h3>
	<table width="954px" border="0" cellspacing="0" cellpadding="0" align="center" style="background-color: #fffe31;">
  <tr>
    <td width="9"></td>
    <td>
    <% if(user.getQzoneret() == 0) 
       { %>
      <div style="margin-top:10px;margin-bottom:10px;">
         <p><%=user.getUsernickname()%></p>
         <p><%=user.getGender()%></p>
         <p><%=user.getLevel()%></p>
         <p><%= user.getIsvip() %></p>
         <p><%= user.getYellowvip() %></p>
      </div>
      <div style="margin-top:10px;margin-bottom:10px;">
        <p><%= user.getUrl100() %></p>
        <p><%= user.getUrl30() %></p>
        <p><%= user.getUrl50() %></p>
      </div>
      <%} 
      else
        {%>
      <div style="margin-top:10px;margin-bottom:10px;">
        <p>fail</p>  <br />
      </div>
      <%} 
        if(user.getFansret() == 0)
        {%>
      <div style="margin-top:10px;margin-bottom:10px;">
         <p>验证您" + (pageFansBean.isFans() ? "是" : "不是")  + "QQ空间97700000官方认证空间的粉丝</p>  <br />
      </div>
      <%}
        if(user.getWbret()==0)
        {%>
      <div style="margin-top:10px;margin-bottom:10px;">
        <p><%= user.getWburl30() %></p>
        <p><%= user.getWburl50() %></p>
        <p><%= user.getWburl100() %></p>
      </div>
      <div style="margin-top:10px;margin-bottom:10px;">
        <p><%= user.getWbuserbirthday() %></p>
         <p><%= user.getWbuserlocal() %></p>
          <p><%= user.getCompanies() %></p>
      </div>
     
      <%} %>
    </td>
  </tr>
</table>
</body>
</html>