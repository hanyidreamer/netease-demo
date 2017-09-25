package com.itoche.netease.demo.bean.out;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class GoodsIdAndSkuIdOut extends BaseResultOut implements Serializable
{
	private static final long serialVersionUID = 9142897474253344306L;

	private List<Map<String, List<String>>> goodsInfo;

	public List<Map<String, List<String>>> getGoodsInfo()
	{
		return goodsInfo;
	}

	public void setGoodsInfo(List<Map<String, List<String>>> goodsInfo)
	{
		this.goodsInfo = goodsInfo;
	}
}