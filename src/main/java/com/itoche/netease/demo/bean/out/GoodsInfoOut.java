package com.itoche.netease.demo.bean.out;

import java.io.Serializable;

import com.itoche.netease.demo.bean.DetailGoodsInfo;

/**
 * @description:
 * @projectName: netease-demo
 * @className: GoodsInfoOut.java
 * @author: hy.zhang
 * @createTime: 2017年9月25日 下午3:23:59
 * @version 1.0
 */
public class GoodsInfoOut extends BaseResultOut implements Serializable
{
	private static final long serialVersionUID = -5560416085354618749L;

	private DetailGoodsInfo goodsInfo;

	public DetailGoodsInfo getGoodsInfo()
	{
		return goodsInfo;
	}

	public void setGoodsInfo(DetailGoodsInfo goodsInfo)
	{
		this.goodsInfo = goodsInfo;
	}
}