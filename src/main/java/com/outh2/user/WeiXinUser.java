package com.outh2.user;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class WeiXinUser 
{   private String openid     ; 
	private String nickname   ;
	private String sex        ;
	private String province   ;
	private String city       ;
	private String country    ;
	private String headimgurl ;
	private String privilege  ;
	private String unionid    ;
	public String getOpenid()
	{
		return this.openid;
	}
	public String getNickname()
	{
		return this.nickname;
	}
	public String getSex()
	{
		return this.sex;
	}
	public String getProvince()
	{
		return this.province;
	}
	public String getCity()
	{
		return this.city;
	}
	public String getCountry()
	{
		return this.country;
	}
	public String getHeadimgurl()
	{
		return this.headimgurl;
	}
	public String getPrivilege()
	{
		return this.privilege;
	}
	public String getUnionid()
	{
		return this.unionid;
	}
	public void setOpenid    (String  openid    )
	{
		this.openid = openid;
	}
	public void setNickname  (String  nickname  )
	{
		this.nickname = nickname;
	}
	public void setSex       (String  sex       )
	{
		this.sex = sex;
	}
	public void setProvince  (String  province  )
	{
		this.province = province;
	}
	public void setCity      (String  city      )
	{
		this.city = city;
	}
	public void setCountry   (String  country   )
	{
		this.country = country;
	}
	public void setHeadimgurl(String  headimgurl)
	{
		this.headimgurl = headimgurl;
	}
	public void setPrivilege (String  privilege )
	{
		this.privilege = privilege;
	}
	public void setUnionid   (String  unionid   )
	{
		this.unionid = unionid;
	}
	public void jsonToWeiXinUser(String retstr)
	{
		System.out.println("retstr="+retstr);
        JSONObject data = JSON.parseObject(retstr);
   	    String accesstoken = data.getString("access_token");
	}

}
