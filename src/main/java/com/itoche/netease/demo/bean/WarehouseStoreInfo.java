package com.itoche.netease.demo.bean;

import java.io.Serializable;

public class WarehouseStoreInfo implements Serializable
{
	private static final long serialVersionUID = 2951590334397128202L;

	private String warehouseName;
	private Integer warehouseId;
	private Integer warehouseStore;

	public String getWarehouseName()
	{
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName)
	{
		this.warehouseName = warehouseName;
	}

	public Integer getWarehouseId()
	{
		return warehouseId;
	}

	public void setWarehouseId(Integer warehouseId)
	{
		this.warehouseId = warehouseId;
	}

	public Integer getWarehouseStore()
	{
		return warehouseStore;
	}

	public void setWarehouseStore(Integer warehouseStore)
	{
		this.warehouseStore = warehouseStore;
	}
}
