package com.testng;

import org.testng.annotations.Test;

import com.sms.genericUtils.BaseClass;

public class SampleTest extends BaseClass
{
	@Test(groups = "regression")
	public void sample()
	{
		System.out.println("Sample test");
	}
}
