package com.itoche.netease.demo.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.itoche.netease.demo.bean.out.BaseResultOut;

public class OrderFromPackage extends BaseResultOut implements Serializable
{
	private static final long serialVersionUID = -4272018453809123974L;

	private BigDecimal payAmount;
	private BigDecimal taxPayAmount;
	private BigDecimal logisticsPayAmount;
	private Integer importType;
	private Integer needVerifyLevel;
	private Integer packageOrder;
	private Warehouse warehouse;
	private List<OrderFormGoodsInfo> goodsList;
	private String goodsSource;

	public BigDecimal getPayAmount()
	{
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount)
	{
		this.payAmount = payAmount;
	}

	public BigDecimal getTaxPayAmount()
	{
		return taxPayAmount;
	}

	public void setTaxPayAmount(BigDecimal taxPayAmount)
	{
		this.taxPayAmount = taxPayAmount;
	}

	public BigDecimal getLogisticsPayAmount()
	{
		return logisticsPayAmount;
	}

	public void setLogisticsPayAmount(BigDecimal logisticsPayAmount)
	{
		this.logisticsPayAmount = logisticsPayAmount;
	}

	public Integer getImportType()
	{
		return importType;
	}

	public void setImportType(Integer importType)
	{
		this.importType = importType;
	}

	public Integer getNeedVerifyLevel()
	{
		return needVerifyLevel;
	}

	public void setNeedVerifyLevel(Integer needVerifyLevel)
	{
		this.needVerifyLevel = needVerifyLevel;
	}

	public Integer getPackageOrder()
	{
		return packageOrder;
	}

	public void setPackageOrder(Integer packageOrder)
	{
		this.packageOrder = packageOrder;
	}

	public Warehouse getWarehouse()
	{
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse)
	{
		this.warehouse = warehouse;
	}

	public List<OrderFormGoodsInfo> getGoodsList()
	{
		return goodsList;
	}

	public void setGoodsList(List<OrderFormGoodsInfo> goodsList)
	{
		this.goodsList = goodsList;
	}

	public String getGoodsSource()
	{
		return goodsSource;
	}

	public void setGoodsSource(String goodsSource)
	{
		this.goodsSource = goodsSource;
	}
}