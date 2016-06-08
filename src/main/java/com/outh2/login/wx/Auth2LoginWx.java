package com.outh2.login.wx;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.outh2.tools.Auth2Tool;
import com.outh2.tools.ReflectJsonToObj;
import com.outh2.tools.WeixinToken;
import com.outh2.user.UserDetail;
import com.outh2.user.WeiXinUser;
import com.post.HttpRequest;
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
public class Auth2LoginWx {
	
	@RequestMapping(value="/wxlogin.do",method=RequestMethod.GET)
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
	
	@RequestMapping(value="/wxafterlogin.do",method=RequestMethod.GET)
	 protected String dealOauth2Call(HttpServletRequest request,Map<String,Object> map) throws IOException, QQConnectException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException 
	{
		    String code = request.getParameter("code");
		    String paramstr = "appid=%s&secret=%s&code=%s&grant_type=authorization_code"; 
            String[] param = {"wx863f118e59b05e5a","dbe17f6864ace0be3058573452d87424",code};
            String paramurl = String.format(paramstr, param);
            String retstr = HttpRequest.sendGet("https://api.weixin.qq.com/sns/oauth2/access_token", paramurl);
            System.out.println("retstr="+retstr);
            WeixinToken wxt = new WeixinToken();
            wxt.jsonToWeixinToken(retstr);
            Auth2Tool.addTokenToMap(map, wxt);
	   	     //System.out.println(String.format("%s-%s-%s-%s",new String[]{accesstoken,refreshtoken,expiresin,openid}));
	   	    String sprurl = String.format("access_token=%s&openid=%s", new String[]{wxt.getAccess_token(),wxt.getOpenid()});
	   	    retstr = HttpRequest.sendGet("https://api.weixin.qq.com/sns/userinfo", sprurl);
	   	    System.out.println(retstr);
	   	    ReflectJsonToObj robj = new ReflectJsonToObj(retstr,"openid,nickname,sex,province,city,country,headimgurl,privilege,unionid","com.outh2.user.WeiXinUser");
	   	    WeiXinUser wuser = (WeiXinUser)robj.getObj();
	   	    map.put("weixinuser", wuser);
   	        return "weixinuser";
	 }
	public void  getUserDetail()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
