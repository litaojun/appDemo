package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑营销活动列表查询
 *
 * @author auto create
 * @since 1.0, 2016-05-20 16:49:30
 */
public class KoubeiMarketingCampaignListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4813419794993712197L;

	/**
	 * 页码
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 查询条件
	 */
	@ApiListField("query_criterias")
	@ApiField("condition")
	private List<Condition> queryCriterias;

	public String getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public List<Condition> getQueryCriterias() {
		return this.queryCriterias;
	}
	public void setQueryCriterias(List<Condition> queryCriterias) {
		this.queryCriterias = queryCriterias;
	}

}
