package com.sauceDemo.TestPackage;

import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.POMClass_HomePage;

public class TC03_VerifyAddAllPrdtsFunctionality extends TestBaseClass
{

	@Test
	public void allPrdtsFunctionality()
	{
		POMClass_HomePage ph=new POMClass_HomePage(driver);
		ph.allPrdtsAction();
	
	ph.getTextFromAddToCartBtn();
	
	log.info("Clicked on bagProduct");
	
	log.info("Apply the validation");
	String expectedProductSelection = "6";
	String actualProductSelected = ph.getTextFromAddToCartBtn();  //6
	
	if(expectedProductSelection.equals(actualProductSelected))
	{
		log.info("Bag Product Test case is passed");
	}
	else
	{
		log.info("Bag Product Test case is failed");
	}
	}
}
