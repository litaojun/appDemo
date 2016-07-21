package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券的使用规则信息
 *
 * @author auto create
 * @since 1.0, 2016-06-16 16:42:50
 */
public class UseRule extends AlipayObject {

	private static final long serialVersionUID = 7272137284266233354L;

	/**
	 * 券的扩展属性
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 券的不可用时间
	 */
	@ApiField("forbidden_time")
	private ForbbidenTime forbiddenTime;

	/**
	 * 最低消费金额
	 */
	@ApiField("min_consume")
	private String minConsume;

	/**
	 * 券适用的单品列表
	 */
	@ApiField("suit_items")
	private String suitItems;

	/**
	 * 券适用的门店列表
	 */
	@ApiListField("suit_shops")
	@ApiField("string")
	private List<String> suitShops;

	/**
	 * 券可用时间段
	 */
	@ApiListField("use_time")
	@ApiField("use_time")
	private List<UseTime> useTime;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public ForbbidenTime getForbiddenTime() {
		return this.forbiddenTime;
	}
	public void setForbiddenTime(ForbbidenTime forbiddenTime) {
		this.forbiddenTime = forbiddenTime;
	}

	public String getMinConsume() {
		return this.minConsume;
	}
	public void setMinConsume(String minConsume) {
		this.minConsume = minConsume;
	}

	public String getSuitItems() {
		return this.suitItems;
	}
	public void setSuitItems(String suitItems) {
		this.suitItems = suitItems;
	}

	public List<String> getSuitShops() {
		return this.suitShops;
	}
	public void setSuitShops(List<String> suitShops) {
		this.suitShops = suitShops;
	}

	public List<UseTime> getUseTime() {
		return this.useTime;
	}
	public void setUseTime(List<UseTime> useTime) {
		this.useTime = useTime;
	}

}
