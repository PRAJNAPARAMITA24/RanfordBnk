package com.pagelibrary.com.ranford_bnk;

import org.testng.annotations.Test;

public class TestExecution extends Reprository{
	
	@Test(priority=0)
	public void verify_launch()
	{
		Launch();
	}

	@Test(priority=1)
	public void verify_login()
	{
		login_TC();
	}
	
	
	@Test(priority=2)
	public void verify_btn()
	{
		branch_btn();
	}
	
	@Test(priority=3)
	public void verify_newbranch_btn() 
	{
		BranchCreation_TC();
		
	}
}
