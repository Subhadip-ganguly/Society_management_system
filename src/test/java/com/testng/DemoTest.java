package com.testng;

import org.testng.annotations.Test;

import com.sms.genericUtils.BaseClass;

public class DemoTest extends BaseClass
{
	@Test(groups = {"smoke","regression"})
	public void demo()
	{
		System.out.println("Demo test");
	}
}
