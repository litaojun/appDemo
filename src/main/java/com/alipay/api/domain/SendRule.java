package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品发放规则
 *
 * @author auto create
 * @since 1.0, 2016-06-16 17:44:01
 */
public class SendRule extends AlipayObject {

	private static final long serialVersionUID = 8393282445141775199L;

	/**
	 * 满多少金额才能送券
	 */
	@ApiField("min_cost")
	private String minCost;

	/**
	 * 发放数量
	 */
	@ApiField("send_num")
	private String sendNum;

	public String getMinCost() {
		return this.minCost;
	}
	public void setMinCost(String minCost) {
		this.minCost = minCost;
	}

	public String getSendNum() {
		return this.sendNum;
	}
	public void setSendNum(String sendNum) {
		this.sendNum = sendNum;
	}

}
