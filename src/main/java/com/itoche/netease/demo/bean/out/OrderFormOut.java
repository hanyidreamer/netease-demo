package com.itoche.netease.demo.bean.out;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.itoche.netease.demo.bean.OrderFromPackage;

public class OrderFormOut extends BaseResultOut implements Serializable
{
	private static final long serialVersionUID = 3974002439319159323L;

	private BigDecimal orderAmount;
	private BigDecimal payAmount;
	private BigDecimal taxPayAmount;
	private BigDecimal logisticsPayAmount;
	private Integer needVerifyLevel;
	private Long orderCloseTime;
	private List<OrderFromPackage> packageList;

	public BigDecimal getOrderAmount()
	{
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount)
	{
		this.orderAmount = orderAmount;
	}

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

	public Integer getNeedVerifyLevel()
	{
		return needVerifyLevel;
	}

	public void setNeedVerifyLevel(Integer needVerifyLevel)
	{
		this.needVerifyLevel = needVerifyLevel;
	}

	public Long getOrderCloseTime()
	{
		return orderCloseTime;
	}

	public void setOrderCloseTime(Long orderCloseTime)
	{
		this.orderCloseTime = orderCloseTime;
	}

	public List<OrderFromPackage> getPackageList()
	{
		return packageList;
	}

	public void setPackageList(List<OrderFromPackage> packageList)
	{
		this.packageList = packageList;
	}
}