package com.itoche.netease.demo.common;

public class APIUrlConst
{
	private static final String API_queryAllGoodsId = "http://test1.thirdpart.kaolatest.netease.com/api/queryAllGoodsId";
	private static final String API_queryAllGoodsIdAndSkuId = "http://test1.thirdpart.kaolatest.netease.com/api/queryAllGoodsIdAndSkuId";
	private static final String API_queryGoodsInfoById = "http://test1.thirdpart.kaolatest.netease.com/api/queryGoodsInfoById";
	private static final String API_orderConfirm = "http://test1.thirdpart.kaolatest.netease.com/api/orderConfirm";
	private static final String API_bookpayorder = "http://test1.thirdpart.kaolatest.netease.com/api/bookpayorder";
	private static final String API_queryOrderStatus = "http://test1.thirdpart.kaolatest.netease.com/api/queryOrderStatus";

	public static String getApiQueryAllGoodsId()
	{
		return API_queryAllGoodsId;
	}

	public static String getApiQueryAllGoodsIdAndSkuId()
	{
		return API_queryAllGoodsIdAndSkuId;
	}

	public static String getApiQueryGoodsInfoById()
	{
		return API_queryGoodsInfoById;
	}

	public static String getApiOrderConfirm()
	{
		return API_orderConfirm;
	}

	public static String getApiBookPayOrder()
	{
		return API_bookpayorder;
	}

	public static String getApiQueryOrderStatus()
	{
		return API_queryOrderStatus;
	}
}