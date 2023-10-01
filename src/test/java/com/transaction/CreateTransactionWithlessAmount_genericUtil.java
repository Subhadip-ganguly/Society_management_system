package com.transaction;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.sms.genericUtils.BaseClass;
import com.sms.genericUtils.ExcelUtility;
import com.sms.genericUtils.FileUtility;
import com.sms.genericUtils.WebdriverUtility;
import com.sms.objectrepository.HomePage;
import com.sms.objectrepository.LoginPage;
import com.sms.objectrepository.StudentTransactionPage;
import com.sms.objectrepository.TransactionPage;

public class CreateTransactionWithlessAmount_genericUtil extends BaseClass
{
	@Test
	public void createTransactionWithLesssAmount() throws Throwable 
	{
		
		//create object for all utility classes
		WebdriverUtility wlib = new WebdriverUtility();
		ExcelUtility elib = new ExcelUtility();
		FileUtility flib = new FileUtility();
		
		//validate Home Page
		String exp = "http://rmgtestingserver/domain/society_management_system/admin/";
		String act = driver.getCurrentUrl();
		assertEquals(act, exp);
		
		//click on transaction
		HomePage hp = new HomePage(driver);
		hp.transaction();
		
		//create invoice
		TransactionPage tp = new TransactionPage(driver);
		tp.transaction(elib.readDataFromExcel("Student", 1, 1), elib.readDataFromExcel("Transaction", 2, 0), elib.readDataFromExcel("Transaction", 1, 1), elib.readDataFromExcel("Transaction", 2, 2));
		
		//logout as admin
		hp.logout();
		
		driver.get("http://rmgtestingserver/domain/Society_Management_System/");
		
		//view Transaction on Student account
		StudentTransactionPage stp = new StudentTransactionPage(driver);
		stp.ViewTransaction(elib.readDataFromExcel("Student", 1, 1));
		stp.clickOnBalance();
		stp.clickOnLogout();
	}
}
