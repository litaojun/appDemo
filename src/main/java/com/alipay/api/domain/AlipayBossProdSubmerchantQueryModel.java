package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户查询接口
 *
 * @author auto create
 * @since 1.0, 2016-06-30 14:58:53
 */
public class AlipayBossProdSubmerchantQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5729862324367743892L;

	/**
	 * 商户外部编号
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 商户识别号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
