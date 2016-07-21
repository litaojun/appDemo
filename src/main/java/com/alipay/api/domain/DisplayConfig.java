package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券的描述信息
 *
 * @author auto create
 * @since 1.0, 2016-06-16 16:42:50
 */
public class DisplayConfig extends AlipayObject {

	private static final long serialVersionUID = 7166132551571422445L;

	/**
	 * 券的宣传语
	 */
	@ApiField("slogan")
	private String slogan;

	/**
	 * 券的宣传图片
	 */
	@ApiField("slogan_img")
	private String sloganImg;

	public String getSlogan() {
		return this.slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String getSloganImg() {
		return this.sloganImg;
	}
	public void setSloganImg(String sloganImg) {
		this.sloganImg = sloganImg;
	}

}
