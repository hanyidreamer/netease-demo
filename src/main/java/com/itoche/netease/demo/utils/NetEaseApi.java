package com.itoche.netease.demo.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.alibaba.fastjson.JSON;
import com.haitao.thirdpart.sdk.APIUtil;
import com.itoche.netease.demo.bean.OrderItemForBookPayOrder;
import com.itoche.netease.demo.bean.OrderItemForOrderConfirm;
import com.itoche.netease.demo.bean.in.BookPayOrderIn;
import com.itoche.netease.demo.bean.in.OrderConfirmIn;
import com.itoche.netease.demo.bean.out.BookPayOrderOut;
import com.itoche.netease.demo.bean.out.GoodsIdAndSkuIdOut;
import com.itoche.netease.demo.bean.out.GoodsInfoOut;
import com.itoche.netease.demo.bean.out.GoodsSkuIdOut;
import com.itoche.netease.demo.bean.out.OrderFormOut;
import com.itoche.netease.demo.bean.out.QueryOrderStatusOut;
import com.itoche.netease.demo.common.APIUrlConst;
import com.itoche.netease.demo.common.Const;

/**
 * @description:
 * @projectName: netease-demo
 * @className: NetEaseApi.java
 * @author: hy.zhang
 * @createTime: 2017年9月25日 下午1:59:00
 * @version 1.0
 */
public class NetEaseApi
{

	/**
	 * @description: 所有商品SkuID查询
	 * https://github.com/kaola-thirdpart/netease-kaola-thirdpart/wiki/所有商品SkuID查询
	 * @return
	 * @author: hy.zhang
	 * @createTime: 2017年9月25日 下午1:59:05
	 */
	public GoodsSkuIdOut queryAllGoodsId()
	{
		GoodsSkuIdOut goodsSkuIdResultOut = null;
		String url = APIUrlConst.getApiQueryAllGoodsId();
		HttpPost httpRequst = new HttpPost(url);	// 创建HttpPost对象

		long time = System.currentTimeMillis();
		String source = Const.getAppSource();
		String sign_method = Const.getAppSingMethod();
		String appKey = Const.getAppKey();
		String appSecret = Const.getAppSecret();

		TreeMap<String, String> parameterMap = new TreeMap<String, String>();
		parameterMap.put("timestamp", new Timestamp(time).toString());
		parameterMap.put("v", Const.getApiVersion());
		parameterMap.put("sign_method", sign_method);
		parameterMap.put("app_key", appKey);
		parameterMap.put("channelId", source);

		String sign = APIUtil.createSign(appSecret, parameterMap);
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("timestamp", new Timestamp(time).toString()));
		params.add(new BasicNameValuePair("v", Const.getApiVersion()));
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

			goodsSkuIdResultOut = JSON.parseObject(result, GoodsSkuIdOut.class);

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

