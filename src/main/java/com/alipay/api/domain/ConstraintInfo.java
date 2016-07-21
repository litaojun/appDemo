package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动限制信息
 *
 * @author auto create
 * @since 1.0, 2016-06-16 16:42:50
 */
public class ConstraintInfo extends AlipayObject {

	private static final long serialVersionUID = 5835283255931584334L;

	/**
	 * 人群规则组Id
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	/**
	 * 消费单品的列表
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 最低消费
	 */
	@ApiField("min_cost")
	private String minCost;

	/**
	 * 适用的门店列表
	 */
	@ApiListField("suit_shops")
	@ApiField("string")
	private List<String> suitShops;

	/**
	 * 用户享受次数
	 */
	@ApiField("user_win_count")
	private String userWinCount;

	/**
	 * 用户能够享受的频率
	 */
	@ApiField("user_win_frequency")
	private String userWinFrequency;

	public String getCrowdGroupId() {
		return this.crowdGroupId;
	}
	public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

	public String getMinCost() {
		return this.minCost;
	}
	public void setMinCost(String minCost) {
		this.minCost = minCost;
	}

	public List<String> getSuitShops() {
		return this.suitShops;
	}
	public void setSuitShops(List<String> suitShops) {
		this.suitShops = suitShops;
	}

	public String getUserWinCount() {
		return this.userWinCount;
	}
	public void setUserWinCount(String userWinCount) {
		this.userWinCount = userWinCount;
	}

	public String getUserWinFrequency() {
		return this.userWinFrequency;
	}
	public void setUserWinFrequency(String userWinFrequency) {
		this.userWinFrequency = userWinFrequency;
	}

}
