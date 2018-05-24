package com.cucumber.stepdef;

import java.util.List;

import org.junit.Assert;
import org.testng.asserts.*;

import com.cucumber.commonFunctions.DriverCommon;
import com.cucumber.objectRepository.ObjectRepository;
import com.cucumber.utils.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOneStepDef extends DriverCommon{

	/*
	 * This Before and After will be executed first every time 
	 */
	@Before
	public void setup() {
		//initiating the ChromeDriver
		driver = DriverFactory.getDriver("chrome");
	}
	
	@After
	public void tearDown() {
		//closes the browsers and quits the session
		driver.quit();
	}
	
	@When("^Open the browser and I am visiting the page$")
	public void Open_the_browser_and_I_am_visiting_the_page() {
		//It launches the browser with mentioned URL
		launchWeb("http://localhost:8000/");		
	}
	
	@When("^I would like to see a list or grid of bikes$")
	public void I_would_like_to_see_a_list_grid_of_bikes() {
		
		//Validating if the grid view of the bikes are displayed or not
		Assert.assertTrue(isElementDisplayed(ObjectRepository.gridView));
		//Getting list bikes in grid
		List<WebElement> noOfBikes = driver.findElements(ObjectRepository.gridView);
		//Getting list of bikenames in grid 
		List<WebElement> bikeTitles = driver.findElements(ObjectRepository.bikeNames);
		//Validating if the no of Bikes displayed are are matching with the grid count 
		Assert.assertEquals(noOfBikes.size(),bikeTitles.size());
				
	}
	
	@And("^I would like to see the name an image a description and the class name for each  bike$")
	public void I_would_like_to_see_the_name_an_image_a_description_and_the_class_name_for_each_bike() 
	{
		
		//Getting list of bikenames in grid 
		List<WebElement> bikeTitles = driver.findElements(ObjectRepository.bikeNames);
		List<WebElement> bikeImages = driver.findElements(ObjectRepository.bikeImages);
		for(int i=0;i<bikeTitles.size();i++) 
		{
			//Validating name, description and class are displayed
			Assert.assertTrue(bikeTitles.get(i).getText(), isElementDisplayed(ObjectRepository.bikeNames));
			//Validating Bike images are displayed or not
			Assert.assertTrue(isElementDisplayed(ObjectRepository.bikeImages));
			
		}
	}
	@When("^I filter by the class bikes should be able to sort into custom order$")
	public void I_would_like_to_be_able_to_sort_the_bikes_into_a_custom_order_based_onclass() throws Exception {
		
		//Sorting By Endurance, Clicks endurance checkbox and validates, all bikes related to endurance are displayed
		click(ObjectRepository.enduranceCheckbox);
		Thread.sleep(4000);
		
		List<WebElement> bikeTitles = driver.findElements(ObjectRepository.bikeNames);
		//six bikes should be displayed with endurance
		Assert.assertEquals(bikeTitles.size(), 6);
		click(ObjectRepository.enduranceCheckbox);
		
		//Sorting By Race
		click(ObjectRepository.raceCheckbox);
		Thread.sleep(2000);
		List<WebElement> bikeTitles2 = driver.findElements(ObjectRepository.bikeNames);
		//six bikes should be displayed with endurance
		Assert.assertEquals(bikeTitles2.size(), 4);
		click(ObjectRepository.raceCheckbox);
		
		//Sorting By comfort
		click(ObjectRepository.comfortCheckbox);
		List<WebElement> bikeTitles3 = driver.findElements(ObjectRepository.bikeNames);
		//six bikes should be displayed with endurance
		Assert.assertEquals(bikeTitles3.size(), 4);	
		click(ObjectRepository.comfortCheckbox);
		
		//Sorting By comfort, Race and Endurance should return 1
		click(ObjectRepository.enduranceCheckbox);
		click(ObjectRepository.comfortCheckbox);
		click(ObjectRepository.raceCheckbox);
		List<WebElement> bikeTitles4 = driver.findElements(ObjectRepository.bikeNames);
		//six bikes should be displayed with endurance
		Assert.assertEquals(bikeTitles4.size(), 1);	
		click(ObjectRepository.enduranceCheckbox);
		click(ObjectRepository.comfortCheckbox);
		click(ObjectRepository.raceCheckbox);		

		//Sorting By comfort, Race and Endurance should return 3
		click(ObjectRepository.enduranceCheckbox);
		click(ObjectRepository.comfortCheckbox);
		List<WebElement> bikeTitles5 = driver.findElements(ObjectRepository.bikeNames);
		//six bikes should be displayed with endurance
		Assert.assertEquals(bikeTitles5.size(), 3);	
		click(ObjectRepository.enduranceCheckbox);
		click(ObjectRepository.comfortCheckbox);
				
	
	
	}
}