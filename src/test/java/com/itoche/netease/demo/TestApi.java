package com.itoche.netease.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.itoche.netease.demo.bean.OrderItemForBookPayOrder;
import com.itoche.netease.demo.bean.OrderItemForOrderConfirm;
import com.itoche.netease.demo.bean.UserInfoForBookPayOrder;
import com.itoche.netease.demo.bean.UserInfoForOrderConfirm;
import com.itoche.netease.demo.bean.in.BookPayOrderIn;
import com.itoche.netease.demo.bean.in.OrderConfirmIn;
import com.itoche.netease.demo.bean.out.BookPayOrderOut;
import com.itoche.netease.demo.bean.out.GoodsIdAndSkuIdOut;
import com.itoche.netease.demo.bean.out.GoodsInfoOut;
import com.itoche.netease.demo.bean.out.GoodsSkuIdOut;
import com.itoche.netease.demo.bean.out.OrderFormOut;
import com.itoche.netease.demo.bean.out.QueryOrderStatusOut;
import com.itoche.netease.demo.utils.NetEaseApi;

public class TestApi
{
	/**
	 * @description:测试考拉接口
	 * @param args
	 * @author: hy.zhang
	 * @createTime: 2017年9月25日 下午4:46:19
	 */
	public static void main(String[] args)
	{
		NetEaseApi netEaseApi = new NetEaseApi();
		// 所有商品SkuID查询
		// testQueryAllGoodsId(netEaseApi);

		// 查询渠道下所有的goodsId和对应的skuId
		// testQueryAllGoodsIdAndSkuId(netEaseApi);

		// 单个商品详情查询
		// testQueryGoodsInfoById(netEaseApi);

		// 订单确认
		// orderConfirmTest(netEaseApi);

		// 代下单代支付（分销2.0）
		// testBookPayOrder(netEaseApi);

		// 订单状态查询
		testQueryOrderStatus(netEaseApi, "20161zhaolong004");
	}

	/**
	 * @description: 订单状态查询
	 * @param netEaseApi
	 * @param thirdPartOrderId
	 * @author: hy.zhang
	 * @createTime: 2017年9月25日 下午5:39:50
	 */
	private static void testQueryOrderStatus(NetEaseApi netEaseApi, String thirdPartOrderId)
	{
		QueryOrderStatusOut queryOrderStatusOut = netEaseApi.queryOrderStatus(thirdPartOrderId);
		System.out.println(JSON.toJSONString(queryOrderStatusOut));
	}

	/**
	 * @description: 代下单代支付（分销2.0）
	 * @author: hy.zhang
	 * @createTime: 2017年9月25日 下午4:51:48
	 */
	private static void testBookPayOrder(NetEaseApi netEaseApi)
	{
		BookPayOrderIn bookPayOrderIn = new BookPayOrderIn();
		bookPayOrderIn.setThirdPartOrderId("20161zhaolong004");
		// 构造用户信息
		UserInfoForBookPayOrder userInfoForBookPayOrder = new UserInfoForBookPayOrder();
		userInfoForBookPayOrder.setAccountId("testfoip299@163.com");
		userInfoForBookPayOrder.setName("肖凡");
		userInfoForBookPayOrder.setMobile("13588065935");
		userInfoForBookPayOrder.setEmail("494153456@qq.com");
		userInfoForBookPayOrder.setProvinceName("北京");
		userInfoForBookPayOrder.setCityName("北京市");
		userInfoForBookPayOrder.setDistrictName("海淀区");
		userInfoForBookPayOrder.setAddress("网商路599号");
		userInfoForBookPayOrder.setIdentityId("429004198708222935");
		bookPayOrderIn.setUserInfo(userInfoForBookPayOrder);
		// 构造商品信息
		List<OrderItemForBookPayOrder> orderItemForBookPayOrders = new ArrayList<OrderItemForBookPayOrder>();
		OrderItemForBookPayOrder orderItemForBookPayOrder = new OrderItemForBookPayOrder();
		orderItemForBookPayOrder.setGoodsId("425607");
		orderItemForBookPayOrder.setSkuId("425607-de5a7e0b3aeb0bfbdbd3cc6b5f4dece7");
		orderItemForBookPayOrder.setBuyAmount(1);
		orderItemForBookPayOrder.setChannelSalePrice(new BigDecimal(130));
		orderItemForBookPayOrder.setWarehouseId(2);
		orderItemForBookPayOrders.add(orderItemForBookPayOrder);
		bookPayOrderIn.setOrderItemList(orderItemForBookPayOrders);
		BookPayOrderOut bookPayOrderOut = netEaseApi.bookPayOrder(bookPayOrderIn);
		System.out.println(bookPayOrderOut.getRecCode());
	}

