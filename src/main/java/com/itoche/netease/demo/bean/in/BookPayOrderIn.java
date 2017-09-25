package com.itoche.netease.demo.bean.in;

import java.io.Serializable;
import java.util.List;

import com.itoche.netease.demo.bean.OrderItemForBookPayOrder;
import com.itoche.netease.demo.bean.UserInfoForBookPayOrder;

public class BookPayOrderIn implements Serializable
{
	private static final long serialVersionUID = -348049371747476777L;

	private String thirdPartOrderId;	// 是 第三方订单ID（长度最大32） 数字字母等
	private List<OrderItemForBookPayOrder> orderItemList;	// 是,订单项,Json格式，orderItem的一个列表，orderItem定义如下
	private UserInfoForBookPayOrder userInfo;	// 是 用户信息，包括地址、实名等

	public String getThirdPartOrderId()
	{
		return thirdPartOrderId;
	}

	public void setThirdPartOrderId(String thirdPartOrderId)
	{
		this.thirdPartOrderId = thirdPartOrderId;
	}

	public List<OrderItemForBookPayOrder> getOrderItemList()
	{
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItemForBookPayOrder> orderItemList)
	{
		this.orderItemList = orderItemList;
	}

	public UserInfoForBookPayOrder getUserInfo()
	{
		return userInfo;
	}

	public void setUserInfo(UserInfoForBookPayOrder userInfo)
	{
		this.userInfo = userInfo;
	}
}