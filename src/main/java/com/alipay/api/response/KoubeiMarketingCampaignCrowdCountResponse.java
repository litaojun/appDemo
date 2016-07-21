package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.count response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-28 22:43:55
 */
public class KoubeiMarketingCampaignCrowdCountResponse extends AlipayResponse {

	private static final long serialVersionUID = 7794154939245792649L;

	/** 
	 * 各个细分维度的值
	 */
	@ApiField("dimension_values")
	private String dimensionValues;

	/** 
	 * 人群组的汇总统计值total是人数，sum是交易金额
	 */
	@ApiField("summary_values")
	private String summaryValues;

	public void setDimensionValues(String dimensionValues) {
		this.dimensionValues = dimensionValues;
	}
	public String getDimensionValues( ) {
		return this.dimensionValues;
	}

	public void setSummaryValues(String summaryValues) {
		this.summaryValues = summaryValues;
	}
	public String getSummaryValues( ) {
		return this.summaryValues;
	}

}
