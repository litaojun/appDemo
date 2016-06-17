package com.microsoft.aad.adal4jsample;

import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class InterfaceTools {
	public static JSONObject getDataFromGraph(String urlstr,String accessToken, String tenant) throws Exception {
        URL url = new URL(String.format(urlstr, tenant,accessToken));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        // Set the appropriate header fields in the request header.
        conn.setRequestProperty("api-version", "2013-04-05");
        conn.setRequestProperty("Authorization", accessToken);
        conn.setRequestProperty("Accept", "application/json;odata=minimalmetadata");
        String goodRespStr = HttpClientHelper.getResponseStringFromConn(conn, true);
        // logger.info("goodRespStr ->" + goodRespStr);
        int responseCode = conn.getResponseCode();
        JSONObject response = HttpClientHelper.processGoodRespStr(responseCode, goodRespStr);
        return response;
    }
	
//	public static void httpPostWithJSON(String url, String json) throws Exception {
//        // 将JSON进行UTF-8编码,以便传输中文
//        String encoderJson = URLEncoder.encode(json, HTTP.UTF_8);
//        
//        DefaultHttpClient httpClient = new DefaultHttpClient();
//        HttpPost httpPost = new HttpPost(url);
//        httpPost.addHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON);
//        
//        StringEntity se = new StringEntity(encoderJson);
//        se.setContentType(CONTENT_TYPE_TEXT_JSON);
//        se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON));
//        httpPost.setEntity(se);
//        httpClient.execute(httpPost);
//    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
