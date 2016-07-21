package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-01 00:31:42
 */
public class AlipayOfflineMarketShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3584957571175246968L;

	/** 
	 * ISV每次请求都会在支付宝保存一条流水，apply_id为流水Id,此字段留作后续功能扩展使用。
2.0版本的开店，都是需要审核的，同步返回时，如果请求成功，不在生成shop_id，此时只有等待审批的流水，相比1.0版本，不再有INIT状态的店铺。如果此时需要获取审批中的店铺状态，可以通过接口：alipay.offline.market.applyorder.batchquery查询，当审核通过后，店铺会生成并立即上架。
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 门店审核状态描述，如果审核驳回则有相关的驳回理由。
2.0接口同步返回将不再有此字段，审核结果将在审核通知中给出。
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 门店审核状态，对于系统商而言，只有三个状态，AUDITING：审核中，AUDIT_FAILED：审核驳回，AUDIT_SUCCESS：审核通过。第一次审核通过会触发门店上架。
2.0接口，同步请求如果支付宝受理成功，将返回AUDITING状态。
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 门店是否上架，T表示上架,F表示未上架，第一次门店审核通过后会触发上架。
2.0接口同步返回中将不再有此字段，门店是否上架将通过异步审核通知到ISV，或者ISV通过流水查询接口获取门店审核流水的状态。
	 */
	@ApiField("is_online")
	private String isOnline;

	/** 
	 * 门店是否在客户端显示，T表示显示，F表示隐藏。
2.0接口同步返回中将不再有此字段，门店展示状态将通过异步审核通知到ISV。
	 */
	@ApiField("is_show")
	private String isShow;

	/** 
	 * 支付宝内部参数，暂不对ISV开放，开店请求结果码：
WAIT_MERCHANT_CONFIRM：等待商户确认
WAIT_CERTIFY：等待认证
LICENSE_AUDITING：一证多开审核中
RISK_AUDITING：风控审核中
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 支付宝门店ID，后续的增删改查接口都使用该ID作为主键。2.0接口创建门店同步返回将不再返回此字段，返回流水apply_id，风控审核通过后，将发送异步通知给到ISV门店shop_id。
	 */
	@ApiField("shop_id")
	private String shopId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}
	public String getAuditDesc( ) {
		return this.auditDesc;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}
	public String getIsOnline( ) {
		return this.isOnline;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	public String getIsShow( ) {
		return this.isShow;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

}
