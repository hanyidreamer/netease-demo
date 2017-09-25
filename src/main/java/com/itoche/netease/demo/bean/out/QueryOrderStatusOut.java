package com.itoche.netease.demo.bean.out;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.itoche.netease.demo.bean.OrderResultForQueryOrderStatus;

public class QueryOrderStatusOut extends BaseResultOut implements Serializable
{
	private static final long serialVersionUID = 1683306552004688122L;

	private String gorderId;
	private List<OrderResultForQueryOrderStatus> result;
	private BigDecimal gpayAmount; // 订单支付的总金额
	private Integer totalOverseaLogisticsAmount;// 忽略
	private Integer totalServiceFee; // 忽略
	private BigDecimal logisticsTaxAmount; // 运费税
	private BigDecimal totalChinaLogisticsAmount;// 运费
	private BigDecimal totalTaxAmount; // 总税费
	private Integer gorderStatus; // 该状态忽略

	public String getGorderId()
	{
		return gorderId;
	}

	public void setGorderId(String gorderId)
	{
		this.gorderId = gorderId;
	}

	public List<OrderResultForQueryOrderStatus> getResult()
	{
		return result;
	}

	public void setResult(List<OrderResultForQueryOrderStatus> result)
	{
		this.result = result;
	}

	public BigDecimal getGpayAmount()
	{
		return gpayAmount;
	}

	public void setGpayAmount(BigDecimal gpayAmount)
	{
		this.gpayAmount = gpayAmount;
	}

	public Integer getTotalOverseaLogisticsAmount()
	{
		return totalOverseaLogisticsAmount;
	}

	public void setTotalOverseaLogisticsAmount(Integer totalOverseaLogisticsAmount)
	{
		this.totalOverseaLogisticsAmount = totalOverseaLogisticsAmount;
	}

	public Integer getTotalServiceFee()
	{
		return totalServiceFee;
	}

	public void setTotalServiceFee(Integer totalServiceFee)
	{
		this.totalServiceFee = totalServiceFee;
	}

	public BigDecimal getLogisticsTaxAmount()
	{
		return logisticsTaxAmount;
	}

	public void setLogisticsTaxAmount(BigDecimal logisticsTaxAmount)
	{
		this.logisticsTaxAmount = logisticsTaxAmount;
	}

	public BigDecimal getTotalChinaLogisticsAmount()
	{
		return totalChinaLogisticsAmount;
	}

	public void setTotalChinaLogisticsAmount(BigDecimal totalChinaLogisticsAmount)
	{
		this.totalChinaLogisticsAmount = totalChinaLogisticsAmount;
	}

	public BigDecimal getTotalTaxAmount()
	{
		return totalTaxAmount;
	}

	public void setTotalTaxAmount(BigDecimal totalTaxAmount)
	{
		this.totalTaxAmount = totalTaxAmount;
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