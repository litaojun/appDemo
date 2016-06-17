package com.microsoft.aad.adal4jsample;

import java.io.IOException;  
import java.nio.charset.Charset;  
  
import org.apache.commons.logging.Log;  
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;  
import org.apache.http.HttpStatus;  
import org.apache.http.client.HttpClient;  
import org.apache.http.client.methods.HttpPost;  
import org.apache.http.entity.StringEntity;  
import org.apache.http.impl.client.DefaultHttpClient;  
import org.apache.http.util.EntityUtils;


import com.google.gson.JsonArray;  
import com.google.gson.JsonObject;  
  
public class APIHttpClient {  
  
    // �ӿڵ�ַ  
    private static String apiURL = "http://192.168.3.67:8080/lkgst_manager/order/order";  
    private Log logger = LogFactory.getLog(this.getClass());  
    private static final String pattern = "yyyy-MM-dd HH:mm:ss:SSS";  
    private HttpClient httpClient = null;  
    private HttpPost method = null;  
    private long startTime = 0L;  
    private long endTime = 0L;  
    private int status = 0;  
  
    /** 
     * �ӿڵ�ַ 
     *  
     * @param url 
     */  
    public APIHttpClient(String url) {  
  
        if (url != null) {  
            this.apiURL = url;  
        }  
        if (apiURL != null) {  
            httpClient = new DefaultHttpClient();  
            method = new HttpPost(apiURL);  
  
        }  
    }  
  
    /** 
     * ���� API 
     *  
     * @param parameters 
     * @return 
     */  
    public String post(String parameters) {  
        String body = null;  
        logger.info("parameters:" + parameters);  
  
        if (method != null & parameters != null  
                && !"".equals(parameters.trim())) {  
            try {  
  
                // ����һ��NameValuePair���飬���ڴ洢�����͵Ĳ���  
                method.addHeader("Content-type","application/json; charset=utf-8");  
                method.setHeader("Accept", "application/json");  
                //method.setEntity(new StringEntity(parameters, Charset.forName("UTF-8"))); 
                method.setEntity(new StringEntity(new String(parameters.getBytes(), Charset.forName("UTF-8"))));  
                startTime = System.currentTimeMillis();  
  
                HttpResponse response = httpClient.execute(method);  
                  
                endTime = System.currentTimeMillis();  
                int statusCode = response.getStatusLine().getStatusCode();  
                  
                logger.info("statusCode:" + statusCode);  
                logger.info("����API ����ʱ��(��λ������)��" + (endTime - startTime));  
                if (statusCode != HttpStatus.SC_OK) {  
                    logger.error("Method failed:" + response.getStatusLine());  
                    status = 1;  
                }  
  
                // Read the response body  
                body = EntityUtils.toString(response.getEntity());  
  
            } catch (IOException e) {  
                // �������  
                status = 3;  
            } finally {  
                logger.info("���ýӿ�״̬��" + status);  
            }  
  
        }  
        return body;  
    }  
  
    public static void main(String[] args) {  
        APIHttpClient ac = new APIHttpClient(apiURL);  
        JsonArray arry = new JsonArray();  
        JsonObject j = new JsonObject();  
        j.addProperty("orderId", "����");  
        j.addProperty("createTimeOrder", "2015-08-11");  
        arry.add(j);  
        System.out.println(ac.post(arry.toString()));  
    }  
  
    /** 
     * 0.�ɹ� 1.ִ�з���ʧ�� 2.Э����� 3.������� 
     *  
     * @return the status 
     */  
    public int getStatus() {  
        return status;  
    }  
  
    /** 
     * @param status 
     *            the status to set 
     */  
    public void setStatus(int status) {  
        this.status = status;  
    }  
  
    /** 
     * @return the startTime 
     */  
    public long getStartTime() {  
        return startTime;  
    }  
  
    /** 
     * @return the endTime 
     */  
    public long getEndTime() {  
        return endTime;  
    }  
}  
