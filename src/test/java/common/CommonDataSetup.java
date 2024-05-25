package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetup {
	
	
	@BeforeSuite
	public void dataSetup()
	{
		System.out.println("COmmon data setup");
	}
	
	@AfterSuite
	public void dataTeardown()
	{
		System.out.println("COmmon data cleanup");
	}

}
