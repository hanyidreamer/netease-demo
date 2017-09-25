package com.itoche.netease.demo.bean;

import java.io.Serializable;

public class Warehouse implements Serializable
{
	private static final long serialVersionUID = 4364640442498086516L;

	private String warehouseId;
	private String warehouseName;
	private String warehouseNameAlias;

	public String getWarehouseId()
	{
		return warehouseId;
	}

	public void setWarehouseId(String warehouseId)
	{
		this.warehouseId = warehouseId;
	}

	public String getWarehouseName()
	{
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName)
	{
		this.warehouseName = warehouseName;
	}

	public String getWarehouseNameAlias()
	{
		return warehouseNameAlias;
	}

	public void setWarehouseNameAlias(String warehouseNameAlias)
	{
		this.warehouseNameAlias = warehouseNameAlias;
	}
}