package com.sauceDemo.TestPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import com.sauceDemo.UtilityPacakge.UtilityClass;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
	@Test
	public void loginFunctionality() throws IOException
	{
	UtilityClass.screenShotMethod(driver, "loginPage");
	String givenTitle="Swag Labs";
	String actualTitle=driver.getTitle();
	
	if(givenTitle.equals(actualTitle))
	{
		log.info("Test Case is passed");
	}
	else
	{
		log.info("Test Case is failed");
	}
	}
}
