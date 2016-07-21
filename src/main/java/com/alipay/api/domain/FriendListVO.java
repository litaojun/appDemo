package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好友列表的模型对象
 *
 * @author auto create
 * @since 1.0, 2016-05-30 10:33:30
 */
public class FriendListVO extends AlipayObject {

	private static final long serialVersionUID = 8219714599715784775L;

	/**
	 * 头像的服务地址
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 是使用userid通过调用cifcommon的服务生成的
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 是否双向好友
	 */
	@ApiField("real_friend")
	private Boolean realFriend;

	/**
	 * 有可能包含emoji表情，业务方要注意编码
	 */
	@ApiField("view_name")
	private String viewName;

	public String getHeadImg() {
		return this.headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Boolean getRealFriend() {
		return this.realFriend;
	}
	public void setRealFriend(Boolean realFriend) {
		this.realFriend = realFriend;
	}

	public String getViewName() {
		return this.viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

}
