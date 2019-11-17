package com.pagelibrary.com.ranford_bnk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;

import TestBase.Base;
import Utility.Generic_Class;
import Wetbable.Webtable;



public abstract class Reprository extends Base{

	ExtentReports report;
	
	ExtentTest    test;
	
	@BeforeTest
	public void generate_report()
	{
		report=new ExtentReports(".\\extentreport\\report.html",true);
		
	}
	@BeforeMethod
	public void Send_method_To_report(Method method)
	{
		test=report.startTest((this.getClass().getSimpleName()+" : : "+method.getName()));
		test.assignAuthor("krishna");
		test.assignCategory("Smoke");
		
	}
	@AfterMethod
	public void save_report()
	{
		report.flush();
	}
	
	public void Launch()
	{
		//System.setProperty("webdriver.chrome.driver", "‪C:\\Users\\MYPC\\Desktop\\ranford\\com.ranford_bnk\\com.ranford_bnk\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		test.log(LogStatus.INFO, "BRowser Has launch");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "BRowser Has maximized");
		driver.get(GetConfig("Build1"));
		test.log(LogStatus.INFO, "Url Is Navigated");
		String ActualUrl=driver.getCurrentUrl();
		try
		{
			org.testng.Assert.assertEquals(ActualUrl, GetConfig("Build1"));
			Assert.assertTrue(ActualUrl.equals(GetConfig("Build1")),"Launch Is success");
			test.log(LogStatus.PASS, "My expURl :- "+GetConfig("Build1")+" is matching mith my actualURl :- "+ActualUrl);
			test.log(LogStatus.INFO, "Launch Is done successfully");
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "My expURl :- "+GetConfig("Build1")+" is not matching mith my actualURl :- "+ActualUrl);
			test.log(LogStatus.INFO, "404 Error Page Is not ready to load");
			Assert.fail("page  is not loaded :- "+e.getMessage());
			
		}
		}
	

	public void login_TC()
	{
		test.log(LogStatus.INFO, "2. Verifaction Of Branches_creation");
		test.log(LogStatus.INFO, "TCCase Id :- TC2345");
		//username
		try {
		Assert.assertTrue(LoginPage.Username_editbox().isDisplayed());
		test.log(LogStatus.INFO, "username field is displayed");
		LoginPage.Username_editbox().sendKeys(GetConfig("username"));
		}
		catch(Exception e) {
			Assert.fail("verification of username field is failed");
			test.log(LogStatus.INFO, "username field is not displayed");
		}
		//password
		try {
		Assert.assertTrue(LoginPage.Password_editbox().isDisplayed());
		test.log(LogStatus.INFO, "password field is displayed ");
		 LoginPage.Password_editbox().sendKeys(GetConfig("password"));
		}	
		catch(Exception e) {
			Assert.fail("verification of password field is failed");
			test.log(LogStatus.INFO, "password field is not displayed");
		}
		//login
		try {
		Assert.assertTrue(LoginPage.Login_btn().isDisplayed());
		test.log(LogStatus.INFO, "login btn is displayed");
	    Generic_Class.JSClick(LoginPage.Login_btn());
	    }
	    catch(Exception e) {
		Assert.fail("verification of username field is failed");
		test.log(LogStatus.INFO, "username field is not displayed");
	   }
		}
	public void branch_btn() {
		//branchs btn
		try {
		Assert.assertTrue(AdminPage.Branches_Btn().isDisplayed());
		test.log(LogStatus.INFO, "Branches btn is displayed");
		Generic_Class.JSClick(AdminPage.Branches_Btn());
		}
		catch(Exception e) {
			Assert.fail("verification of login btn is failed");
			test.log(LogStatus.INFO, "login btn is not displayed");
		   }
	}
	public void BranchCreation_TC()
	{
		test.log(LogStatus.INFO, "2. Verifaction Of Branches_creation");
		test.log(LogStatus.INFO, "TCCase Id :- TC2345");
		//NewBranch
		try
		{
			Assert.assertTrue(Branch_Creation.New_Branch().isDisplayed());
			test.log(LogStatus.INFO, "NewBranches BTn is displayed");
			Generic_Class.JSClick(Branch_Creation.New_Branch());
		}
		catch(Exception e)
		{
			Assert.fail("verification of newbranch btn is failed");
			test.log(LogStatus.INFO, "newbranch btn is not displayed");
		}
		//BranchName
		try {
			
			Assert.assertTrue(Branch_Creation.Branchname().isDisplayed());
			test.log(LogStatus.INFO, "Branchname is displayed");
			Branch_Creation.Branchname().sendKeys(GetConfig("Branchname"));
		}
	   catch(Exception e) {
		   
			Assert.fail("verifiction of branchName field is failed");
			test.log(LogStatus.INFO, "branchName field is not displayed");
		}
		//Address1
		try {
			
		   Assert.assertTrue(Branch_Creation.Address1().isDisplayed());
		   test.log(LogStatus.INFO, "Address1 field is displayed");
		   Branch_Creation.Address1().sendKeys(GetConfig("Address1"));
		}
		catch(Exception e)
		{
			Assert.fail("verfication of Address1 field is failed");
			test.log(LogStatus.INFO, "Address1 field is not displayed");
			
		}
		//Address2
				try {
					
				   Assert.assertTrue(Branch_Creation.Address2().isDisplayed());
				   test.log(LogStatus.INFO, "Address2 field is displayed");
				   Branch_Creation.Address2().sendKeys(GetConfig("Address2"));
				}
				catch(Exception e)
				{
					Assert.fail("verfication of Address2 field is failed");
					test.log(LogStatus.INFO, "Address2 field is not displayed");
					
				}
		//Address3
				try {
					
				   Assert.assertTrue(Branch_Creation.Address3().isDisplayed());
				   test.log(LogStatus.INFO, "Address3 field is displayed");
				   Branch_Creation.Address3().sendKeys(GetConfig("Address3"));
				}
				catch(Exception e)
				{
					Assert.fail("verfication of Address3 field is failed");
					test.log(LogStatus.INFO, "Address3 field is not displayed");
					
				}
		//Area
		try {
			
			Assert.assertTrue(Branch_Creation.Area().isDisplayed());
			test.log(LogStatus.INFO, "Area field is displayed");
			Branch_Creation.Area().sendKeys(GetConfig("Area"));
					}
			catch(Exception e)
			{
				Assert.fail("verfication of Area field is failed");
				test.log(LogStatus.INFO, "Area field is not displayed");
				
			}
		//Zipcode
       try {
	     
    	   Assert.assertTrue(Branch_Creation.Zipcode().isDisplayed());
	       test.log(LogStatus.INFO, "Zipcode field is displayed");
	       Branch_Creation.Zipcode().sendKeys(GetConfig("zipcode"));
			}
			catch(Exception e)
			{
				Assert.fail("verfication of Zipcode is failed");
				test.log(LogStatus.INFO, "Zipcode is not displayed");
			
			}
			
		//country dropdown
			try
			{
		       List<String> expdata=new ArrayList<>();
			   expdata.add("INDIA");expdata.add("UK");expdata.add("USA");
			   List<String>  ActualData=Generic_Class.DP_Handle_verify(Branch_Creation.country());
			  
			   
			boolean result= Generic_Class.Is_equals(expdata, ActualData);
			   
			Assert.assertTrue(result, "Verifaction of country DP");
			     test.log(LogStatus.INFO, "Country dropdown is displayed");
			     
			      }
			catch(Exception e)
			{
				Assert.fail("Verifaction of Dropdown country iS Failed");
				test.log(LogStatus.INFO, "Country dropdown is not displayed");
				
			}
		  //state dropdown
			try
			{
		       List<String> expdata=new ArrayList<>();
			   expdata.add("andra pradesh");expdata.add("tamil nadu");expdata.add("Delhi");expdata.add("GOA");expdata.add("MAHARASTRA");expdata.add("Karnataka");expdata.add("Kerala");
			   List<String>  ActualData=Generic_Class.DP_Handle_verify(Branch_Creation.state());
			   
				
			boolean result= Generic_Class.Is_equals(expdata, ActualData);
			     Assert.assertTrue( result,"Verifaction of Dropdown state");
			     test.log(LogStatus.INFO, "state dropdown is displayed");
				 
			     }
			catch(Exception e)
			{
				Assert.fail("Verifaction of Dropdown state iS Failed");
				test.log(LogStatus.INFO, "state dropdown is  not displayed");
				 
			}

			
			//city dropdown
			try
			{
		       List<String> expdata=new ArrayList<>();
			   expdata.add("Hyderabad");expdata.add("Secundarabad");expdata.add("Nellore");expdata.add("TENALI");
			   List<String>  ActualData=Generic_Class.DP_Handle_verify(Branch_Creation.city());
			  
			boolean result= Generic_Class.Is_equals(expdata, ActualData);
			     Assert.assertTrue(result,"verification of city dropdown ");
			     test.log(LogStatus.INFO, "City dropdown is displayed");
				 
			     }
			catch(Exception e)
			{
				Assert.fail("Verifaction of Dropdown city iS Failed");
				test.log(LogStatus.INFO, "City dropdown is not displayed");
				 
			}
            
			//submit
			try {
	        Assert.assertTrue(Branch_Creation.submit().isDisplayed());
			test.log(LogStatus.INFO, "submit is displayed");
			Generic_Class.JSClick(Branch_Creation.submit());
            String actualTest=driver.switchTo().alert().getText();
			
			String expText="Created Successfully";
			
			Assert.assertTrue(actualTest.contains(expText),"Branch is created");
			
			   String BranchId=actualTest.split(" ")[4];
			driver.switchTo().alert().accept();
			test.log(LogStatus.PASS, "new Branch Is Created With Id :- "+BranchId);
			
			test.log(LogStatus.INFO, "Verify The Id "+BranchId+" is present in The table");
			
			Webtable.BR_Table_Handle("edit", By.id(""), BranchId);
			
			
			}
			catch(Exception e) {
				Assert.fail("verfication of submit btn is failed");
				test.log(LogStatus.INFO, "submit is not displayed");
			}
}
	//--------------------------------------------------------------------------------------------------------
