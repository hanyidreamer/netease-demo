package com.itoche.netease.demo.bean;

import java.io.Serializable;

public class SkuInfoForQueyOrderStatus implements Serializable
{
	private static final long serialVersionUID = -2918918085643194374L;

	private Integer buyCnt;
	private String skuid;

	public Integer getBuyCnt()
	{
		return buyCnt;
	}

	public void setBuyCnt(Integer buyCnt)
	{
		this.buyCnt = buyCnt;
	}

	public String getSkuid()
	{
		return skuid;
	}

	public void setSkuid(String skuid)
	{
		this.skuid = skuid;
	}
}