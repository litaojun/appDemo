package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 延迟生效信息
 *
 * @author auto create
 * @since 1.0, 2016-06-16 16:42:50
 */
public class DelayInfo extends AlipayObject {

	private static final long serialVersionUID = 8582496836817528796L;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 分钟
	 */
	@ApiField("value")
	private String value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
