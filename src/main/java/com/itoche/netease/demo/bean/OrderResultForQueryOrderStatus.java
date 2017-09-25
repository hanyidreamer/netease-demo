package com.itoche.netease.demo.bean;

import java.io.Serializable;
import java.util.List;

public class OrderResultForQueryOrderStatus implements Serializable
{
	private static final long serialVersionUID = 8444146746886026587L;

	private String desc;
	private Integer status; // 订单状态以此为准
	private String limitReason; // 拦截原因
	private boolean isLimit;  // 海关是否拦截
	private List<SkuInfoForQueyOrderStatus> skuList;
	private String deliverName;
	private String deliverNo;
	private String orderId;

	public String getDesc()
	{
		return desc;
	}

	public void setDesc(String desc)
	{
		this.desc = desc;
	}

	public Integer getStatus()
	{
		return status;
	}

	public void setStatus(Integer status)
	{
		this.status = status;
	}

	public String getLimitReason()
	{
		return limitReason;
	}

	public void setLimitReason(String limitReason)
	{
		this.limitReason = limitReason;
	}

	public boolean isLimit()
	{
		return isLimit;
	}

	public void setLimit(boolean isLimit)
	{
		this.isLimit = isLimit;
	}

	public List<SkuInfoForQueyOrderStatus> getSkuList()
	{
		return skuList;
	}

	public void setSkuList(List<SkuInfoForQueyOrderStatus> skuList)
	{
		this.skuList = skuList;
	}

	public String getDeliverName()
	{
		return deliverName;
	}

	public void setDeliverName(String deliverName)
	{
		this.deliverName = deliverName;
	}

	public String getDeliverNo()
	{
		return deliverNo;
	}

	public void setDeliverNo(String deliverNo)
	{
		this.deliverNo = deliverNo;
	}

	public String getOrderId()
	{
		return orderId;
	}

	public void setOrderId(String orderId)
	{
		this.orderId = orderId;
	}
}