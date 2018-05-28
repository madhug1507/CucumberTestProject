package com.cucumber.CommonFunctions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.cucumber.ObjectRepository.ObjectRepository;
import com.cucumber.Utils.DriverFactory;


public class DriverCommon {

	public static WebDriver driver;
	
	//public static RemoteWebDriver driver;
	
	public void launchWeb(String URL) 
	{

		try {
			
			//Enter the URL into the address bar
			driver.get(URL);
			//Maximizes the Window
			driver.manage().window().maximize();
			
		} catch (Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}
		
		
	}
	
	public boolean isElementDisplayed(By Key) {
		
		try {
			WebElement element = driver.findElement(Key);	
			return element.isDisplayed();
		}catch(NoSuchElementException e) {
			System.out.println("Element is not displayed"+e.getMessage());
		}
		return false;
	}
	
	public static String getText(By Key) {
		
		try {
			String text = driver.findElement(Key).getText();
			return text;
		}catch(NoSuchElementException e) {
			System.out.println("No Text found: "+e.getMessage());
		}
		return null;
	}
	
	public static void click(By Key) {
		
		try {
			WebElement element = driver.findElement(Key);
			new Actions(driver).moveToElement(element).click().perform();
		}catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public byte[] createAttachment() {
	    return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	} 
	
}
