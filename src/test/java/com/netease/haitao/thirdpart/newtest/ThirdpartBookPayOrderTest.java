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
 * 
 * 
 * @author lianglihai<hzlianglihai@corp.netease.com>
 * @since 2016年4月15日
 */
public class ThirdpartBookPayOrderTest
{

	public static void main(String[] args) throws JSONException
	{
		// 参数配置;
		String url = "http://test1.thirdpart.kaolatest.netease.com/api/bookpayorder";
		String appKey = "bb0b3ad64c9e5eb06c2fb6f163bf179e79051bd5c9b652fc45dc68a2b5dd23c6";
		String secretKey = "4ed8b056c32939b9fd66987470b3e9fb720bdded02197e678e516bdcdf810833";
		String goodsId = "425607";
		String skuId = "425607-de5a7e0b3aeb0bfbdbd3cc6b5f4dece7";
		String accountId = "testfoip299@163.com";
		long time = System.currentTimeMillis();
		String thirdPartOrderId = "20161zhaolong004";
		String source = "1200";

		// 创建HttpPost对象;
		HttpPost httpRequst = new HttpPost(url);
		TreeMap<String, String> parameterMap = new TreeMap<String, String>();
		parameterMap.put("timestamp", new Timestamp(time).toString());
		parameterMap.put("v", "1.0");
		parameterMap.put("sign_method", "md5");
		parameterMap.put("app_key", appKey);
		parameterMap.put("source", source);
		List<Map<String, Object>> orderItemList = new ArrayList<Map<String, Object>>();
		parameterMap.put("thirdPartOrderId", thirdPartOrderId);
		// 构造商品信息
		Map<String, Object> orderItemMap = new HashMap<String, Object>();
		orderItemMap.put("goodsId", goodsId);
		orderItemMap.put("skuId", skuId);
		orderItemMap.put("buyAmount", 1);
		orderItemMap.put("channelSalePrice", 130);
		orderItemMap.put("warehouseId", 2);
		orderItemList.add(orderItemMap);
		JSONObject orderItemJsonObject = new JSONObject();
		orderItemJsonObject.put("orderItemList", orderItemList);
		parameterMap.put("orderItemList", orderItemJsonObject.toString());
		// 构造用户信息
		Map<String, Object> userInfoMap = new HashMap<String, Object>();
		userInfoMap.put("accountId", accountId);
		userInfoMap.put("name", "肖凡");
		userInfoMap.put("mobile", "13588065935");
		userInfoMap.put("email", "494153456@qq.com");
		userInfoMap.put("provinceName", "北京");
		userInfoMap.put("cityName", "北京市");
		userInfoMap.put("districtName", "海淀区");
		userInfoMap.put("address", "网商路599号");
		userInfoMap.put("identityId", "429004198708222935");
		JSONObject userInfoJsonObject = new JSONObject();
		userInfoJsonObject.put("userInfo", userInfoMap);
		parameterMap.put("userInfo", userInfoJsonObject.toString());

		String sign = APIUtil.createSign(secretKey, parameterMap);

		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("timestamp", new Timestamp(time).toString()));
		params.add(new BasicNameValuePair("v", "1.0"));
		params.add(new BasicNameValuePair("sign_method", "md5"));
		params.add(new BasicNameValuePair("app_key", appKey));
		params.add(new BasicNameValuePair("sign", sign));
		params.add(new BasicNameValuePair("source", source));
		params.add(new BasicNameValuePair("thirdPartOrderId", thirdPartOrderId));
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
