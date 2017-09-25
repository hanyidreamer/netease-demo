package com.itoche.netease.demo.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderForBookPayOrder implements Serializable
{
	private static final long serialVersionUID = 1702680474030472516L;

	private String id;
	private BigDecimal gpayAmount;
	private BigDecimal originalGpayAmount;	// 等于上面gpayAmount实际支付金额
	private BigDecimal gorderAmount;	// 等于上面gpayAmount实际支付金额
	private String goodsName;	// 短标题20161012113503597"
	private Integer gorderStatus;	// 0 //忽略，以订单状态查询接口返回为准

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public BigDecimal getGpayAmount()
	{
		return gpayAmount;
	}

	public void setGpayAmount(BigDecimal gpayAmount)
	{
		this.gpayAmount = gpayAmount;
	}

	public BigDecimal getOriginalGpayAmount()
	{
		return originalGpayAmount;
	}

	public void setOriginalGpayAmount(BigDecimal originalGpayAmount)
	{
		this.originalGpayAmount = originalGpayAmount;
	}

	public BigDecimal getGorderAmount()
	{
		return gorderAmount;
	}

	public void setGorderAmount(BigDecimal gorderAmount)
	{
		this.gorderAmount = gorderAmount;
	}

	public String getGoodsName()
	{
		return goodsName;
	}

	public void setGoodsName(String goodsName)
	{
		this.goodsName = goodsName;
	}

	public Integer getGorderStatus()
	{
		return gorderStatus;
	}

	public void setGorderStatus(Integer gorderStatus)
	{
		this.gorderStatus = gorderStatus;
	}
}