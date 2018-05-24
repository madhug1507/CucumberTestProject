package com.cucumber.objectRepository;

import org.openqa.selenium.By;

public class ObjectRepository {

	/*
	 * xpaths and CSS values will be written in this class, if there are any changes in the Web page due to new design changes
	 * then related xpaths and CSS can be modified here. re-useablity will be easy and can avoid hard coding
	 */
	public static final By gridView = By.xpath("//div[@ng-repeat='p in filteredProducts' and @class='col-sm-4 ng-scope' ]");
	public static final By bikeNames = By.xpath("//div[@class='panel-heading ng-binding']");
	public static final By bikeImages = By.xpath("//img[starts-with(@src,'https://jujhar.com/images/bikes/')]");
	public static final By enduranceCheckbox = By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/input");
	public static final By raceCheckbox = By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/input");
	public static final By comfortCheckbox = By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[3]/input");
}
//input[@type='checkbox']/../span[@class='capitalise ng-binding' and contains(.,'comfort')]