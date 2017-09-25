package com.itoche.netease.demo.bean.out;

import java.io.Serializable;

import com.itoche.netease.demo.bean.OrderForBookPayOrder;

public class BookPayOrderOut extends BaseResultOut implements Serializable
{
	private static final long serialVersionUID = -2778556823722079343L;

	private OrderForBookPayOrder gorder;

	public OrderForBookPayOrder getGorder()
	{
		return gorder;
	}

	public void setGorder(OrderForBookPayOrder gorder)
	{
		this.gorder = gorder;
	}
}