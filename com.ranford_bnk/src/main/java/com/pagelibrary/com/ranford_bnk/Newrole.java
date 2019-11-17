package com.pagelibrary.com.ranford_bnk;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Newrole extends Base {
	public static WebElement RoleName_Editbox() 
	{
		return driver.findElement(getElement("rolename"));
	}
	public static WebElement RoleDesc_Editbox() 
	{
		return driver.findElement(getElement("roledesc"));
	}
	public static WebElement RoleType_btn() 
	{
		return driver.findElement(getElement("roletype"));
	}
	public static WebElement Submit_btn() 
	{
		return driver.findElement(getElement("submit"));
	}
	public static WebElement Cancel_btn() 
	{
		return driver.findElement(getElement("cancel"));
	}
   

}
