package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动基本信息
 *
 * @author auto create
 * @since 1.0, 2016-05-20 16:26:25
 */
public class CampBaseDto extends AlipayObject {

	private static final long serialVersionUID = 3195887775227194651L;

	/**
	 * 截至时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 活动id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 活动名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 启动时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 活动状态,CREATED:草稿，ENABLED：生效，DISABLED：无效，STARTED：启动，CLOSED：停止，FINISHED：完成
	 */
	@ApiField("status")
	private String status;

	/**
	 * 活动类型.DIRECT_SEND:直发奖,CONSUME_SEND:消费送
	 */
	@ApiField("type")
	private String type;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
