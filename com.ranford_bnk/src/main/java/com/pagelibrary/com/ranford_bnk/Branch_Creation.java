package com.pagelibrary.com.ranford_bnk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Branch_Creation extends Base{

	public static WebElement New_Branch()
	{
		return driver.findElement(getElement("newbranch"));
	}
	public static WebElement Branchname()
	{
		return driver.findElement(getElement("branchname"));
	}
	public static WebElement Address1()
	{
		return driver.findElement(getElement("address1"));
	}
	public static WebElement Address2()
	{
		return driver.findElement(getElement("address2"));
	}
	public static WebElement Address3()
	{
		return driver.findElement(getElement("address3"));
	}
	public static WebElement Area()
	{
		return driver.findElement(getElement("area"));
	}

	public static  WebElement Zipcode()
	{
		return driver.findElement(getElement("zipcode"));
	}
	public static WebElement country()
	{
		return driver.findElement(getElement("country"));

	}
	public static WebElement state()
	{
		return driver.findElement(getElement("state"));
	}
	public static WebElement city()
	{
		return driver.findElement(getElement("city"));
	}
	public static WebElement submit()
	{
		return driver.findElement(getElement("submit"));
	}
}
