package com.account;

import static org.testng.Assert.*;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sms.genericUtils.BaseClass;
import com.sms.genericUtils.ExcelUtility;
import com.sms.genericUtils.WebdriverUtility;
import com.sms.objectrepository.AdministratorPage;
import com.sms.objectrepository.HomePage;


public class CreateAdmin_genericUtil extends BaseClass
{
	@Test
	public void createAdmin() throws Throwable
	{
		
		
		//create object for all utility classes
		WebdriverUtility wlib = new WebdriverUtility();
		ExcelUtility elib = new ExcelUtility();
		
		//validate Home Page
		String exp = "http://rmgtestingserver/domain/society_management_system/";
		String act = driver.getCurrentUrl();
		assertEquals(act, exp);
		
		//create object for home page
		HomePage hp = new HomePage(driver);
		hp.account();
		hp.administrator();
		
		//create object for admin page
		AdministratorPage ap = new AdministratorPage(driver);
		ap.clickOnAddAdmin();
		ap.addAdmin(elib.getMultipleDataFromExcel("Admin", 0, 1,driver), driver);
		ap.saveAdmin();
		
		//handle alert popup
		wlib.acceptAlertPopup(driver, "username already taken");
		
		//validate admin page
		ap.adminPageValidate();
		
	}
}
