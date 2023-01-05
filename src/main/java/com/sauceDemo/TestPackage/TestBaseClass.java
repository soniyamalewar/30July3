package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMPackage.POMClass_Login;
import com.sauceDemo.UtilityPacakge.UtilityClass;



public class TestBaseClass 
{
	WebDriver driver;
	
	Logger log=Logger.getLogger("SauceDemoMaven");
	@Parameters("browserName")
	@BeforeMethod
	public void openBrowserUrl(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
	System.setProperty("webdriver.chrome.driver", "./DriverFolder/chromedriver.exe");
	
	driver=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "./DriverFolder/geckodriver.exe");
			
			driver=new FirefoxDriver();
		}
		
		PropertyConfigurator.configure("log4j.properties");
	log.info("Browser is opened");
	
	driver.manage().window().maximize();
	log.info("Window is maximized");
	
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.saucedemo.com/");
	log.info("URL is opened");
	
	UtilityClass.screenShotMethod(driver, "loginSauceDemo");
	
	POMClass_Login pl=new POMClass_Login(driver);
	
	pl.usernameEnter();
	log.info("Username is entered");
	
	pl.passwordEnter();
	log.info("Password is entered");
	
	pl.loginBtnClick();
	log.info("Clicked on login button");
	
	UtilityClass.screenShotMethod(driver, "homePageSauceDemo");
	
	//--homepage--//
	log.info("Entered on home page");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
	driver.close();
	log.info("Browser is closed");
	}
}
