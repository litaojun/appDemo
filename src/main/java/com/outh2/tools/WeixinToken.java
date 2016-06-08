package com.outh2.tools;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class WeixinToken {
	private String access_token;
	private String refresh_token;
	private String expires_in;
	private String openid;
	public String getAccess_token()
	{
		return this.access_token;
	}
	public String getRefresh_token()
	{
	    return this.refresh_token;
	}
	public String getExpires_in()
	{
		return this.expires_in;
	}
	public String getOpenid()
	{
		return this.openid;
	}
	public void setAccess_token(String curstr)
	{
		this.access_token = curstr;
	}
	public void setRefresh_token(String curstr)
	{
		this.refresh_token = curstr;
	}
	public void setExpires_in(String curstr)
	{
		this.expires_in = curstr;
	}
	public void setOpenid(String curstr)
	{
		this.openid = curstr;
	}
	public void jsonToWeixinToken(String retstr)
	{
		System.out.println("retstr="+retstr);
        JSONObject data = JSON.parseObject(retstr);
   	    this.access_token = data.getString("access_token");
   	    this.refresh_token = data.getString("refresh_token");
   	    this.expires_in = data.getString("expires_in");
   	    this.openid = data.getString("openid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
