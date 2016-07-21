package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.submerchant.create response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-30 14:59:00
 */
public class AlipayBossProdSubmerchantCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6389711244566641488L;

	/** 
	 * 商户识别号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}
	public String getSubMerchantId( ) {
		return this.subMerchantId;
	}

}
