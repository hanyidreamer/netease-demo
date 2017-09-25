package com.itoche.netease.demo.bean;

import java.io.Serializable;

public class UserInfoForOrderConfirm implements Serializable
{
	private static final long serialVersionUID = 3159877999730736950L;

	private String accountId;// 是 用户id 第三方账号（测试环境请使用@163.com结尾的账户，正式环境不受限）
	private String name;// 是 用户姓名 收货人姓名
	private String mobile;// 是 手机号码
	private String email;// 否 邮箱
	private String provinceName;// 是 省份名称
	private String provinceCode;// 否 省份代码 如果传入省份代码，并能获取到省份名称,
								// 则省份名称根据该代码获取，否则取provinceName
	private String cityName;// 是 城市名称
	private String cityCode;// 否 城市代码
							// 如果传入城市代码，并能获取到城市名称，则城市名称根据该代码获取，否则取cityName
	private String districtName;// 是 县（区）名称
	private String districtCode;// 否 县（区）代码
								// 如果传入县（区）代码，并能获取到县（区）名称，则县（区）名称根据该代码获取，否则取districtName
	private String address;// 是 街道地址
	private String postCode;// 否 邮编
	private String phoneNum;// 否 固定电话
	private String phoneAreaNum;// 否 区号
	private String phoneExtNum;// 否 分机号
	private String identityId;// 否 证件号码 实名信息

	public String getAccountId()
	{
		return accountId;
	}

	public void setAccountId(String accountId)
	{
		this.accountId = accountId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getMobile()
	{
		return mobile;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getProvinceName()
	{
		return provinceName;
	}

	public void setProvinceName(String provinceName)
	{
		this.provinceName = provinceName;
	}

	public String getProvinceCode()
	{
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode)
	{
		this.provinceCode = provinceCode;
	}

	public String getCityName()
	{
		return cityName;
	}

	public void setCityName(String cityName)
	{
		this.cityName = cityName;
	}

	public String getCityCode()
	{
		return cityCode;
	}

	public void setCityCode(String cityCode)
	{
		this.cityCode = cityCode;
	}

	public String getDistrictName()
	{
		return districtName;
	}

	public void setDistrictName(String districtName)
	{
		this.districtName = districtName;
	}

	public String getDistrictCode()
	{
		return districtCode;
	}

	public void setDistrictCode(String districtCode)
	{
		this.districtCode = districtCode;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getPostCode()
	{
		return postCode;
	}

	public void setPostCode(String postCode)
	{
		this.postCode = postCode;
	}

	public String getPhoneNum()
	{
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}

	public String getPhoneAreaNum()
	{
		return phoneAreaNum;
	}

	public void setPhoneAreaNum(String phoneAreaNum)
	{
		this.phoneAreaNum = phoneAreaNum;
	}

	public String getPhoneExtNum()
	{
		return phoneExtNum;
	}

	public void setPhoneExtNum(String phoneExtNum)
	{
		this.phoneExtNum = phoneExtNum;
	}

	public String getIdentityId()
	{
		return identityId;
	}

	public void setIdentityId(String identityId)
	{
		this.identityId = identityId;
	}
}