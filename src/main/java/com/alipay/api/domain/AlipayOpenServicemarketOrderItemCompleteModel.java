package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商完成订单内单个明细实施操作
 *
 * @author auto create
 * @since 1.0, 2016-06-16 21:01:33
 */
public class AlipayOpenServicemarketOrderItemCompleteModel extends AlipayObject {

	private static final long serialVersionUID = 4856836917379955279L;

	/**
	 * 订购服务插件订单号
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/**
	 * 订购插件选择的某一店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCommodityOrderId() {
		return this.commodityOrderId;
	}
	public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
