package com.outh2.login.qq;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.outh2.user.UserDetail;
import com.qq.connect.QQConnectException;
import com.qq.connect.api.OpenID;
import com.qq.connect.api.qzone.PageFans;
import com.qq.connect.api.qzone.UserInfo;
import com.qq.connect.javabeans.AccessToken;
import com.qq.connect.javabeans.qzone.PageFansBean;
import com.qq.connect.javabeans.qzone.UserInfoBean;
import com.qq.connect.javabeans.weibo.Company;
import com.qq.connect.oauth.Oauth;

@Controller
@RequestMapping("/outh2")
public class Auth2LoginQq {
	
	
	@RequestMapping(value="/qqlogin.do",method=RequestMethod.GET)
	protected void qqAuthLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        try {
        	String path = new Oauth().getAuthorizeURL(request);
        	System.out.println(path);
            response.sendRedirect(path);
        } catch (QQConnectException e) {
            e.printStackTrace();
        }
    }
	
	@RequestMapping(value="/afterlogin.do",method=RequestMethod.GET)
	 protected String dealOauth2Call(HttpServletRequest request,Map<String,Object> map) throws IOException, QQConnectException {
	            AccessToken accessTokenObj = (new Oauth()).getAccessTokenByRequest(request);
	            String accessToken   = null,
	                   openID        = null;
	            long tokenExpireIn = 0L;
	            if (accessTokenObj.getAccessToken().equals("")) {
//	                ���ǵ���վ��CSRF�����˻����û�ȡ������Ȩ
//	                ��һЩ����ͳ�ƹ���
	                System.out.print("û�л�ȡ����Ӧ����");
	                return "litaojun";
	            } else {
	                accessToken = accessTokenObj.getAccessToken();
	                tokenExpireIn = accessTokenObj.getExpireIn();
	                request.getSession().setAttribute("demo_access_token", accessToken);
	                request.getSession().setAttribute("demo_token_expirein", String.valueOf(tokenExpireIn));
	                // ���û�ȡ����accessToken ȥ��ȡ��ǰ�õ�openid -------- start
	                OpenID openIDObj =  new OpenID(accessToken);
	                openID = openIDObj.getUserOpenID();
	                request.getSession().setAttribute("demo_openid", openID);
	                UserDetail udetail = new UserDetail(accessToken,openID);
	                map.put("user", udetail);
	                return "userdetail";
	            }
	            

	    }
	public void  getUserDetail()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
