package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.tags.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-28 22:45:00
 */
public class KoubeiMarketingCampaignTagsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7422773672414513237L;

	/** 
	 * 查询成功时返回人群标签信息查询失败时为空
	 */
	@ApiField("tags")
	private String tags;

	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getTags( ) {
		return this.tags;
	}

}
