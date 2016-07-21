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
<meta property="qc:admins" content="74463327161754026100416216375711477166230" />
</head>
<script src="http://res.wx.qq.com/connect/zh_CN/htmledition/js/wxLogin.js"></script>
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
function openwx()
{
	//d="https://open.weixin.qq.com/connect/qrconnect?appid="+"wx863f118e59b05e5a"+"&scope="+"snsapi_login"+"&redirect_uri="+"http%3A%2F%2Fwww.livesmg.com%2Fouth2%2Fwxafterlogin.do"+"&state="+"state"+"&response_type=code";
	d="https://open.weixin.qq.com/connect/qrconnect?appid="+"wx863f118e59b05e5a"+"&scope="+"snsapi_login"+"&redirect_uri="+"http%3a%2f%2fjavaouth2.applinzi.com%2Fouth2%2Fwxafterlogin.do"+"&state="+"state"+"&response_type=code";
	window.location.href = d;
}
function openzfb()
{
	//d="https://openauth.alipay.com/oauth2/publicAppAuthorize.htm?app_id=2016070801592904&scope=auth_userinfo&state=litaojun&redirect_uri=http%3a%2f%2fwww.livemsg.com%2fappDemo%2fouth2%2fzfbafterlogin.do";
	d="https://openauth.alipay.com/oauth2/publicAppAuthorize.htm?app_id=2016070801592904&scope=auth_userinfo&state=litaojun&redirect_uri=http%3a%2f%2fjavaouth2.applinzi.com%2fouth2%2fzfbafterlogin.do";
	window.location.href = d;
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
	<!-- <%=application.getRealPath("/")%>
	<%=request.getRequestURI()%>
	<%=application.getRealPath(request.getRequestURI())%> 
	 <%=request.getContextPath()%>-->
	<p>第三方登录：</p>
	<p><a href="/outh2/qqlogin.do" ><img src="<%=request.getContextPath()%>/images/qqlogo.png" style="width:130px;height:40px;" /></a></p>
	<p><a href="#" onclick="openwx()" ><img src="<%=request.getContextPath()%>/images/icon32_wx_button.png" style="width:130px;height:40px;" /></a></p>
	<p><a href="#" onclick="openzfb()" ><img src="<%=request.getContextPath()%>/images/icon54_zfb_img.png" style="width:130px;height:40px;" /></a></p>
</body>
</html>