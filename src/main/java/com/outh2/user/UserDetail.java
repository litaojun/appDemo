package com.outh2.user;

import java.util.ArrayList;

import com.qq.connect.QQConnectException;
import com.qq.connect.api.qzone.PageFans;
import com.qq.connect.api.qzone.UserInfo;
import com.qq.connect.javabeans.qzone.PageFansBean;
import com.qq.connect.javabeans.qzone.UserInfoBean;
import com.qq.connect.javabeans.weibo.Company;

public class UserDetail 
{
	int qzoneret = 0;
	String userNickname = "";
	String gender = "";
	String level = "";//黄钻等级：
	String isVip;//会员
	String yellowVip;//黄钻会员：
	String url30 ;
	String url50;
	String url100;
	int fansret;
	boolean isfans;//当前用户是否为认证空间的粉丝
	int wbret = 0;
	String wburl30;
	String wburl50;
	String wburl100;
    String wbuserbirthday;
    String wbuserlocal;
    ArrayList<Company> companies ;// 获取用户的公司信息
    public UserDetail(String accessToken,String openID) throws QQConnectException
    {
    	UserInfo qzoneUserInfo = new UserInfo(accessToken, openID);
    	this.initQzoneUser(qzoneUserInfo);
    	PageFans pageFansObj = new PageFans(accessToken, openID);
    	this.initPageFans(pageFansObj);
    	com.qq.connect.api.weibo.UserInfo weiboUserInfo = new com.qq.connect.api.weibo.UserInfo(accessToken, openID);
    	this.initWBuser(weiboUserInfo);
    }
    public void initQzoneUser(UserInfo qzoneUserInfo) throws QQConnectException
    {
    	UserInfoBean userInfoBean = qzoneUserInfo.getUserInfo();
    	this.qzoneret = userInfoBean.getRet();
    	if(this.qzoneret == 0)
    	{
    		this.userNickname = userInfoBean.getNickname() + "<br/>"                                        ;
    		this.gender = userInfoBean.getGender() + "<br/>"                                          ;
    		this.level = "黄钻等级： " + userInfoBean.getLevel() + "<br/>"                           ;
    		this.isVip = "会员 : " + userInfoBean.isVip() + "<br/>"                                  ;
    		this.yellowVip = "黄钻会员： " + userInfoBean.isYellowYearVip() + "<br/>"                    ;
    		this.url30 = "<image src=" + userInfoBean.getAvatar().getAvatarURL30() + " /><br/>"       ;
    		this.url50 = "<image src=" + userInfoBean.getAvatar().getAvatarURL50() + " /><br/>"       ;
    		this.url100 = "<image src=" + userInfoBean.getAvatar().getAvatarURL100() + " /><br/>"      ;
    	}
    }
    public void initPageFans(PageFans pageFansObj) throws QQConnectException
    {
    	 PageFansBean pageFansBean = pageFansObj.checkPageFans("97700000");
    	 this.fansret = pageFansBean.getRet();
    	 this.isfans = pageFansBean.isFans();
    }
    public void initWBuser(com.qq.connect.api.weibo.UserInfo weiboUserInfo) throws QQConnectException
    {
    	com.qq.connect.javabeans.weibo.UserInfoBean weiboUserInfoBean = weiboUserInfo.getUserInfo();
    	this.wbret = weiboUserInfoBean.getRet();
    	if(this.wbret == 0)
    	{
	    	//获取用户的微博头像----------------------start
	        this.wburl30 = "<image src=" + weiboUserInfoBean.getAvatar().getAvatarURL30() + " /><br/>";
	        this.wburl50 = "<image src=" + weiboUserInfoBean.getAvatar().getAvatarURL50() + " /><br/>";
	        this.wburl100 = "<image src=" + weiboUserInfoBean.getAvatar().getAvatarURL100() + " /><br/>";
	        //获取用户的微博头像 ---------------------end
	
	        //获取用户的生日信息 --------------------start
	        this.wbuserbirthday = "<p>尊敬的用户，你的生日是： " + weiboUserInfoBean.getBirthday().getYear()
	                    +  "年" + weiboUserInfoBean.getBirthday().getMonth() + "月" +
	                    weiboUserInfoBean.getBirthday().getDay() + "日</p>";
	        //获取用户的生日信息 --------------------end
	
	        StringBuffer sb = new StringBuffer();
	        sb.append("<p>所在地:" + weiboUserInfoBean.getCountryCode() + "-" + weiboUserInfoBean.getProvinceCode() + "-" + weiboUserInfoBean.getCityCode()
	                 + weiboUserInfoBean.getLocation() + "</p>");
	        this.wbuserlocal = sb.toString();
	        //获取用户的公司信息---------------------------start
	        this.companies = weiboUserInfoBean.getCompanies();
    	}
    }
    public int getFansret()
    {
    	return this.fansret;
    }
    public int                   getQzoneret()     
    {
    	return this.qzoneret;
    }
    public String                getUsernickname()     
    {
    	return this.userNickname;
    }
    public String                getGender()     
    {
    	return this.gender;
    }
    public String                getLevel()     
    {
    	return this.level;
    }
    public String                getIsvip()   
    {
    	return this.isVip;
    }
    public String                getYellowvip()    
    {
    	return this.yellowVip;
    }
    public String                getUrl30()    
    {
    	return this.url30;
    }
    public String                getUrl50()      
    {
    	return this.url50;
    }
    public String                getUrl100()  
    {
    	return this.url100;
    }
    public boolean                   getIsfans()       
    {
    	return this.isfans;
    }
    public int                   getWbret()  
    {
    	return this.wbret;
    }
    public String                getWburl30()    
    {
    	return this.wburl30;
    }
    public String                getWburl50()   
    {
    	return this.wburl50;
    }
    public String                getWburl100()       
    {
    	return this.wburl100;
    }
    public String                getWbuserbirthday()      
    {
    	return this.wbuserbirthday;
    }
    public String                getWbuserlocal()      
    {
    	return this.wbuserlocal;
    }
    public String    getCompanies()
    {
    	StringBuffer sb = new StringBuffer();
    
    	if(this.companies!=null)
	    	if (this.companies.size() > 0) {
	            //有公司信息
	            for (int i=0, j=companies.size(); i<j; i++) {
	                sb.append("<p>曾服役过的公司：公司ID-" + companies.get(i).getID() + " 名称-" +
	                companies.get(i).getCompanyName() + " 部门名称-" + companies.get(i).getDepartmentName() + " 开始工作年-" +
	                companies.get(i).getBeginYear() + " 结束工作年-" + companies.get(i).getEndYear()+"</p></br>");
	            }
	    	}
    	return sb.toString();
    }
    public static void main(String[] args) {
		// TODO Auto-generated metqzoneUserInfohod stub

	}

}
