package com.outh2.login.zfb;

import java.util.Date;
import java.util.HashMap;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.internal.util.RequestParametersHolder;

public class Outh2SignData {
	public String  app_id = "2016070801592904";
	public String method = "alipay.system.oauth.token";
	public String charset="GBK";
	public String sign_type="RSA";
	public String timestamp="";
	public String version = "1.0";
	public String grant_type = "authorization_code";
	public String  code = "";
	public String sign = null;
	public JSONObject biz_content = null;
	public String signCtt ;
	public Outh2SignData(String code) throws AlipayApiException
	{
		this.code = code;
		Date a = new Date();
		this.setTimestamp(a);
		this.sign();
	}
	public void setTimestamp(Date a)
	{
		this.timestamp = DateFormatTran.dateTranFormatString(a, "yyyy-MM-dd HH:mm:ss");
		System.out.println(this.timestamp);
	}
	public void sign() throws AlipayApiException
	{
		
//		String prikey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBANhAlmiZohWFdWsp\r\n"+
//				"xWLj+95w4H9F1PCZy3HbkinZEnUWeF8Ip2kbRaX4pLcEC4wy0QHhFPZWcy/0PbTx\r\n"+
//				"d6qhnReOKVu92GwIn8GxVW5KYBxd5OtDugvxrNPJtEcGLeUmen1k5ZFtr3HARPj9\r\n"+
//				"0sy0prYBE1XVn3y78RlCoUqAqrTbAgMBAAECgYEApaXr0NoGP0gIpnrLuTF76Gs8\r\n"+
//				"fCFouJiGL4QK1UVzDv+UWu+NFUUPt8/blFlj4xO16COa5AtalpwXfHgOu0SqyEzO\r\n"+
//				"pMYoRxAgpT3M+uoO5i2PShOyn7LrEezjLnFi5lKnygiN5cdFKQ2qEPj35GdHXcO3\r\n"+
//				"T87iuIZQ4EfLz+Xf0LECQQDwjrk3b+jqV50aFgwTDUuCGjbyRS3sGNcuQMMIaj9O\r\n"+
//				"vos2AkMVEGj6uUGgm52SkigIbySCJxO77JCWWP9AaShZAkEA5iJvyobwlQPUAZi2\r\n"+
//				"io75NBZXjaHT2cJeFExzpPw9C49Pyv0zGUPuF4uMwfOnlmlIVQIbhQOvhAlgF8Ob\r\n"+
//				"RNOgUwJASQaatXiUlWdJetzMh5AWpwU8Pum/WhfkYtcoHcrbMxVm/1tKb/+OTuak\r\n"+
//				"RJRZDmCuJHlQ9O3V8MuMzQdxXWVO6QJAfS+KZD8XK9hTQTMTSTgQ83ab1d2L4k7K\r\n"+
//				"4nvcBIl5o4onu6IUY9AB+ijdPrwOE9HdmPB2i9q/ZTG8ZfDvy3bbJQJBALIi4mG8\r\n"+
//				"PXrqKw6lZbCcw9Ajf7jYA+zyIRwAf+Tgq1JtPDgeZmP1GFJUakoGjrWyPM868SxO\r\n" +
//				"H5nEq2WPqvmjKH8=";
//		String prikey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBANhAlmiZohWFdWsp\n"+
//				"xWLj+95w4H9F1PCZy3HbkinZEnUWeF8Ip2kbRaX4pLcEC4wy0QHhFPZWcy/0PbTx\n"+
//				"d6qhnReOKVu92GwIn8GxVW5KYBxd5OtDugvxrNPJtEcGLeUmen1k5ZFtr3HARPj9\n"+
//				"0sy0prYBE1XVn3y78RlCoUqAqrTbAgMBAAECgYEApaXr0NoGP0gIpnrLuTF76Gs8\n"+
//				"fCFouJiGL4QK1UVzDv+UWu+NFUUPt8/blFlj4xO16COa5AtalpwXfHgOu0SqyEzO\n"+
//				"pMYoRxAgpT3M+uoO5i2PShOyn7LrEezjLnFi5lKnygiN5cdFKQ2qEPj35GdHXcO3\n"+
//				"T87iuIZQ4EfLz+Xf0LECQQDwjrk3b+jqV50aFgwTDUuCGjbyRS3sGNcuQMMIaj9O\n"+
//				"vos2AkMVEGj6uUGgm52SkigIbySCJxO77JCWWP9AaShZAkEA5iJvyobwlQPUAZi2\n"+
//				"io75NBZXjaHT2cJeFExzpPw9C49Pyv0zGUPuF4uMwfOnlmlIVQIbhQOvhAlgF8Ob\n"+
//				"RNOgUwJASQaatXiUlWdJetzMh5AWpwU8Pum/WhfkYtcoHcrbMxVm/1tKb/+OTuak\n"+
//				"RJRZDmCuJHlQ9O3V8MuMzQdxXWVO6QJAfS+KZD8XK9hTQTMTSTgQ83ab1d2L4k7K\n"+
//				"4nvcBIl5o4onu6IUY9AB+ijdPrwOE9HdmPB2i9q/ZTG8ZfDvy3bbJQJBALIi4mG8\n"+
//				"PXrqKw6lZbCcw9Ajf7jYA+zyIRwAf+Tgq1JtPDgeZmP1GFJUakoGjrWyPM868SxO\n" +
//				"H5nEq2WPqvmjKH8=";
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
//		RequestParametersHolder a = new RequestParametersHolder();
//		AlipayHashMap ahm = this.getAlipayHashMap();
//		a.setApplicationParams(ahm);
		AlipaySignature ast = new AlipaySignature();
//		String signContent = ast.getSignatureContent(a);
//		ast.rsaSign(this.getHashMap(), prikey, this.charset);
//		this.signCtt = signContent;
//		System.out.println("signContent="+signContent);
		//String sign = ast.rsaSign(signContent,prikey , this.charset);
		String sign = ast.rsaSign(this.getHashMap(), prikey, this.charset);
		System.out.println("sign="+sign);
		this.sign = sign;
	}
	public AlipayHashMap getAlipayHashMap()
	{
		AlipayHashMap ahm = new AlipayHashMap();
		ahm.put("app_id", this.app_id);
		ahm.put("method", this.method);
		ahm.put("charset", this.charset);
		ahm.put("timestamp", this.timestamp);
		ahm.put("version", this.version);
		ahm.put("grant_type", this.grant_type);
		ahm.put("code", this.code);
		//ahm.put("sign_type", this.sign_type);
		return ahm;
	}
	public HashMap<String,String> getHashMap()
	{
		HashMap<String,String> ahm = new HashMap<String,String>();
		ahm.put("app_id", this.app_id);
		ahm.put("method", this.method);
		ahm.put("charset", this.charset);
		ahm.put("timestamp", this.timestamp);
		ahm.put("version", this.version);
		ahm.put("grant_type", this.grant_type);
		ahm.put("code", this.code);
		//ahm.put("sign_type", this.sign_type);
		return ahm;
		
		
	}
	public String tranUrl()
	{
		String url = null;
		url = "app_id="+this.app_id +"&method="+this.method +"&charset="+this.charset+"&sign_type="+this.sign_type + "&timestamp="+this.timestamp +"&version="+this.version +"&grant_type="+this.grant_type +"&code="+this.code + "&sign="+ this.sign;
		System.out.println("url="+url);
		return url;
	}
}
