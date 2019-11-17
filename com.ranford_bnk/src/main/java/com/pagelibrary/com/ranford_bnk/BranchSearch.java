package com.pagelibrary.com.ranford_bnk;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class BranchSearch extends Base{
	public static WebElement Country_Dropdown() 
	{
		return driver.findElement(getElement("Country1"));
	}
	public static WebElement State_Dropdown() 
	{
		return driver.findElement(getElement("State1"));
	}
	public static WebElement City_dropdown() 
	{
		return driver.findElement(getElement("city1"));
	}
	public static WebElement Search_btn() 
	{
		return driver.findElement(getElement("search"));
	}
	public static WebElement Clear_btn() 
	{
		return driver.findElement(getElement("clear"));
	}


}
