package com.springmvc.json;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import com.microsoft.aad.adal4jsample.User;

@Controller
@RequestMapping(value = "/test")  
public class SpringJson {
	
    @ResponseBody  
    @RequestMapping(value = "/xinwen.do")  
    public ModelAndView ajaxLogin(HttpServletRequest request, HttpSession session){  
        String errorMessage="0";
        Map map=new HashMap();  
        if("0".equals(errorMessage)){  
            map.put("result", "success");  
        }else{  
            map.put("result", "failed");  
        }  
        map.put("error", errorMessage);  
        map.put("message","都是错误");
        //model.addAttribute("user", null);  
        MappingJacksonJsonView view = new MappingJacksonJsonView();
        view.setContentType("application/json;charset=UTF-8");
        return new ModelAndView(new MappingJacksonJsonView(),map);  
    }   

}
