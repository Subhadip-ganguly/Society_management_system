package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestScript1Test 
{
	@Test(dependsOnMethods = "testcase2")
	public void testcase1()
	{
		System.out.println("Test Script1 Execution");
	}
	
	@BeforeSuite
	public void configBS()
	{
		System.out.println("Connect to Database");
	}
	
	@BeforeClass
	public void configBC()
	{
		System.out.println("Launch the browser");
	}
	
	@BeforeMethod
	public void configBM()
	{
		System.out.println("Login to Application");
	}
	
	@AfterMethod
	public void configAM()
	{
		System.out.println("Logout from Application");
	}
	
	@AfterClass
	public void configAC()
	{
		System.out.println("Close the browser");
	}
	
	@AfterSuite
	public void configAS()
	{
		System.out.println("Close the DB Connection");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("Test Script2 execution");
	}
}