	/**
	 * @description: 单个商品详情查询
	 * @param netEaseApi
	 * @author: hy.zhang
	 * @createTime: 2017年9月25日 下午4:51:24
	 */
	private static void testQueryGoodsInfoById(NetEaseApi netEaseApi)
	{
		GoodsInfoOut goodsInfoOut = netEaseApi.queryGoodsInfoById("58867598-0e2cecd2ca2b544ed975af9fd5a484d9", "496", 1);
		System.out.println(goodsInfoOut.getGoodsInfo().getBrandCountryName());
	}

	/**
	 * @description: 查询渠道下所有的goodsId和对应的skuId
	 * @param netEaseApi
	 * @author: hy.zhang
	 * @createTime: 2017年9月25日 下午4:48:56
	 */
	private static void testQueryAllGoodsIdAndSkuId(NetEaseApi netEaseApi)
	{
		GoodsIdAndSkuIdOut goodsIdAndSkuIdOut = netEaseApi.queryAllGoodsIdAndSkuId();
		System.out.println(goodsIdAndSkuIdOut.getGoodsInfo());
	}

	/**
	 * @description: 所有商品SkuID查询
	 * @param netEaseApi
	 * @author: hy.zhang
	 * @createTime: 2017年9月25日 下午4:47:33
	 */
	private static void testQueryAllGoodsId(NetEaseApi netEaseApi)
	{
		GoodsSkuIdOut goodsSkuIdResultOut = netEaseApi.queryAllGoodsId();
		System.out.println(goodsSkuIdResultOut.getGoodsInfo());
	}

	/**
	 * @description: 订单确认（分销2.0）
	 * @param netEaseApi
	 * @author: hy.zhang
	 * @createTime: 2017年9月25日 下午4:45:42
	 */
	private static void orderConfirmTest(NetEaseApi netEaseApi)
	{
		// 订单确认
		// 构造商品信息
		List<OrderItemForOrderConfirm> orderItemes = new ArrayList<OrderItemForOrderConfirm>();
		OrderItemForOrderConfirm orderItem = new OrderItemForOrderConfirm();
		orderItem.setGoodsId("26153046");
		orderItem.setSkuId("26153046-2308c416091d831c0f3be7b9cd82af20");
		orderItem.setBuyAmount(1);
		orderItem.setChannelSalePrice(new BigDecimal(200));
		orderItemes.add(orderItem);
		// 构造用户信息
		UserInfoForOrderConfirm userInfo = new UserInfoForOrderConfirm();
		userInfo.setAccountId("laotest1@163.com");
		userInfo.setName("虞圆浩");
		userInfo.setMobile("13857479955");
		userInfo.setEmail("8545646@11.com");
		userInfo.setProvinceName("浙江省");
		userInfo.setCityName("宁波市");
		userInfo.setDistrictName("北仑区");
		userInfo.setAddress("新碶街道北仑世茂世界湾二期3幢201室");
		userInfo.setIdentityId("330206198210113436");// 一般贸易商品可不传

		OrderConfirmIn orderConfirmIn = new OrderConfirmIn();
		orderConfirmIn.setOrderItemList(orderItemes);
		orderConfirmIn.setUserInfo(userInfo);

		OrderFormOut orderFormOut = netEaseApi.orderConfirm(orderConfirmIn);
		System.out.println(orderFormOut.getRecMeg());
	}
}
