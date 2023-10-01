package com.expenses;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.sms.genericUtils.BaseClass;
import com.sms.genericUtils.ExcelUtility;
import com.sms.genericUtils.FileUtility;
import com.sms.genericUtils.WebdriverUtility;
import com.sms.objectrepository.ExpensesPage;
import com.sms.objectrepository.HomePage;
import com.sms.objectrepository.LoginPage;

public class AddExpenses_genericUtil extends BaseClass
{
	@Test
	public void addExpenses() throws Throwable
	{
		//create object for all utility classes
		WebdriverUtility wlib = new WebdriverUtility();
		ExcelUtility elib = new ExcelUtility();
		FileUtility flib = new FileUtility();
		
		//validate Home Page
		String exp = "http://rmgtestingserver/domain/society_management_system/admin/";
		String act = driver.getCurrentUrl();
		assertEquals(act, exp);
		
		//add expenses
		HomePage hp = new HomePage(driver);
		hp.expenses();
		ExpensesPage ep = new ExpensesPage(driver);
		ep.clickOnAddExpenses();
		ep.createExpenses(elib.getMultipleDataFromExcel("Expenses", 0, 1, driver), driver, "1st", "31-08-2023");
		
	}
}
