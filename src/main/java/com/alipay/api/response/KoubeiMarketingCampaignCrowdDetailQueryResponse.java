package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-28 22:44:43
 */
public class KoubeiMarketingCampaignCrowdDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1425368949664348987L;

	/** 
	 * 详见人群组列表查询的人群组crowd_group_info对象
	 */
	@ApiField("crowd_group_info")
	private String crowdGroupInfo;

	/** 
	 * 人群名称
	 */
	@ApiField("name")
	private String name;

	public void setCrowdGroupInfo(String crowdGroupInfo) {
		this.crowdGroupInfo = crowdGroupInfo;
	}
	public String getCrowdGroupInfo( ) {
		return this.crowdGroupInfo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

}
