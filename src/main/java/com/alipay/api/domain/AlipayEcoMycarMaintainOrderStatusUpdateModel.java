package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保养订单状态更新
 *
 * @author auto create
 * @since 1.0, 2016-06-24 12:33:33
 */
public class AlipayEcoMycarMaintainOrderStatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 7864563487571331731L;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 行业类目标识
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 状态: 1.确认收货, 2.服务验证
	 */
	@ApiField("type")
	private String type;

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getIndustryCode() {
		return this.industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
