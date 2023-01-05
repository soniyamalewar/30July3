package com.sauceDemo.UtilityPacakge;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass
{
	public static void screenShotMethod(WebDriver driver, String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./ScreenShotFolder/"+name+".jpg");
		FileHandler.copy(sourceFile, destFile);
	}

}
