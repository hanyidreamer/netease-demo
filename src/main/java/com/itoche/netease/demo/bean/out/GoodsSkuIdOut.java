package com.itoche.netease.demo.bean.out;

import java.util.List;

/**
 * @description: 所有商品SkuID
 * @projectName: netease-demo
 * @className: GoodsSkuIdResultOut.java
 * @author: hy.zhang
 * @createTime: 2017年9月25日 下午2:27:17
 * @version 1.0
 */
public class GoodsSkuIdOut extends BaseResultOut
{
	private static final long serialVersionUID = 2243474638824272617L;

	private List<String> goodsInfo;

	public List<String> getGoodsInfo()
	{
		return goodsInfo;
	}

	public void setGoodsInfo(List<String> goodsInfo)
	{
		this.goodsInfo = goodsInfo;
	}
}