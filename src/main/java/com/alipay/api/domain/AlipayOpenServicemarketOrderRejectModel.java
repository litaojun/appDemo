package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商拒绝接单
 *
 * @author auto create
 * @since 1.0, 2016-06-16 21:01:39
 */
public class AlipayOpenServicemarketOrderRejectModel extends AlipayObject {

	private static final long serialVersionUID = 3866543751158595589L;

	/**
	 * 订购服务商品订单ID
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/**
	 * 拒绝接单原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public String getCommodityOrderId() {
		return this.commodityOrderId;
	}
	public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

}