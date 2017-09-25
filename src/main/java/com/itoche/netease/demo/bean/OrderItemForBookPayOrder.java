package com.itoche.netease.demo.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderItemForBookPayOrder implements Serializable
{
	private static final long serialVersionUID = -3935051931849602927L;

	private String goodsId;	// 是 商品id 该id为商品在考拉的商品id
	private String skuId;	// 是 商品skuId 该skuId为商品在考拉的skuId
	private Integer buyAmount;	// 是 购买数量
	private BigDecimal channelSalePrice;	// 是 单品税前价，元
	private Integer warehouseId;	// 是 仓库Id 该值由订单确认接口返回

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

	public Integer getBuyAmount()
	{
		return buyAmount;
	}

	public void setBuyAmount(Integer buyAmount)
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

	public Integer getWarehouseId()
	{
		return warehouseId;
	}

	public void setWarehouseId(Integer warehouseId)
	{
		this.warehouseId = warehouseId;
	}
}