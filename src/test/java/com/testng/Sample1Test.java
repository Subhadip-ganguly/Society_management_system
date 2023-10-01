package com.testng;

import org.testng.annotations.Test;

import com.sms.genericUtils.BaseClass;

public class Sample1Test extends BaseClass
{
	@Test(groups = "smoke")
	public void sample1()
	{
		System.out.println("Sample1 test");
	}
}
