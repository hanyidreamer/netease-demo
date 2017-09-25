package com.itoche.netease.demo.bean.out;

import java.io.Serializable;

public class BaseResultOut implements Serializable
{
	private static final long serialVersionUID = 877669293335591419L;
	private Integer recCode;
	private String recMsg;
	private String recMeg;

	public Integer getRecCode()
	{
		return recCode;
	}

	public void setRecCode(Integer recCode)
	{
		this.recCode = recCode;
	}

	public String getRecMsg()
	{
		return recMsg;
	}

	public void setRecMsg(String recMsg)
	{
		this.recMsg = recMsg;
	}

	public String getRecMeg()
	{
		return recMeg;
	}

	public void setRecMeg(String recMeg)
	{
		this.recMeg = recMeg;
	}
}