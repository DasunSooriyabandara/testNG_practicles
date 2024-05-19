package UI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Test_ {
	
	//-----------------------Before Test------and ------- After Test-----------------------------------------------------
	
	@BeforeTest
	public void beforeTest_login() {
		System.out.println("Before Test Execution");
		
	}
	
	
	
	@AfterTest
	public void afterTest_logOut() {
		System.out.println("After Test Execution");
		
	}
	
	
	//-----------------------Before Method------and ------- After Method-----------------------------------------------------
	
	@BeforeMethod
	public void connectToDB() {
		System.out.println("Before Method --- DB Connected");
	}
	
	
	@AfterMethod
	public void disconnectToDB() {
		System.out.println("After Method --- DB Disconnected");
	}
	
	
	//------------------------Test Cases-----------------------------------------------------------------
	
	
	@Test(priority=1,description= ": Test 1")
	public void BLogin() {
		System.out.println("successfully Test One Complted");

	}
	@Test(priority=2,description= ":Test 2")
	public void ALogOut() {
		System.out.println("successfully Test Two Complted");

	}
	
}
