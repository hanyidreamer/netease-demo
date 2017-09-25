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
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;

import com.haitao.thirdpart.sdk.APIUtil;

/**
 * 
 * 
 * @author lianglihai<hzlianglihai@corp.netease.com>
 * @since 2016年4月15日
 */
@SuppressWarnings("deprecation")
public class ThirdpartQueryOrderStatus
{

	public static void main(String[] args) throws JSONException
	{
		String url = "http://test1.thirdpart.kaolatest.netease.com/api/queryOrderStatus";
		HttpPost httpRequst = new HttpPost(url);// 创建HttpPost对象

		String thirdPartOrderId = "20161zhaolong004";
		String source = "1200";
		String appKey = "bb0b3ad64c9e5eb06c2fb6f163bf179e79051bd5c9b652fc45dc68a2b5dd23c6";
		String appSecret = "4ed8b056c32939b9fd66987470b3e9fb720bdded02197e678e516bdcdf810833";

		long time = System.currentTimeMillis();
		TreeMap<String, String> parameterMap = new TreeMap<String, String>();
		parameterMap.put("thirdPartOrderId", thirdPartOrderId);
		parameterMap.put("channelId", source);
		parameterMap.put("timestamp", new Timestamp(time).toString());
		parameterMap.put("v", "1.0");
		parameterMap.put("sign_method", "md5");
		parameterMap.put("app_key", appKey);

		String sign = APIUtil.createSign(appSecret, parameterMap);

		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("thirdPartOrderId", thirdPartOrderId));
		params.add(new BasicNameValuePair("timestamp", new Timestamp(time).toString()));
		params.add(new BasicNameValuePair("v", "1.0"));
		params.add(new BasicNameValuePair("sign_method", "md5"));
		params.add(new BasicNameValuePair("app_key", appKey));
		params.add(new BasicNameValuePair("sign", sign));
		params.add(new BasicNameValuePair("channelId", source));

		try
		{
			httpRequst.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
			HttpResponse httpResponse = new DefaultHttpClient().execute(httpRequst);
			System.out.println(httpResponse.getStatusLine().getStatusCode());
			HttpEntity httpEntity = httpResponse.getEntity();
			String result = EntityUtils.toString(httpEntity);// 取出应答字符串

			System.out.println("[Thirdpart Order][reslut] " + result);
			System.out.println("[Thirdpart Order][reslut] " + result);

		}
		catch (UnsupportedEncodingException e)
		{
			System.out.println("[Thirdpart Order][reslut] " + e);
		}
		catch (ClientProtocolException e)
		{
			System.out.println("[[Thirdpart Order][reslut] " + e);
		}
		catch (IOException e)
		{
			System.out.println("[[Thirdpart Order][reslut] " + e);
		}
		catch (Exception e)
		{
			System.out.println("[[Thirdpart Order][reslut] " + e);
		}
		System.out.println("end...");

	}
}
