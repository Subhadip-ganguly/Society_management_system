package com.account;

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
import com.sms.objectrepository.StudentPage;
import com.sms.objectrepository.TransactionPage;

public class CreateStudentId_genericUtil extends BaseClass
{
	@Test
	public void createStudentID() throws Throwable 
	{	
		//create object for all utility
		WebdriverUtility wlib = new WebdriverUtility();
		ExcelUtility elib = new ExcelUtility();
		FileUtility flib = new FileUtility();
		
		//validate Home Page
		String exp = "http://rmgtestingserver/domain/society_management_system/admin/";
		String act = driver.getCurrentUrl();
		assertEquals(act, exp);
		
		//create object for Home Page
		HomePage hp = new HomePage(driver);
		hp.account();
		hp.student();
		
		//create student account
		StudentPage sp = new StudentPage(driver);
		sp.clickOnAddStudent();
		sp.addStudent(elib.getMultipleDataFromExcel("Student", 0, 1, driver), driver,"I" );
		
		hp.transaction();
		//create transaction
		TransactionPage tp = new TransactionPage(driver);
		tp.transaction( elib.readDataFromExcel("Student", 1, 1), elib.readDataFromExcel("Transaction", 2, 0), elib.readDataFromExcel("Transaction", 1, 1), "550");	
		
	}
}
