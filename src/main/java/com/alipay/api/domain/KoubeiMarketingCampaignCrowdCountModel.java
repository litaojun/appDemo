package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商户人群组数目统计接口
 *
 * @author auto create
 * @since 1.0, 2016-05-20 16:24:35
 */
public class KoubeiMarketingCampaignCrowdCountModel extends AlipayObject {

	private static final long serialVersionUID = 8548485649454257657L;

	/**
	 * 由人群标签及标签值组成
	 */
	@ApiField("conditions")
	private String conditions;

	/**
	 * 如果conditions为空，则以人群中ID为准，否则以conditions为准
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	/**
	 * 细分维度
	 */
	@ApiField("dimensions")
	private String dimensions;

	public String getConditions() {
		return this.conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String getCrowdGroupId() {
		return this.crowdGroupId;
	}
	public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}

	public String getDimensions() {
		return this.dimensions;
	}
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

}
