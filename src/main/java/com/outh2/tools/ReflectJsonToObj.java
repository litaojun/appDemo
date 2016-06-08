package com.outh2.tools;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class ReflectJsonToObj 
{
	  private String retdata;
	  private String[] jsondata;
	  private Class cls;
	  private Map<String,Method> methodmap =new HashMap<String,Method>();
	  private Object obj;
       public ReflectJsonToObj(String retstr,String jsonstr,String clastr) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
       {
    	   this.retdata = retstr;
    	   this.jsondata = jsonstr.split(",");
    	   this.cls = Class.forName(clastr);
    	   this.obj = this.cls.newInstance();
    	   this.init();
       }
       public void init() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
       {
    	   JSONObject data = JSON.parseObject(this.retdata);
    	   
    	   for(String b : this.jsondata)
    	   {
    		   String a =  "set"+b.substring(0, 1).toUpperCase() + b.substring(1,b.length()); 
    		   Method cur = this.cls.getMethod(a, String.class);
    		   methodmap.put(b, cur);
    		   cur.invoke(this.obj, new String[]{data.getString(b)});
    	   }
       }
       public Object getObj()
       {
    	   return this.obj;
       }
       
       public static void main(String[] args)
       {
    	   String a = "litaojun";
    	   String b =  a.substring(0, 1).toUpperCase() + a.substring(1,a.length());
    	   System.out.println(b);
       }
       

}
