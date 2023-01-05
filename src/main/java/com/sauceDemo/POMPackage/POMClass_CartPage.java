package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass_CartPage 
{
WebDriver driver;
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement remove;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	WebElement continueShopping;
	
	public void clickRemoveBtn()
	{
		remove.click();
	}
	
	public void clickCheckOut()
	{
		checkout.click();
	}
	
	public POMClass_CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
