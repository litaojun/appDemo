package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动创建接口
 *
 * @author auto create
 * @since 1.0, 2016-06-16 17:44:09
 */
public class KoubeiMarketingCampaignCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3157396893694316442L;

	/**
	 * 活动预算
	 */
	@ApiField("budget_info")
	private BudgetInfo budgetInfo;

	/**
	 * 活动限制信息
	 */
	@ApiField("constraint_info")
	private ConstraintInfo constraintInfo;

	/**
	 * 活动详细说明
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 活动的扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 活动名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 操作人id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 外部批次ID
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 营销工具集
	 */
	@ApiListField("promo_tools")
	@ApiField("promo_tool")
	private List<PromoTool> promoTools;

	/**
	 * 投放渠道集
	 */
	@ApiListField("publish_channels")
	@ApiField("publish_channel")
	private List<PublishChannel> publishChannels;

	/**
	 * 招商工具信息
	 */
	@ApiField("recruit_tool")
	private RecruitTool recruitTool;

	/**
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 活动类型
	 */
	@ApiField("type")
	private String type;

	public BudgetInfo getBudgetInfo() {
		return this.budgetInfo;
	}
	public void setBudgetInfo(BudgetInfo budgetInfo) {
		this.budgetInfo = budgetInfo;
	}

	public ConstraintInfo getConstraintInfo() {
		return this.constraintInfo;
	}
	public void setConstraintInfo(ConstraintInfo constraintInfo) {
		this.constraintInfo = constraintInfo;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<PromoTool> getPromoTools() {
		return this.promoTools;
	}
	public void setPromoTools(List<PromoTool> promoTools) {
		this.promoTools = promoTools;
	}

	public List<PublishChannel> getPublishChannels() {
		return this.publishChannels;
	}
	public void setPublishChannels(List<PublishChannel> publishChannels) {
		this.publishChannels = publishChannels;
	}

	public RecruitTool getRecruitTool() {
		return this.recruitTool;
	}
	public void setRecruitTool(RecruitTool recruitTool) {
		this.recruitTool = recruitTool;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
