package com.itoche.netease.demo.bean;

import java.io.Serializable;

public class GoodsImagesInfo implements Serializable
{
	private static final long serialVersionUID = -2015253413547674253L;

	private Integer goodsId;
	private String imageUrl;
	private Integer imageType;
	private Integer orderValue;
	private String imageUrlFor70;
	private String imageUrlFor430;
	private String imageUrlFor640490;

	public Integer getGoodsId()
	{
		return goodsId;
	}

	public void setGoodsId(Integer goodsId)
	{
		this.goodsId = goodsId;
	}

	public String getImageUrl()
	{
		return imageUrl;
	}

	public void setImageUrl(String imageUrl)
	{
		this.imageUrl = imageUrl;
	}

	public Integer getImageType()
	{
		return imageType;
	}

	public void setImageType(Integer imageType)
	{
		this.imageType = imageType;
	}

	public Integer getOrderValue()
	{
		return orderValue;
	}

	public void setOrderValue(Integer orderValue)
	{
		this.orderValue = orderValue;
	}

	public String getImageUrlFor70()
	{
		return imageUrlFor70;
	}

	public void setImageUrlFor70(String imageUrlFor70)
	{
		this.imageUrlFor70 = imageUrlFor70;
	}

	public String getImageUrlFor430()
	{
		return imageUrlFor430;
	}

	public void setImageUrlFor430(String imageUrlFor430)
	{
		this.imageUrlFor430 = imageUrlFor430;
	}

	public String getImageUrlFor640490()
	{
		return imageUrlFor640490;
	}

	public void setImageUrlFor640490(String imageUrlFor640490)
	{
		this.imageUrlFor640490 = imageUrlFor640490;
	}
}