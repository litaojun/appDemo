package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/oauth")
public class ResourceController {
	@RequestMapping("/getUserInfo")
	public String getUserInfo() {
		return "resource";
		
		
		
		
	}
	
	@RequestMapping("/getImage")
	public String getImage() {
		return "image";
	}
	
	@RequestMapping("/getXing")
	public String getXing() {
		return "xing";
	}
	
	@RequestMapping("/getTest")
	public String getTest() {
		return "litaojun";
	}
	
}
