package com.test;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.post.HttpRequest;

@Controller
@RequestMapping("/litaojun")
public class TestIndex {
	@RequestMapping("/testuser")
	public String getUserInfo() {
		return "litaojun";
	}
	
	@RequestMapping("/testapp")
	public String  testApp(@RequestParam(value="code")String code,Map<String,Object> map)
	{
		 String reqstr = "code="+code+"&client_id=m1&client_secret=s1&grant_type=authorization_code&redirect_uri=http%3a%2f%2flocalhost%3a8080%2fappDemo%2flitaojun%2ftestapp";
		 System.out.println("reqstr="+reqstr);
		 String sr=HttpRequest.sendPost("http://localhost:8080/appDemo/oauth/token", reqstr);
		 System.out.println("sr="+sr);
	     JSONObject data = JSON.parseObject(sr);
	     String accesstoken = data.getString("access_token");
	     String refreshtoken = data.getString("refresh_token");
	     String expiresin = data.getString("expires_in");
	     map.put("access_token", accesstoken);
	     map.put("refresh_token", refreshtoken);
	     map.put("expires_in", expiresin);
	     return "testapp";
	}
	@RequestMapping("/testindex")
	public String testIndex()
	{
		return "testapp";
	}
	
	@RequestMapping(value="/reg/{name:\\w+}-{age:\\d+}", method = {RequestMethod.GET})
	public ModelAndView regUrlTest(@PathVariable(value="name") String name, @PathVariable(value="age") Integer age)
	{
	    
	    ModelAndView modelAndView = new ModelAndView();   
	    modelAndView.addObject("name", name); 
	    modelAndView.addObject("age", age); 
	    modelAndView.setViewName("regurltest");  
	    return modelAndView;
	}
}
