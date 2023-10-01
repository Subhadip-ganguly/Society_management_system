package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest 
{
	@Test
	public void softAssertTest()
	{
		String exp = "Facebook – log in or sign";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		String act = driver.getTitle();
		System.out.println(act);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(act, exp);
		System.out.println("application launched");
		sa.assertAll();
		System.out.println("application end");
	}
}
