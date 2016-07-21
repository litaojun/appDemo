package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券不可用时间
 *
 * @author auto create
 * @since 1.0, 2016-06-16 16:42:50
 */
public class ForbbidenTime extends AlipayObject {

	private static final long serialVersionUID = 3471612575466526583L;

	/**
	 * 日期，格式说明：范围区间，区间之间用逗号分隔，多个区间之间用^分隔
	 */
	@ApiField("days")
	private String days;

	public String getDays() {
		return this.days;
	}
	public void setDays(String days) {
		this.days = days;
	}

}
