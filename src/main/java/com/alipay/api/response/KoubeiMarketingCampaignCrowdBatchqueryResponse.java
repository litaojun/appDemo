package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-28 22:44:22
 */
public class KoubeiMarketingCampaignCrowdBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2511281894516116215L;

	/** 
	 * 人群组的基本信息
	 */
	@ApiField("crowd_group_sets")
	private String crowdGroupSets;

	/** 
	 * 返回接记录的总条数
	 */
	@ApiField("total_number")
	private String totalNumber;

	public void setCrowdGroupSets(String crowdGroupSets) {
		this.crowdGroupSets = crowdGroupSets;
	}
	public String getCrowdGroupSets( ) {
		return this.crowdGroupSets;
	}

	public void setTotalNumber(String totalNumber) {
		this.totalNumber = totalNumber;
	}
	public String getTotalNumber( ) {
		return this.totalNumber;
	}

}
