package com.itoche.netease.demo.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class DetailGoodsInfo implements Serializable
{
	private static final long serialVersionUID = 2598906881222798297L;

	private String goodsId;
	private String detail;
	private Integer store;
	private String imageUrl;
	private Map<String, WarehouseStoreInfo> warehouseStores;
	private Integer onlineStatus;
	private Integer brandId;
	private String brandName;
	private String subTitle;
	private String title;
	private WarehouseStoreInfo recommandStore;
	private boolean IsPostageFree;
	private BigDecimal suggestPrice;
	private String logisticsProperty;
	private String skuId;
	private boolean isSelf;
	private Map<String, List<String>> goodsProperty;
	private Integer leafCategoryId;
	private BigDecimal marketPrice;
	private BigDecimal taxRate;
	private Integer canReturnGoods;
	private List<BigDecimal> taxRates;
	private Integer productId;
	private String brandCountryName;
	private Integer importType;
	private String category;
	private BigDecimal price;
	private String shortTitle;
	private List<SkuProperty> skuProperty;
	private List<GoodsImagesInfo> goodsImages;
	private String storage;
	private BigDecimal taxFees;
	private BigDecimal afterTaxPrice;
	private Integer thirdCategoryId;
	private String thirdCategoryName;

	public String getGoodsId()
	{
		return goodsId;
	}

	public void setGoodsId(String goodsId)
	{
		this.goodsId = goodsId;
	}

	public String getDetail()
	{
		return detail;
	}

	public void setDetail(String detail)
	{
		this.detail = detail;
	}

	public Integer getStore()
	{
		return store;
	}

	public void setStore(Integer store)
	{
		this.store = store;
	}

	public String getImageUrl()
	{
		return imageUrl;
	}

	public void setImageUrl(String imageUrl)
	{
		this.imageUrl = imageUrl;
	}

	public Map<String, WarehouseStoreInfo> getWarehouseStores()
	{
		return warehouseStores;
	}

	public void setWarehouseStores(Map<String, WarehouseStoreInfo> warehouseStores)
	{
		this.warehouseStores = warehouseStores;
	}

	public Integer getOnlineStatus()
	{
		return onlineStatus;
	}

	public void setOnlineStatus(Integer onlineStatus)
	{
		this.onlineStatus = onlineStatus;
	}

	public Integer getBrandId()
	{
		return brandId;
	}

	public void setBrandId(Integer brandId)
	{
		this.brandId = brandId;
	}

	public String getBrandName()
	{
		return brandName;
	}

	public void setBrandName(String brandName)
	{
		this.brandName = brandName;
	}

	public String getSubTitle()
	{
		return subTitle;
	}

	public void setSubTitle(String subTitle)
	{
		this.subTitle = subTitle;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public WarehouseStoreInfo getRecommandStore()
	{
		return recommandStore;
	}

	public void setRecommandStore(WarehouseStoreInfo recommandStore)
	{
		this.recommandStore = recommandStore;
	}

	public boolean isIsPostageFree()
	{
		return IsPostageFree;
	}

	public void setIsPostageFree(boolean isPostageFree)
	{
		IsPostageFree = isPostageFree;
	}

	public BigDecimal getSuggestPrice()
	{
		return suggestPrice;
	}

	public void setSuggestPrice(BigDecimal suggestPrice)
	{
		this.suggestPrice = suggestPrice;
	}

	public String getLogisticsProperty()
	{
		return logisticsProperty;
	}

	public void setLogisticsProperty(String logisticsProperty)
	{
		this.logisticsProperty = logisticsProperty;
	}

	public String getSkuId()
	{
		return skuId;
	}

	public void setSkuId(String skuId)
	{
		this.skuId = skuId;
	}

	public boolean isSelf()
	{
		return isSelf;
	}

	public void setSelf(boolean isSelf)
	{
		this.isSelf = isSelf;
	}

	public Map<String, List<String>> getGoodsProperty()
	{
		return goodsProperty;
	}

	public void setGoodsProperty(Map<String, List<String>> goodsProperty)
	{
		this.goodsProperty = goodsProperty;
	}

	public Integer getLeafCategoryId()
	{
		return leafCategoryId;
	}

	public void setLeafCategoryId(Integer leafCategoryId)
	{
		this.leafCategoryId = leafCategoryId;
	}

	public BigDecimal getMarketPrice()
	{
		return marketPrice;
	}

	public void setMarketPrice(BigDecimal marketPrice)
	{
		this.marketPrice = marketPrice;
	}

	public BigDecimal getTaxRate()
	{
		return taxRate;
	}

	public void setTaxRate(BigDecimal taxRate)
	{
		this.taxRate = taxRate;
	}

	public Integer getCanReturnGoods()
	{
		return canReturnGoods;
	}

	public void setCanReturnGoods(Integer canReturnGoods)
	{
		this.canReturnGoods = canReturnGoods;
	}

	public List<BigDecimal> getTaxRates()
	{
		return taxRates;
	}

	public void setTaxRates(List<BigDecimal> taxRates)
	{
		this.taxRates = taxRates;
	}

	public Integer getProductId()
	{
		return productId;
	}

	public void setProductId(Integer productId)
	{
		this.productId = productId;
	}

	public String getBrandCountryName()
	{
		return brandCountryName;
	}

	public void setBrandCountryName(String brandCountryName)
	{
		this.brandCountryName = brandCountryName;
	}

	public Integer getImportType()
	{
		return importType;
	}

	public void setImportType(Integer importType)
	{
		this.importType = importType;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public BigDecimal getPrice()
	{
		return price;
	}

	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}

	public String getShortTitle()
	{
		return shortTitle;
	}

	public void setShortTitle(String shortTitle)
	{
		this.shortTitle = shortTitle;
	}

	public List<SkuProperty> getSkuProperty()
	{
		return skuProperty;
	}

	public void setSkuProperty(List<SkuProperty> skuProperty)
	{
		this.skuProperty = skuProperty;
	}

	public List<GoodsImagesInfo> getGoodsImages()
	{
		return goodsImages;
	}

	public void setGoodsImages(List<GoodsImagesInfo> goodsImages)
	{
		this.goodsImages = goodsImages;
	}

	public String getStorage()
	{
		return storage;
	}

	public void setStorage(String storage)
	{
		this.storage = storage;
	}

	public BigDecimal getTaxFees()
	{
		return taxFees;
	}

	public void setTaxFees(BigDecimal taxFees)
	{
		this.taxFees = taxFees;
	}

	public BigDecimal getAfterTaxPrice()
	{
		return afterTaxPrice;
	}

	public void setAfterTaxPrice(BigDecimal afterTaxPrice)
	{
		this.afterTaxPrice = afterTaxPrice;
	}

	public Integer getThirdCategoryId()
	{
		return thirdCategoryId;
	}

	public void setThirdCategoryId(Integer thirdCategoryId)
	{
		this.thirdCategoryId = thirdCategoryId;
	}

	public String getThirdCategoryName()
	{
		return thirdCategoryName;
	}

	public void setThirdCategoryName(String thirdCategoryName)
	{
		this.thirdCategoryName = thirdCategoryName;
	}
}