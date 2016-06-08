package com.outh2.tools;

import java.util.Map;

public class Auth2Tool 
{
	
       public static void addTokenToMap(Map<String,Object> map,WeixinToken wxt)
       {
    	     map.put("access_token", wxt.getAccess_token());
	   	     map.put("refresh_token", wxt.getRefresh_token());
	   	     map.put("expires_in", wxt.getExpires_in());
	   	     map.put("openid", wxt.getOpenid());
       }
}
