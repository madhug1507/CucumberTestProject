package com.cucumber.Utils;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
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
	
	
	public static RemoteWebDriver getRemoteDriver(String browserType) {
		
		try {
			URL nodeURL = new URL("http://localhost:4444/wd/hub");
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("PlaformName", Platform.ANY);     
			
			if(browserType.equalsIgnoreCase("firefox")) {
				cap = DesiredCapabilities.firefox();
				
			}else if(browserType.equalsIgnoreCase("chrome")){
				cap = DesiredCapabilities.chrome();
				
			}
			
			return new RemoteWebDriver(nodeURL,cap);
	
			
		} catch (Exception e1) {
		
			System.out.println(e1.getMessage());
		}
		return null;
	}
	
}


