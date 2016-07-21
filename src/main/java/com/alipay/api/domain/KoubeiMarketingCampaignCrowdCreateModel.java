package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商户人群组创建接口
 *
 * @author auto create
 * @since 1.0, 2016-06-16 16:04:48
 */
public class KoubeiMarketingCampaignCrowdCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2571314869536259753L;

	/**
	 * 圈人的条件
	 */
	@ApiField("conditions")
	private String conditions;

	/**
	 * 人群组的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 操作者ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作者类型PROVIDE表示是服务商，不传值表示是商家
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 外部流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getConditions() {
		return this.conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
