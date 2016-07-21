package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户增加的自定义菜单内容
 *
 * @author auto create
 * @since 1.0, 2016-05-06 17:21:07
 */
public class PrizeCustomMenu extends AlipayObject {

	private static final long serialVersionUID = 3676561182865736597L;

	/**
	 * 菜单详情
	 */
	@ApiField("text")
	private String text;

	/**
	 * 菜单名称
	 */
	@ApiField("title")
	private String title;

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
