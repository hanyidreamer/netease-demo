package com.itoche.netease.demo.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderFormGoodsInfo implements Serializable
{
	private static final long serialVersionUID = 8684353078308297997L;

	private Integer goodsId;
	private String skuId;
	private OrderFormSkuInfo sku;
	private Integer warehouseId;
	private BigDecimal goodsUnitPriceWithoutTax; // 商品单个金额(不含税)
	private BigDecimal goodsTaxAmount; // 商品税（含运费税）（同一个包裹中多个商品，按比例分摊运费）
	// 运费分摊：（该商品的总价格/该订单税前商品总价格）*总运费
	// 比如一个商品A是40块，税率是11.9%，一个商品B是60块，税率是5%，两个商品一起买的话，
	// 总的运费是10块，然后计算运费的税的时候，把这10块摊到每个商品上，
	// 比如A商品摊4块，A商品运费税4*11.9%，B商品摊6块，B商品运费税6*5%
	private BigDecimal goodsPayAmount; // 商品总金额（不含税）
	private Integer goodsBuyNumber;
	private String imageUrl;
	private BigDecimal composeTaxRate;// 综合税率，即下单的真实税率

	public Integer getGoodsId()
	{
		return goodsId;
	}

	public void setGoodsId(Integer goodsId)
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

	public OrderFormSkuInfo getSku()
	{
		return sku;
	}

	public void setSku(OrderFormSkuInfo sku)
	{
		this.sku = sku;
	}

	public Integer getWarehouseId()
	{
		return warehouseId;
	}

	public void setWarehouseId(Integer warehouseId)
	{
		this.warehouseId = warehouseId;
	}

	public BigDecimal getGoodsUnitPriceWithoutTax()
	{
		return goodsUnitPriceWithoutTax;
	}

	public void setGoodsUnitPriceWithoutTax(BigDecimal goodsUnitPriceWithoutTax)
	{
		this.goodsUnitPriceWithoutTax = goodsUnitPriceWithoutTax;
	}

	public BigDecimal getGoodsTaxAmount()
	{
		return goodsTaxAmount;
	}

	public void setGoodsTaxAmount(BigDecimal goodsTaxAmount)
	{
		this.goodsTaxAmount = goodsTaxAmount;
	}

	public BigDecimal getGoodsPayAmount()
	{
		return goodsPayAmount;
	}

	public void setGoodsPayAmount(BigDecimal goodsPayAmount)
	{
		this.goodsPayAmount = goodsPayAmount;
	}

	public Integer getGoodsBuyNumber()
	{
		return goodsBuyNumber;
	}

	public void setGoodsBuyNumber(Integer goodsBuyNumber)
	{
		this.goodsBuyNumber = goodsBuyNumber;
	}

	public String getImageUrl()
	{
		return imageUrl;
	}

	public void setImageUrl(String imageUrl)
	{
		this.imageUrl = imageUrl;
	}

	public BigDecimal getComposeTaxRate()
	{
		return composeTaxRate;
	}

	public void setComposeTaxRate(BigDecimal composeTaxRate)
	{
		this.composeTaxRate = composeTaxRate;
	}
}