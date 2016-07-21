package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv 回传的用户操作行为信息调用接口
 *
 * @author auto create
 * @since 1.0, 2016-05-16 21:30:25
 */
public class AlipayOfflineProviderOpenUseractionModel extends AlipayObject {

	private static final long serialVersionUID = 7346433348722563587L;

	/**
	 * 行为描述 json格式，有特定的字段(太大的话可能会导致内部处理失败)
	 */
	@ApiField("action_detail")
	private String actionDetail;

	/**
	 * 本次请求的唯一键（操作实体主键+平台字符串）
	 */
	@ApiField("action_outer_id")
	private String actionOuterId;

	/**
	 * 行为类型（点菜ORDER_DISHES、点歌、领取号）
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 插件ID（用户在您的那个插件发生的行为）
	 */
	@ApiField("alipay_app_id")
	private String alipayAppId;

	/**
	 * 行为发生时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("date_time")
	private String dateTime;

	/**
	 * user用户实体
	 */
	@ApiField("entity")
	private String entity;

	/**
	 * 所属行业 (餐饮：REPAST)
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 合作店铺对象 信息
	 */
	@ApiField("outer_shop_do")
	private OuterShopDO outerShopDo;

	/**
	 * source对应平台的id
	 */
	@ApiField("user_id")
	private String userId;

	public String getActionDetail() {
		return this.actionDetail;
	}
	public void setActionDetail(String actionDetail) {
		this.actionDetail = actionDetail;
	}

	public String getActionOuterId() {
		return this.actionOuterId;
	}
	public void setActionOuterId(String actionOuterId) {
		this.actionOuterId = actionOuterId;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAlipayAppId() {
		return this.alipayAppId;
	}
	public void setAlipayAppId(String alipayAppId) {
		this.alipayAppId = alipayAppId;
	}

	public String getDateTime() {
		return this.dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getEntity() {
		return this.entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public OuterShopDO getOuterShopDo() {
		return this.outerShopDo;
	}
	public void setOuterShopDo(OuterShopDO outerShopDo) {
		this.outerShopDo = outerShopDo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
