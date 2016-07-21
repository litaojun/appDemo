package com.outh2.login.zfb;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayOpenAuthTokenAppRequest;
import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.alipay.api.request.AlipayUserUserinfoShareRequest;
import com.alipay.api.response.AlipayOpenAuthTokenAppResponse;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.alipay.api.response.AlipayUserUserinfoShareResponse;
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
public class Auth2LoginZfb {
	
	@RequestMapping(value="/zfblogin.do",method=RequestMethod.GET)
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
	
	@RequestMapping(value="/zfbafterlogin.do",method=RequestMethod.GET)
	 protected String dealOauth2Call(HttpServletRequest request,Map<String,Object> map) throws IOException, QQConnectException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, AlipayApiException 
	{
		Map maps = request.getParameterMap();
		Iterator it = maps.keySet().iterator();
		while(it.hasNext())
		{
			System.out.println("it.next="+it.next());
		}
		String prikey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKcKOF2czZVs3C+L"+
				"8hehBzasTKDDs3/WqrtVkIWeGI4rZxW0Df2u4KjRImXaY/Z4oQA/KIEY87zhF4hk"+
				"ailqCqlm5JryNyEsIXV0wNGilupvqzOJ2iCQXpC/GntVoJ/ipeQmfORhulEgMBWS"+
				"KDnbudIxoxeOnh0v9oX6F4mme8xpAgMBAAECgYEAn+sp8X2IWPFCkAakPLj+pfoo"+
				"1pTlyZMkG3uchD/KdHnbFC0wY9nD3ftyuh5uK25rfUf6KDZSS1cYZ4zzEjkigGWV"+
				"Op+zyVkNDVPtRqT+HH+NXVIcQAqGh9GASRBO7LCoNWGZC8ibckOFhrp85hGqYFFG"+
				"RmbKqtypV6O7NWGhvo0CQQDbAZ/jyTDDNnDkhVTS2dgyChf/jnrPKlakSnOVRI89"+
				"N81fM4BAkJ8lzMoMkGfK4XUF22ZdJ8IxGjxjdOluJyMvAkEAw0FwZ8uFWg+FcVjs"+
				"Y87F4Nbkd/tEpwcRDeo10FAhcRcoTa441BaRbUgClt+7D0fZg7y54B7Vd7ix+GI6"+
				"hfaD5wJATxM8FvP6zlFm26wkn2kWvaKVXamlQA3KcNGNADVb/r+aQKiIw0c0n2Jd"+
				"BcJSJ5fWOAIq6LHFVRNjAIojCqnI8wJANl6ddzmTy20xAkv5nx0vupj8C3DbQAtW"+
				"s2I5U+VMOppxLZhK2LvkCOMZXXu1Md8W8Xj25TKQzIKQhBKOK0lmlwJASuu8MtEX"+
				"RhT/pheJsx77vQeupbzl5H8Lhraf9JnrCmiMoP6UL1QtozdOg2lp17ZrxQsX/1XI" +
				"5CGRgnkA/qiXsA==";
		    String zfbgy = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";
		    String code = request.getParameter("auth_code");
		    String app_id = request.getParameter("app_id");
		    System.out.println("code = "+code);
		    System.out.println("app_id = "+app_id);
		    AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",app_id,prikey,"json","GBK",zfbgy);
		    AlipaySystemOauthTokenRequest requesttoken = new AlipaySystemOauthTokenRequest();
		    requesttoken.setGrantType("authorization_code");
		    requesttoken.setCode(code);
		   // requesttoken.setRefreshToken("201208134b203fe6c11548bcabd8da5bb087a83b");
		    AlipaySystemOauthTokenResponse response = alipayClient.execute(requesttoken);
		    System.out.println("response.getAccessToken()="+response.getAccessToken());
		    map.put("token", response.getAccessToken());
		   // AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do","app_id","your private_key","json","GBK","alipay_public_key");
		    AlipayUserUserinfoShareRequest requestuser = new AlipayUserUserinfoShareRequest();
		    AlipayUserUserinfoShareResponse responseuser = alipayClient.execute(requestuser, response.getAccessToken());
		    
		    String imgurl = responseuser.getAvatar();
		    String name = responseuser.getRealName();
		    
		    map.put("imgurl", imgurl);
		    map.put("name",name);
		    return "zhifubao";
	 }
	
	
	@RequestMapping(value="/zfbafterloginApp.do",method=RequestMethod.GET)
	 protected String dealOauth2CallApp(HttpServletRequest request,Map<String,Object> map) throws IOException, QQConnectException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, AlipayApiException 
	{
		Map maps = request.getParameterMap();
		Iterator it = maps.keySet().iterator();
		while(it.hasNext())
		{
			System.out.println("it.next="+it.next());
		}
		String prikey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKcKOF2czZVs3C+L"+
				"8hehBzasTKDDs3/WqrtVkIWeGI4rZxW0Df2u4KjRImXaY/Z4oQA/KIEY87zhF4hk"+
				"ailqCqlm5JryNyEsIXV0wNGilupvqzOJ2iCQXpC/GntVoJ/ipeQmfORhulEgMBWS"+
				"KDnbudIxoxeOnh0v9oX6F4mme8xpAgMBAAECgYEAn+sp8X2IWPFCkAakPLj+pfoo"+
				"1pTlyZMkG3uchD/KdHnbFC0wY9nD3ftyuh5uK25rfUf6KDZSS1cYZ4zzEjkigGWV"+
				"Op+zyVkNDVPtRqT+HH+NXVIcQAqGh9GASRBO7LCoNWGZC8ibckOFhrp85hGqYFFG"+
				"RmbKqtypV6O7NWGhvo0CQQDbAZ/jyTDDNnDkhVTS2dgyChf/jnrPKlakSnOVRI89"+
				"N81fM4BAkJ8lzMoMkGfK4XUF22ZdJ8IxGjxjdOluJyMvAkEAw0FwZ8uFWg+FcVjs"+
				"Y87F4Nbkd/tEpwcRDeo10FAhcRcoTa441BaRbUgClt+7D0fZg7y54B7Vd7ix+GI6"+
				"hfaD5wJATxM8FvP6zlFm26wkn2kWvaKVXamlQA3KcNGNADVb/r+aQKiIw0c0n2Jd"+
				"BcJSJ5fWOAIq6LHFVRNjAIojCqnI8wJANl6ddzmTy20xAkv5nx0vupj8C3DbQAtW"+
				"s2I5U+VMOppxLZhK2LvkCOMZXXu1Md8W8Xj25TKQzIKQhBKOK0lmlwJASuu8MtEX"+
				"RhT/pheJsx77vQeupbzl5H8Lhraf9JnrCmiMoP6UL1QtozdOg2lp17ZrxQsX/1XI" +
				"5CGRgnkA/qiXsA==";
		    String zfbgy = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";
		    String code = request.getParameter("app_auth_code");
		    String app_id = request.getParameter("app_id");
		    System.out.println("code = "+code);
		    System.out.println("app_id = "+app_id);
		    AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",app_id,prikey,"json","GBK",zfbgy);
		    AlipayOpenAuthTokenAppRequest requestapp = new AlipayOpenAuthTokenAppRequest();
		    requestapp.setBizContent("{\"grant_type\":\"authorization_code\",\"code\":"+code+"}");
		    AlipayOpenAuthTokenAppResponse responseapp = alipayClient.execute(requestapp);
		    System.out.println(" responseapp.getAppAuthToken();="+ responseapp.getAppAuthToken());
		    return "zhifubao";
	 }
	
	 
	 protected String dealOauth2Callsss(HttpServletRequest request,Map<String,Object> map) throws IOException, QQConnectException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, AlipayApiException 
	{
		    String code = request.getParameter("auth_code");
		    System.out.println("code = "+code);
		    Outh2SignData olz = new Outh2SignData(code);
		    //olz.sign();
		    String  paramurl = olz.tranUrl();
		    System.out.println("paramurl = "+paramurl);
           String retstr = HttpRequest.sendPost("https://openapi.alipay.com/gateway.do", paramurl);
           System.out.println("retstr="+retstr);
           map.put("signcontent", olz.signCtt);
           map.put("sign", olz.sign);
           map.put("retcode", retstr);
  	        return "litaojunzfb";
	 }
	public void  getUserDetail()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
