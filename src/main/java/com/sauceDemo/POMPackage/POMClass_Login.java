package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass_Login 
{

	
		
		//1.WebDriver declare
		//2.elements find using @FindBy()
		//3.Action methods
		//4.constructor declare
		
		
		//declare WebDriver
		private WebDriver driver;
		
		//Find Ele using @FindBy annotation, but not with findElement()
		@FindBy(xpath="//input[@id='user-name']") 
		private WebElement username;
		
		@FindBy(xpath="//input[@id='password']")
		private WebElement password;
		
		@FindBy(xpath="//input[@id='login-button']")
		private WebElement loginBtn;
		
		//action methods to perform action
	    public void usernameEnter()
		{
			username.sendKeys("standard_user");
			System.out.println("Entered username");
		}
		public void passwordEnter()
		{
			password.sendKeys("secret_sauce");
			System.out.println("Entered password");
		}
		public void loginBtnClick()
		{
			loginBtn.click();
			System.out.println("Clicked on login btn");
		}
		
		//declare constructor
		public POMClass_Login(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		
	}


