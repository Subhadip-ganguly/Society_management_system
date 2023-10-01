package com.testng;

import org.testng.annotations.DataProvider;
import com.sms.genericUtils.ExcelUtility;

public class DataProviderTest 
{
	@DataProvider
	public Object[][] mobiles()
	{
		Object[][] obj = new Object[2][2];
		
		obj[0][0] = "Samsung";
		obj[0][1] = 10000;
		
		obj[1][0] = "Redmi";
		obj[1][1] = 15000;
		
		return obj;
	}
	
	@DataProvider
	public Object[][] tv()
	{
		Object[][] obj = new Object[2][3];
		
		obj[0][0] = "LG";
		obj[0][1] = 40000;
		obj[0][2] = "32 inch";
		
		obj[1][0] = "Sony";
		obj[1][1] = 30000;
		obj[1][2] = "22 inch";
		
		return obj;
	}
	
	@DataProvider
	public Object[][] readDataFromExcel() throws Throwable
	{
		ExcelUtility elib = new ExcelUtility();
		Object[][] value = elib.getMultipleData("DP");
		return value;
	}
}
