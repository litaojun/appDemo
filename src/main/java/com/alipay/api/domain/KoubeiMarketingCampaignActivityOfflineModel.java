package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动下架接口
 *
 * @author auto create
 * @since 1.0, 2016-06-16 16:03:28
 */
public class KoubeiMarketingCampaignActivityOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 5716824836517294878L;

	/**
	 * 活动Id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * "{\"key\"：\"value\"}"
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 操作人id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 外部批次ID
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 下架原因
	 */
	@ApiField("reason")
	private String reason;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
