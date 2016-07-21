package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑业务授权令牌查询
 *
 * @author auto create
 * @since 1.0, 2016-06-16 17:11:13
 */
public class KoubeiMemberDataOauthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7676879182978426527L;

	/**
	 * 授权业务类型
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 授权码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

}
