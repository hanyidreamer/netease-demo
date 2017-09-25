package com.netease.haitao.thirdpart.newtest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import com.haitao.thirdpart.sdk.APIUtil;

/**
 * Created by hzzhaolong on 2016/4/13.
 */
public class ThirdpartOrderConfirmTest
{

	public static void main(String[] args) throws JSONException
	{
		String url = "http://test1.thirdpart.kaolatest.netease.com/api/orderConfirm";

		HttpPost httpRequst = new HttpPost(url);// 创建HttpPost对象

		long time = System.currentTimeMillis();
		String source = "1200";
		String sign_method = "md5";
		String appKey = "bb0b3ad64c9e5eb06c2fb6f163bf179e79051bd5c9b652fc45dc68a2b5dd23c6";
		String appSecret = "4ed8b056c32939b9fd66987470b3e9fb720bdded02197e678e516bdcdf810833";
		String goodsID = "26153046";
		String skuId = "26153046-2308c416091d831c0f3be7b9cd82af20";
		String accountId = "laotest1@163.com";

		TreeMap<String, String> parameterMap = new TreeMap<String, String>();
		parameterMap.put("timestamp", new Timestamp(time).toString());
		parameterMap.put("v", "1.0");
		parameterMap.put("sign_method", sign_method);
		parameterMap.put("app_key", appKey);
		parameterMap.put("source", source);

		List<Map<String, Object>> orderItemList = new ArrayList<Map<String, Object>>();
		// 构造商品信息
		Map<String, Object> orderItemMap = new HashMap<String, Object>();
		orderItemMap.put("goodsId", goodsID);
		orderItemMap.put("skuId", skuId);
		orderItemMap.put("buyAmount", 1);
		orderItemMap.put("channelSalePrice", 200);
		orderItemList.add(orderItemMap);
		JSONObject orderItemJsonObject = new JSONObject();
		orderItemJsonObject.put("orderItemList", orderItemList);
		parameterMap.put("orderItemList", orderItemJsonObject.toString());
		// 构造用户信息
		Map<String, Object> userInfoMap = new HashMap<String, Object>();
		userInfoMap.put("accountId", accountId);
		userInfoMap.put("name", "虞圆浩");
		userInfoMap.put("mobile", "13857479955");
		userInfoMap.put("email", "8545646@11.com");
		userInfoMap.put("provinceName", "浙江省");
		userInfoMap.put("cityName", "宁波市");
		userInfoMap.put("districtName", "北仑区");
		userInfoMap.put("address", "新碶街道北仑世茂世界湾二期3幢201室");
		userInfoMap.put("identityId", "330206198210113436"); // 一般贸易商品可不传
		JSONObject userInfoJsonObject = new JSONObject();
		userInfoJsonObject.put("userInfo", userInfoMap);
		parameterMap.put("userInfo", userInfoJsonObject.toString());

		String sign = APIUtil.createSign(appSecret, parameterMap);
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("timestamp", new Timestamp(time).toString()));
		params.add(new BasicNameValuePair("v", "1.0"));
		params.add(new BasicNameValuePair("sign_method", sign_method));
		params.add(new BasicNameValuePair("app_key", appKey));
		params.add(new BasicNameValuePair("sign", sign));
		params.add(new BasicNameValuePair("source", source));
		params.add(new BasicNameValuePair("orderItemList", orderItemJsonObject.toString()));
		params.add(new BasicNameValuePair("userInfo", userInfoJsonObject.toString()));

		try
		{
			httpRequst.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
			CloseableHttpClient httpclient = HttpClients.createDefault();
			CloseableHttpResponse httpResponse = httpclient.execute(httpRequst);
			System.out.println(httpResponse.getStatusLine().getStatusCode());
			HttpEntity httpEntity = httpResponse.getEntity();
			String result = EntityUtils.toString(httpEntity);// 取出应答字符串
			System.out.println("[Thirdpart Order][result] " + result);
			System.out.println("[Thirdpart Order][result] " + result);

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
