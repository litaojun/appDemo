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
<meta property="qc:admins" content="744633271612537523561004162163757164506230" />
</head>
<script type="text/javascript">
function openusers(token) 
{
	sign = isNull(token);
	alert(sign);
	if(sign == "meiyou")
		url = "http://localhost:8080/appDemo/oauth/authorize?client_id=m1&redirect_uri=http%3a%2f%2flocalhost%3a12345%2flitaojun&response_type=code&scope=read";
	else
	    url = "http://localhost:8080/appDemo/resource/getUserInfo?access_token=" + token;
	window.location.href = url;
	alert(window.location.href);
} 
</script>
<body>
	<h3>Login page</h3>
	<form action='j_spring_security_check' method='POST'>
		<table>
			<tr>
				<td>User Name:</td>
				<td><input type='text' name='j_username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='j_password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Login" /></td>
			</tr>
		</table>
	</form>
	
	<p>第三方登录：</p>
	<p><a href="/outh2/qqlogin.do" ><img src="/images/qqlogo.png" style="width:130px;height:40px;" /></a></p>
</body>
</html>