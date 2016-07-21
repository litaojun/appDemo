package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车超人退款节接口
 *
 * @author auto create
 * @since 1.0, 2016-06-14 15:11:20
 */
public class AlipayEcoMycarCarmanTradeRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4189246263811251142L;

	/**
	 * 渠道平台
	 */
	@ApiField("isv")
	private String isv;

	/**
	 * 退款金额(分)
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款交易编号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getIsv() {
		return this.isv;
	}
	public void setIsv(String isv) {
		this.isv = isv;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
