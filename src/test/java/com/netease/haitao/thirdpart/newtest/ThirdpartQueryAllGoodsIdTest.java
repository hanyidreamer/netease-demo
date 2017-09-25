/**
 * Copyright 2014-2015, NetEase, Inc. All Rights Reserved.
 * 
 * Date: 2016年4月15日
 */

package com.netease.haitao.thirdpart.newtest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;

import com.haitao.thirdpart.sdk.APIUtil;

/**
 * 
 * 
 * @author lianglihai<hzlianglihai@corp.netease.com>
 * @since 2016年4月15日
 */
public class ThirdpartQueryAllGoodsIdTest
{
	public static void main(String[] args) throws JSONException
	{
		// String url = "http://223.252.220.85/api/queryAllGoodsId";
		String url = "http://test1.thirdpart.kaolatest.netease.com/api/queryAllGoodsId";
		HttpPost httpRequst = new HttpPost(url);// 创建HttpPost对象

		long time = System.currentTimeMillis();
		String source = "1200";
		String sign_method = "md5";
		String appKey = "bb0b3ad64c9e5eb06c2fb6f163bf179e79051bd5c9b652fc45dc68a2b5dd23c6";
		String appSecret = "4ed8b056c32939b9fd66987470b3e9fb720bdded02197e678e516bdcdf810833";

		TreeMap<String, String> parameterMap = new TreeMap<String, String>();
		parameterMap.put("timestamp", new Timestamp(time).toString());
		parameterMap.put("v", "1.0");
		parameterMap.put("sign_method", sign_method);
		parameterMap.put("app_key", appKey);
		parameterMap.put("channelId", source);

		String sign = APIUtil.createSign(appSecret, parameterMap);
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("timestamp", new Timestamp(time).toString()));
		params.add(new BasicNameValuePair("v", "1.0"));
		params.add(new BasicNameValuePair("sign_method", sign_method));
		params.add(new BasicNameValuePair("app_key", appKey));
		params.add(new BasicNameValuePair("sign", sign));
		params.add(new BasicNameValuePair("channelId", source));

		try
		{
			httpRequst.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
			RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(10 * 1000).setConnectTimeout(5 * 1000).build();// 设置请求和传输超时时间
			httpRequst.setConfig(requestConfig);
			CloseableHttpClient httpclient = HttpClients.createDefault();
			CloseableHttpResponse httpResponse = httpclient.execute(httpRequst);
			System.out.println(httpResponse.getStatusLine().getStatusCode());
			HttpEntity httpEntity = httpResponse.getEntity();
			String result = EntityUtils.toString(httpEntity);// 取出应答字符串
			System.out.println("[Thirdpart ThirdpartQueryAllGoodsIdTest][result] " + result);
			System.out.println("[Thirdpart ThirdpartQueryAllGoodsIdTest][result] " + result);

		}
		catch (UnsupportedEncodingException e)
		{
			System.out.println("[Thirdpart Order][result] " + e);
		}
		catch (ClientProtocolException e)
		{
			System.out.println("[[Thirdpart Order][result] " + e);
		}
		catch (IOException e)
		{
			System.out.println("[[Thirdpart Order][result] " + e);
		}
		catch (Exception e)
		{
			System.out.println("[[Thirdpart Order][result] " + e);
		}
		System.out.println("end...");

	}
}
