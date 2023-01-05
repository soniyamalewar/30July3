package com.sauceDemo.TestPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.POMClass_CartPage;
import com.sauceDemo.POMPackage.POMClass_HomePage;
import com.sauceDemo.UtilityPacakge.UtilityClass;

public class TC02_VerifyAddPrdtFunctionality extends TestBaseClass
{

	@Test
	public void addPrdtFunctionality() throws IOException
{
	POMClass_HomePage ph=new POMClass_HomePage(driver);
	UtilityClass.screenShotMethod(driver, "homePage");
	ph.clickBagPrdtbtn();
	
	ph.getTextFromAddToCartBtn();
	
	log.info("Clicked on bagProduct");
	
	POMClass_CartPage pc=new POMClass_CartPage(driver);
	pc.clickRemoveBtn();
	
	//pc.clickCheckOut();
	
	//--login page--//
	
	String givenTitle="Swag Labs";
	String actualTitle=driver.getTitle();
	if(givenTitle.equals(actualTitle))
	{
		log.info("Cart Page Test Case passed");
	}
	else
	{
		log.info("Cart Page test case failed");
	}
	
}
}
