package com.itoche.netease.demo.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderFormSkuInfo implements Serializable
{
	private static final long serialVersionUID = 2189207927514377928L;

	private String skuId;
	private BigDecimal actualCurrentPrice;// 考拉售价
	private BigDecimal xyTaxRate; // 行邮税，忽略

	public String getSkuId()
	{
		return skuId;
	}

	public void setSkuId(String skuId)
	{
		this.skuId = skuId;
	}

	public BigDecimal getActualCurrentPrice()
	{
		return actualCurrentPrice;
	}

	public void setActualCurrentPrice(BigDecimal actualCurrentPrice)
	{
		this.actualCurrentPrice = actualCurrentPrice;
	}

	public BigDecimal getXyTaxRate()
	{
		return xyTaxRate;
	}

	public void setXyTaxRate(BigDecimal xyTaxRate)
	{
		this.xyTaxRate = xyTaxRate;
	}
}