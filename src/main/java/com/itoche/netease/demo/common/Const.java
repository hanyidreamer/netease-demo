package com.itoche.netease.demo.common;

public class Const
{
	private static final String API_VERSION = "1.0";
	private static final String APP_KEY = "bb0b3ad64c9e5eb06c2fb6f163bf179e79051bd5c9b652fc45dc68a2b5dd23c6";
	private static final String APP_SECRET = "4ed8b056c32939b9fd66987470b3e9fb720bdded02197e678e516bdcdf810833";
	private static final String APP_SOURCE = "1200";
	private static final String APP_SING_METHOD = "md5";

	public static String getAppKey()
	{
		return APP_KEY;
	}

	public static String getAppSecret()
	{
		return APP_SECRET;
	}

	public static String getApiVersion()
	{
		return API_VERSION;
	}

	public static String getAppSource()
	{
		return APP_SOURCE;
	}

	public static String getAppSingMethod()
	{
		return APP_SING_METHOD;
	}
}