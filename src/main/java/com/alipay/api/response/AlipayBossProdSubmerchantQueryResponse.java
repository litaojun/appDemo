package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.submerchant.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-30 14:58:53
 */
public class AlipayBossProdSubmerchantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6643294425866112332L;

	/** 
	 * 商户简称
	 */
	@ApiField("alias_name")
	private String aliasName;

	/** 
	 * 经营类目
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/** 
	 * 联系人手机号
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/** 
	 * 联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/** 
	 * 联系人电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/** 
	 * 商户外部编号,一个受理机构下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/** 
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 商户名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/** 
	 * 商户识别号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public String getAliasName( ) {
		return this.aliasName;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryId( ) {
		return this.categoryId;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactEmail( ) {
		return this.contactEmail;
	}

	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}
	public String getContactMobile( ) {
		return this.contactMobile;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactName( ) {
		return this.contactName;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getContactPhone( ) {
		return this.contactPhone;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getExternalId( ) {
		return this.externalId;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}
	public String getServicePhone( ) {
		return this.servicePhone;
	}

	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}
	public String getSubMerchantId( ) {
		return this.subMerchantId;
	}

}
