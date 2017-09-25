package com.itoche.netease.demo.bean.in;

import java.io.Serializable;
import java.util.List;

import com.itoche.netease.demo.bean.OrderItemForOrderConfirm;
import com.itoche.netease.demo.bean.UserInfoForOrderConfirm;

public class OrderConfirmIn implements Serializable
{
	private static final long serialVersionUID = 1395021111587078179L;

	private List<OrderItemForOrderConfirm> orderItemList;
	private UserInfoForOrderConfirm userInfo;

	public List<OrderItemForOrderConfirm> getOrderItemList()
	{
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItemForOrderConfirm> orderItemList)
	{
		this.orderItemList = orderItemList;
	}

	public UserInfoForOrderConfirm getUserInfo()
	{
		return userInfo;
	}

	public void setUserInfo(UserInfoForOrderConfirm userInfo)
	{
		this.userInfo = userInfo;
	}
}