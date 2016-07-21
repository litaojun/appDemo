package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券可用时间
 *
 * @author auto create
 * @since 1.0, 2016-06-16 17:44:01
 */
public class UseTime extends AlipayObject {

	private static final long serialVersionUID = 4131576114478165239L;

	/**
	 * 可用时间的维度
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 可用时间的时分秒时间段
	 */
	@ApiField("times")
	private String times;

	/**
	 * 维度所对应的值
	 */
	@ApiField("values")
	private String values;

	public String getDimension() {
		return this.dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getTimes() {
		return this.times;
	}
	public void setTimes(String times) {
		this.times = times;
	}

	public String getValues() {
		return this.values;
	}
	public void setValues(String values) {
		this.values = values;
	}

}