//			public void Banches_search_Tc()
//			{
//				//country
//		        try
//				{
//					 List<String> expdata=new ArrayList<>();
//				     expdata.add("INDIA");expdata.add("EUROPE");expdata.add("USA");
//				     
//				     List<String> ActualData=Generic_Class.DP_Handle_verify(Branches.Country_Dropdown());
//				      boolean result= Generic_Class.Is_equals(expdata, ActualData);
//				     Assert.assertTrue(result,"Verifaction of Dropdown country ");
//				     
//				     test.log(LogStatus.INFO, "country dropdown is displayed");
//				     
//				     }
//				catch(Exception e)
//				{
//					Assert.fail("Verifaction of Dropdown country iS Failed");
//					test.log(LogStatus.INFO,"country dropdown is not displayed");
//				}
//		        
//		        //state
//		        try
//				{
//					 List<String> expdata=new ArrayList<>();
//				     expdata.add("Andhrapradesh");expdata.add("tamil nadhu");expdata.add("GOA");expdata.add("DELHI");expdata.add("karnathaka");expdata.add("MAHARASTRA");
//				     List<String> ActualData=Generic_Class.DP_Handle_verify(Branches.State_Dropdown());
//					
//				    boolean result= Generic_Class.Is_equals(expdata, ActualData);
//				     Assert.assertTrue(result,"Verifaction of Dropdown state" );
//				     test.log(LogStatus.INFO, "state dropdown is displayed");
//				     }
//				catch(Exception e)
//				{
//					Assert.fail("Verifaction of Dropdown state iS Failed");
//					test.log(LogStatus.INFO,"state dropdown is not displayed");
//				}
//		        //city
//		        try
//				{
//					 List<String> expdata=new ArrayList<>();
//				     expdata.add("Hyderabad");expdata.add("secundrabad");expdata.add("TENALI");expdata.add("Nellore");
//				     List<String> ActualData=Generic_Class.DP_Handle_verify(Branches.City_dropdown());
//					
//				    boolean result= Generic_Class.Is_equals(expdata, ActualData);
//				     Assert.assertTrue( result,"Verifaction of Dropdown city ");
//				     test.log(LogStatus.INFO, "city dropdown is displayed");
//				     }
//				catch(Exception e)
//				{
//					Assert.fail("Verifaction of Dropdown city iS Failed");
//					test.log(LogStatus.INFO,"city dropdown is not displayed");
//				}
//		       //search btn
//		      try 
//		      {
//		        Assert.assertTrue(Branches.Search_btn().isDisplayed());
//		        test.log(LogStatus.INFO, "search btn is displayed");
//		        Generic_Class.JSClick(Branches.Search_btn());
//		      }
//		      catch(Exception e) {
//		    	  Assert.fail("Verifaction of search btn iS Failed");
//					test.log(LogStatus.INFO,"search btn is not displayed");
//				  }
//			}
////	//----------------------------------------------------------------------------------------------		
//	          public void roles_Tc()
//	          {
//	           		      
//	        	//Roles  
//	          try 
//	          {
//		      Assert.assertTrue(AdminPage.Roles_btn().isDisplayed());
//		      test.log(LogStatus.INFO, "roles btn is displayed");
//		      Generic_Class.JSClick(AdminPage.Roles_btn());
//		      }
//		      catch(Exception e) {
//		    	  Assert.fail("Verifaction of roles btn iS Failed");
//					test.log(LogStatus.INFO,"roles btn is not displayed");
//				  }
//		      //NewRole_btn
//		      try
//		      {
//		      Assert.assertTrue(NewRole.NewRole_btn().isDisplayed());
//		      test.log(LogStatus.INFO, "NewBranch btn is displayed");
//		      Generic_Class.JSClick(NewRole.NewRole_btn());
//		      }
//		      catch(Exception e) {
//		    	  Assert.fail("Verifaction of NewRole btn iS Failed");
//					test.log(LogStatus.INFO,"Newrole btn is not displayed");
//				  }
//		    
//              //RoleName
//		      
//		      try
//		      {
//		      Assert.assertTrue(NewRole.RoleName().isDisplayed());
//		      test.log(LogStatus.INFO,"RoleName field is displayed");
//		      NewRole.RoleName().sendKeys(GetConfig("RoleName"));
//		      }
//		      catch(Exception e) {
//		    	  Assert.fail("Verifaction of RoleName field iS Failed");
//					test.log(LogStatus.INFO,"RoleName field is not displayed");
//				  }
//		    //Role Desc
//		      try
//		      {
//		      Assert.assertTrue(NewRole.RoleDesc().isDisplayed());
//		      test.log(LogStatus.INFO,"RoleDesc field is displayed");
//		      NewRole.RoleDesc().sendKeys(GetConfig("RoleDesc"));
//		      }
//		      catch(Exception e) {
//		    	  Assert.fail("Verifaction of RoleDesc field iS Failed");
//					test.log(LogStatus.INFO,"RoleDesc field is not displayed");
//				  }
//		      //Role Type
//		       try
//				{
//					 List<String> expdata=new ArrayList<>();
//				     expdata.add("E");expdata.add("C");
//				     List<String> ActualData=Generic_Class.DP_Handle_verify(NewRole.RoleType());
//					
//				    boolean result= Generic_Class.Is_equals(expdata, ActualData);
//				     Assert.assertTrue(result,"Verifaction of Dropdown city");
//				     test.log(LogStatus.INFO, "RoleType dropdown is displayed");
//				     }
//				catch(Exception e)
//				{
//					Assert.fail("Verifaction of Dropdown RoleType iS Failed");
//					test.log(LogStatus.INFO,"RoleType dropdown is not displayed");
//				}
//		      //Submit
//		      try
//		      {
//		      Assert.assertTrue(NewRole.Submit_btn().isDisplayed());
//		      test.log(LogStatus.INFO,"Submit btn is displayed");
//		      Generic_Class.JSClick(NewRole.Submit_btn());
//		      }
//		      catch(Exception e) {
//		    	  Assert.fail("Verifaction of submit btn iS Failed");
//					test.log(LogStatus.INFO,"submit btn is not displayed");
//				  }
//	          }
////	//----------------------------------------------------------------------------------------------------	      
//		   public void Users_Tc()
//		   {
//	          //users
//		      try {
//		      Assert.assertTrue(AdminPage.Users_btn().isDisplayed());
//		      test.log(LogStatus.INFO,"Users btn is displayed");
//		      Generic_Class.JSClick(AdminPage.Users_btn());
//		      }
//		      catch(Exception e) {
//		    	  Assert.fail("Verifaction of users btn iS Failed");
//					test.log(LogStatus.INFO,"users btn is not displayed");
//				  }
//		      //NewUser
//		      try {
//			      Assert.assertTrue(NewUser.NewUser_btn().isDisplayed());
//			      test.log(LogStatus.INFO,"NewUser btn is displayed");
//			      Generic_Class.JSClick(NewUser.NewUser_btn());
//			      }
//			      catch(Exception e) {
//			    	  Assert.fail("Verifaction of Newuser btn iS Failed");
//						test.log(LogStatus.INFO,"Newuser btn is not displayed");
//					  }
//			  //Role
//		      try
//				{
//					 List<String> expdata=new ArrayList<>();
//				     expdata.add("icustomer");expdata.add("ccustomer");expdata.add("Ncustomer");expdata.add("Tester12");expdata.add("Accounts");
//				     expdata.add("managerkanchi");expdata.add("Tech support");expdata.add("Analyst");expdata.add("Director");expdata.add("Accountant");
//				     List<String> ActualData=Generic_Class.DP_Handle_verify(NewUser.Role_dropdown());
//					
//				    boolean result= Generic_Class.Is_equals(expdata, ActualData);
//				     Assert.assertTrue(result,"Verifaction of RoleDropdown");
//				     test.log(LogStatus.INFO, "Role dropdown is displayed");
//				     }
//				catch(Exception e)
//				{
//					Assert.fail("Verifaction of Dropdown Role iS Failed");
//					test.log(LogStatus.INFO,"Role dropdown is not displayed");
//				}
//		      
//		      
//			//Branch
//		      try
//				{
//					 List<String> expdata=new ArrayList<>();
//				     expdata.add(" ");expdata.add(" ");expdata.add(" ");expdata.add(" ");expdata.add(" ");
//				     expdata.add(" ");expdata.add(" ");expdata.add(" ");expdata.add(" ");expdata.add(" ");
//				     List<String> ActualData=Generic_Class.DP_Handle_verify(NewUser.Branch_dropdown());
//					
//				    boolean result= Generic_Class.Is_equals(expdata, ActualData);
//				     Assert.assertTrue(result,"Verifaction of BranchDropdown");
//				     test.log(LogStatus.INFO, "Branch dropdown is displayed");
//				     }
//				catch(Exception e)
//				{
//					Assert.fail("Verifaction of Dropdown Branch iS Failed");
//					test.log(LogStatus.INFO,"Branch dropdown is not displayed");
//				}
//		    
//		      
//			//CustomerId
//		      try {
//			      Assert.assertTrue(NewUser.CustomerID_dropdown().isDisplayed());
//			      test.log(LogStatus.INFO,"CustomerId dropdown is displayed");
//			      
//			       }
//			      catch(Exception e) {
//			    	  Assert.fail("Verifaction of Customer Id dropdown iS Failed");
//						test.log(LogStatus.INFO,"Customer id dropdown is not displayed");
//					  }
//			//CustomerName
//		    
//		      try {
//			      Assert.assertTrue(NewUser.CustomerName().isDisplayed());
//			      test.log(LogStatus.INFO,"Customer name is displayed");
//			      NewUser.CustomerName().sendKeys(GetConfig("CustomerName"));
//			      }
//			      catch(Exception e) {
//			    	  Assert.fail("Verifaction of CustomerName field iS Failed");
//						test.log(LogStatus.INFO,"CustomerName is not displayed");
//					  }
//			
//		      //username
//		      try {
//			      Assert.assertTrue(NewUser.UserName().isDisplayed());
//			      test.log(LogStatus.INFO,"UserName is displayed");
//			      NewUser.UserName().sendKeys(GetConfig("UserName"));
//			      }
//			      catch(Exception e) {
//			    	  Assert.fail("Verifaction of UserName field iS Failed");
//						test.log(LogStatus.INFO,"UserName is not displayed");
//					  }
//			//Login password
//		      try {
//			      Assert.assertTrue(NewUser.Login_password().isDisplayed());
//			      test.log(LogStatus.INFO,"Login Password is displayed");
//			      NewUser.Login_password().sendKeys(GetConfig("LoginPassword"));
//			      }
//			      catch(Exception e) {
//			    	  Assert.fail("Verifaction of Login Password field iS Failed");
//						test.log(LogStatus.INFO,"Login Password is not displayed");
//					  }
//		
//		    //Transaction password
//		      
//		      try {
//			      Assert.assertTrue(NewUser.Transaction_password().isDisplayed());
//			      test.log(LogStatus.INFO,"UserName is displayed");
//			      NewUser.Transaction_password().sendKeys(GetConfig("TransactionPassword"));
//			      }
//			      catch(Exception e) {
//			    	  Assert.fail("Verifaction of Transaction password field iS Failed");
//						test.log(LogStatus.INFO,"Transaction password is not displayed");
//					  }
//		   //Submit
//		      try {
//			      Assert.assertTrue(NewUser.Submit_btn().isDisplayed());
//			      test.log(LogStatus.INFO,"Submit btn is displayed");
//			      Generic_Class.JSClick(NewUser.Submit_btn());
//			      }
//			      catch(Exception e) {
//			    	  Assert.fail("Verifaction of Submit btn iS Failed");
//						test.log(LogStatus.INFO,"Submit btn is not displayed");
//					  }
//		   }
//	//-------------------------------------------------------------------------------------------	
//		      //Employee btn
//		      
//		      try {
//			      Assert.assertTrue(AdminPage.Employee_btn().isDisplayed());
//			      test.log(LogStatus.INFO,"Employee btn is displayed");
//			      Generic_Class.JSClick(AdminPage.Employee_btn());
//			      }
//			      catch(Exception e) {
//			    	  Assert.fail("Verifaction of Employee btn iS Failed");
//						test.log(LogStatus.INFO,"Employee btn is not displayed");
//					  }
//		      //Employee Name
//		      try {
//			      Assert.assertTrue(Employees.EmployeeName().isDisplayed());
//			      test.log(LogStatus.INFO,"EmployeeName is displayed");
//			      Employees.EmployeeName().sendKeys(GetConfig("EmployeeName"));
//			      }
//			      catch(Exception e) {
//			    	  Assert.fail("Verifaction of EmployeeName iS Failed");
//						test.log(LogStatus.INFO,"EmployeeName is not displayed");
//					  }
//		    
//		      //Login Password
//		      try {
//			      Assert.assertTrue(Employees.LoginPassword().isDisplayed());
//			      test.log(LogStatus.INFO,"LoginPassword is displayed");
//			      Employees.LoginPassword().sendKeys(GetConfig("LoginPassword"));
//			      }
//			      catch(Exception e) {
//			    	  Assert.fail("Verifaction of LoginPassword iS Failed");
//						test.log(LogStatus.INFO,"LoginPassword is not displayed");
//					  }
//		    //Role dropdown
//		      try
//				{
//					 List<String> expdata=new ArrayList<>();
//				     expdata.add("k");expdata.add("ExternalConsultant");expdata.add("Aswghfhyfy");expdata.add("Controller");expdata.add("cre");
//				     expdata.add("cred");expdata.add("tellerhdfc");expdata.add("srijay123");expdata.add("gcgfh");expdata.add("ProbationaryOfficer");
//				     List<String> ActualData=Generic_Class.DP_Handle_verify(Employees.Role_dropdown());
//					
//				    boolean result= Generic_Class.Is_equals(expdata, ActualData);
//				     Assert.assertTrue("Verifaction of RoleDropdown  :- ", result);
//				     test.log(LogStatus.INFO, "Role dropdown is displayed");
//				     }
//				catch(Exception e)
//				{
//					Assert.fail("Verifaction of Dropdown Role iS Failed");
//					test.log(LogStatus.INFO,"Role dropdown is not displayed");
//				}
//		    //Branch
//		      try
//				{
//					 List<String> expdata=new ArrayList<>();
//				     expdata.add("k");expdata.add("ExternalConsultant");expdata.add("Aswghfhyfy");expdata.add("Controller");expdata.add("cre");
//				     expdata.add("cred");expdata.add("tellerhdfc");expdata.add("srijay123");expdata.add("gcgfh");expdata.add("ProbationaryOfficer");
//				     List<String> ActualData=Generic_Class.DP_Handle_verify(Employees.Branch_dropdown());
//					
//				    boolean result= Generic_Class.Is_equals(expdata, ActualData);
//				     Assert.assertTrue("Verifaction of BranchDropdown  :- ", result);
//				     test.log(LogStatus.INFO, "Branchdropdown is displayed");
//				     }
//				catch(Exception e)
//				{
//					Assert.fail("Verifaction of Dropdown Branch iS Failed");
//					test.log(LogStatus.INFO,"Branch dropdown is not displayed");
//				}

				}
				
		    
		    
			
			
			
	
			
		

		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

