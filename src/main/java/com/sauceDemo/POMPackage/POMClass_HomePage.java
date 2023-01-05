package com.sauceDemo.POMPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass_HomePage 
{

	private WebDriver driver;
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement setting;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cart;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;
	
//	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
//	private WebElement bagPrdt;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagPrdt;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addToCartBtn;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private  List<WebElement> allProducts;

	
	public void clickSettingBtn()
	{
		setting.click();
		System.out.println("Clicked on setting btn");
	}
	
	
	public String getTextFromAddToCartBtn()
	{
		String totalProductSelected =addToCartBtn.getText();
		return totalProductSelected; //1
	}

	public void clickLogoutBtn()
	{
		logout.click();
		System.out.println("Clicked on logout btn");
	}
	
	public void clickBagPrdtbtn()
	{
		bagPrdt.click();
		System.out.println("Prdt added to cart");
	}
	
	public void allPrdtsAction()
	{
		for(WebElement item:allProducts)
		{
			item.click();
		}

	}
	
	public POMClass_HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
