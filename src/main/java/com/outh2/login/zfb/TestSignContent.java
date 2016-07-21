package com.outh2.login.zfb;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;

public class TestSignContent {
	
	public static void main(String[] args) throws AlipayApiException
	{
		String prikey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKcKOF2czZVs3C+L"+
				"8hehBzasTKDDs3/WqrtVkIWeGI4rZxW0Df2u4KjRImXaY/Z4oQA/KIEY87zhF4hk"+
				"ailqCqlm5JryNyEsIXV0wNGilupvqzOJ2iCQXpC/GntVoJ/ipeQmfORhulEgMBWS"+
				"KDnbudIxoxeOnh0v9oX6F4mme8xpAgMBAAECgYEAn+sp8X2IWPFCkAakPLj+pfoo"+
				"1pTlyZMkG3uchD/KdHnbFC0wY9nD3ftyuh5uK25rfUf6KDZSS1cYZ4zzEjkigGWV"+
				"Op+zyVkNDVPtRqT+HH+NXVIcQAqGh9GASRBO7LCoNWGZC8ibckOFhrp85hGqYFFG"+
				"RmbKqtypV6O7NWGhvo0CQQDbAZ/jyTDDNnDkhVTS2dgyChf/jnrPKlakSnOVRI89"+
				"N81fM4BAkJ8lzMoMkGfK4XUF22ZdJ8IxGjxjdOluJyMvAkEAw0FwZ8uFWg+FcVjs"+
				"Y87F4Nbkd/tEpwcRDeo10FAhcRcoTa441BaRbUgClt+7D0fZg7y54B7Vd7ix+GI6"+
				"hfaD5wJATxM8FvP6zlFm26wkn2kWvaKVXamlQA3KcNGNADVb/r+aQKiIw0c0n2Jd"+
				"BcJSJ5fWOAIq6LHFVRNjAIojCqnI8wJANl6ddzmTy20xAkv5nx0vupj8C3DbQAtW"+
				"s2I5U+VMOppxLZhK2LvkCOMZXXu1Md8W8Xj25TKQzIKQhBKOK0lmlwJASuu8MtEX"+
				"RhT/pheJsx77vQeupbzl5H8Lhraf9JnrCmiMoP6UL1QtozdOg2lp17ZrxQsX/1XI" +
				"5CGRgnkA/qiXsA==";
		AlipaySignature a  = new AlipaySignature();
		String content = "app_id=2016052001423370&charset=GBK&code=bfafcb0ff3584040aa5ada9dd1cd5X04&grant_type=authorization_code&method=alipay.system.oauth.token&sign_type=RSA&timestamp=2016-07-07 14:35:52&version=1.0";
		//String content1 = "charset=GBK&app_id=2016052001423370&code=c2f1f78abb8f4d49a034fb0a8f68cX04&grant_type=authorization_code&method=alipay.system.oauth.token&sign_type=RSA&timestamp=2016-07-07 10:58:09&version=1.0";
		//String content = "a=123";
		String sign = "PVtw/8nHtXWv+Hud2YdN8QtlaY2Cs3KA8smZ+aGTsmN7yxE/DYuySkFG/f90IPJAYmqFZ3HltjIxroz/+cJGEn3rVdqvuJFADc8mE7FoAKwU2XVyWGt8/kL1LmV6yVDBpZB3oMY4CpGmaJDRC1IhnXTBcAHD6/aWh7+J5rSNJjA=";
		String publickey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnCjhdnM2VbNwvi/IXoQc2rEygw7N/1qq7VZCFnhiOK2cVtA39ruCo0SJl2mP2eKEAPyiBGPO84ReIZGopagqpZuSa8jchLCF1dMDRopbqb6szidogkF6Qvxp7VaCf4qXkJnzkYbpRIDAVkig527nSMaMXjp4dL/aF+heJpnvMaQIDAQAB";
		//String sb = a.rsaSign(content, prikey, "GBK", "RSA");
		boolean t = a.rsaCheckContent(content, sign, publickey, "GBK");
		//System.out.println(sb);
		System.out.println(t);

	}

}
