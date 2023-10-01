package com.testng;

import org.testng.annotations.Test;

public class PracticeTestNG 
{
	@Test
	public void create()
	{
		int[] x = {1,2,3};
		System.out.println(x[5]);
		System.out.println("create data");
	}
	
	@Test(invocationCount = 0)
	public void edit()
	{
		System.out.println("edit data");
	}
	
	@Test(priority = 1)
	public void delete()
	{
		System.out.println("delete data");
	}
}
