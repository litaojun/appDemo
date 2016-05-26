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
	String level = "";//����ȼ���
	String isVip;//��Ա
	String yellowVip;//�����Ա��
	String url30 ;
	String url50;
	String url100;
	int fansret;
	boolean isfans;//��ǰ�û��Ƿ�Ϊ��֤�ռ�ķ�˿
	int wbret = 0;
	String wburl30;
	String wburl50;
	String wburl100;
    String wbuserbirthday;
    String wbuserlocal;
    ArrayList<Company> companies ;// ��ȡ�û��Ĺ�˾��Ϣ
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
    		this.level = "����ȼ��� " + userInfoBean.getLevel() + "<br/>"                           ;
    		this.isVip = "��Ա : " + userInfoBean.isVip() + "<br/>"                                  ;
    		this.yellowVip = "�����Ա�� " + userInfoBean.isYellowYearVip() + "<br/>"                    ;
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
	    	//��ȡ�û���΢��ͷ��----------------------start
	        this.wburl30 = "<image src=" + weiboUserInfoBean.getAvatar().getAvatarURL30() + " /><br/>";
	        this.wburl50 = "<image src=" + weiboUserInfoBean.getAvatar().getAvatarURL50() + " /><br/>";
	        this.wburl100 = "<image src=" + weiboUserInfoBean.getAvatar().getAvatarURL100() + " /><br/>";
	        //��ȡ�û���΢��ͷ�� ---------------------end
	
	        //��ȡ�û���������Ϣ --------------------start
	        this.wbuserbirthday = "<p>�𾴵��û�����������ǣ� " + weiboUserInfoBean.getBirthday().getYear()
	                    +  "��" + weiboUserInfoBean.getBirthday().getMonth() + "��" +
	                    weiboUserInfoBean.getBirthday().getDay() + "��</p>";
	        //��ȡ�û���������Ϣ --------------------end
	
	        StringBuffer sb = new StringBuffer();
	        sb.append("<p>���ڵ�:" + weiboUserInfoBean.getCountryCode() + "-" + weiboUserInfoBean.getProvinceCode() + "-" + weiboUserInfoBean.getCityCode()
	                 + weiboUserInfoBean.getLocation() + "</p>");
	        this.wbuserlocal = sb.toString();
	        //��ȡ�û��Ĺ�˾��Ϣ---------------------------start
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
	            //�й�˾��Ϣ
	            for (int i=0, j=companies.size(); i<j; i++) {
	                sb.append("<p>�����۹��Ĺ�˾����˾ID-" + companies.get(i).getID() + " ����-" +
	                companies.get(i).getCompanyName() + " ��������-" + companies.get(i).getDepartmentName() + " ��ʼ������-" +
	                companies.get(i).getBeginYear() + " ����������-" + companies.get(i).getEndYear()+"</p></br>");
	            }
	    	}
    	return sb.toString();
    }
    public static void main(String[] args) {
		// TODO Auto-generated metqzoneUserInfohod stub

	}

}
