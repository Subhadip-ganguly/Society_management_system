package com.testng;

import org.testng.annotations.Test;

public class DPExecutionTest 
{
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "mobiles",enabled = false)
	public void getMobile(String product,int price)
	{
		System.out.println(product+"-->"+price);
	}
	
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "tv",enabled = false)
	public void getTV(String product,int price,String size)
	{
		System.out.println(product+"-->"+price+"-->"+size);
	}
	
	@Test(dataProviderClass = DataProviderTest.class,dataProvider = "readDataFromExcel")
	public void getDataFromExcel(String product,String price,String size)
	{
		System.out.println(product+"-->"+price+"-->"+size);
	}
}
