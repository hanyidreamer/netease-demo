package com.itoche.netease.demo.bean;

import java.io.Serializable;

public class SkuProperty implements Serializable
{
	private static final long serialVersionUID = 6723794968430948436L;

	private String propertyValueId;
	private String propertyValue;
	private String propertyNameId;
	private String propertyName;
	private String propertyValueIcon;
	private String nameAlias;
	private String imageUrl;
	private Integer isSysProperty;
	private Integer showOrder;
	private String skuid;

	public String getPropertyValueId()
	{
		return propertyValueId;
	}

	public void setPropertyValueId(String propertyValueId)
	{
		this.propertyValueId = propertyValueId;
	}

	public String getPropertyValue()
	{
		return propertyValue;
	}

	public void setPropertyValue(String propertyValue)
	{
		this.propertyValue = propertyValue;
	}

	public String getPropertyNameId()
	{
		return propertyNameId;
	}

	public void setPropertyNameId(String propertyNameId)
	{
		this.propertyNameId = propertyNameId;
	}

	public String getPropertyName()
	{
		return propertyName;
	}

	public void setPropertyName(String propertyName)
	{
		this.propertyName = propertyName;
	}

	public String getPropertyValueIcon()
	{
		return propertyValueIcon;
	}

	public void setPropertyValueIcon(String propertyValueIcon)
	{
		this.propertyValueIcon = propertyValueIcon;
	}

	public String getNameAlias()
	{
		return nameAlias;
	}

	public void setNameAlias(String nameAlias)
	{
		this.nameAlias = nameAlias;
	}

	public String getImageUrl()
	{
		return imageUrl;
	}

	public void setImageUrl(String imageUrl)
	{
		this.imageUrl = imageUrl;
	}

	public Integer getIsSysProperty()
	{
		return isSysProperty;
	}

	public void setIsSysProperty(Integer isSysProperty)
	{
		this.isSysProperty = isSysProperty;
	}

	public Integer getShowOrder()
	{
		return showOrder;
	}

	public void setShowOrder(Integer showOrder)
	{
		this.showOrder = showOrder;
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