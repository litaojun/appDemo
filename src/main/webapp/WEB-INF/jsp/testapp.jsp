<%@page import="org.springframework.security.core.context.SecurityContextHolder"%>
<%@page import="org.springframework.util.StringUtils"%>
<%@page import="org.springframework.security.core.Authentication"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Login</title>
</head>
<%
	  String token = (String)request.getAttribute("access_token");
	%>
<script type="text/javascript">
	window.onload=function(){
		      //alert("litaojun--1");
          sign = isNull('<%=token%>');
          //alert("litaojun--2"+sign);
          if(sign != "meiyou")
          {
          	   //alert("litaojun--3");
               url = "http://localhost:8080/appDemo/resource/getUserInfo?access_token=" + sign;
               window.location.href = url;
               //alert("litaojun--4");
          }
  }
	function openuser(token) 
	{
		sign = isNull(token);
		//alert(sign);
		if(sign == "meiyou")
			url = "http://localhost:8080/appDemo/oauth/authorize?client_id=m1&redirect_uri=http%3a%2f%2flocalhost%3a8080%2fappDemo%2flitaojun%2ftestapp&response_type=code&scope=read";
		else
		    url = "http://localhost:8080/appDemo/resource/getUserInfo?access_token=" + token;
		window.location.href = url;
		alert(window.location.href);
	} 
	function isNull(data)
	{ 
		return (data == "" || data == undefined || data == null || data == "null") ? "meiyou" : data; 
	}
</script>
<body>
	<h3>Login page</h3>
	
	<table width="954px" border="0" cellspacing="0" cellpadding="0" align="center" style="background-color: #272e31;">
	  <tr>
	    <td width="9"></td>
	    <td>
	      <div style="margin-top:10px;margin-bottom:10px;">
	        <a href="" onclick="openuser('<%=token%>')"  >访问第三方资源</a>&nbsp;        <br />
	      </div>
	    </td>
	    <td align="right">Powered by yihaomen.com</td>
	    <td width="9"></td>
	  </tr>
    </table>
</body>
</html>