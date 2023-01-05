package com.sauceDemo.TestPackage;

import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.POMClass_HomePage;



public class TC04_VerifyLogOutFunctionality extends TestBaseClass
{

	@Test
	public void verifyLogOutFunctionality()
	{
		POMClass_HomePage ph=new POMClass_HomePage(driver);
		
		ph.clickSettingBtn();
		
		ph.clickLogoutBtn();
		
		log.info("Went on Login Page");
		
		log.info("Apply Validation");
		
		String expectedURL="https://www.saucedemo.com/";
		String actualURL=driver.getCurrentUrl();
		
		if(expectedURL.equals(actualURL))
		{
			log.info("Log Out Test Case passed");
		}
		else
		{
			log.info("Logout Test Case failed");
		}
	}
}