		return goodsSkuIdResultOut;
	}

	/**
	 * @description: 查询渠道下所有的goodsId和对应的skuId
	 * https://github.com/kaola-thirdpart/netease-kaola-thirdpart/wiki/查询渠道下所有的goodsId和对应的skuId
	 * @return GoodsIdAndSkuIdOut
	 * @author: hy.zhang
	 * @createTime: 2017年9月25日 下午2:30:26
	 */
	public GoodsIdAndSkuIdOut queryAllGoodsIdAndSkuId()
	{
		GoodsIdAndSkuIdOut goodsIdAndSkuIdOut = null;
		String url = APIUrlConst.getApiQueryAllGoodsIdAndSkuId();
		HttpPost httpRequst = new HttpPost(url);// 创建HttpPost对象

		long time = System.currentTimeMillis();
		String source = Const.getAppSource();
		String sign_method = Const.getAppSingMethod();
		String appKey = Const.getAppKey();
		String appSecret = Const.getAppSecret();

		TreeMap<String, String> parameterMap = new TreeMap<String, String>();
		parameterMap.put("timestamp", new Timestamp(time).toString());
		parameterMap.put("v", Const.getApiVersion());
		parameterMap.put("sign_method", sign_method);
		parameterMap.put("app_key", appKey);
		parameterMap.put("channelId", source);

		String sign = APIUtil.createSign(appSecret, parameterMap);
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("timestamp", new Timestamp(time).toString()));
		params.add(new BasicNameValuePair("v", Const.getApiVersion()));
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
			System.out.println("[Thirdpart queryAllGoodsIdAndSkuId][result] " + result);
			System.out.println("[Thirdpart queryAllGoodsIdAndSkuId][result] " + result);

			// meg转换为msg
			goodsIdAndSkuIdOut = JSON.parseObject(result, GoodsIdAndSkuIdOut.class);
			if (goodsIdAndSkuIdOut != null && (goodsIdAndSkuIdOut.getRecMsg() == null || goodsIdAndSkuIdOut.getRecMsg() == ""))
			{
				goodsIdAndSkuIdOut.setRecMsg(goodsIdAndSkuIdOut.getRecMeg());
			}
		}
		catch (UnsupportedEncodingException e)
		{
			System.out.println("[Thirdpart Order][result] " + e);
		}
		catch (ClientProtocolException e1)
		{
			System.out.println("[[Thirdpart Order][result] " + e1);
		}
		catch (IOException e2)
		{
			System.out.println("[[Thirdpart Order][result] " + e2);
		}
		catch (Exception e3)
		{
			System.out.println("[[Thirdpart Order][result] " + e3);
		}
		System.out.println("end...");

		return goodsIdAndSkuIdOut;
	}

	/**
	 * @description: 单个商品详情查询
	 * https://github.com/kaola-thirdpart/netease-kaola-thirdpart/wiki/单个商品详情查询
	 * @param skuId
	 * @param channelSalePrice
	 * @param queryType
	 * @return 
	 * @author: hy.zhang
	 * @createTime: 2017年9月25日 下午2:49:14
	 */
	public GoodsInfoOut queryGoodsInfoById(String skuId, String channelSalePrice, Integer queryType)
	{
		GoodsInfoOut goodsInfoOut = null;
		String url = APIUrlConst.getApiQueryGoodsInfoById();
		HttpPost httpRequst = new HttpPost(url);// 创建HttpPost对象

		long time = System.currentTimeMillis();
		String source = Const.getAppSource();
		String sign_method = Const.getAppSingMethod();
		String appKey = Const.getAppKey();
		String appSecret = Const.getAppSecret();
		// Integer queryType = 0;

		TreeMap<String, String> parameterMap = new TreeMap<String, String>();
		parameterMap.put("timestamp", new Timestamp(time).toString());
		parameterMap.put("v", Const.getApiVersion());
		parameterMap.put("sign_method", sign_method);
		parameterMap.put("app_key", appKey);
		parameterMap.put("channelId", source);
		parameterMap.put("queryType", queryType.toString());
		parameterMap.put("skuId", skuId);
		parameterMap.put("channelSalePrice", channelSalePrice);

		String sign = APIUtil.createSign(appSecret, parameterMap);
		List<NameValuePair> params = new ArrayList<NameValuePair>();

		params.add(new BasicNameValuePair("timestamp", new Timestamp(time).toString()));
		params.add(new BasicNameValuePair("v", Const.getApiVersion()));
		params.add(new BasicNameValuePair("sign_method", sign_method));
		params.add(new BasicNameValuePair("app_key", appKey));
		params.add(new BasicNameValuePair("sign", sign));
		params.add(new BasicNameValuePair("channelId", source));
		params.add(new BasicNameValuePair("queryType", queryType.toString()));
		params.add(new BasicNameValuePair("skuId", skuId));
		params.add(new BasicNameValuePair("channelSalePrice", channelSalePrice));

		try
		{
			httpRequst.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
			CloseableHttpClient httpclient = HttpClients.createDefault();
			CloseableHttpResponse httpResponse = httpclient.execute(httpRequst);
			System.out.println(httpResponse.getStatusLine().getStatusCode());
			HttpEntity httpEntity = httpResponse.getEntity();
			String result = EntityUtils.toString(httpEntity);// 取出应答字符串
			System.out.println("[Thirdpart queryGoodsInfoById][result] " + result);
			System.out.println("[Thirdpart queryGoodsInfoById][result] " + result);

			goodsInfoOut = JSON.parseObject(result, GoodsInfoOut.class);
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

		return goodsInfoOut;
	}

	/**
	 * @description: 订单确认（分销2.0）
	 * https://github.com/kaola-thirdpart/netease-kaola-thirdpart/wiki/订单确认（分销2.0）
	 * @param orderConfirmIn
	 * @return OrderFormOut
	 * @author: hy.zhang
	 * @createTime: 2017年9月25日 下午4:45:03
	 */
	public OrderFormOut orderConfirm(OrderConfirmIn orderConfirmIn)
	{
		OrderFormOut orderFormOut = null;
		String url = APIUrlConst.getApiOrderConfirm();

		HttpPost httpRequst = new HttpPost(url);// 创建HttpPost对象

		long time = System.currentTimeMillis();
		String source = Const.getAppSource();
		String sign_method = Const.getAppSingMethod();
		String appKey = Const.getAppKey();
		String appSecret = Const.getAppSecret();

		TreeMap<String, String> parameterMap = new TreeMap<String, String>();
		parameterMap.put("timestamp", new Timestamp(time).toString());
		parameterMap.put("v", Const.getApiVersion());
		parameterMap.put("sign_method", sign_method);
		parameterMap.put("app_key", appKey);
		parameterMap.put("source", source);

		List<Map<String, Object>> orderItemList = new ArrayList<Map<String, Object>>();
		// 构造商品信息
		for (OrderItemForOrderConfirm orderItem : orderConfirmIn.getOrderItemList())
		{
			Map<String, Object> orderItemMap = new HashMap<String, Object>();
			orderItemMap.put("goodsId", orderItem.getGoodsId());
			orderItemMap.put("skuId", orderItem.getSkuId());
			orderItemMap.put("buyAmount", orderItem.getBuyAmount());
			orderItemMap.put("channelSalePrice", orderItem.getChannelSalePrice());
			orderItemList.add(orderItemMap);
		}
		JSONObject orderItemJsonObject = new JSONObject();
		orderItemJsonObject.put("orderItemList", orderItemList);
		parameterMap.put("orderItemList", orderItemJsonObject.toString());
		// 构造用户信息
		Map<String, Object> userInfoMap = new HashMap<String, Object>();
		userInfoMap.put("accountId", orderConfirmIn.getUserInfo().getAccountId());
		userInfoMap.put("name", orderConfirmIn.getUserInfo().getName());
		userInfoMap.put("mobile", orderConfirmIn.getUserInfo().getMobile());
		userInfoMap.put("email", orderConfirmIn.getUserInfo().getEmail());
		userInfoMap.put("provinceName", orderConfirmIn.getUserInfo().getProvinceName());
		userInfoMap.put("cityName", orderConfirmIn.getUserInfo().getCityName());
		userInfoMap.put("districtName", orderConfirmIn.getUserInfo().getDistrictName());
		userInfoMap.put("address", orderConfirmIn.getUserInfo().getAddress());
		userInfoMap.put("identityId", orderConfirmIn.getUserInfo().getIdentityId()); // 一般贸易商品可不传
		JSONObject userInfoJsonObject = new JSONObject();
		userInfoJsonObject.put("userInfo", userInfoMap);
		parameterMap.put("userInfo", userInfoJsonObject.toString());

		String sign = APIUtil.createSign(appSecret, parameterMap);
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("timestamp", new Timestamp(time).toString()));
		params.add(new BasicNameValuePair("v", Const.getApiVersion()));
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

			orderFormOut = JSON.parseObject(result, OrderFormOut.class);
			// meg转换为msg
			if (orderFormOut != null && (orderFormOut.getRecMsg() == null || orderFormOut.getRecMsg() == ""))
			{
				orderFormOut.setRecMsg(orderFormOut.getRecMeg());
			}
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

		return orderFormOut;
	}

	/**
	 * @description: 代下单代支付（分销2.0）
	 * https://github.com/kaola-thirdpart/netease-kaola-thirdpart/wiki/代下单代支付（分销2.0）
	 * @return BookPayOrderOut
	 * @author: hy.zhang
	 * @createTime: 2017年9月25日 下午4:52:31
	 */
	public BookPayOrderOut bookPayOrder(BookPayOrderIn bookPayOrderIn)
	{
		BookPayOrderOut bookPayOrderOut = null;
		// 参数配置;
		String url = APIUrlConst.getApiBookPayOrder();
		String appKey = Const.getAppKey();
		String secretKey = Const.getAppSecret();
		long time = System.currentTimeMillis();
		String thirdPartOrderId = bookPayOrderIn.getThirdPartOrderId();
		String source = Const.getAppSource();

		// 创建HttpPost对象;
		HttpPost httpRequst = new HttpPost(url);
		TreeMap<String, String> parameterMap = new TreeMap<String, String>();
		parameterMap.put("timestamp", new Timestamp(time).toString());
		parameterMap.put("v", Const.getApiVersion());
		parameterMap.put("sign_method", Const.getAppSingMethod());
		parameterMap.put("app_key", appKey);
		parameterMap.put("source", source);
		List<Map<String, Object>> orderItemList = new ArrayList<Map<String, Object>>();
		parameterMap.put("thirdPartOrderId", thirdPartOrderId);
		// 构造商品信息
		for (OrderItemForBookPayOrder orderItemForBookPayOrder : bookPayOrderIn.getOrderItemList())
		{
			Map<String, Object> orderItemMap = new HashMap<String, Object>();
			orderItemMap.put("goodsId", orderItemForBookPayOrder.getGoodsId());
			orderItemMap.put("skuId", orderItemForBookPayOrder.getSkuId());
			orderItemMap.put("buyAmount", orderItemForBookPayOrder.getBuyAmount());
			orderItemMap.put("channelSalePrice", orderItemForBookPayOrder.getChannelSalePrice());
			orderItemMap.put("warehouseId", orderItemForBookPayOrder.getWarehouseId());
			orderItemList.add(orderItemMap);
		}
		JSONObject orderItemJsonObject = new JSONObject();
		orderItemJsonObject.put("orderItemList", orderItemList);
		parameterMap.put("orderItemList", orderItemJsonObject.toString());
		// 构造用户信息
		Map<String, Object> userInfoMap = new HashMap<String, Object>();
		userInfoMap.put("accountId", bookPayOrderIn.getUserInfo().getAccountId());
		userInfoMap.put("name", bookPayOrderIn.getUserInfo().getName());
		userInfoMap.put("mobile", bookPayOrderIn.getUserInfo().getMobile());
		userInfoMap.put("email", bookPayOrderIn.getUserInfo().getEmail());
		userInfoMap.put("provinceName", bookPayOrderIn.getUserInfo().getProvinceName());
		userInfoMap.put("cityName", bookPayOrderIn.getUserInfo().getCityName());
		userInfoMap.put("districtName", bookPayOrderIn.getUserInfo().getDistrictName());
		userInfoMap.put("address", bookPayOrderIn.getUserInfo().getAddress());
		userInfoMap.put("identityId", bookPayOrderIn.getUserInfo().getIdentityId());
		JSONObject userInfoJsonObject = new JSONObject();
		userInfoJsonObject.put("userInfo", userInfoMap);
		parameterMap.put("userInfo", userInfoJsonObject.toString());

		String sign = APIUtil.createSign(secretKey, parameterMap);

		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("timestamp", new Timestamp(time).toString()));
		params.add(new BasicNameValuePair("v", Const.getApiVersion()));
		params.add(new BasicNameValuePair("sign_method", Const.getAppSingMethod()));
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

			bookPayOrderOut = JSON.parseObject(result, BookPayOrderOut.class);
			// meg转换为msg
			if (bookPayOrderOut != null && (bookPayOrderOut.getRecMsg() == null || bookPayOrderOut.getRecMsg() == ""))
			{
				bookPayOrderOut.setRecMsg(bookPayOrderOut.getRecMeg());
			}
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

		return bookPayOrderOut;
	}

	/**
	 * @description: 订单状态查询
	 * https://github.com/kaola-thirdpart/netease-kaola-thirdpart/wiki/订单状态查询
	 * @param thirdPartOrderId
	 * @return QueryOrderStatusOut
	 * @author: hy.zhang
	 * @createTime: 2017年9月25日 下午5:40:00
	 */
	@SuppressWarnings(
	{ "deprecation", "resource" })
	public QueryOrderStatusOut queryOrderStatus(String thirdPartOrderId)
	{
		QueryOrderStatusOut queryOrderStatusOut = null;
		String url = APIUrlConst.getApiQueryOrderStatus();
		HttpPost httpRequst = new HttpPost(url);// 创建HttpPost对象

		// String thirdPartOrderId = "20161zhaolong004";
		String source = Const.getAppSource();
		String appKey = Const.getAppKey();
		String appSecret = Const.getAppSecret();

		long time = System.currentTimeMillis();
		TreeMap<String, String> parameterMap = new TreeMap<String, String>();
		parameterMap.put("thirdPartOrderId", thirdPartOrderId);
		parameterMap.put("channelId", source);
		parameterMap.put("timestamp", new Timestamp(time).toString());
		parameterMap.put("v", Const.getApiVersion());
		parameterMap.put("sign_method", Const.getAppSingMethod());
		parameterMap.put("app_key", appKey);

		String sign = APIUtil.createSign(appSecret, parameterMap);

		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("thirdPartOrderId", thirdPartOrderId));
		params.add(new BasicNameValuePair("timestamp", new Timestamp(time).toString()));
		params.add(new BasicNameValuePair("v", Const.getApiVersion()));
		params.add(new BasicNameValuePair("sign_method", Const.getAppSingMethod()));
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

			queryOrderStatusOut = JSON.parseObject(result, QueryOrderStatusOut.class);
			// meg转换为msg
			if (queryOrderStatusOut != null && (queryOrderStatusOut.getRecMsg() == null || queryOrderStatusOut.getRecMsg() == ""))
			{
				queryOrderStatusOut.setRecMsg(queryOrderStatusOut.getRecMeg());
			}
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
		return queryOrderStatusOut;
	}
}