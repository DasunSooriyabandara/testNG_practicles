package UI;

import org.testng.annotations.Test;

import common.BaseTest;

import org.testng.Assert;

public class DependancyTest{
	
//	---------------------------Hard dependancies-------------------
	@Test
	public void userRegistration()
	{
		System.out.println("This is a User registration function");
		Assert.assertTrue(false);
		
	}

	@Test(dependsOnMethods="userRegistration")
	public void UserSearch()
	{
		System.out.println("This is User search function should be work only for regitered users");
	}
	
//	---------------------------Soft dependancies-------------------
	
	@Test
	public void userRegistration1()
	{
		System.out.println("This is a User registration function Soft dependancies");
		Assert.assertTrue(false);
		
	}

	@Test(dependsOnMethods="userRegistration",alwaysRun=true)  //----------add-----alwaysRun=true
	public void UserSearch1()
	{
		System.out.println("This is User search function should be work only for regitered users Soft dependancies");
	}
	
}


