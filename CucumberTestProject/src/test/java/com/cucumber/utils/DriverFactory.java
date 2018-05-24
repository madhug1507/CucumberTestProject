package com.cucumber.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverFactory {

	
	public static WebDriver getDriver(String browserType) 
	{

		//System.out.println(System.getProperty("user.dir")+"\\CucumberTestProject\\src\\test\\resources\\BrowserDrivers\\chromedriver.exe");
		//Launches the browser based on the type provided
		if(browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\BrowserDrivers\\geckodriver.exe");
			return new FirefoxDriver();
		}else if(browserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\BrowserDrivers\\chromedriver.exe");
			return new ChromeDriver();
		}
		return null;
	}
	
	
}


