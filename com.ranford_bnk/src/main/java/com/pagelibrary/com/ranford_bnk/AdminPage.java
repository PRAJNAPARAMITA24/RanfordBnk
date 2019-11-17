package com.pagelibrary.com.ranford_bnk;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class AdminPage extends Base {

	public static WebElement Branches_Btn()
	{
		return driver.findElement(getElement("branches_btn"));
	}
	public static WebElement roles_Btn()
	{
		return driver.findElement(getElement("roles"));
	}
}
