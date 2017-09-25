package com.itoche.netease.demo.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderItemForOrderConfirm implements Serializable
{
	private static final long serialVersionUID = 1506368427161936380L;

	private String goodsId;	// 是 商品id 该id为商品在考拉的商品id
	private String skuId;	// 是 商品skuId 该skuId为商品在考拉的skuId
	private int buyAmount;	// 是 购买数量
	private BigDecimal channelSalePrice;

	public String getGoodsId()
	{
		return goodsId;
	}

	public void setGoodsId(String goodsId)
	{
		this.goodsId = goodsId;
	}

	public String getSkuId()
	{
		return skuId;
	}

	public void setSkuId(String skuId)
	{
		this.skuId = skuId;
	}

	public int getBuyAmount()
	{
		return buyAmount;
	}

	public void setBuyAmount(int buyAmount)
	{
		this.buyAmount = buyAmount;
	}

	public BigDecimal getChannelSalePrice()
	{
		return channelSalePrice;
	}

	public void setChannelSalePrice(BigDecimal channelSalePrice)
	{
		this.channelSalePrice = channelSalePrice;
	}
}